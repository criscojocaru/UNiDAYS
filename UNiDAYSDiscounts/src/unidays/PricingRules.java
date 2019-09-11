package unidays;

import java.util.HashMap;

public class PricingRules {

    private static PricingRules pricingRulesInstance = new PricingRules();
    private HashMap<String, Item> items = new HashMap<>();

    private PricingRules(){
        this.items.put("A", new A(8.00, "None"));
        this.items.put("B", new B(12.00, "2 for £20.00"));
        this.items.put("C", new C(4.00, "3 for £10.00"));
        this.items.put("D", new D(7.00, "Buy 1 get 1 free"));
        this.items.put("E", new E(5.00, "3 for the price of 2"));
    }

    /**
     * @return pricingRulesInstance
     */
    public static PricingRules getPricingRulesInstance(){
        return pricingRulesInstance;
    }

    /**
     * @return
     */
    public HashMap<String, Item> getItems() {
        return items;
    }

}
