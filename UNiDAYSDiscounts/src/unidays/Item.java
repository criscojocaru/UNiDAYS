package unidays;

public abstract class Item {
    private double price;
    private String discount;
    private double totalPriceAfterDiscount;

    /**
     * @param price
     * @param discount
     */
    public Item(double price, String discount){
        this.price = price;
        this.discount = discount;
    }

    /**
     * @param applyDiscountVisitor
     * @param numberOfItems
     */
    public abstract void accept(ApplyDiscountVisitor applyDiscountVisitor, int numberOfItems);

    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return totalPriceAfterDiscount
     */
    public double getTotalPriceAfterDiscount() {
        return totalPriceAfterDiscount;
    }

    /**
     * @param totalPriceAfterDiscount
     */
    public void setTotalPriceAfterDiscount(double totalPriceAfterDiscount) {
        this.totalPriceAfterDiscount = totalPriceAfterDiscount;
    }
}
