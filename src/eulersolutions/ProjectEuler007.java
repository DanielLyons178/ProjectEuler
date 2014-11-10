package eulersolutions;

public class ProjectEuler007 {

	public static void main(String[] args){
		int primeCount =0;
				int i = 0;
		while(true){
			if(isPrime(i)){
				primeCount++;
				if(primeCount ==10001){
					break;
				}
			}
			i++;
		}
		System.out.println(i);
	}
	
	public static boolean isPrime(int n){
		int checkTo = (int) (Math.sqrt(n)+1);
		
		for(int i=2;i<checkTo;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	
}
