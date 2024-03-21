import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // Audi, BMW, Volvo
       /* ArrayList<String> carBrands = new ArrayList<String>();
        carBrands.add("Audi");
        carBrands.add("BMW");
        carBrands.add("Volvo");

        for (String brand: carBrands){
                System.out.println(brand);
        }


        ArrayList<Vehicle> carBrands2 = new ArrayList<Vehicle>();

        CarBrand audi = new CarBrand("Audi", 19000, 60.5, 4);
        carBrands2.add(audi);
        CarBrand bmw = new CarBrand("BMW", 22000, 60.5, 4);
        carBrands2.add(bmw);
        CarBrand volvo = new CarBrand("Volvo", 34000, 80.0, 6);
        carBrands2.add(volvo);
        Boat boat1 = new Boat("Sunseeker", 20000, 200.0);
        carBrands2.add(boat1);

        for (Vehicle brand: carBrands2){
            System.out.println(brand.getName() + " /" + brand.getPrice()+ " /" + brand.getfuelCapacity() + " /" + brand.getWheelsCount());
        }
        */

        ArrayList<PriceableProduct> productList = new ArrayList<PriceableProduct>();

        CarBrand audi = new CarBrand ("Audi", 19000, 60.5, 4);
        productList.add(audi);
        CarBrand bmw = new CarBrand ("BMW", 22000, 60.5, 4);
        productList.add(bmw);
        CarBrand volvo = new CarBrand("Volvo", 34000, 80.0, 6);
        productList.add(volvo);
        Boat boat1 = new Boat("Sunseeker", 20000, 200.0);
        productList.add(boat1);
        Furniture furniture = new Furniture("IKEA Couch", 1000);
        productList.add(furniture);
        for (PriceableProduct product : productList){
            System.out.println(product.getName() +  " /" + product.getPrice());
        }

    }
}// New Interface called Priceable Product contains get Name and get Price in a List with a new class called furniture. ArrayList will be Priceable Product and pnly print those 2 clumns  loop and print
