package java.awesome;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// using for loop	
//		int i =1 ;
//		int numbers = 10;
//		 int Total = 0;
//		for(i=1;i<=numbers;i++)
//{
//
//			Total = i+Total;	
//		}
//System.out.println("sum of first ten natural numbers is ---" +Total);
//}
	
	//using while loop
//	int i =1 ;
//	int numbers = 10;
//	 int Total = 0;
//	 while(i<=numbers) {
//		 
//		 Total = i+Total;
//		 i++;
//	 }
//	 System.out.println("sum of first ten natural numbers is ---" +Total);
//	}
	
		int i =1 ;
		int numbers = 10;
		 int Total = 0;
		 do {
			 System.out.println(i);
			 Total = i+Total;
			 i++;
		 }while(i<=numbers);
	
	System.out.println("sum of first ten natural numbers is ---" +Total);
	}
	

	}
