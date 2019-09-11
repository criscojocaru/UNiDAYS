package unidays;

public interface ApplyDiscountVisitor {
    void visit(A itemA, int numberOfItems);
    void visit(B itemB, int numberOfItems);
    void visit(C itemC, int numberOfItems);
    void visit(D itemD, int numberOfItems);
    void visit(E itemE, int numberOfItems);

}
