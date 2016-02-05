#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>
#define N 15
#define M 15

/*Задача: задать одномерный массив, выполнить сортировку массива и вывести на экран(или в файл):
1. сортировка строк;
2. сортировка столбцов;
3. сортировка элементов на главной диагонали.*/

int sortArr(int mass[]);			//Функция сортировки пузырьком одномерного массива
int sortArr1(int mass1[N][M]);		//Функция сортировки пузырьком двумерного массива по строкам
int sortArr2(int mass2[N][M]);		//Функция сортировки пузырьком двумерного массива по столбцам
int sortArr3(int mass3[N][M]);		//Функция сортировки пузырьком элементов двумерного массива на главной диагонали

int main(void)
{
	setlocale(LC_ALL,".1251");
	int i,j,arr[N],arr1[N][M];
	/////////////////////////////////////////////////////////////////////////
	//Одномерный массив
	printf("\n Несортированный массив arr[%d]: ",N);

	for (i=0; i<N; i++) 
		{
			arr[i]=rand()%30+25;
			printf("%3d",arr[i]);
		}

	sortArr(arr);

	printf("\n Cортированный массив arr[%d]: \t ",N);
	
	for (i=0; i<N; i++) 
		{
			printf("%3d",arr[i]);
		}
	
	printf("\n\n");
	/////////////////////////////////////////////////////////////////////////
	//Двумерный массив

	for (i=0; i<N; i++)
		for (j=0; j<M; j++)
			arr1[i][j]=0;

	printf(" Несортированный массив arr1[%d][%d]:\n",N,M);
	printf("----------------------------------------------------------------\n");

	for (i=0; i<N; i++)
	{
		printf("%d->\t",i+1);
		for (j=0; j<M; j++)
			{
				arr1[i][j]=rand()%100+10;
				printf("%5d",arr1[i][j]);
			}
		printf("\n");
	}
	
	printf("----------------------------------------------------------------\n");

	sortArr1(arr1);

	printf(" Сортировка исходного массива arr1[%d][%d] по строкам:\n",N,M);
	printf("----------------------------------------------------------------\n");

	for (i=0; i<N; i++)
	{
		printf("%d->\t",i+1);
		for (j=0; j<M; j++)
			{
				printf("%5d",arr1[i][j]);
			}
		printf("\n");
	}
	
	printf("----------------------------------------------------------------\n");

	sortArr2(arr1);

	printf(" Сортировка исходного массива arr1[%d][%d] по столбцам:\n",N,M);
	printf("----------------------------------------------------------------\n");

	for (i=0; i<N; i++)
	{
		printf("%d->\t",i+1);
		for (j=0; j<M; j++)
			{
				printf("%5d",arr1[i][j]);
			}
		printf("\n");
	}
	
	printf("----------------------------------------------------------------\n");

	sortArr3(arr1);

	printf(" Сортировка элементов исходного массива arr1[%d][%d] на главной диагонали:\n",N,M);
	printf("----------------------------------------------------------------\n");

	for (i=0; i<N; i++)
	{
		printf("%d->\t",i+1);
		for (j=0; j<M; j++)
			{
				printf("%5d",arr1[i][j]);
			}
		printf("\n");
	}
	
	printf("----------------------------------------------------------------\n");

	return 0;
}

//Функция сортировки пузырьком одномерного массива
int sortArr(int mass[N])
{
	int f,j;
	int temp;

	for (f=0; f<N; f++)
		for (j=0; j<N-1; j++)
		{
		if (mass[j]>mass[j+1])
			{
				temp=mass[j];
				mass[j]=mass[j+1];
				mass[j+1]=temp;
			}
		}
	return mass[N];
}

//Функция сортировки пузырьком двумерного массива по строкам
int sortArr1(int mass1[N][M])
{
	int f,j;
	int temp;
	int n=0;
	do
	{
	for (f=0; f<N; f++)
	{
		for (j=0; j<N-1; j++)
		{
		if (mass1[n][j]>mass1[n][j+1])
			{
				temp=mass1[n][j];
				mass1[n][j]=mass1[n][j+1];
				mass1[n][j+1]=temp;
			}
		}
	}
	n++;
	}
	while (n<N);

	return mass1[N][M];
}

//Функция сортировки пузырьком двумерного массива по столбцам
int sortArr2(int mass2[N][M])
{
	int f,j;
	int temp;
	int n=0;
	do
	{
	for (f=0; f<N; f++)
	{
		for (j=0; j<N-1; j++)
		{
		if (mass2[j][n]>mass2[j+1][n])
			{
				temp=mass2[j][n];
				mass2[j][n]=mass2[j+1][n];
				mass2[j+1][n]=temp;
			}
		}
	}
	n++;
	}
	while (n<N);

	return mass2[N][M];
}

//Функция сортировки пузырьком элементов двумерного массива на главной диагонали
int sortArr3(int mass3[N][M])
{
	int f,j;
	int temp;
	int n=0;
	
	for (f=0; f<N; f++)
	{
		for (j=0; j<N-1; j++)
		{
			if (mass3[f][j]==mass3[f+1][f+1])
				if (mass3[f][j]>mass3[f+1][j+1])
				{
					temp=mass3[f][j];
					mass3[f][j]=mass3[f+1][j+1];
					mass3[f+1][j+1]=temp;
				}
		}
	}
	

	return mass3[N][M];
}

