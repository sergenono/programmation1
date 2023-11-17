//============================================================================
// Name        : Bsp23.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============{================================================================

#include <iostream>
using namespace std;
#include "Zeit.h"
#include<algorithm>

int main() {

	Zeit z1{ 5 , 23 } ;
	Zeit z2{ 2 , 6 } ;


	Zeit z3 =  z1 + z2 ;
	z3.print() ;
	return 0;
}
