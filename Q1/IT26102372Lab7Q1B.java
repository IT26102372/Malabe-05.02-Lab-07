import java.util.Scanner;
	public class IT26102372Lab7Q1B{
	public static void main (String[] args){
	int i,j;
	double Average,sum;
	String Distinction,Credit,Fail;
	
	Scanner input = new Scanner(System.in);
	
	i=1;
	
	while(i<=3){
	System.out.println("Student" + i);
	
	System.out.print("Enter marks :");
	int[] marks = new int[4];
	j = 0;
	sum = 0;
	
	while (j < 4){
	marks[j] = input.nextInt();
	sum = sum + marks[j];
	
	j++;}
	Average = sum/4.0;
	System.out.println("Average = " + Average);
	
		if (100<= Average || Average >= 75) {
			System.out.println("Overall Grade is : Distinction" );
		}
			else if (74<= Average || Average >=50){
				System.out.println("Overall Grade is : Credit");
			}
	
			else {
				System.out.println("Overall Grade is : Fail");
            }
	System.out.println();
	i=i+1;
	
	}
	input.close();
	}
}