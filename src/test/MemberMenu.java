package test;



import java.util.Scanner;



public class MemberMenu {
	   static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		 {
			while((choice=MemberMenu.menuList())!=0)
			{
				switch (choice) {
                 case 0:
				    
					break;
				case 1:
					editProfile();
				    
					break;
	            case 2:
					 editPassword();
					  
					break;
	            case 3: 
	                   findBookByName();
	            	break;
	            case 4:
	            	bookAvailability();
	            	break;
	            case 5:issuedBooks();
	            	break;
	            case 6:
	            	paymentHistory();
	            	break;

				
				}
			}
			
		} 
		}
	

	

	

	
	private static void issuedBooks() {
		
		
	}







	private static void editPassword() {
		System.out.println("enter password");
		sc.nextLine();
		String password =sc.nextLine();
        System.out.println("password updated successfully");
		
	}







	private static void editProfile() {
		System.out.println("new email :");
		sc.nextLine();
        String email =sc.nextLine();
        System.out.println("new mobile :");
        String mobile =sc.nextLine();
        System.out.println("profile updated successfully");
		
	}







	private static void bookAvailability() {
		System.out.println("enter book id :");
        int id =sc.nextInt();
        System.out.println("avaliable copies :");
	}







	private static void findBookByName() {
		System.out.println("enter book name : ");
		sc.nextLine();
		String book_name=sc.nextLine();
		System.out.println("id :   name :  author :   subject :  price :  isbn :" );
	
		
	}







	private static void paymentHistory() {
		
		System.out.println("id :   member_id :  amount :   type :  tx_time : due_date :" );
		
	}







	private static int menuList() {
		System.out.println("---------------------------------MEMBER'S MENU----------------------------------------");
		System.out.println("0. SIGN OUT");
		System.out.println("1. EDIT PROFILE ");
		System.out.println("2. CHANGE PASSWORD");
		System.out.println("3. FIND BOOK BY NAME");
		System.out.println("4. CHECK BOOK AVAILABILITY");
		System.out.println("5. LIST ISSUED BOOKS");
		System.out.println("6. PAYMENT HISTORY");
		System.out.println("ENTER CHOICE  : ");
		return sc.nextInt();
	}

}
