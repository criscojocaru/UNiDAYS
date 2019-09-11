package unidays;

import java.util.HashMap;
import java.util.Map;

public class UnidaysDiscountChallenge {
    private PricingRules pricingRules;
    private HashMap<Item, Integer> basket;

    /**
     * @param pricingRules
     */
    public UnidaysDiscountChallenge(PricingRules pricingRules){
        this.pricingRules = pricingRules;
        this.basket = new HashMap<>();
    }

    /**
     * @param item
     */
    public void AddToBasket(Item item){
        if (basket.containsKey(item)) {
            basket.put(item, basket.get(item) + 1);
        } else {
            basket.put(item, 1);
        }
    }

    /**
     * @return result
     */
    public Result CalculateTotalPrice(){
        double total = 0.00;
        double deliveryCharge = 7.00;

        ApplyDiscountVisitor applyDiscountVisitor = new ApplyDiscount();
        for(Map.Entry<Item, Integer> entry : basket.entrySet()) {
            entry.getKey().accept(applyDiscountVisitor, entry.getValue());
        }

        for(Map.Entry<Item, Integer> entry : basket.entrySet()) {
            total += entry.getKey().getTotalPriceAfterDiscount();
        }

        if(total >= 50.00){
            deliveryCharge = 0.00;
        }

        return new Result(total, deliveryCharge);
    }
}
