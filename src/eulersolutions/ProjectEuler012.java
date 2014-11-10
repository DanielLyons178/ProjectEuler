package eulersolutions;

public class ProjectEuler012 {
	
	public static void main(String[] args){
		
		for(int i=1;true;i++){
			int tri = getTri(i);
			
			if(numOfFactors(tri)>500){
				System.out.println(tri);
				break;
			}
			
		}
		
		
	}
	
	public static int getTri(int num){
		int result =0;
		for(int i=1;i<=num;i++){
			result+=i;
		}
		
		return result;
	}
	
	public static int numOfFactors(int tri){
		int factorCount=0;
		
		for(int i=1;i<Math.sqrt(tri);i++){
			if(tri % i ==0){
			factorCount++;
			}
		}
		return factorCount*2;
		
		
	}
	

}
