#include<stdio.h>
void main() {
	//char name[]={"Raj Deep"};
	char *name="Raj Deep Kumar";
	int i=0;
	while( name[i] != '\0' ){
		printf("%c\n",name[i]);	
		i++;
	}
}