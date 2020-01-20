import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static HashMap<Long, Long> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Long> coins = new ArrayList<>();

        while (sc.hasNext()) {
            long n = sc.nextLong();
            if (n < 0 || n > 1000000000) System.exit(0);
            coins.add(n);
            if (coins.size()>10) System.exit(0);

            System.out.println(count(n));
        }

        sc.close();
    }

    private static long count(long n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            if (n < 12) {
                map.put(n,n);
                return n;
            } else {
                long num = count(n/2) + count(n/3) + count(n/4);
                map.put(n, num);
                return map.get(n);
            }
        }
    }
}
