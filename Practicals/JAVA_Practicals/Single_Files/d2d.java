import java.util.*;
class day{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,d,m,y;
		int c=2020,day;
		int x[]=new int[12];
		System.out.println("Day=");
		d=sc.nextInt();
		System.out.println("Month=");
		m=sc.nextInt();
		System.out.println("Year=");
		y=sc.nextInt();
        
        
        x[0]=4;
          x[1]=0;
            x[2]=0;
              x[3]=3;
                x[4]=5;
                  x[5]=1;
                    x[6]=3;
                      x[7]=6;
                        x[8]=2;  
                         x[9]=4;
                           x[10]=0;
                             x[11]=2;
            if (y>2021) {
                 for (i=0;y>2021 ;i++ ) {
                        for (j=0;j<12 ;j++ ) {
                      	     x[j]++;
                              }
                 	if (y%4==0) { 
                 		 for (j=2;j<12 ;j++ ) {
                      	    x[j]++;
                          }
                 	 }
                 	if ((y-1)%4==0) { 
                 		 for (j=0;j<2;j++ ) {
                      	    x[j]++;
                          }
                 	 }
                     y--;
                 }
            	
            }
             if (y<2021){ 
                for(;y<2021;){
                   for (n=0;n<12 ;n++ ) {
                      	      if(x[n]==0) {  x[n]=7;   }   x[n]--;
                         }
                 if (y % 4 ==0) {  for ( i=0;i<2 ;i++ ) {  
                      	      if(x[i]==0) {  x[i]=7;   }    x[i]--;
                                 	
                 }
                 	
                 }
                 if ((y+1) % 4 == 0) { for (n=2;n<12 ;n++ ) {  
                 	                           if(x[n]==0) {  x[n]=7;   }    x[n]--;
                 	
                 }
                 	
                 }
         
             	 y++;
             	
	            }
	        }       

             

         
         day=d+x[m-1];
        for (i=0;day>7 ; ) {
              day=day-7;
             }
         if (day==1) {
             	System.out.println("Day is  Monday");
             }   
          if (day==2) {
             	System.out.println("Day is  Tuesday");
             }   
              if (day==3) {
             	System.out.println("Day is  Wednesday");
             }   
              if (day==4) {
             	System.out.println("Day is  Thursday");
             }   
              if (day==5) {
             	System.out.println("Day is  Friday");
             }   
              if (day==6) {
             	System.out.println("Day is  Saturday");
             }   
              if (day==7) {
             	System.out.println("Day is  Sunay");
             }    
        

	}
}