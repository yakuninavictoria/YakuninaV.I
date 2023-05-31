public class Order {
    private int amount;
    private double price;
    private Product product;
    public Order(int amount,Product product){
        this.amount=amount;
        this.product=product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString(){
        return "Name : "+product.getName()+
                ", Amount : "+amount+
                ", Price : "+price;
    }
}
