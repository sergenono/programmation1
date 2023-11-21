/*
 * versuch1.h
 *
 *  Created on: 8 nov. 2023
 *      Author: kiano
 */

#ifndef VERSUCH1_H_
#define VERSUCH1_H_
using namespace std ;
#include<iostream>
#include<memory>
#include<algorithm>
#include<cstring>

class versuch1 {
private:
	int length ;
	char  *txt;



public:
	versuch1();
	versuch1(  int len );
	versuch1(char wert  );
	virtual ~versuch1();
	versuch1(const versuch1 &other);
	versuch1(versuch1 &&other);
	versuch1& operator=(const versuch1 &other);
	versuch1& operator=(versuch1 &&other);
	void append(const versuch1 &other);
	versuch1 concat(const versuch1 &a )  ;
	int getLength() const ;
	char getCharAt(int index);
	void setCharAt(int index , char wert );
	void print() ;
};

#endif /* VERSUCH1_H_ */
