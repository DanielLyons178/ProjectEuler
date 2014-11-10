package eulersolutions;

public class ProjectEuler001 {

	public static void main (String [] args){
		
		
		
		System.out.println(sum());

		
	}
	
	static int sum(){
		
		int total=0;
		
		for(int i=1;i<1000;i++){
			if(i%3  ==0 || i%5 ==0){
				total+= i;
			}
		}
		
		return total;
	}
	
	
}
