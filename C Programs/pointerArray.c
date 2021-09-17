#include<stdio.h>
#include<stdlib.h>
void main() {
	int abc[]={10,20,30,40,50};
	int *ptr = abc;
	printf("Value of abc from 0 index position is =%d\n",abc[0]);
	printf("Value of abc from 0 index position using pointer =%d\n",(*ptr+0));
	printf("Value of abc from 1 index position is =%d\n",abc[1]);
	printf("Value of abc from 1 index position using pointer =%d\n",*(ptr+1));
	printf("Address of abc from 0 index position is =%d\n",&abc[0]);
	printf("Address of abc from 0 index position using pointer =%d\n",(ptr+0));
	printf("Address of abc from 1 index position is =%d\n",&abc[1]);
	printf("Address of abc from 1 index position using pointer =%d\n",(ptr+1));
}