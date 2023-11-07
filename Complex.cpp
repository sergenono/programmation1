/*
 * Complex.cpp
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#include "Complex.h"

#include<iostream>
#include<algorithm>
using namespace std ;

Complex::Complex() {
	realTeil = 0;
	imagTeil = 0 ;
 winkel = 0 ;
 betrag = 0 ;
      //  z  =  realTeil + "i"imagTeil
}
Complex::Complex(double rTeil , double imgTeil)
{
	realTeil =  rTeil ;
	imagTeil = imgTeil ;
	winkel = 0 ;
	betrag = 0 ;
}
Complex::Complex(const Complex &other)
{
	realTeil = other.realTeil ;
	imagTeil = other.imagTeil ;
	winkel = other.winkel ;
	betrag = other.betrag ;
}
Complex::Complex(double bTrag , double wKel)
{
	betrag = bTrag ;
	winkel = wKel ;
	realTeil = 0 ;
	imagTeil = 0 ;
}
double Complex::getReal() const
{
	return realTeil ;
}
double Complex:: getImg()const
{
	 return imagTeil ;
}
double Complex::getWinkel()const
{
	return winkel ;
}
double Complex::getBetrag() const
{
	return betrag ;
}
void Complex:: setReal(double r)
{
	realTeil = r ;
}
void Complex::setImg(double i)
{
	imagTeil = i ;
}
Complex  Complex::add1(  Complex  z1 )
{
	Complex   result ;
	result.setReal(z1.getReal() + this->getReal());
	result.setImg(z1.getImg()+ this->getImg());

	return result ;
}
Complex Complex::sub(Complex z1)
{
	Complex   result ;
		result.setReal(  this->getReal() -z1.getReal()  );
		result.setImg(  this->getImg()-z1.getImg());
		return result ;

}
Complex Complex::mult(Complex z1)
{
	Complex result ;
	result.setReal((this->getReal()*z1.getReal())+ (this->getImg()*z1.getImg()*(-1)));
	result.setImg((this->getReal()*z1.getImg()) + this->getImg()*z1.getReal());

	return result ;

}


void Complex::print(){

	std::cout<< realTeil << " +"   << imagTeil << "i";
	std::cout<<"\n" ;

}




Complex::~Complex() {

}

 /*void Complex::Complex1::setBetrag(const Complex &z1)
 {
	 betrag = Math.sqrt(((z1.realTeil)*(z1.realTeil)) + ((z1.imagTeil)*(z1.imagTeil)));
 }*/

void Complex::setBetrag( double b )
{
        betrag = b ;
}
void Complex:: setWinkel( double w)
{
	winkel = w ;
}
int main()
{

	Complex c1{ 1, 2 } ;
	Complex c2{2 ,1 } ;
	//Complex::Complex1 c3 {c1} ;
   Complex r;
   Complex r2  ;
   Complex r3 ;

	r =  c1.add1(c2) ;
	r2 = c1.sub(c2) ;
	r3 = c1.mult(c2);
    r.print();
	r2.print() ;
	r3.print() ;
return 0 ;
}











