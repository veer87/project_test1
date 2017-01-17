package tester;

import java.util.Scanner;

import HibUtils.HibernateUtils;
import dao.UserDao;
import pojo.NewUser;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtils.getSf();
		UserDao dao=new UserDao();
		boolean flag=true;
		while(flag){
			try{
				System.out.println("1. Insert new user");
				System.out.println("2. Delete user");
				System.out.println("3. Quit");
				System.out.println("Enter your option");
				Scanner sc=new Scanner(System.in);
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter name, email and password");
					dao.insert(new NewUser(sc.next(),sc.next(),sc.next()));
					System.out.println("New user added into the database");
					break;
				case 2:
					System.out.println("Enter email and password to delete");
					String em=sc.next();
					String ps=sc.next();
					dao.delete(em, ps);
					break;
				case 3:
					System.out.println("Good bye...");
					HibernateUtils.getSf().close();
					sc.close();
					flag=false;
					break;
				default:
					System.out.println("Invalid option, try again");
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception in tester :"+e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
