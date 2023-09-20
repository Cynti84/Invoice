package invoicePackage;

public class InvoiceCreator {

	public static void main(String[] args) {
		String soldTo = "C026-01-0932/2022";
		String date = "9/17/2023";
		String address = "Cynthia Njoki";
		String contactNumber = "0100100100";
		int quantity;
		String itemDescription;
		double unitPrice;
		double amount;
		double subTotal;
		//double vat = subTotal * 0.16;
		//double totalAmount = subTotal + vat;
		
		
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
		quantity = 4; unitPrice = 20; itemDescription = "Pencil"; amount = quantity * unitPrice;
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(quantity+ " \t |\t" +itemDescription+ "\t\t\t |\t" +unitPrice+ "\t\t |\t" +amount );
		System.out.println("------------------------------------------------------------------------------");
		quantity = 10; unitPrice = 50; itemDescription = "ruler"; amount = quantity * unitPrice;
		System.out.println(quantity+ "\t |\t" +itemDescription+ "\t\t\t |\t" +unitPrice+ "\t\t |\t" +amount);
		System.out.println("------------------------------------------------------------------------------");
		quantity = 9; unitPrice = 30; itemDescription = "pens"; amount = quantity * unitPrice;
		System.out.println(quantity+ "\t |\t" +itemDescription+ "\t\t\t |\t" +unitPrice+ "\t\t |\t" +amount);
		System.out.println("------------------------------------------------------------------------------");
		quantity = 10; unitPrice = 80; itemDescription = "crayon"; amount = quantity * unitPrice;
		System.out.println(quantity+ "\t |\t" +itemDescription+ "\t\t\t |\t" +unitPrice+ "\t\t |\t" +amount);
		System.out.println("------------------------------------------------------------------------------");
		subTotal = amount;
		System.out.println("\t\t\t\t\t\t|Subtotal   \t|" +subTotal);
		System.out.println("\t\t\t\t\t\t--------------------------------");
		System.out.println("\t\t\t\t\t\t|VAT (16%)   \t| 264.00");
		System.out.println("\t\t\t\t\t\t--------------------------------");
		System.out.println("\t\t\t\t\t\t|Total Amount   \t| 1914.00");
		System.out.println("\t\t\t\t\t\t--------------------------------");
		
	
		
		
	}

}
