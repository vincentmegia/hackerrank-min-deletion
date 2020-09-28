package vincentmegia.com;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(minDeletion(new int[] {3,3,2,1,3}));
    }
    static int minDeletion(int[] array) {

        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.computeIfAbsent(i, x -> 0);
            map.computeIfPresent(i, (x, y) -> y + 1);
            if (max < map.get(i)) max = map.get(i);
        }
        return array.length - max;
    }
}
