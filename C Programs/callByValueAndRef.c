#include<stdio.h>
void callByValue(int x, int y) {
	printf("In callByValue function\n");
	printf("The value of a is = %d\n",x);
	printf("The value of b is = %d\n",y);
		x++;
		y++;
	printf("The value after change in callByValue funciton is \n");	
	printf("The value of a is = %d\n",x);
	printf("The value of b is = %d\n",y);	
}
void callByRef(int *x, int *y) {
	printf("In callByRef function\n");
	printf("The value of a is = %d\n",*x);
	printf("The value of b is = %d\n",*y);
		(*x)++;
		(*y)++;
	printf("The value after change in callByRef funciton is \n");	
	printf("The value of a is = %d\n",*x);
	printf("The value of b is = %d\n",*y);	
}
void main() {
	int a=10;
	int b=20;
	printf("In main function\n");
	printf("The value of a is = %d\n",a);
	printf("The value of b is = %d\n",b);
	//callByValue(a,b);
	callByRef(&a,&b);
	printf("The value in main function\n");
	printf("The value of a is = %d\n",a);
	printf("The value of b is = %d\n",b);
}