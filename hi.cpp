//============================================================================
// Name        : hi.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<vector>
using namespace std;
constexpr unsigned int N{2};

int rows = N;
	int cols = N ;

	 int n ;
void eingabe( std::vector<std::vector<double>>& matrx1);

int main() {
	std::vector<std::vector<int>> myMatrx1 ;
	std::vector<std::vector<int>>myMatrx2;



	std::cout<<"enter items :";
	for(int i = 0 ; i < rows ; i++)
	{
		for(int j = 0 ; j < cols ; j++)
		{
			std::cin>> n ;

			std::cout<<myMatrx1[i][j];
		}
	}


	eingabe( myMatrx1);
	return 0;
}
void eingabe(std::vector<std::vector<double>>& matrx1 )
{
	std::cout<<"the elements in vectors are";

	 for(int i = 0 ; i < rows ; i++)
	 {
		 std::vector<double> vec ;
		   for(int j = 0 ; j < cols  ; j++)
		   {
			   vec.push_back(n);
		   }
		   matrx1.push_back(vec);
	 }
}
