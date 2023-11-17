/*
 * Zeit.cpp
 *
 *  Created on: 16 nov. 2023
 *      Author: kiano
 */

#include "Zeit.h"
#include<iostream>
using namespace std ;
#include<algorithm>


Zeit::Zeit(int s, int m) : stunden(s) , minuten(m){
}

Zeit::~Zeit() {
  std::cout<<"objekt wird geloescht";
}

Zeit Zeit::operator+ (  const Zeit& other)  const{

	return Zeit(  this->stunden + other.stunden ,this->minuten + other.minuten ) ;

}

void Zeit::print() {
	std::cout<<stunden <<":"<<minuten ;
}

int Zeit::getMinute() {
	return minuten ;
}

int Zeit::getStunde() {
	return stunden  ;
}

void Zeit::setMinute(int min) {
	minuten = min ;
}

void Zeit::setStunden(int std) {
	stunden = std ;
}
