package eulersolutions;


import java.util.ArrayList;

public class ProjectEuler003 {
	
	public static void main(String [] args){
		long max =0;
		long n =600851475143L;
		
		long[] factors = getFactors(n);
		
		for(long i: factors){
			if(isPrime(i) && i > max){
				max = i;
			}
		}
		System.out.println("Max prime factor of " + n + " is: " + max);
		
	}
	
	public static boolean isPrime(long n){
		int checkTo = (int) (Math.sqrt(n)+1);
		
		for(int i=2;i<checkTo;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static long[] getFactors(long n){
		ArrayList<Long> factors = new ArrayList<Long>();
		
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				factors.add((long)i);
				factors.add((long)n/i);
			}
		}
		long[] factorsArr = new long[factors.size()];
		for(int i=0;i<factors.size();i++){
			factorsArr[i] =  (long) factors.get(i) ;
		}
		return factorsArr;
		
	}
	
	
	}


