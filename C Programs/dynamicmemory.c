#include<stdio.h>
#include<stdlib.h>
void main() {
	int *num;
	int n,i;
	printf("How many number do you want to store\n");
	scanf("%d",&n);
	//num = (int*)malloc(n*sizeof(int));	// default value is garbage or junk
	num = (int*)calloc(n,n*sizeof(int));	// default value is zero 
	printf("Enter the number one by one\n");
	for(i=0;i<n;i++) {
		scanf("%d",(num+i));		// &num[i];
	}
	printf("All number are\n");
	for(int i=0;i<n;i++) {
		printf("%d\n",*(num+i));	// num[i]
	}
	free(num);				// this function is use to destroy the memory.
}