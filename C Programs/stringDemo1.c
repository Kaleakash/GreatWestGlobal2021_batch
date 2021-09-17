#include<stdio.h>
void main() {
	char name1='a';
	char name2[]={'R','a','j'};
	char name3[]={"Raj Deep"};
	//char name4[5]="Welcome to C programming";
	char *name4 = "Welcome to C programming language";
	printf("Value of name1 is = %c\n",name1);
	printf("Value of name2 is = %c\n",name2[0]);
	printf("Value of name2 is = %c\n",name2[1]);
	printf("Value of name2 is = %c\n",name2[2]);
	printf("Value of name3 is = %s\n",name3);
	printf("Value of name4 is = %s\n",name4);
}