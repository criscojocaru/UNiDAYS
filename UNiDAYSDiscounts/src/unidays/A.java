package unidays;

public class A extends Item{

    /**
     * @param price
     * @param discount
     */
    public A(double price, String discount){
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
