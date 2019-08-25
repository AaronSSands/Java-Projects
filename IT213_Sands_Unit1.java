import java.text.NumberFormat;

import java.util.Locale;


class IT213_Sands_Unit1 {
    public static void main(String[] args) {
        String name = "John Smith";
        String address = "101 N. Main Street";
        String city = "Anytown";
        String state = "TX";
        String zipCode = "11111";
        String unitsTaken = "19";

        final double pricePerUnit = 100.50;
        final double discount = 150;

        int intUnitsTaken = Integer.parseInt(unitsTaken);

        intUnitsTaken++;

        double tuition = pricePerUnit * intUnitsTaken;

        double afterDiscount = tuition - discount;

        double monthlyPayment = afterDiscount / 12;

        //display output

        System.out.println("Name:" + name);
        System.out.println("Address :" + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("The number of unit taken is: " + intUnitsTaken);

        //formatted values and payments

        System.out.println("The tuition before discount is " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(tuition));
        System.out.println("The tuition after discount is " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(afterDiscount));
        System.out.println("Your monthly payment is: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(monthlyPayment));

        //Java Unit 1 assignment

    }
}