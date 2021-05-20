package new12;

import java.util.Scanner;

public class Project2 {
	public void task1() {
		for(int i=0;i<100;i++)
		{
			if((i%3==0)|(i%5==0))
			{
				if((i%3==0)&(i%5==0))
				{
					
					System.out.println("Planetit Testing");
				}
			else if(i%3==0) {
				System.out.println("Planetit");
				
					
			}
			else if(i%5==0) {
				System.out.println("Testing");
				
					
			}
				
				
			}
			else {
				System.out.println(i);
			}
		}
	}
	static final int N = 256;
	 static char result = ' ';
public static char MaxOccuringChar(String str1)
{
	
	  int ctr[] = new int[N];
	  int l = str1.length();
	  for (int i = 0; i < l; i++)
	   ctr[str1.charAt(i)]++;
	  int max = -1;
	 

	  for (int i = 0; i < l; i++) {
	   if (max < ctr[str1.charAt(i)]) {
	    max = ctr[str1.charAt(i)];
	    result = str1.charAt(i);
	   }
	  }
	  if(result==' ') {
		  return result;
	  }
	  if (result !=' ') {
		  char str2=str1.toLowerCase().charAt(0);
		  return str2;
	  }
	return result;
	  
	

}
	 

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project2 obj1=new Project2();
		obj1.task1();
		System.out.println("Enter a string to find out max occcuring char");
		Scanner obj=new Scanner(System.in);
		String obj2=obj.next();
		System.out.println("Ans is"+" "+MaxOccuringChar(obj2));
		

	}

}
