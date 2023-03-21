package is.hi.hbv202g.ass9.compositeLeafObservedByComposite.composite;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);

    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void lastObservedResult(int number) {
        for (Observer observer : observers) {
            observer.lastObservedResult(number);
        }

    }

    public void setLastObservedResult(int number) {
        for (Observer observer : observers) {
            observer.lastObservedResult(number);
        }
    }

    public int getResult() {
        return 0;
    }

    public int SetValue(int number) {
        return 0;
    }

    public static void main(String[] args) {

    }
}
