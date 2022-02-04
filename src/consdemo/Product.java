package consdemo;

public class Product {
	 
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	
	//constructor -- used to initialize
	public  Product() {
		productId = 1;
		productName = "Lakme";
		quantityOnHand = 100;
		price = 99;
		
		System.out.println("PRODUCT CONSTRUCTOR CALLED");
	}
	
	
	
	public void printProductDetails() {
		System.out.println("Product Id : " + productId );
		System.out.println("Product Name : " + productName );
		System.out.println("Quantity On Hand : " + quantityOnHand );
		System.out.println("Product Price : " + price );
		
	}

	public static void main(String[] args) {
		
		Product product1 = new Product();
		System.out.println("Printing the details about product1 : ");
		product1.printProductDetails();
		
		System.out.println("==============================");
		
		System.out.println("Printing the details about product2 : ");
		Product product2 = new Product();
		product2.printProductDetails();
		
		System.out.println("==============================");
		
		new Product().printProductDetails();
		
	}

}
