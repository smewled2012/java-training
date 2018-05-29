import java.util.Scanner;

public class factorial {
	int f;
	
	public static int factor(int x) {
		if (x==0) {
			return 1;
		}
		else if (x==1) {
			return 1;
		}
		else {
			
				return ((x)*factor(x-1));
				//x=x-2
			
		}
	}

	public static void main(String[] args) {
		// fac 0 = 1
		//factor 1= 1
		//factorial(2) = 2*1 = 2
		//factorial (3) = 3*2*1= 6
		//factorial(4) = 4*3*2*1 = 24
		//5! = 5*4*3*2*1 = 120
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some integer number \n");
		int num = input.nextInt();
		
		int sum = factor(num);
		
		System.out.println("Tha factorial of the number is "+ sum);

	}

}
