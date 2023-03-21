package is.hi.hbv202g.ass9;


import is.hi.hbv202g.ass9.composite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.composite.Observable;

public class NumberLeaf extends Observable implements MathExpression {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }

    public int SetValue(int number) {
        this.number = number;
        return number;
    }

}

