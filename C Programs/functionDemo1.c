#include<stdio.h>
#include<stdlib.h>
void info() {
	printf("This is user-defined function\n");
}
void addNumber(int a, int b) {
	int sum;
	sum = a+b;
	printf("Sum of two number is add number funtion is = %d\n",sum);
}
int subNumber(int a, int b) {
	int sub;
	sub = a-b;
	return sub;	
}
char getChar();	// function declaration 
void main() {
	int result;
	char result1;
	system("cls");
	printf("This is main function\n");	
	info();		// calling the function by name	
	addNumber(10,20);
	addNumber(1,2);
	addNumber(100,200);
	result = subNumber(20,10);
	result1 = getChar();
	printf("Substraction of two number is  in main function = %d\n",result);
	printf("The character is = %c\n",result1);
}

char getChar() {
	char a='$';
	return a;
}