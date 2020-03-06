import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int number,x=0;
	    System.out.println("Enter the Integer");
	    
	    number = in.nextInt();
	    //length of the integer
	    int length = (int)(Math.log10(number));
	    String result =null;
	    //get first right digit by using mode
	    x=number%10;
	    
	    result=String.valueOf(x);
	   // to obtain next digits
	    for(int i=1; i<=length;i++) {
	    number=number/10;
	    x=number%10;
	    result=String.valueOf(x)+result;
	    }
	    System.out.println(result);
}



	}

