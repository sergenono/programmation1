/*
 * NewComplex.cpp
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#include "NewComplex.h"

#include<iostream>
#include<algorithm>
using namespace std ;
#include<cmath>

NewComplex::NewComplex() {

	realTeil = 0;
	imagTeil = 0 ;

}

NewComplex::~NewComplex() {

}

NewComplex::NewComplex(double rTeil, double imgTeil): realTeil(rTeil) , imagTeil(imgTeil){}

double NewComplex::getReal() const {
	return realTeil ;
}

double NewComplex::getImg() const {
	return imagTeil ;
}

void NewComplex::setReal(double r) {
	realTeil = r ;
}

void NewComplex::setImg(double i) {
	imagTeil = i ;
}

double NewComplex::abs() {
	return sqrt(realTeil*realTeil + imagTeil*imagTeil) ;
}

double NewComplex::phi() {

	return atan2(realTeil , imagTeil);
}

NewComplex::NewComplex(const NewComplex &other) {

	realTeil = other.realTeil ;
		imagTeil = other.imagTeil ;

}

NewComplex NewComplex::operator +(const NewComplex &z1) const {

	return NewComplex(this->getReal()+z1.getReal() , this->getImg()+z1.getImg()) ;
}

NewComplex NewComplex::operator -(const NewComplex &z1) const {
	return NewComplex(this->getReal()-z1.getReal() , this->getImg()- z1.getImg()) ;
}

NewComplex NewComplex::operator *(const NewComplex &z1) const {
	return NewComplex((this->getReal()*z1.getReal())+ (this->getImg()*z1.getImg()*(-1)) ,(this->getReal()*z1.getImg()) + this->getImg()*z1.getReal());
}

void NewComplex::print() {
	std::cout<< realTeil << " +"   << imagTeil << "i";
		std::cout<<"\n" ;

}
