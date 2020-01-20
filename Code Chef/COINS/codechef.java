import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
	static Map <Long, Long> map;
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext()) {
			
			long n =sc.nextLong();
			map = new HashMap<>();
			System.out.println(getCoin (n));
		}
		sc.close();
	}
	
	public static long getCoin (long n) {
		
		if (map.containsKey(n)) {
			return map.get(n);
		} else {
			
			if (n<12) {
				map.put(n, n);
				return n;
			} else {
				
				long num = getCoin(n/2) + getCoin(n/3) + getCoin(n/4);
				map.put(n, num);
				return map.get(n);
			}
		}
	}
}