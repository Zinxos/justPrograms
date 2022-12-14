import java.util.Objects;

public class Shirt extends Clothes {
    public enum Size{
        SMALL, MEDIUM, LARGE
    }
    private Size size;



    public Shirt( Size size,double price , String color, String brand) {
        super(price, brand, color);
        this.size = size;
    }
    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return size == shirt.size && super.getPrice() == shirt.getPrice() &&
                super.getBrand().equals(shirt.getBrand()) && super.getColor().equals(shirt.getColor());
    }




    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getBrand(), super.getColor());
    }
    @Override
    public String toString() {
        return "Shirt" + "\n" +
                "size = " + getSize() + "\n" +
                "price = " + super.getPrice() +"\n" +
                "brand = " + super.getBrand() +"\n" +
                "color = " + super.getColor() +"\n" ;
    }
}
