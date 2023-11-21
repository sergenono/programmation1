//============================================================================
// Name        : Vesuch1P1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include<memory>
#include<algorithm>
#include "versuch1.h"

int main() {
	versuch1 obj1{'d'} ;
	versuch1  obj2{'o'} ;
	versuch1 obj3 ;

	obj1.setCharAt(0 ,  'v');
	obj1.setCharAt(1 ,  'f');
	obj1.setCharAt(2 ,  'e');


	obj2.setCharAt(0 ,  'b');
	obj2.setCharAt(1 ,  'e');
	obj2.setCharAt(2 ,  'b');
	 obj2.setCharAt(3 , 'i' );

		obj1.append(obj2) ;

obj2.print() ;

std::cout<<"\n" ;
obj3 = obj1.concat( obj2) ;
obj3.print();
	return 0;
}
