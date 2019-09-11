package unidays;

public class D extends Item{
    /**
     * @param price
     * @param discount
     */
    public D(double price, String discount){
        super(price, discount);
    }

    /**
     * @param applyDiscountVisitor
     * @param numberOfItems
     */
    public void accept(ApplyDiscountVisitor applyDiscountVisitor, int numberOfItems){
        applyDiscountVisitor.visit(this, numberOfItems);
    }
}
