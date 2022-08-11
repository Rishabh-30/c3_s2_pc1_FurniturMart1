import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureItem object = new FurnitureItem();
        System.out.println("Enter furniture code");
        object.furnitureCode = scanner.nextInt();
        System.out.println("Enter furnitureType");
        scanner.nextLine();
        object.furnitureType = scanner.nextLine();
        System.out.println("Enter Grade");
        object.gradeOfFurniture = scanner.nextLine();
        System.out.println("Enter color");
        object.color = scanner.nextLine();
        System.out.println("Enter furniture usage");
        object.furnitureUsage = scanner.nextLine();
        System.out.println("Enter price");
        object.price = scanner.nextInt();

        System.out.println("furItem.furnitureCode = " + object.furnitureCode);;
        System.out.println("furItem.gradeOfFurniture = " + object.gradeOfFurniture);
        System.out.println("furItem.furnitureType = " + object.furnitureType);
        System.out.println("furItem.furnitureUsage = " + object.furnitureUsage);
        System.out.println("furItem.color = " + object.color);
        System.out.println("furItem.price = " + object.price);
        object.discount(object.price);






    }
}
