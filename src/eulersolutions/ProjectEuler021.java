package eulersolutions;

import java.util.ArrayList;
import java.util.List;

public class ProjectEuler021 {

	public static void main(String[] args){
		int total = 0;
		for(int i=1;i<10000;i++){
			if(isAmicable(i)){
				total += i;
				System.out.println(i);
			}
		}
		System.out.println(total);
		
		
	}
	
	public static boolean isAmicable(int a){
		int b = d(a);
		return d(b) == a && a != b;
	}
	
	public static int d(int n){
		int total = 0;
		for(int i : divisors(n)){
			total +=i;
		}
		return total;
	}
	
	public static List<Integer> divisors(int n){
		List<Integer> divisors = new ArrayList<Integer>();
		
		for(int i =1;i<Math.sqrt(n);i++){
			if(n%i == 0){
				divisors.add(i);
				if(i != 1)
				divisors.add(n/i);
			}
		}
		
		
		return divisors;
	}
	
}
