import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Please provide the following information:");
       System.out.println("-----------------------------------------");

       System.out.println("Full name: ");
       String fullName = scanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder fullBilling = new StringBuilder();
        fullBilling.append(billingStreet);
        fullBilling.append("");
        fullBilling.append(billingCity);
        fullBilling.append(billingState);
        fullBilling.append("");
        fullBilling.append(billingZip);










    }
}
