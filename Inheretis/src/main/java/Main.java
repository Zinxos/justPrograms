import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static final String FILE_NAME = "src/main/java/products.txt";


    public static void main(String[] args) {
        Clothes[] pantsArr = new Clothes[]{
                new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
                new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
                new Pants(34, 24.53, "Red", "JANGLER"),
                new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
                new Pants(30, 24.54, "Grey", "FENDI"),
                new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
                new Pants(30, 24.51, "Red", "VERSACE"),
                new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
                new Pants(29, 24.53, "Dark", "JANGLER"),
                new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
                new Pants(26, 24.58, "Indigo", "BELSTAFF"),
                new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
                new Pants(34, 24.50, "Red", "JANGLER"),

        };
        try {
            Clothes[] clothes = loudClothes();
            System.out.println(Arrays.toString(clothes));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        //Arrays.sort(pantsArr);
        //System.out.println(Arrays.toString(pantsArr));
    }
    public static Clothes[] loudClothes() throws FileNotFoundException{
        FileInputStream file = new FileInputStream(FILE_NAME);
        Scanner scanner = new Scanner(file);
        Clothes[] clothes = new Clothes[18];
        for (int i = 0 ; scanner.hasNextLine(); i++){
            switch (scanner.next()){
                 case "SHIRT":
                    clothes[i] = new Shirt(Shirt.Size.valueOf(scanner.next()),scanner.nextDouble(),scanner.next(),scanner.next());
                case "PANTS":
                    clothes[i] = new Pants(scanner.nextInt(),scanner.nextDouble(),scanner.next(),scanner.next());
            }
        }
        scanner.close();
    return clothes;
    }
}
