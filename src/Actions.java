public class Actions {
     private String name;
     private int amount ;
     private int price;

public Actions(String name,int amount,int price){
    this.name=name;
    this.amount=amount;
    this.price=price;
}




    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}

