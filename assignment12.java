
import java.util.Scanner;
class assignment12 {
 
    
    public static String Validate (String Password) {

		String result = "Valid Password";	
		int length = 0;						
		int numCount = 0;					
		int capCount = 0;	
        int lowCount = 0;				


		for (int x =0; x < Password.length(); x++) {
			
			if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {	//used ascii values for password validation		
				numCount ++;
			}

			if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {			
				capCount ++;
			}
            if ((Password.charAt(x) > 97 && Password.charAt(x) < 122)) {			
				lowCount ++;
            }
			length = (x + 1);								

		} 

		if (numCount <3){									
			result = "Not Enough Numbers in Password";
		}

		if (capCount <3) {									
			result = "Not Enough Capital Letters in Password";
		}
        if (lowCount <3) {									
			result = "Not Enough Lower Case Letters in Password";
		}

		if (length <8){									
			result = "Password is Too Short";
		}
        if (length >16){
            result = "Password is Too Long";
        }
        

			return (result);
 
    }
    public static void main(String args[]){
        Scanner scnr= new Scanner(System.in);
        while (true){
            System.out.println("please enter a password or press enter to exit the program");
            String pass = scnr.next();
            if (pass == ""){
                break;
                
            }
            else {
                System.out.println(Validate(pass));

            }
            
    }
    }
      
        
}