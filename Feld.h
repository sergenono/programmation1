/*
 * Feld.h
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#ifndef FELD_H_
#define FELD_H_
#include<memory>

class Feld {

private:

	int untereFeldgrenze ;
	int obereFeldgrenze ;
	std::unique_ptr <int>element ;
public:
	Feld(int index , int elem = 0);
    Feld( Feld&& other);
	Feld& operator=( Feld&& other);
	void setAt(int index , int wert);
	int getAt(int index) ;
	int getSize() ;
	int getLower();
	int getUpper();
	void display();
	virtual ~Feld();
};

#endif /* FELD_H_ */
