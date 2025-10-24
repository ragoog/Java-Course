package Question_02;

import java.util.ArrayList;

public class MaxInteger {
    ArrayList<Integer> list = new ArrayList<>();

    public MaxInteger() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
    public Integer maximum()
    {
        if (list.isEmpty())
            return null;
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}

