package eulersolutions;

public class ProjectEuler005 {

	public static void main(String[] args){
		int i =21;
		
		while(true){
			if(hasRemainder(i)){
				i++;
				continue;
			}else{
				System.out.println(i);
				break;
			}
			
		}
		
		
	}
	
	public static boolean hasRemainder(int n){
		for(int i=1;i<=20;i++){
			if(n%i !=0){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
