#include<stdio.h>
#include<string.h>
int main(){
	char a[100];
	char b[20];
	int l,n,i;
	int t;
	scanf("%s",a);
	scanf("%s",b);
	 l=strlen(a);
     n=strlen(b);
     for(i=0;i<n;i++){
     	a[l]=b[i];
     	l++;
     	
	 }
	 for(i=0;i<l;i++){
	 	printf("%c",a[i]);
	 }
	 
	 
}
