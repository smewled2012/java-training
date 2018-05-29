import java.util.Scanner;

public class fibbonacci {
	//by the sum of two previous numbers 
	//fib 0=0
	//fib 1= 1;
	//fib 2 = fib(0)+fib(1) 0+1 = 1 
	//fib 3 = fib 2+fib 1= 1 + 1 =2
	//fib 4 = fib3+ fib 2 = 2+1= 3
	//fib 5 = fib 4+fib 3 = 3+2 = 5
	// fibonnacci series the code that i have been using 
	
	public static int fibo(int n) {
		
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return (fibo(n-1) + fibo(n-2));
		}
	}
	public static void main(String [] args ) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer : ");
		int num = input.nextInt();
		
		int fib = fibo(num);
		
		System.out.println("the fibonnacci series of " + num +" is "+ fib);
		
	}
	

	}


