/*
 * Stack.cpp
 *
 *  Created on: 27 oct. 2023
 *      Author: kiano
 */

#include "Stack.h"
#include<iostream>

Stack::Stack(int i) {

	top = 0 ;
  size = i ;   // zuweisung an die size ein wert i

  stck = new int[size] ;   // erstellung neue speicherplatz fuer integer element
}

Stack::~Stack()
{
	delete[] stck  ; // loeschen von reservierte  seichertplatz
}
Stack::Stack(const Stack &s)
{
	top  = s.top ;              // das kopie bekommt 0  von original s
	size = s.getSize() ;    //  das kopie  bekommt die laenge  von original s
	stck  =  new int[s.size] ;   // das kopie bekommt die gleiche speichertplatz von original
	for(int i = 0 ;  i< size ; i++)
	{
		stck[i] = s.stck[i];  // alle element von den original stack objekt  werden in kopie objekt stack kopiert
	}
}

Stack& Stack::operator =(const Stack &s)
{
	int *nStck = new int[s.size] ;  // eine neue speichertplatz  fuer die kopieoperator erstellen
	size = s.getSize();
	for(int i = 0 ; i < size  ; i++ )

		nStck[i] = s.stck[i] ; // kopieren von element von original in das kopie und dzwischen die elementen sich veraerndern
	  delete[]  stck ; // loeschen von reservierung platz von original objekt
	  stck = nStck ;

	  	  top = s.top ;

	  	  return *this ; // das kopieObjekt wird  zuruckgegeben
}


int Stack::getSize()const
{
	return size ;
}

void Stack::push(int wert)
{
	if(size != 0  && wert != 0)
		top = wert  ;
	std::cout<< top ;
}
int Stack::pop(){

	return top ;
}

int main(){

	Stack st1 {20} ;
	Stack st2 = st1 ;
	Stack st3 ;

	st3 = st1 ;
	std::cout<<st2.getSize() <<" \n " ;
	st1.push(1);



}

