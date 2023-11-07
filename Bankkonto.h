/*
 * Bankkonto.h
 *
 *  Created on: 3 nov. 2023
 *      Author: kiano
 */
#include<string>
using namespace std ;
#ifndef BANKKONTO_H_
#define BANKKONTO_H_

class Bankkonto {
private:
	std:: string kontonummer ;
	std:: string kontoinhaber ;
	double kontostand ;
public:
	Bankkonto(const std::string& knummer , const std::string& kinhaber , double kstand= 0.0);
	virtual ~Bankkonto();
	Bankkonto& operator=(  const Bankkonto &other) ;
	double getKontostand() const ;
	double einzahlung(double wert);
	double auszahlung(double wert);
	void print();
};

#endif /* BANKKONTO_H_ */
