/*
 * Queue.h
 *
 *  Created on: 15 déc. 2023
 *      Author: kiano
 */

#ifndef QUEUE_H_
#define QUEUE_H_
#include<iostream>
#include<memory>
#include<concepts>
#include<algorithm>
#include<stdexcept>
#include<iterator>
using namespace std ;
template<copyable T>              // koennte man auch so mache ?    template< class T >    concept hi = concept hi = std::copyable<T> ; template<hi TYPE>

class Queue {
private:
	int size ;
	int count = 0 ;
	unique_ptr<T[]> pData ;
	int enqueueIndex , dequeueIndex ;
	void resize(int index ) ;
public:
	Queue(int size = 4);
	virtual ~Queue() = default;
	Queue(const Queue &other);
	Queue(Queue &&other) = default;
	Queue& operator=(const Queue &other);
	Queue& operator=(Queue &&other) = default;
	void enqueue(T value) ;
	T dequeue() ;
	int getSize() ;
	int getCount() ;
	void print() ;
	void iterateAndPrint(const T& Queue) ;

	class StackForwardIterator{
				typedef std::forward_iterator_tag iterator_category ;   //  iterator catogory
				typedef T  value_type  ;                                // objekttyp . typ  des objekt  auf das sie zeigt
				typedef T* pointer ;                                     //pointer auf den typ des objekt
				typedef T& reference ;                                     //referenz auf den typ des objekt
				typedef ptrdiff_t difference_type ;

				T* pAct ;
			public:
				StackForwardIterator(T* pAct = nullptr) :pAct(pAct){}

				T& operator*(){

					return *pAct ;
				}
				const T& operator*()const {

						return *pAct ;
					}
				T* operator->(){
					return &(pAct);
					return &operator*() ;
				}
				const T* operator->()const{
						return &(pAct);
						return &operator*() ;
					}
				StackForwardIterator& operator++(){
					if(pAct != nullptr)
						pAct = pAct->enqueueIndex ;
					return *this ;
				}
				StackForwardIterator operator++(int){
					StackForwardIterator sFIErg(*this);
					++(*this);
					operator++() ;
					return  sFIErg ;
				}
				bool operator==(const  StackForwardIterator& sFI)const{
					return pAct = sFI.pAct ;
				}
				bool operator !=(StackForwardIterator& sFI)const{
					return !operator==(sFI);
				}


			};
			StackForwardIterator begin()
			{
				return StackForwardIterator{enqueueIndex } ;
			}
			StackForwardIterator end(){
				return StackForwardIterator{} ;
			}
			StackForwardIterator begin() const
					{
						return StackForwardIterator{enqueueIndex } ;
					}
					StackForwardIterator end() const {
						return StackForwardIterator{} ;
					}


};
template<copyable T>
Queue<T>::Queue(int size) : size(size)  , pData(new T[size]) , enqueueIndex(0), dequeueIndex(0) {}
template<copyable T>
Queue<T>::Queue(const Queue<T> &other) {

	enqueueIndex =  other.enqueueIndex ;
	dequeueIndex = other.	dequeueIndex  ;
	size = other.size ;
	count = other.count ;
	pData = new T[size] ;
	for(int i =  0 ; i  < size ; ++i)
	{
		pData[i] = other.pData[i] ;
	}


}

template<copyable T>
inline void Queue<T>::resize(int index) {

	if(index == enqueueIndex)
	{
	size = size * 2 ;
	unique_ptr<T[]> tmp  = std::make_unique<T[]>(size);
	for(int i = 0 ; i < enqueueIndex ;++i)
	{
		tmp[i] = pData[i] ;
	}
	pData = move(tmp) ;

	}
	if(index == dequeueIndex)
	{
		size = size/2 ;
		if(size < 4)
			{
			size = 4 ;
			}
		unique_ptr<T[]> tmp  = std::make_unique<T[]>(size);
		for(int i = 0 ; i < dequeueIndex ;++i)
		{
			tmp[i] = pData[i] ;
		}
		pData = move(tmp) ;
	}

}

template<copyable T>
Queue<T>& Queue<T>::operator=(const Queue<T> &other) {
	unique_ptr<T[]> npData = std::make_unique<T[]>(other.size) ;
	size= other.getSize() ;
	enqueueIndex =  other.enqueueIndex ;
	dequeueIndex = other.dequeueIndex  ;
	count = other.count ;

	for(int i = 0 ; i < size ; ++i)
	{
	    npData[i] = pData[i] ;
	}

	    pData = npData ;
	    return *this ;




}

template<copyable T>
inline void Queue<T>::enqueue(T value) {
	if(enqueueIndex == size)  resize(enqueueIndex) ;
	    pData[++enqueueIndex] = value ;
	    count++ ;

}

template<copyable T>
inline T Queue<T>::dequeue() {
	if(dequeueIndex == 0)
	{
		throw std::runtime_error("error : queue is empty") ;
		return -99 ;
	}
	else
	{
		if(dequeueIndex < (size/4))
			{
			 resize(dequeueIndex);
			}

		count -- ;
		return pData[--dequeueIndex];
	}
}

template<copyable T>
inline int Queue<T>::getSize() {
	return size  ;
}

template<copyable T>
inline int Queue<T>::getCount() {
	return count ;
}

template<copyable T>
inline void Queue<T>::print() {
	for(int  i = 0 ; i <= enqueueIndex ; ++i)
	{
		cout<<pData[i] ;
	}
}

template<copyable T>
inline void Queue<T>::iterateAndPrint(const T &Queue) {
}

#endif /* QUEUE_H_ */
