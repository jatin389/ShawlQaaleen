package bean;

public class Customer {
	
	private long  c_id;
	private String c_name;
	private String c_email;
	private String c_pass;
	private String c_address;
	private long c_phone;
	
	
	public Customer(long c_id, String c_name, String c_email, String c_pass, String c_address, long c_phone) {
		
		
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_pass = c_pass;
		this.c_address = c_address;
		this.c_phone = c_phone;
	}
	
	
	
public Customer( String c_name, String c_email, String c_pass, String c_address, long c_phone) {
		
		//this.c_id = c_id;
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_pass = c_pass;
		this.c_address = c_address;
		this.c_phone = c_phone;
	}



	

	
	/*************************************** getter and setters******************************/
	
	public long getC_id() {
		return c_id;
	}


	public void setC_id(long c_id) {
		this.c_id = c_id;
	}


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public String getC_email() {
		return c_email;
	}


	public void setC_email(String c_email) {
		this.c_email = c_email;
	}


	public String getC_pass() {
		return c_pass;
	}


	public void setC_pass(String c_pass) {
		this.c_pass = c_pass;
	}


	public String getC_address() {
		return c_address;
	}


	public void setC_address(String c_address) {
		this.c_address = c_address;
	}


	public long getC_phone() {
		return c_phone;
	}


	public void setC_phone(long c_phone) {
		this.c_phone = c_phone;
	}
	
	
	
}
