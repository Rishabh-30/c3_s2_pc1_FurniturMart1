public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    int price;

    FurnitureItem(){
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture= "";
        color = "";
        furnitureUsage = "";
        price = 0;



    }
   public double discount(double price){
        if(furnitureUsage.equalsIgnoreCase("outdoor"))
            price = (price -(price *5/100));
        System.out.println("discounted value " + price);
        return price;
    }

}
