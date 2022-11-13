/*
* Name : LONIE MAE SALISE16
* Section: Devotion
* Year : 4th 
*/

package hardcoding;
import java.util.Scanner;

public class Main{

  public static void main(String[]args) {
  
  Scanner console = new Scanner(System.in);
  
  
  String orderCart = "Your orders are the following: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
  System.out.println("| DO YOU WANT TO ORDER? [1-YES, 2-NO]            |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  respondToOrder = console.nextInt(); 
  
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	  System.out.println("|WHAT TO ORDER? [1-FOOD, 2 - BEVERAGES , 3-SNACKS|");
	  System.out.println("| Enter the number for your choice below         |");
	  System.out.println("==================================================");
	  System.out.print  ("Choice:");
	  orderCategory = console.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|***************ORDER FOOD***********************|");
	    System.out.println("| [1] Unli-Chicken Wings + Unli-Rice : P260.00   |");
	    System.out.println("| [2] Unli-Pork Fat + Sisig          : P170.00   |");
	    System.out.println("| [3] Bangus Sisig + Unli-Rice       : P200.00   |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    float unliChicken = 260 , unliPork = 170, bangusSisig = 200;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Unli-Chicken Wings + Unli-Rice: P260.00 added to cart");
		  totalPayment+=unliChicken;
		  String order1 = "Unli-Chicken Wings + Unli-Rice: P260.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Unli-Pork Fat + Sisig P 170   : P170.00  added to cart");
		  totalPayment+=unliPork;
		  String order2 = "Unli-Pork Fat + Sisig          : P170.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Bangus Sisig + Unli-Rice      : P200.00 added to cart");
		  totalPayment+=bangusSisig;
		  String order3 = "Bangus Sisig + Unli-Rice      : P200.00 \n";
		  orderCart+=order3;
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|***************ORDER BEVERAGE********************|");
	    System.out.println("| [1] 1-Bucket of Red Horse Stallion : P320.00    |");
	    System.out.println("| [2] 1-Tower of Beer na Beer Pilsen : P290.00    |");
	    System.out.println("| [3] Kulafu Special for Cult Members: P190.00    |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float redhorse = 320 , bnbp = 290, kulafu = 190;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1-Bucket of Red Horse Stallion : P320.00 added to cart");
		  totalPayment+=redhorse;
		  String order1 = "1-Bucket of Red Horse Stallion : P320.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1-Tower of Beer na Beer Pilsen : P290.00 added to cart");
		  totalPayment+=bnbp;
		  String order2 = "1-Tower of Beer na Beer Pilsen : P290.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Kulafu Special for Cult Members: P190.00  added to cart");
		  totalPayment+=kulafu;
		  String order3 = "Kulafu Special for Cult Members: P190.00 \n";
		  orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|*************ORDER SNACKS / PULUTAN*************|");
	    System.out.println("| [1] Chicken Skin in a plate       : P160.00    |");
	    System.out.println("| [2] Kropek Dragon Skin            : P190.00    |");
	    System.out.println("| [3] Kropek Vegatarian Special     : P140.00    |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float chickenSkin = 160 , kropekDragon = 190, kropekVeg = 140;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Chicken Skin in a plate       : P160.00 added to cart");
		  totalPayment+=chickenSkin;
		  String order1 = "Chicken Skin in a plate       : P160.00 \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Kropek Dragon Skin            : P190.00 added to cart");
		  totalPayment+=kropekDragon;
		  String order2 = "Kropek Dragon Skin            : P190.00 \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Kropek Vegatarian Special     : P140.00  added to cart");
		  totalPayment+=kropekVeg;
		   String order3 = "Kropek Vegatarian Special     : P140.00 \n";
		   orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Okay! Have a nice day!~ 😉");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = console.nextInt();
   
    
  } while(respondToOrder == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = console.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(orderCart);
     System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you come again!");
  
  
  
  
  

  }


}