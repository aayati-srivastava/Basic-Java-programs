import java.util.Scanner;
public class MathsMarks3{
    public static void main(String[] args)
    {
        int n;
	Scanner input=new Scanner(System.in);
        System.out.println("enter number of marks");
	n=input.nextInt();
	if (n%3==0){
		System.out.println("marks = "+n);
	}
	else{
		System.out.println("result not printed");
        
    }
    input.close();
    }
}