/*
 * Queue.h
 *
 *  Created on: 8 nov. 2023
 *      Author: kiano
 */

#ifndef QUEUE_H_
#define QUEUE_H_
#include<memory>
using namespace std ;

class Queue {


public:
	class QueueItem{
	public :
			int value ;
	         unique_ptr<int[]> pYounger ;
			public :

		QueueItem();
		QueueItem(int val)  ;
		virtual ~QueueItem() =  default  ;

	};

	Queue();
	Queue(QueueItem other) ;
	Queue(const Queue &other);
	Queue(Queue &&other) = default ;
	Queue& operator=(const Queue &other);
	Queue& operator=(Queue &&other) = default ;
	void  enqueue(QueueItem  &other );
	int dequeue() ;
	virtual ~Queue() = default ;
private :

		unique_ptr<QueueItem[]> pDequeue ;
		QueueItem *pEnqueue ;
		int size  ;

};

#endif /* QUEUE_H_ */
