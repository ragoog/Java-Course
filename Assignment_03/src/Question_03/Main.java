package Question_03;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(89);
        list.add(38);
        list.add(382392);
        list.add(4893);
        list.add(10);

        System.out.println(list);
        sort(list);
        System.out.println("sorted list: " + list);

    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}

