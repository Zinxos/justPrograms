public abstract class Clothes  implements Comparable<Clothes> {
    private double price;
    private String brand;
    private String color;

    public Clothes( double price,String brand,String color){
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public Clothes(Clothes source){
        this.color = source.color;
        this.brand = source.brand;
        this.price = source.price;
    }


    public  void sortArrayCharInt(){

    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Clothes o) {
        String className = this.getClass().getSimpleName();
        String sClassName = o.getClass().getSimpleName();
        if(!(className.equals(sClassName)))
        {
            return className.compareTo(sClassName);
        }
        return (int) (Double.compare(this.getPrice(), o.getPrice()));
    }

}
