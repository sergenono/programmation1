//============================================================================
// Name        : Bsp25.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Zaehler.h"

#include<algorithm>
using namespace std ;

int main() {
	Zaehler z1{1} ;
	++z1 ;
	z1.print();

	return 0;
}
