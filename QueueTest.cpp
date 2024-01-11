/*
 * QueueTest.cpp
 *
 *  Created on: 15 déc. 2023
 *      Author: kiano
 */
#include "Queue.h"
#include<iostream>
using namespace std ;
template<class TYPE>
void iterateAndPrint(const Queue<TYPE> s )
{
	for(auto  i: s )
	{
		cout<<i<<" " ;
	}
}
int main()
{
 try{
	Queue<int>  q1{6} ;

	q1.enqueue(1) ;
	q1.enqueue(2) ;
	/*q1.enqueue(3) ;
	q1.enqueue(4) ;
	q1.enqueue(5) ;
	q1.enqueue(6) ;
	q1.enqueue(7) ;*/

	cout<<q1.getSize() <<endl;
	q1.print();


	//q1.dequeue() ;

		//q1.print() ;
		//cout<<q1.getSize();
 }catch(std::exception& e)
 {
    std::cerr<<"exception"<<e.what()<<endl ;
 }
 return 0 ;

}



