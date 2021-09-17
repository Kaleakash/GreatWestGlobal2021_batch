#include<stdio.h>
#include<string.h>
void main() {
	char *fname="Raj";
	char *lname="Deep";
	char firstname[10]={"Raj"};
	char lastname[10]={"Deep"};
	int leng;
	leng = strlen(fname);
	printf("Number of character is = %d\n",leng);
	if(strcmp(fname,lname)==0) {
		printf("Equal\n");
	}else {
		printf("Not Equal\n");
	}
	printf("first name is =%s\n",firstname);
	printf("last name is =%s\n",lastname);
	strcpy(firstname,lastname);
	printf("first name... is =%s\n",firstname);
	printf("last name is =%s\n",lastname);
}