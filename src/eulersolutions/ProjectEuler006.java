package eulersolutions;


public class ProjectEuler006 {

	public static void main(String [] args){
		
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int sum = 0;
		
		for(int i =1; i<=100; i++){
			sumOfSquares = sumOfSquares + (i*i);
		}
		
		for(int j = 1; j<=100; j++){
			sum = sum + j;
		}
		
		squareOfSum = sum*sum;
		
		System.out.println("Sum of Squares is: " + sumOfSquares);
		System.out.println("Sum is: " + sum);
		System.out.println("Square of sum is: " + squareOfSum);
		System.out.println("Difference between sum of squares and square of sum is: " + (squareOfSum - sumOfSquares) );
	}
	
}

