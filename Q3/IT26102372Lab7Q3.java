import java.util.Scanner;
	public class IT26102372Lab7Q3{
		public static void main(String[] args){
	
		final double discount;
		discount = 0.05;
		int customer;
		double total;
		double discount_bill= 0.0;
		double amount_to_pay = 0.0;
		char payment_mode =' ';
		
		
		Scanner input = new Scanner(System.in);
		
		customer = 1;
		
		while (customer<=5){
			System.out.println("Customer " + customer);
			
			System.out.print("Enter total bill amount :" + " ");
			total = input.nextDouble();
			
			System.out.print("Enter mode of payment(C for cash,O for others) :");
			payment_mode = input.next().charAt(0);
			
			if (payment_mode == 'C' || payment_mode == 'c'){
				discount_bill = total * discount;
				
				System.out.println("Discount is :" + discount_bill);
				amount_to_pay = total - discount_bill;
				System.out.println("Amount to be paid :" + amount_to_pay);
			}
			else if(payment_mode == 'O' || payment_mode == 'o'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid :" + total);
			}
			else {
				System.out.println("Payment mode is not valid");
			}
			
			System.out.println();
			customer = customer + 1;
			}
	input.close();
	}
}