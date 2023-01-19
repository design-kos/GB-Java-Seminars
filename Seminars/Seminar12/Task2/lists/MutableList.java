package Seminars.Seminar12.Task2.lists;

import java.util.ArrayList;

public class MutableList<T> extends AbstractList<T> {

    public MutableList() {
        this.list = new ArrayList<>();
    }

    @Override
    public void showList() {
        System.out.println(list);
    }

    @Override
    public void getElementByIndex(int i) {
        System.out.println(list.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(list.size());
    }

    public void addToList(T i) {
        list.add(i);
    };

    public void removeFromList(T i) {
        list.remove(i);
    };

}
