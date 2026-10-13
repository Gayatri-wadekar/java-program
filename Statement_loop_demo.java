public class Statement_loop_demo {
    
	public static void main(String[] args) {
		
		float marks= 59;
		
//		marks-->less than 30--> fail
//		31 to 50-->c
//		51 to 60-->B
//		61 to 80--> A
//		81 to 100--> A+
		
		if(marks<30) {
			System.out.println("fail");
		}
		else if((marks>=30) && (marks<50)) {
			System.out.println("C");
		}
		else if((marks>=51) && (marks<60)) {
			System.out.println("B");
		}
		else if((marks>=61) && (marks<80)) {
			System.out.println("A");
		}
		else if((marks>=81) && (marks<100)) {
			System.out.println("A+");
		}
		else {
			System.out.println("invalid marks");
		}
		
		
		//switch case
		
		int day = 0;

		switch (day) {

		    case 0: {
		        System.out.println("Sunday");
		        break;
		    }

		    case 1: {
		        System.out.println("Monday");
		        break;
		    }

		    case 2: {
		        System.out.println("Tuesday");
		        break;
		    }

		    case 3: {
		        System.out.println("Wednesday");
		        break;
		    }

		    default: {
		        System.out.println("Invalid day");
		    }
		}
		
		
		// for loop
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        
        
        // while loop
        int i = 1;

        while(i <= 5) {
            System.out.println(i);
            i++;
        }
		
        
     // do-while loop
        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while(j <= 5);
		
		
		
		}
		
	}
	
