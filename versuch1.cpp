/*
 * versuch1.cpp
 *
 *  Created on: 8 nov. 2023
 *      Author: kiano
 */

#include "versuch1.h"
#include<memory>
#include<iostream>
using namespace std;
#include<cstring>

versuch1::versuch1()
{
 length = 0 ;
 txt =NULL ;
}
versuch1::versuch1(int len )
{
	length = len ;
   txt  = new char[length];

}
versuch1::versuch1(char wert )
{
	length = 1 ;
	txt = new  char[wert] ;
}

versuch1::~versuch1() {
delete[] txt ;
}

versuch1::versuch1(const versuch1 &other) {
       length= other.getLength();
       txt = new  char[other.length];
       for(int i = 0 ; i < other.length ; ++i)
       {
    	   txt[i] = other.txt[i];
       }

}

versuch1::versuch1(versuch1 &&other) {
      length = other.length ;
      txt = other.txt ;
      length = 0 ;
      txt  = NULL ;

}

versuch1& versuch1::operator=(const versuch1 &other) {
	string *ntxt  = new char[other.length] ;
	length = other.length ;
	for(int i = 0 ; i < other.length ; ++i)
	{
		 ntxt[i] = txt[i] ;
	}
	delete[] txt;

	txt = ntxt ;
	return *this  ;

}


versuch1& versuch1::operator=(versuch1 &&other) {
	std::swap(length , other.length); // @suppress("Invalid arguments")
	std::swap(txt , other.txt); // @suppress("Invalid arguments")
	return *this ;

}

void versuch1::append(const versuch1 &other) {

	//unique_ptr<double[]> newElement =std:: make_unique<double[]>(other.size)  ;
	string *newtxt = new char[other.length] ;
	if(length < other.length )
	{
		int i ;
	 for(i = 0 ; i < length ; ++i)
	 {
		 newtxt[i] = txt[i] ;
	 }
	 for(int j = i ; j  < other.length ; ++j)
	 {
		 newtxt[j] = other.txt[j] ;
	 }
	 length= other.length ;
	 txt = move(newtxt) ;

	}
	for(int i = 0 ; i < other.length ; ++i)
	{
		txt[i] +=other.txt[i];
	}
	//delete[] newElement ;
}


int versuch1::getLength() const {
	return length ;
}

char versuch1::getCharAt(int index) {
	if(index >= 0  || index < length -1 )
	{
		return txt[index] ;
	}
	else
	{
		cerr<<"fehlermeldung" ;
		return 0 ;
	}
}

void versuch1::setCharAt(int index, char wert) {
	if(index >= 0  || index < length -1 )
	{
		txt[index] = wert ;
	}
	else
	{
		cerr<<"fehlermeldung" ;

	}
}

void versuch1::print() {
	for(int i =  0 ;  i < length  ; ++i)
	{
		std::cout<<txt[i] << "  " ;
	}
}

versuch1 versuch1::concat(const versuch1 &a )   {
	versuch1 res  ;
	res.append(a) ;

	return res;
}
