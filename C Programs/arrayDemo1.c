#include<stdio.h>
#include<stdlib.h>
void main() {
	int abc[10];
	int n,i;
	system("cls");
	printf("how many number do you want to store Max 10\n");
	scanf("%d",&n);
	printf("Enter the number one by one \n");
	for(i=0;i<n;i++) {
		scanf("%d",&abc[i]);
	}
	printf("The number are\n");
	for(i=0;i<n;i++) {
		printf("%d\n",abc[i]);
	}
}
