public class SmallestElement {

	
public static void main(String[] args) {
		
		int no[] = {40 , 77 , 80 , 90 , 23 , 105};
		
		int min = no[0];
		
		for(int i = 1; i< no.length ; i++) {
			if(no[i] < min) {
				min = no[i]; // 105	
			}
		}
		System.err.println("Smallest number : "+min);
		
	}

}


