//============================================================================
// Name        : ueb5blatt2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include<iostream>
#include<algorithm>
using namespace std ;
#include<cmath>

#include "NewComplex.h"

int main() {
	NewComplex c1{1.0 , 2.0} ;
		NewComplex c2{2.0 , 1.0} ;
		NewComplex r;
		   NewComplex r2  ;
		   NewComplex r3 ;

		   r = c1 + c2  ;
		   r.print() ;
		   r2 = c1 -c2 ;
		   r2.print() ;
		   r3 = c1 * c2 ;
				   r3.print();
	return 0;
}
