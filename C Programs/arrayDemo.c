#include<stdio.h>
#include<stdlib.h>
void main() {
	int abc[10];
	int i;
	int xyz[10]={10,20,30,40,50,60,70,80,90,100};
	system("cls");
	printf("Value of 0 index position is = %d\n",abc[0]);
	printf("Value of 1 index position is = %d\n",abc[1]);
	printf("Value of 0 index position is of xyz array = %d\n",xyz[0]);
	printf("Value of 1 index position is of xyz array = %d\n",xyz[1]);
	for(i=0;i<12;i++) {
		printf("Value of array variable is = %d\n",xyz[i]);
	}
}
