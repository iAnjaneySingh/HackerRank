import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */




class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		FastReader in = new FastReader();
		try {
			int t = in.nextInt();
			while (t-- > 0) {
                int n=in.nextInt();
                int time=in.nextInt();
              //  in.next();
                String str=in.nextLine();
                char []a=str.toCharArray();
               // System.out.println(a.toString());
				calculateResult(a,n,time);

			}
		} catch (Exception e) {
		return;
		}

	}

	private static void calculateResult(char a[],int n,int time) {
               while(time-->0) {
            	   for(int i=0;i<n-1;i++) {
            		   if(a[i]=='G'&&a[i+1]=='L') {
            			   char ch=a[i];
            			   a[i]=a[i+1];
            			   a[i+1]=ch;
            			   i+=1;
            		   }
            	   }
               }
              System.out.println(n);
               System.out.println(String.valueOf(a));
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
