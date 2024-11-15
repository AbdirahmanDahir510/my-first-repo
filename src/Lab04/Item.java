package Lab04;

public class Item {
    private int id;
    private String description;
    private float price;
    private int stock;
	
    //corresponding methods static 
    public static Item CreateItem(String [] item) {
    	Item i = null;	
    	 if ((item==null)||(item.length!=4)) 
    		 return null;
         int id = Integer.parseInt(item[0]);
         String description = item[1];
         float price = Float.parseFloat(item[2]);
         int stock = Integer.parseInt(item[3]);
          i = new Item(id, description, price, stock);
         return i;
         

    }
    
    
    
    //private constructor 
    private Item(int id, String description, float price, int stock) {
    	 this.id = id;
    	 this.description = description;
    	 this.price = price;
    	 this.stock = stock;
    }
    
    
    
    
    
    //getters and setters 
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
    
    @Override
    public String toString() {
    	String str = "{- Item: [Description: " + description + "], [Price: " + price + "], [NumItems: " + stock + "]";
    	return str;
    }
}
