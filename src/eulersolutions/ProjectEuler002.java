package eulersolutions;

public class ProjectEuler002 {

	public static void main(String [] args){
		int sum=0;
		int term=1;
		
		while(fibonacci(term) <=4000000){
			int currentTerm =fibonacci(term);
		if(currentTerm % 2 ==0){
			sum += currentTerm;
		}
			
			term++;
		}
		
		System.out.println(sum);
		
	}
	
	
	public static int fibonacci(int term){
		int n=0;
		int temp1=0;
		int temp2=0;
		for(int i=1;i<=term;i++){
			if(i==1){
				n=1;
				temp2=temp1;
				temp1=n;
				
			}else if(i==2){
				n=2;
				temp2=temp1;
				temp1=n;
			}else{
			
			n=temp1+temp2;
			
			temp2=temp1;
			temp1 = n;
			}
			
			
		}
		return n;	
	}
}
