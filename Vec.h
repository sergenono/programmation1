/*
 * Vec.h
 *
 *  Created on: 1 nov. 2023
 *      Author: kiano
 */

#ifndef VEC_H_
#define VEC_H_

class Vec {
	private:
		 int  size ;
	private:
		 double *elemente ;
	public:
		Vec(int s = 4);
		Vec(const Vec& other);
		Vec& operator=(const Vec& other);
		Vec(Vec&& other);

		Vec& operator=( Vec&& other);

		void setAt(int index , double werte);
		double getAt(int index);
		int getSize() const;
		void print();
		void  plusGleich( const Vec &other);
		Vec add( Vec a );
		void resize(int a , int b );
		virtual ~Vec();


};

#endif /* VEC_H_ */
