package is.hi.hbv202g.ass9;

import is.hi.hbv202g.ass9.composite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.composite.Observer;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    public int getResult() {
        int result = 1;
        for (MathExpression child : getChildren()) {
            result *= child.getResult();
        }
        return result;
    }

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public int lastObservedResult(int number) {
        System.out.println("Observer: " + number);
        return number;
    }

    // get last observed result
    public int getLastObservedResult() {
        int result = 0;
        for (MathExpression child : getChildren()) {
            result = child.getLastObservedResult();
        }
        return result;
    }


}
