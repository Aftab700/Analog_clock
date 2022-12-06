import java.util.*;
class p3{
	public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        int i=0,x,n=0,a=0,j,r;
         /*   count vowels and words that start with capital letters*/
	
		for (x=0;x<3 ; ) { 
			
		System.out.println("Enetr string=");
		s=sc.nextLine();
		r=s.length(); 
	if ( s.length()>4&&s.charAt(r-4)=='q'&&s.charAt(r-3)=='u'&&s.charAt(r-2)=='i'&&s.charAt(r-1)=='t') 
			{ x=7;   
		
			
		} 
		for (i=0;i<s.length() ;i++ ) {
			if (s.charAt(i)=='a') { a++;
				
			}if (s.charAt(i)=='e') { a++;
				
			}if (s.charAt(i)=='i') { a++;
				
			}if (s.charAt(i)=='o') { a++;
				
			}if (s.charAt(i)=='u') { a++;
				
			}if (s.charAt(i)=='A') { a++;
				
			}if (s.charAt(i)=='E') { a++;
				
			}if (s.charAt(i)=='I') { a++;
				
			}if (s.charAt(i)=='O') { a++;
				
			}if (s.charAt(i)=='U') { a++;
				
			}

   		}if (s.charAt(0)>='A'&&s.charAt(0)<='Z') { n++;
   			
   		}for (j=0;j<s.length()-1 ;j++ ) {
   		  if (s.charAt(j)==' '&& s.charAt(j+1)>='A'&&s.charAt(j+1)<='Z') { n++;
   			
   		}
   			
   		} 
      System.out.println("number of vowel="+a);
       System.out.println("number of words start with capital letter="+n);
       a=0; n=0;
       
       }
	}
}