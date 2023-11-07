/*
 * Complex.h
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#ifndef COMPLEX_H_
#define COMPLEX_H_

class Complex {

private:
	double realTeil ;
	double imagTeil ;
	double betrag ;
	double winkel ;



public:
	Complex();
	Complex(double rTeil , double imgTeil);
	Complex(double bTrag , double wKel);
	Complex(const Complex &z);
	double getReal()const ;
	double getImg() const ;
	double  getWinkel() const ;
	double getBetrag() const ;
	void setReal(double r);
	void setImg(double i);
	void setBetrag( double b );
	void setWinkel( double w) ;
	Complex add1(  Complex  z1);
	Complex sub(Complex z1 );
	Complex div(Complex z1);
	Complex mult(Complex z1);
	void  print();
	virtual ~Complex();

	/*class  Complex1{

	private :
		double betrag ;
		double winkel ;
	public :
		Complex1( const  Complex& other);
		void setBetrag( const Complex &z1 );
		void setWinkel( const Complex &other) ;
		virtual ~Complex1();
	};*/

};


#endif /* COMPLEX_H_ */
