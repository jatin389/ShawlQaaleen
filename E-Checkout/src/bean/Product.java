package bean;

public class Product {
	
		private long  p_id;
		private String p_name;
		private float p_price;
		private int p_stock;
		private String p_brand;
		private String p_type;
		private String p_size;
		private String p_imagename;
		
		////////////////////constructor/////////////////////////////
		
		
		
		
		
		
		public Product(long p_id, String p_name, float p_price, String p_imagename) {
			
			this.p_id = p_id;
			this.p_name = p_name;
			this.p_price = p_price;
//			this.p_stock = p_stock;
//			this.p_brand = p_brand;
//			this.p_type = p_type;
//			this.p_size = p_size;
			this.p_imagename = p_imagename;
		}
		
		
		
		






//////////////////////getters & setters////////////////////
		
		public long getP_id() {
			return p_id;
		}

		public void setP_id(long p_id) {
			this.p_id = p_id;
		}
		
		
		public String getP_name() {
			return p_name;
		}

		public void setP_name(String p_name) {
			this.p_name = p_name;
		}

		public float getP_price() {
			return p_price;
		}

		public void setP_price(float p_price) {
			this.p_price = p_price;
		}

		public int getP_stock() {
			return p_stock;
		}

		public void setP_stock(int p_stock) {
			this.p_stock = p_stock;
		}

		public String getP_brand() {
			return p_brand;
		}

		public void setP_brand(String p_brand) {
			this.p_brand = p_brand;
		}

		public String getP_type() {
			return p_type;
		}

		public void setP_type(String p_type) {
			this.p_type = p_type;
		}

		public String getP_size() {
			return p_size;
		}

		public void setP_size(String p_size) {
			this.p_size = p_size;
		}

		public String getP_imagename() {
			return p_imagename;
		}

		public void setP_imagename(String p_imagename) {
			this.p_imagename = p_imagename;
		}
		
	}
