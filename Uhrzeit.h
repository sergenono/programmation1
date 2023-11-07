/*
 * Uhrzeit.h
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#ifndef UHRZEIT_H_
#define UHRZEIT_H_

class Uhrzeit {
private:
	unsigned int stunde ;
	unsigned int minute ;
	unsigned int sekunde ;
private :
	void norm(unsigned int &uhr , unsigned int &min , unsigned int &sec );
public:
	Uhrzeit(unsigned  int h , unsigned int m , unsigned int s );
	int getStunde()  ;
	int getMinute() ;
	int getSekunde()  ;
	void setStunde(unsigned int std );
	void setMinute(unsigned int minu);
	void  setSekunde(unsigned int sek);
	Uhrzeit add( const Uhrzeit &other) ;
	void print();
	void  addSek(unsigned int sek);
    void   addMin(unsigned int min) ;
	void    addStunde(unsigned int std);
	virtual ~Uhrzeit();
};

#endif /* UHRZEIT_H_ */
