package consdemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(10182, "Daniel",  5);
		review1.reviewCount++;
		
		System.out.println(" The review1's  reviewId, reviewGivenby , rating is: "  + 
				review1.getReviewId()+ " , " + 
				review1.getReviewGivenBy() + " , " + 
				review1.getRating());
		System.out.println(" review1.reviewCount : " + review1.reviewCount);
		
		System.out.println("=============================");
		
		Review review2 = new Review(1085, "Richard", 5);
		review2.reviewCount++;
		
		System.out.println(" The review2's  reviewId, reviewGivenby , rating is: "  + 
				review2.getReviewId()+ " , " + 
				review1.getReviewGivenBy() + " , " + 
				review1.getRating());
		
		System.out.println(" review2.reviewCount : "+  review2.reviewCount);
		System.out.println("=============================");
		
		Review review3 = new Review();
		review3.reviewCount++;
		
		System.out.println(" The review3's  reviewId, reviewGivenby , rating is: "  + 
				review3.getReviewId()+ " , " + 
				review3.getReviewGivenBy() + " , " + 
				review3.getRating());
		
		System.out.println(" review2.reviewCount : " + review3.reviewCount);
		
		
	}

}
