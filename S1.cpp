//============================================================================
// Name        : S1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "Queue.h"

int main() {

	Queue::QueueItem q1 ;
	Queue::QueueItem q2{17} ;
	Queue::QueueItem q3{-5} ;
	Queue::QueueItem q4{42} ;

	Queue q5 ;
	Queue q6 {q2} ;
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
}
