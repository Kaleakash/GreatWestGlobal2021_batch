#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=100;		 
	//int *ptr = &a;	// storing address of a in pointer variable while declaring 
	int *ptr;		// created pointer variable 
	int **ptr1  = &ptr;	// storing pointer variable address 
	ptr = &a;		// assign the address of a in pointer variable. 
	system("cls");
	printf("The value of a is = %d\n",a);
	printf("The addrss of a is = %d\n",&a);
	printf("The value of a is using pointer variable  = %d\n",*ptr);
	printf("The address of a is using pointer variable = %d\n",ptr);
	printf("The address of pointer varaible is %d\n",&ptr);
	printf("The address of ptr pointer varaible through pointer of poiter varaible is = %d\n",ptr1);
	printf("The value of a variable through pointer of pointer varaible is = %d\n",**ptr1);
	printf("The address of a through pointer of pointer variable = %d\n",*ptr1);		
}