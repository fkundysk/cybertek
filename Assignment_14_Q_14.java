package assignment_14;

public class Q_14_Item {
	//private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    
    public Q_14_Item(String name,int quantity,int catalogNumber, double price){
    	
    	this.name = name;
    	this.quantity = quantity;
    	this.catalogNumber = catalogNumber;
    	this.price = price;
      
      
    }
    public void setName(String name) {
    	this.name =name;
    }

    public void setPrice(double price) {
    	this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public String getName(){
        return name;
    }


    public int getQuantity(){
        return quantity;

    }
    public void setQuantity(int quantity){
    	this.quantity = quantity;
    }

    public int getCatalogNumber(){
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
       this.catalogNumber = catalogNumber;
    }
    
	@Override
	public String toString() {
		return "Regular Item {name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price="
				+ price + "}";
	}
    
}


package assignment_14;

public class Q_14_OnSaleItem extends Q_14_Item{
    
    private double discount;

    public Q_14_OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
        super(name, quantity,catalogNumber, price);
        super.setPrice((price-(price*discount/100)));
        this.discount = discount;
    }

    
    public double getDiscount() {
        return discount;
    }

   
    public void setDiscount(double discount) {
       this.discount = discount;
    }


    @Override
    public String toString() {
        return "OnSaleItem {discount=" + discount + "%, name=" + getName() + ", price=" + getPrice() + "}";
    }
  
}


package assignment_14;

import java.util.ArrayList;
import java.util.List;


public class Q_14_TJMaxx {
    

    private List<Q_14_Item> RegularItems;
    private List<Q_14_OnSaleItem> OnSaleItems;

        
      public Q_14_TJMaxx() {
            
            RegularItems = new ArrayList<>();
            OnSaleItems = new ArrayList<>();
            
       }

       public void addRegularItem(Q_14_Item item) {
           RegularItems.add(item);   
       }

       public void addOnSaleItem(Q_14_OnSaleItem item) {
            OnSaleItems.add(item);    
       }

       public List<Q_14_Item> getRegularItems() {  
            return RegularItems;
       }

       public List<Q_14_OnSaleItem> getOnSaleItems() { 
            return OnSaleItems;
       }

       public int RegularItemsCount() {
            return RegularItems.size();
       }

       public int OnSaleItemsCount() {
            return OnSaleItems.size();
       }

       public List<String> getAllItemNames() {
           
            List<String> AllItemNames = new ArrayList<>();
            
            for (Q_14_Item Item : RegularItems) {
                    
                AllItemNames.add(Item.getName());
            }
            
           for(Q_14_OnSaleItem Item : OnSaleItems) {
               
                AllItemNames.add(Item.getName());
           }
           
           return AllItemNames;
        }

       
      public double getItemPrice(int catalogNumber){
          
        List<Q_14_Item> AllItemList = new ArrayList<>();    
        AllItemList.addAll(RegularItems);
        AllItemList.addAll(OnSaleItems);
                
           for(Q_14_Item AllItems : AllItemList) {
                    
               if (AllItems.getCatalogNumber()==catalogNumber) {
                   return AllItems.getPrice();
                        
               } 
                    
            }return 0.0;
            
        }

       public Q_14_OnSaleItem getOnSaleItem(String name){
            
            for(Q_14_OnSaleItem OnSaleItem : OnSaleItems) {
                
                if(OnSaleItem.getName().equalsIgnoreCase(name)) {
                    return OnSaleItem;
                    
                } 
                        
            }return null;
         }

       
       public void removeItem(int catalogNumber) {
            
            for(Q_14_Item RegularItem : RegularItems) {
                
                if(RegularItem.getCatalogNumber()==catalogNumber) {
                    RegularItems.remove(RegularItem);
                    
                }
            }
            for(Q_14_OnSaleItem OnSaleItem : OnSaleItems) {
                
                if(OnSaleItem.getCatalogNumber()==catalogNumber) {
                    OnSaleItems.remove(OnSaleItem);
                    
                }
            }
            
        }

       
       public void buyItem(int catalogNumber) {
           
            List<Q_14_Item> AllItemList = new ArrayList<>();    
            AllItemList.addAll(RegularItems);
            AllItemList.addAll(OnSaleItems);
                    
               for(Q_14_Item AllItems : AllItemList) {
                        
                   if (AllItems.getCatalogNumber()==catalogNumber) {
                       AllItems.setQuantity(AllItems.getQuantity()-1);
                        
                       if (AllItems.getQuantity()==0) {
                           removeItem(AllItems.getCatalogNumber());
                       }
                       
                   } 
                        
                }
                
           }
     
    }


package assignment_14;

public class Q_14_TJMaxxTest {

    public static void main(String[] args) {
        
        Q_14_Item test = new Q_14_Item("aaa", 2, 5, 120);

        System.out.println(test.toString());
        
        Q_14_TJMaxx s = new Q_14_TJMaxx();
        
        s.addRegularItem(test);
        
        
        Q_14_OnSaleItem onsale1 = new Q_14_OnSaleItem("aaa", 2, 5, 120, 20);
        s.addOnSaleItem(onsale1);
        
        System.out.println(onsale1.toString());
        
        System.out.println(s.getAllItemNames());
        
        System.out.println(s.getOnSaleItem("aaa"));
        System.out.println(s.getRegularItems());
        System.out.println(s.getItemPrice(5));

    }

}
