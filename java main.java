/*
* Name : Lonie Mae Salise
* Section: Devotion
* Year : 4th 
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner code=new Scanner(System.in);
		int i=1;
		int total=2;
		int rep=3;

		while(i==1){
		    System.out.println("ENTER GRADE:");
		    int grade=code.nextInt();
		    
		    total+=grade;
		    rep+=i;
		    
		    System.out.println("DO YOU WANT TO ENTER ANOTHER GRADE?\n[1]YES   [2]NO:");
		    i=code.nextInt();
		    
		}
		total=total/rep;
		System.out.println("AVERAGE:"+total);
    }	
}