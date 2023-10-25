//============================================================================
// Name        : hi.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;
constexpr unsigned int N{2};
int n = N  ;

int a  ;
int b ;

void eingabe( std::vector<std::vector<double>>   &matrx1  , std::vector<std::vector<double>>  &matrx2);
void mult( std::vector<std::vector<double>>   &matrx1  , std::vector<std::vector<double>>  &matrx2 , std::vector<std::vector<double>> &result);

int main() {
	std::vector<std::vector<double>>  myMatrx1 ;
	std::vector<std::vector<double>> myMatrx2;
	std::vector<std::vector<double>> res ;

	eingabe(myMatrx1 , myMatrx2);
	mult(myMatrx1 , myMatrx2 , res) ;


	return 0;
}
void eingabe(std::vector<std::vector<double>> &matrx1  , std::vector<std::vector<double>>  &matrx2)
{

	 for(int i = 0 ; i < n ; i++)
	 {
		 std::vector<double> vec ;
		   for(int j = 0 ; j < n  ; j++)
		   {
			   std::cout<<"enter a number" ;
					   std::cin>> a ;
					   vec.push_back(a);
		   }

		   matrx1.push_back(vec);
	 }
	 for(int i = 0 ; i < n ; i++)
	 {
		 std::vector<double> vec ;
		   for(int j = 0 ; j < n  ; j++)
		   {
			   std::cout<<"enter  number" ;
					   std::cin>> b ;
			   vec.push_back(b);
		   }
		   matrx2.push_back(vec);
	 }
	 for(int i = 0 ; i < n ; i++)
	 {
		 for(int j = 0 ; j < n ; j++)
		 {
			 std::cout<< matrx1[i][j];
		 }
		 std::cout<<"\n" ;
	 }

	 std::cout<<"\n" ;

	 for(int i = 0 ; i < n ; i++)
		 {
			 for(int j = 0 ; j < n ; j++)
			 {
				 std::cout<< matrx2[i][j];
			 }
			 std::cout<<"\n" ;
		 }
}
	 void mult( std::vector<std::vector<double>>   &matrx1  , std::vector<std::vector<double>>  &matrx2 , std::vector<std::vector<double>> &result)
	 {
		 for(int i = 0 ; i < n  ; i++)
		 	{
		 		   std::vector<double> vec ;

		 		for(int j = 0 ; j < n ; j++)
		 		{
		 			std::cout<<"enter a number";
		 			std::cin>> a ;
		 		      vec.push_back(a);

		 		}
		 		matrx1.push_back(vec);
		 	}
		 	for(int i = 0 ; i < n  ; i++)
		 	{
		 		   std::vector<double> vec ;

		 		for(int j = 0 ; j < n ; j++)
		 		{
		 			std::cout<<"enter number";
		 			std::cin>> b ;
		 		      vec.push_back(b);

		 		}
		 		matrx2.push_back(vec);
		 	}

		 	for(int i = 0 ; i < n ; i++)
		 	{
		 		for(int j = 0 ; j< n ; j++)
		 		{
		 			std::cout<<matrx1[i][j] ;
		 		}

		 		std::cout<<"\n";
		 	}
		 	for(int i = 0 ; i < n ; i++)
		 	{
		 		for(int j = 0 ; j< n ; j++)
		 		{
		 			std::cout<<matrx2[i][j] ;
		 		}

		 		std::cout<<"\n";
		 	}

		     int laengeRows = matrx1[0].size();
		      int laengeCols = matrx2[0].size();
		      if(laengeRows != laengeCols)
		      {
		     	 std::cout<<"beide matrix koennen nicht multipliziert werden " ;
		      }
		      else
		      {
		     	 for(int i = 0 ; i < n*n ; i++)
		     	 {

		     		 std::vector<double>rows ;
		     		 for(int j = 0 ; j < n ; j++)
		     		 {
		     		 int tmp  = 0 ;
		                     for(int k = 0 ; k< n ; k++)
		                     {
		                     	 tmp  =  tmp + (matrx1[i][k]*matrx2[k][j]) ;

		                     }
		                	 rows.push_back(tmp);

		     		 }

		     	     result.push_back(rows);
		     	 }
		      }
		      for(int i = 0 ; i < n ; i++)
		      {
		     	 for(int j = 0 ; j < n ; j++ )
		     	 {
		     		 std::cout << result[i][j]  << " ";
		     	 }
		     	 std::cout<<"\n";
		      }
		      //std::cout<< laengeRows ;

	 }


