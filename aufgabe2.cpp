
#include<stdio.h>
#include<stdlib.h>
#include<iostream>
constexpr unsigned N{2} ;
using namespace std ;
void matrix1(double a1[][N] , double rows , double cols );

int main(){

	double array1[N][N] =  {{1.0,2.0} , {2.0 ,2.0}} ;
	double rows = N ;
		double cols = N ;
		matrix1(array1 ,rows , cols);
	return 0 ;
}


void matrix1(double a1[][N] , double rows , double cols ){
	for(int i = 0 ;  i< rows , i++){
		for(int j= 0 ; j < cols  ; j++)
		{
			std::cout<<a1[i][j];
		}
		std::cout<<std::endl ;
	}
}
