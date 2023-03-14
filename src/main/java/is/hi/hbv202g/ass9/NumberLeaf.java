package is.hi.hbv202g.ass9;


import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf implements MathExpression {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }

}

