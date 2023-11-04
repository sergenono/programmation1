/*
 * Vec.cpp
 *
 *  Created on: 1 nov. 2023
 *      Author: kiano
 */

#include "Vec.h"
#include<iostream>
#include<algorithm>
using namespace std;

Vec::Vec(int s ) {
	size = s ;
	elemente = new double[size];

}
Vec::Vec(const Vec& other)
{
	size = other.getSize() ;
	elemente = new double[size];
	for(int i = 0 ;i < size ; ++i)
	{
		elemente[i] = other.elemente[i];
	}
}
Vec& Vec::operator=(const Vec& other)
{
	size = other.getSize();
    double *nElemente = new double[other.size];
    for(int i = 0 ; i  < size ; ++i)
    {
    	nElemente[i] = other.elemente[i] ;
    }
    delete[] elemente ;
    elemente = nElemente ;
    return *this ;

}
Vec::Vec( Vec&& other)
{
	size = other.size ;
	elemente = other.elemente ;

	other.size = 0 ;
	other.elemente = NULL ;
}
 Vec& Vec:: operator=(Vec&& other)
{
	std::swap(size , other.size); // @suppress("Invalid arguments")
	std::swap(elemente , other.elemente); // @suppress("Invalid arguments")

	return  *this ;
}

Vec::~Vec() {
	delete[] elemente ;
}
int Vec:: getSize() const
{
	return size ;
}
void Vec::setAt(int index , double werte)
{
	if(index >=0 || index < size )

	{
		elemente[index] = werte ;
	}
	else
	{
		std::cout<<"fehler";
	}
}
double Vec:: getAt(int index)
{
	if(index >= 0 || index < size )
	{
         return  elemente[index]  ;
	}
	else
	{
		std::cout<<"fehler";
		return 0 ;
	}
}
void Vec::print()
{
	for(int i = 0 ;  i < size ; ++i)
	{
		std::cout<< elemente[i] << "  ";

	}

}
void  Vec::plusGleich( const Vec &other)
{
//unique_ptr<double[]> nElement { new double[other.size]};

	double *nElement = new double[other.size];

 if( size < other.size)
 {
	  int  i ;
    for(  i = 0 ; i < size ; ++i)
    {
       nElement[i]  = elemente[i] ;
    }

	for( int j = i ;  j < other.size  ; ++j)
	{
		 nElement[j] = elemente[j] ;
	}
	size = other.size ;
	elemente = move(nElement);

	///delete[] nElement ;
 }

    for(int i = 0 ; i < other.size ; ++i)
    {
        elemente[i] += other.elemente[i] ;
        std::cout<< elemente[i]<<"   ";
    }

}

Vec  Vec:: add( Vec a )
{
	 Vec result ;
	 int groesserSize ;
	 if(size < a.size)
	 {
		 groesserSize = a.size ;
	 }
	 else
	 {
		 groesserSize = size ;
	 }
	 result.size = groesserSize ;
	 for(int i = 0 ;  i < groesserSize ; ++i)
	 {
		 result.setAt(i , this->getAt(i) + a.getAt(i));
	 }
	 return result ;
}



int main(){

	Vec v1{5} ;
	v1.setAt(0 ,6);
	v1.setAt(1 ,7);
	v1.setAt(2 ,8);
	v1.setAt(3 ,9);
	v1.setAt(4 ,10);
	v1.print();
	std::cout<<"\n";

	Vec v2{9} ;
	v2.setAt(0 ,6);
	v2.setAt(1 ,7);
	v2.setAt(2 ,7);
	v2.setAt(3 ,7);
	v2.setAt(4 ,7);
	v2.setAt(5 ,7);

 v1.plusGleich(v2);

	std::cout<< "\n";

	//add(v1 , v2);



return 0 ;
}


