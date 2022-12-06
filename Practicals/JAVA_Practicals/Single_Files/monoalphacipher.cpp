#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<iostream>
using namespace std;
main()
{ //clrscr();
char k[26],p[45],c[45],m[45],x;
int i=0,j=0,n=0,d=0,d1;
cout<<"Enter key=";
cin>>k;
cout<<"Enter msg=";
cin>>m;
 
for(i=0;i<strlen(m);i++ ){

for(x='a',n=0;x>='a'&&x<='z';x++,n++){ if(m[i]==x){ c[i]=k[n];  } }
for(x='A',j=0;x>='A'&&x<='Z';x++,j++){  if(m[i]==x){ c[i]=k[j];}  }
 }
cout<<"cipher text is = ";
for(i=0;i<strlen(m);i++){cout<<c[i]; }
//  decryption
for(i=0;i<strlen(m);i++){
for(d=0;d<26;d++){if(k[d]==c[i]){d1=d; d=26;  }  }


for(x='a',n=0;x>='a'&&x<='z';x++,n++){ if(n==d1){ p[i]=x;  } }
// for(x='A',j=0;x>='A'&&x<='Z';x++,j++){  if(m[i]==x){ c[i]=k[j];}  }
 }
cout<<"plain text is = ";
for(i=0;i<strlen(m);i++){cout<<p[i]; }


getch();
 return 0;
 }
