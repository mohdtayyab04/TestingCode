package Package1;

public class Hawaldar extends Inspector {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inspector obj = new Inspector("mhdfarhan2611@gmail.com", "pass321");
		System.out.println(obj.getpassword());
		
		
		obj.setPassword("Acco", "mhdfarhan2611@gmail.com");
		
		System.out.println(obj.getpassword());
		
				
		

	}

}
