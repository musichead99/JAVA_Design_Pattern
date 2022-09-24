package dp_17_Observer;

import java.util.ArrayList;
import java.util.Iterator;

/* 수를 생성하는 오브젝트를 나타내는 클래스 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }
    public abstract int getNumber(); // 수를 취득한다.
    public abstract void execute(); // 수를 생성한다.
}
