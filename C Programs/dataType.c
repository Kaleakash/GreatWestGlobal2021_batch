#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=10;
	float b =10.20;
	char c ='&';
	double d = 20.20;
	short int e = 30;
	long int f = 40;
	system("cls");
	printf("The value of a is = %d and size of int is = %d\n",a,sizeof(a));
	printf("The value of b is = %f and size of float is = %d\n",b,sizeof(b));
	printf("The value of c is = %c and size of char is = %d\n",c,sizeof(c));
	printf("The value of d is = %lf and size of double is = %d\n",d,sizeof(d));
	printf("The value of e is = %d and size of short int is = %d\n",e,sizeof(e));
	printf("The value of f is = %d and size of long int is = %d\n",f,sizeof(f));
}


