/*
 * Queue.cpp
 *
 *  Created on: 8 nov. 2023
 *      Author: kiano
 */

#include "Queue.h"
#include<memory>
#include<algorithm>
using namespace std ;
Queue::Queue() {

	 pDequeue = nullptr ;
	 pEnqueue = nullptr ;
	 size = 0 ;



}

/*Queue::~Queue() {   default weil unique_ptr

}*/
Queue::Queue(QueueItem other)
{
	pDequeue = std::make_unique<QueueItem>(other) ;
	pEnqueue = new QueueItem[other] ;
      size = 0  ;
}
Queue::QueueItem::QueueItem()
{
	value = 0 ;
	pYounger = NULL ;
}
Queue::QueueItem::QueueItem(int val )
{
	value = val ;
	pYounger = std::make_unique<int>(value) ;
}
void Queue::enqueue(QueueItem &other)
{
     int *front ;
     int *rear ;
     if(size == 0)
     {
        // front  =std:: move(pEnqueue) ;
          pEnqueue = pDequeue.get();
     }
     else
     {
    	 pDequeue =   pDequeue.get() ;
     }
}
int dequeue()
{

}

/*Queue::Queue(const Queue &other) {
	// TODO Auto-generated constructor stub       default weil unique_ptr

}*/

/*Queue::Queue(Queue &&other) {
	// TODO Auto-generated constructor stub   default weil unique_ptr

}*/

Queue& Queue::operator=(const Queue &other) {
	// TODO Auto-generated method stub
	return *this ;

}

/*Queue& Queue::operator=(Queue &&other) {
	// TODO Auto-generated method stub               default  weil unique pointer

}*/

