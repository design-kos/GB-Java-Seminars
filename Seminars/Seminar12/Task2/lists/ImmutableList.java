package Seminars.Seminar12.Task2.lists;

import java.util.ArrayList;

public class ImmutableList extends AbstractList<Integer> {

    public ImmutableList() {
        this.list = new ArrayList<>();
        list.add(31);
        list.add(537);
        list.add(92);
        list.add(30);
        list.add(22);
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

}
