/*Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class dz4_1 {
    public static int deQueToInt(Deque<Integer> l1) { // for reverse
        StringBuilder res1 = new StringBuilder();

        l1.stream().forEach(S -> res1.insert(0, S)); // add to start
        // enter:(2 -> 4 -> 3) Output: 342

        // l1.stream().forEach(S -> res1.append(S)); // add to end
        // enter:(2 -> 4 -> 3) Output: 243

        int foo = 0;
        try {
            foo = Integer.parseInt(res1.toString());
        } catch (NumberFormatException e) {
            foo = 0;
        }
        return foo;
    }

    public static Deque<Integer> intTodeQue(int l1) {
        Deque<Integer> res = new ArrayDeque<>();
        String str1 = Integer.toString(l1);

        if (str1.charAt(0) == '-') {
            res.push(-Integer.parseInt(str1.substring(1, 2)));
            // check sign of first digit
            for (int i = 2; i < str1.length(); i++) {
                res.push(Integer.parseInt(str1.substring(i, i + 1)));
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                res.push(Integer.parseInt(str1.substring(i, i + 1)));
            }
        }
        // System.out.println(" intTodeQue : " + (res));
        return res;
    }

    public static Deque<Integer> multTwoNumbersStr(Deque<Integer> l1, Deque<Integer> l2) {
        int sum1 = deQueToInt(l1), sum2 = deQueToInt(l2);
        int mult = sum1 * sum2;
        return intTodeQue(mult);
    }

    public static void main(String[] args) {
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        // enter:(2 -> 4 -> -3) + (5 -> 6 -> 4)
        // Output:7 -> 0 -> 2
        // the reason:342 + 465 = 807
        // -342* 465 = -159030
        // the reason:-3 + 465 = 462

        dq1.addFirst(2);
        dq1.addLast(4);
        dq1.addLast(-3);
        // dq1.addLast(-);
        // dq1.push(3); // add first

        dq2.addFirst(5);
        dq2.addLast(6);
        dq2.addLast(4);

        System.out.println("-342 * 465 = -159030");
        System.out.println(" dq1 * dq2 : " + multTwoNumbersStr(dq1, dq2));

    }
}
