package unidays;

/**
 *
 */
public class ApplyDiscount implements ApplyDiscountVisitor {

    /**
     * @param itemA
     * @param numberOfItems
     */
    @Override
    public void visit(A itemA, int numberOfItems){
        itemA.setTotalPriceAfterDiscount(itemA.getPrice());
    }

    /**
     * @param itemB
     * @param numberOfItems
     */
    @Override
    public void visit(B itemB, int numberOfItems){
        double itemBPrice = itemB.getPrice();
        if(numberOfItems % 2 == 0){
            itemB.setTotalPriceAfterDiscount(20.00 * (numberOfItems / 2));
        } else {
            itemB.setTotalPriceAfterDiscount(20.00 * (numberOfItems / 2) + (numberOfItems % 2) * itemBPrice);
        }
    }

    /**
     * @param itemC
     * @param numberOfItems
     */
    @Override
    public void visit(C itemC, int numberOfItems){
        double itemCPrice = itemC.getPrice();
        if(numberOfItems % 3 == 0){
            itemC.setTotalPriceAfterDiscount(10.00 * (numberOfItems / 3));
        } else {
            itemC.setTotalPriceAfterDiscount(10.00 * (numberOfItems / 3) + (numberOfItems % 3) * itemCPrice);
        }
    }

    /**
     * @param itemD
     * @param numberOfItems
     */
    @Override
    public void visit(D itemD, int numberOfItems){
        double itemDPrice = itemD.getPrice();
        if(numberOfItems % 2 == 0){
            itemD.setTotalPriceAfterDiscount(itemDPrice * (numberOfItems / 2));
        } else {
            itemD.setTotalPriceAfterDiscount(itemDPrice * ((numberOfItems / 2) + 1));
        }
    }

    /**
     * @param itemE
     * @param numberOfItems
     */
    @Override
    public void visit(E itemE, int numberOfItems){
        double itemEPrice = itemE.getPrice();
        if(numberOfItems % 3 == 0){
            itemE.setTotalPriceAfterDiscount(2 * itemEPrice * (numberOfItems / 3));
        } else {
            itemE.setTotalPriceAfterDiscount(2 * itemEPrice * (numberOfItems / 3) + (numberOfItems % 3) * itemEPrice);
        }
    }
}
