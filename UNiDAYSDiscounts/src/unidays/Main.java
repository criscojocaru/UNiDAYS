package unidays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PricingRules pricingRules = PricingRules.getPricingRulesInstance();
        UnidaysDiscountChallenge example = new UnidaysDiscountChallenge(pricingRules);

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.equals("") || input == null || input.equals("None")){
            System.out.println("Total price is: £" + 0.00);
            System.out.println("Delivery charge is: £" + 0.00);
            System.out.println("Overall total price is: £" + 0.00);
            return;
        }

        for(int i = 0; i < input.length(); ++i){
            if(input.charAt(i) == 'A' ||
                    input.charAt(i) == 'B' ||
                    input.charAt(i) == 'C' ||
                    input.charAt(i) == 'D' ||
                    input.charAt(i) == 'E') {
                String entry = "" + input.charAt(i);
                example.AddToBasket(pricingRules.getItems().get(entry));
            } else {
                System.out.println("Error: Invalid type of items.");
                return;
            }
        }

        Result result = example.CalculateTotalPrice();

        double totalPrice = result.getTotal();
        double deliveryCharge = result.getDeliveryCharge();
        double overallTotal = totalPrice + deliveryCharge;

        System.out.println("Total price is: £" + totalPrice);
        System.out.println("Delivery charge is: £" + deliveryCharge);
        System.out.println("Overall total price is: £" + overallTotal);
    }
}
