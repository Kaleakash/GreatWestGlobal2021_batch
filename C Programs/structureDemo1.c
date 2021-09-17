#include<stdio.h>
struct info{
int a;
float b;
char c;
};
void main() {
	struct info abc;
	struct info abc1={100,10.10,'$'};
	int n=10;
	printf("Value of n is = %d\n",n);	
	printf("Value of a is = %d\n",abc.a);
	printf("Value of b is = %f\n",abc.b);
	printf("Value of c is = %c\n",abc.c);
	printf("Value of a is = %d\n",abc1.a);
	printf("Value of b is = %f\n",abc1.b);
	printf("Value of c is = %c\n",abc1.c);
}