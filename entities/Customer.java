package entities;

public class Customer extends Person {
    String taxpayerId;
    
    public void add() {
        System.out.println("Add en Customer");
    }



    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }
    
}
