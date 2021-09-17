#include<stdio.h>
struct Employee{
	int id;
	char name[10];
	float salary;
}emp1,emp2;		// structure array 
void main() {
	printf("Enter the id \n");
	scanf("%d",&emp1.id);
	printf("Enter the name \n");
	scanf("%s",&emp1.name);
	printf("Enter the salary \n");
	scanf("%f",&emp1.salary);
	printf("id is = %d\n",emp1.id);
	printf("id is = %s\n",emp1.name);
	printf("id is = %f\n",emp1.salary);
}