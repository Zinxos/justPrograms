import java.util.Objects;

public class Pants extends Clothes{
    private int wise;

    public Pants(int wise , double price , String color, String brand) {
        super(price, color, brand);
        this.wise = wise;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public Pants(Pants source) {
        super(source);
        this.wise = source.wise;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pants pants = (Pants) o;
        return this.wise == pants.wise && super.getPrice() == pants.getPrice() &&
                super.getBrand().equals(pants.getBrand()) && super.getColor().equals(pants.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.wise, super.getPrice(), super.getBrand(), super.getColor());
    }

    @Override
    public String toString() {
        return "Pants" +  "\n" +
                "wise = " + getWise() +  "\n" +
                "price = " + super.getPrice() +  "\n" +
                "brand = " + super.getBrand() +  "\n" +
                "color = " + super.getColor() +  "\n";
    }


}
