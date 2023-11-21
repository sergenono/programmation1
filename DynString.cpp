/*
 * DynString.cpp
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#include "DynString.h"
#include<iostream>
#include<algorithm>
#include<memory>
#include<string>
using namespace std ;


DynString::DynString(int s ,  char zeichen ): size(s) ,  data(new char[size]) {
	/*for(int i = 0 ; i < size , ++i)
		{
			data[i] =  Zchen ;
		}*/

	}

/*DynString::~DynString() {  wegen unique_ptr

}*/

DynString::DynString(const DynString &other) {

	size = other.getSize();

	 data = std::make_unique<char[]>(size);
	 for(int i = 0 ; i < size ; ++i)
	 {
		 data[i] = other.data[i] ;
	 }

}

DynString& DynString::operator=(const DynString &other) {
  std::unique_ptr<char []> nData = std::make_unique<char[]>(other.size);
  size = other.getSize();

  for(int i = 0 ; i < size ; ++i)
  {
	nData[i] = other.data[i] ;
  }
 // delete[] data  // on a pu besion de sa a cause du unique pointer
   data =move( nData ) ;
   return *this      ;   //  retourne la copie

}

/*DynString::DynString(DynString &&other) { wegen unique pointer  wegen unique pointer


}*/

/*DynString& DynString::operator=(DynString &&other) {


}*/

DynString DynString::operator +(const DynString &other) const {

	 DynString *res  = new DynString[this->size +other.size]   ;






  for(int i = 0 ; i < this->size ; ++i)
  {
	// res=  this->data[i] + other.data[i] ;
	// cout<<res[i] ;
	  res[i] = this->data[i];


  }
  for(int j = 0 ; j < other.size ; ++j)
 	  {
 		  res[j] = other.data[j] ;
 	  }
return res;
}

DynString  DynString::operator +(char zeichen ) {

	 DynString   res ;

	 for(int i= 0 ; i < size ; ++i)
	 {
		res.data[i]=  zeichen +this->data[i]   ;


	 }
	 return res ;
}
/*DynString DynString:: operator+(const DynString &other  , char zeichen)
{
     DynString res ;
     for(int i = 0 ; i < size ; ++i)
     {
    	 res[i] = other.data[i] + zeichen ;
     }
     return res ;
}*/

DynString& DynString::operator +=(const DynString &other) {
	std::unique_ptr<char[]> nData = std::make_unique<char[]>(other.size);
	if(size < other.size)
	{
		int i  ;
		for(i = 0 ; i < size ; ++i)
		{
			nData[i] = data[i];
		}
		for(int j = i  ; j < other.size ; ++ j)
		{
			nData[j] =  other.data[j] ;
		}
		size = other.size ;
		data = move(nData) ;
	}
	for(int i = 0;  i < other.size ; ++i)
	{
	this->data[i] +=other.data[i] ;

	}
	return *this ;



}

DynString& DynString::operator +=(char zeichen ) {

	for(int i = 0 ;  i <size ;  i++)
	{
		  this->data[i] += zeichen ;
	}
	return *this ;


}

int DynString::getSize() const {
 return size ;
}

char& DynString:: operator[](int index)
{
	return data[index] ;
}

const char& DynString::operator [](int index) const {

	return data[index] ;


}
char&  DynString:: at(unsigned int index ){

	if(index >= 0 ||  index < size)
		return data[index];
	throw -99 ;

}
const char&  DynString ::at(unsigned int index)const
{
	if(index >= 0 ||  index < size)
			return data[index];
		throw -99 ;
}
/*ostream& DynString::operator <<(ostream s ,  const  DynString& other ) {
	for(int i = 0 ;  i <size ; ++i)
	{
		s<<this->data[i] ;
	}
	return s ;

}*/


void DynString::setZeichen(int index, char werte) {
  if(index >= 0  || index < size)
	  data[index] = werte ;
  else
	  throw -99 ;
}
void DynString::print() {

	for(int i = 0 ;  i < size ; ++i )
	{
		cout <<data[i]<< " " ;
	}

}

int main(){
	DynString obj1{ 5 } ;
	DynString obj2{5 } ;
	DynString obj3 ;
	DynString obj4 ;

	/*obj3 = obj1 + obj2 ;
	cout<<obj3 ;
	obj3 = obj2 + obj1 ;
	cout<<obj3 ;
	obj4  =  obj3 + 'C' ;*/
 obj1.setZeichen(0 , 's') ;
 obj1.setZeichen(1 , 'e') ;
 obj1.setZeichen(2 , 'r') ;
 obj1.setZeichen(3 , 'g') ;
 obj1.setZeichen(4 , 'e') ;


 obj2.setZeichen(0 , 's') ;
 obj2.setZeichen(1 , 'a') ;
 obj2.setZeichen(2 , 'l') ;
 obj2.setZeichen(3 , 'u') ;
 obj2.setZeichen(4 , 't') ;


//obj1 += obj2 ;
 obj4 = obj1 + obj2;

obj4 = obj1 + 'a' ;


obj4.print() ;

/* string c = ""  ;
  c = c +'b' ;
  c = c + 'c' ;
	  cout<< c ;*/

	/* char c1 = '0';
	 char  c2 = '4' ;
	 char c3[3] = {c1 , c2 , 0} ;
	 cout<<c3  ;*/

	return 0 ;
}


