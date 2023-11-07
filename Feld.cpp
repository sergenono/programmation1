/*
 * Feld.cpp
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#include "Feld.h"
#include<iostream>
#include<algorithm>
#include<memory>
using namespace  std;


Feld::Feld(int index , int elem ) {

	untereFeldgrenze = index  ;
	std::unique_ptr <int>element((new int(elem)));

	obereFeldgrenze = index ;
	std::cout<<"geben sie ein obere Indexgrenze  ein:";
			std::cin>> obereFeldgrenze;

}
Feld::Feld(Feld&& other){
	untereFeldgrenze = other.untereFeldgrenze;
	 obereFeldgrenze  = other. obereFeldgrenze ;
	 element = other.element ;
}
int Feld:: getAt(int index)
{
	return index;
}

Feld::~Feld() {

}
int main(){

	Feld f1{0 } ;

	return 0;
}

