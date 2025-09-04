import java.util.Scanner;
public class VoteEligibility1{
    public static void main(String[] args)
    {
        int age;
	Scanner input=new Scanner(System.in);
        System.out.println("enter age");
	age=input.nextInt();
	if (age>18){
		System.out.println("you are eligible to vote");
	}
	else{
		System.out.println("you are not eligible to vote");
        
    }
    input.close();
    }
}