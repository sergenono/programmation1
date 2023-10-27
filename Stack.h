/*
 * Stack.h
 *
 *  Created on: 27 oct. 2023
 *      Author: kiano
 */

#ifndef STACK_H_
#define STACK_H_

class Stack {
	int top ;  // fuer entfernen von element
	int size ;   // laenge von stack

	int *stck ;      // fuer reservierung von speichertplatz fur element von stack
public:
	Stack(int i = 16);     //   konstruktor mit der initialisierung  von der laenge der stack
	Stack(const Stack &s);    // kopie konstruktor , die als parameter den original objekt  s  bekommt
	Stack& operator= (const Stack& s)  ; // zuweisung operator , kann auch kopieren die element von originaal ojekt aber kann auch die veraendern

	virtual ~Stack();
	int getSize() const ; // fuer das zugreifen von size  von stack objekt aber diese methode kann nur die size lesen und nicht aendern
	void push(int wert) ; // fuer einfuegen von elemnten
	int pop(); //  fuer entfernung von element
};

#endif /* STACK_H_ */
