#include<stdio.h>
#include<stdlib.h>
void main() {
	int abc[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int i,j;
	system("cls");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			printf("%d \t",abc[i][j]);
		}	
		printf("\n");
	}
}
