package Package1;

public class Inspector {
	//Encapsulation: it is used to hide the data members of the class
	//Encapsulation we can achieve by making data members private and by using getter and setter methods.
	
	
	//Private>default>protected>public
	
	
	 private String username;
	 private String password;
	 
	 
    Inspector(String username, String password)
	 {
		 this.username = username;
		 this.password = password;
	 }
	 
	public String getusername()
	{
			return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
	public String getpassword()
	{
		return password;
	}
	
	public void setPassword(String password, String admin)
	{
		if(admin.equals("mhdfarhan2611@gmail.com"))
		{
			this.password = password;	
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inspector obj = new Inspector("mhdfarhan2611@gmail.com", "Pass123");
		System.out.println(obj.getusername());
		System.out.println(obj.getpassword());
		
		obj.setPassword("Acco@123");
		
		System.out.println(obj.getpassword());
		

		
	
		
		

	}

}
