import java.util.Scanner;

public class VirtualRealityArtGallery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Reality Art Gallery!");
        System.out.println("Please select an option:");
        System.out.println("1. Explore the gallery");
        System.out.println("2. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                exploreGallery();
                break;
            case 2:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
                break;
        }
    }

    public static void exploreGallery() {
        System.out.println("You are now exploring the gallery...");
        // Add code here to display virtual reality environment and art pieces
    }
}
