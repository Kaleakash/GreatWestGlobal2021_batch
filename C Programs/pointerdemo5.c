#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=10;
	int b=20;
	int *ptr = &a;
	printf("Value of a is = %d\n",a);
	printf("Value of b is = %d\n",b);
	printf("Value of a through prointer variable = %d\n",*ptr);
	printf("Address of a is = %d\n",&a);
	printf("Address of b is = %d\n",&b);
	printf("Address of a through pointer = %d\n",ptr);
	ptr--;
	printf("Address of a through pointer = %d\n",ptr);
	printf("Value of a through prointer variable = %d\n",*ptr);	
	printf("Value of a is = %d\n",a);	
}