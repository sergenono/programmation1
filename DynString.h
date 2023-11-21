/*
 * DynString.h
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#ifndef DYNSTRING_H_
#define DYNSTRING_H_
#include<iostream>
#include<algorithm>
#include<memory>
#include<string>
using namespace std ;

class DynString {
private :
	//char zeichen ;
	int size ;
	std::unique_ptr<char[]> data ;
public:

	 DynString(int s  = 0, char zeichen  = ' ');
	virtual ~DynString()= default ;
	DynString(const DynString &other);
	DynString& operator=(const DynString &other);
	DynString(DynString &&other) = default ;
	DynString& operator=(DynString &&other) = default ;
	DynString   operator+(const DynString &other)const ;
	DynString operator+(char zeichen )  ;
	//DynString operator+(const DynString &other  , char zeichen) ;
	DynString& operator +=(const DynString &other) ;
	DynString& operator +=(char  zeichen) ;
	int getSize() const ;
	char& operator[](int index)  ;
	const char& operator[](int index) const  ;
	char& at(unsigned int index );
	const char& at(unsigned int index)const ;
	void setZeichen(int index, char werte) ;
	void print() ;
	 friend ostream& operator<<(ostream s , const  DynString& other );



};
ostream& operator<<(ostream s , const  DynString& other );

#endif /* DYNSTRING_H_ */
