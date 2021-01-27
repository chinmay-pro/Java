package OOPs.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop myObj = new Laptop();
        myObj.setPrice(9600);
        System.out.println(myObj.getPrice());
    }
}
class Laptop {
    private int ram;
    private int price;

    public void setPrice(int price) {
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("You can't set the price");
        }else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}