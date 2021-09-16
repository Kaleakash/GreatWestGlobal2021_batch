#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=100;		 
	int *ptr = &a;	
	system("cls");
	printf("Address of a is %d\n",&a);
	printf("The value of a is = %d\n",a);	// a=100;
	printf("The value of a through pointer variable is = %d\n",*ptr);	//*ptr=100
	a++;
	printf("The value of a is = %d\n",a);	// a=101	
	printf("The value of a through pointer variable is = %d\n",*ptr);// *ptr  =101
	(*ptr)++;
	//*(ptr++);
	printf("The value of a is = %d\n",a);	// a=102	
	printf("The value of a through pointer variable is = %d\n",*ptr);// *ptr  =102				
}