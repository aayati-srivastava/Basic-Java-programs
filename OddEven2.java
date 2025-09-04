import java.util.Scanner;
public class OddEven2{
    public static void main(String[] args)
    {
        int n;
	Scanner input=new Scanner(System.in);
        System.out.println("enter number");
	n=input.nextInt();
	if (n%2==0){
		System.out.println("number is even");
	}
	else{
		System.out.println("number is odd");
        
    }
    input.close();
    }
}