package java.awesome;

public class countofb {

	public static void main(String[] args) {
		
		char[] ch = {'a','b','b','c','d','b','f'};    
        int count = 0;    
            
        //Counts each character except space    
        for(char c: ch) {
        	
        	if(c=='b') {
        	count = count+1;  
        }    
        
        
        }
        System.out.println("Total number of  b characters coocurs in a string: " + count +"times");  

	}
          
    }    
     