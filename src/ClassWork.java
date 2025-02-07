public class ClassWork {
    public static void main(String[] args)
    {
        int noPersons = 4;
        double dishPrice = 18.99;
        final double TAX_RATE = 0.2;
        double subTotal = noPersons * dishPrice;
        double tax = subTotal * TAX_RATE;
        double tip = subTotal * 0.15;
        double total = subTotal + tax + tip;
        double share_person =0;

        System.out.println("SubTotal: " + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);

        share_person = total/4;
        System.out.println("share per person: " + share_person);
    }
}