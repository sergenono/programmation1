/*
 * NewComplex.h
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#ifndef NEWCOMPLEX_H_
#define NEWCOMPLEX_H_
#include<iostream>
#include<algorithm>
using namespace std ;
#include<cmath>

class NewComplex {
private:
	double realTeil;
	double imagTeil ;
public:
	NewComplex();
	NewComplex(double rTeil , double imgTeil) ;
	NewComplex(const NewComplex &z);
	double  getReal() const ;
	double getImg() const ;

	void setReal(double r);
	void setImg(double i) ;

	double abs() ;
	double phi() ;
	virtual ~NewComplex();

	NewComplex operator+(const NewComplex &z1) const;
	NewComplex operator-(const NewComplex &z1) const;
	NewComplex operator*(const NewComplex &z1) const;
	//NewComplex operator/(const NewComplex &z1) const;
	 void print() ;
};

#endif /* NEWCOMPLEX_H_ */
