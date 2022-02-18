package Class;

import java.util.Scanner;
import java.util.scanner;

public class mkay {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner R=new Scanner(System.in);
    Scanner Rn=new Scanner(System.in);
    Scanner Circ=new Scanner(System.in);
    System.out.println("Input the values of R1");
    int R1= R.nextInt();
    System.out.println("Input the values of R2");
    int R2= R.nextInt();
    float series_circuit= R1+R2;
    int result= R1+R2;
    float parallel_circuit =1/R1 + 1/R2;
    float result = 1/R1 + 1/R2;
    System.out.println("float result for series =" + (R1+R2));
    System.out.println("float result for parallel="  + result );
    int Rm= R.nextInt();
	}

}
