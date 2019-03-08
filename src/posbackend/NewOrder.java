package posbackend;

public class NewOrder {
    
    private String item;
    private Integer burgerQuantity = 0;
    private Double burgerPrice = 6.99;
    private Integer fryQuantity = 0;
    private Double fryPrice =6.99;
    private Double orderTotal=0.00;
    private Double currentOrderPrice=0.00;
    private String currentOrder="";

    public Double getTotal(){
        orderTotal = 0.00;
        orderTotal += burgerQuantity * burgerPrice;
        orderTotal += fryQuantity * fryPrice;
        return orderTotal;
    }
    public String updateCurrentOrder(String newItem){
        currentOrder+=newItem;
        return currentOrder;
    } 

    public String getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrderPrice(Double currentOrderPrice) {
        this.currentOrderPrice = currentOrderPrice;
    }



    public void setCurrentOrder(String currentOrder) {
        this.currentOrder = currentOrder;
    }
    
    public String getItem() {
        return item;
    }

    public void addItem(String item) {
        if(item == "Burger"){
            burgerQuantity += 1;
        }
        else if(item=="Fry"){
            fryQuantity += 1;
        }

        
    }
    
    public void reset(){
        burgerQuantity = 0;
        fryQuantity = 0;
        orderTotal = 0.00;
        currentOrder = "";
        
    }
    }

    
    
    
    

