import java.lang.*;

class Compare<T extends Comparable<T>> {
    T vals[];
    Compare(T[] values) {
        vals = values;
    }

    public T min() {
        T v = vals[0];
        for (T other: vals) {
            if (v.compareTo(other) < 0) {
                v = other;
            }
        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for (T other: vals) {
            if (v.compareTo(other) > 0) {
                v = other;
            }
        }
        return v;
    }
}
public class Main {
    public static void main(String args[]) {
        int i;
        Integer[] nums = {1, 2, 3, 4, 5};
        Character[] chars = {'a', 'b', 'c', 'd', 'e'};
        Compare<Integer> one = new Compare<Integer>(nums);
        Compare<Character> two = new Compare<Character>(chars);

        System.out.println("Min: " + one.min() + "\tMax: " + one.max());
        System.out.println("Min: " + two.min() + "\tMax: " + two.max());
    }
}
