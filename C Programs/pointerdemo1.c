#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=100;		// 2 byte or 4 byte 
	int b=200;
	system("cls");
	printf("The value of a is = %d\n",a);
	printf("The addrss of a is = %d\n",&a);
	printf("The value of b is = %d\n",b);
	printf("The addrss of b is = %d\n",&b);
	a++;	// trying to maths operation on variable 
	//&a++;	// trying to maths operation on address 
}