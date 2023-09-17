package invoicePackage;

public class InvoiceCreator {

	public static void main(String[] args) {
		String soldTo = "C026-01-0932/2022";
		String date = "9/17/2023";
		String address = "Cynthia Njoki";
		String contactNumber = "0100100100";
		int quantity=4;
		String itemDescription = "Sample Item";
		double unitPrice = 10.99;
		double amount = quantity * unitPrice;
		double subTotal = amount;
		double vat = subTotal * 0.16;
		double totalAmount = subTotal + vat;
		
		
		System.out.println("***********************Adamson Compuuters Ltd*************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("\t\t VAT REG. TIN 098-765-4321-0000");
		System.out.println("\t\t\t SALES INVOICE \n");
		
		
		
		System.out.print("Sold To: " +soldTo);
		System.out.println("\t\t\t Date: " +date);
		System.out.print("Address: " +address);
		System.out.println("\t\t\t\t Contact Number: " +contactNumber);
		
		
		
		System.out.println("\n\n------------------------------------------------------------------------------");
		System.out.println("Qty \t | \t Item Description \t | \t Unit price \t | \t Amount");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("4 \t |\t pencil \t\t |\t 20 \t\t |\t 80.00");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("10 \t |\t Duster \t\t |\t 50 \t\t |\t 500.00");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("9 \t |\t pens \t\t\t |\t 30 \t\t |\t 270.00");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("10 \t |\t Crayon \t\t |\t 80 \t\t |\t 800.00");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t|Subtotal   \t| 1650.00");
		System.out.println("\t\t\t\t\t\t--------------------------------");
		System.out.println("\t\t\t\t\t\t|VAT (16%)   \t| 264.00");
		System.out.println("\t\t\t\t\t\t--------------------------------");
		System.out.println("\t\t\t\t\t\t|Total Amount   \t| 1914.00");
		System.out.println("\t\t\t\t\t\t--------------------------------");
		
	
		
		
	}

}
