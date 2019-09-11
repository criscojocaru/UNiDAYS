package unidays;

public class B extends Item{

    /**
     * @param price
     * @param discount
     */
    public B(double price, String discount){
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
