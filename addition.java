import java.util.Scanner;
public class addition
{

	public static void main(String[] args) 
	{	        
		        Scanner inputs = new Scanner(System.in);
		        System.out.println("Enter a:");
		        int a = inputs.nextInt();
		        System.out.println("Enter b:");
		        int b = inputs.nextInt();
		        int c = a + b;
		        System.out.println("Output: "+c);	    
	}

}
