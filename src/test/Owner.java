package test;

import java.util.Scanner;

public class Owner
{
	private int id;
    private String name;
    private String email;
    private int phone;
    private String password;
    private String role;
	public Owner() 
	{
	
	}
	public Owner(int id, String name, String email, int phone, String password, String role) 
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	static Scanner sc=new Scanner(System.in);
	public static int ownerMenu()
	{
		System.out.println("***********************OWNER MENU*****************************");
		System.out.println("0.Sign out");
		System.out.println("1.Edit Profile");
		System.out.println("2.change password");
		System.out.println("3.subjectwise copies report");
		System.out.println("4.Bookwise copies report");
		System.out.println("5.Fees/Fine report");
		System.out.println("Enter choice");
		return sc.nextInt();	
	}
	
	private void editProfile() 
	{
	   System.out.println("New Email:");
	   sc.next();
	   sc.nextLine();
	   System.out.println("New Mobile:");
	   sc.next();
	   sc.nextLine();
	   System.out.println("Profile updated successfully..");
		
	}
	
	private void changePassword() 
	{
	System.out.println("New Password:");
	sc.next();
	sc.nextLine();
	System.out.println("password updated successfully");
		
	}
	
	private void subjectWiseCopiesReport() 
	{
		
		
	}
	
	private static void bookWiseCopiesReport() 
	{
		
	}
	
	public static void main(String[] args) 
	{
		int choice;
		Owner o1=new Owner();
		while((choice=Owner.ownerMenu())!=0)
		{
			switch(choice)
			{
			case 1: o1.editProfile();
				break;
			case 2:  o1.changePassword();
				break;
			case 3:o1.subjectWiseCopiesReport();
				break;
			case 4: bookWiseCopiesReport();
				break;
			case 5: 
				System.out.println("From date: ");
				sc.next();
			    sc.nextLine();
			    System.out.println("To date: ");
			    sc.next();
			    sc.nextLine();
				break;
			}
		}
	    	
	}
	
	
	
	
	
    
    
}
