import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter furniture code");
        int Code = scanner.nextInt();
        System.out.println("Enter furnitureType");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.println("Enter Grade");
        String grade = scanner.nextLine();
        System.out.println("Enter color");
        String color = scanner.nextLine();
        System.out.println("Enter furniture usage");
        String usage = scanner.nextLine();
        System.out.println("Enter price");
        int price = scanner.nextInt();

        FurnitureItem furItem = new FurnitureItem();
        System.out.println("furItem.discount() = " + furItem.discount(10000));




    }
}
