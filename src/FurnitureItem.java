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
    double discount(double price){
        double discount = (price -(price * 5/100));
        return discount;
    }

}
