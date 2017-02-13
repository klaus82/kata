package HackerRank.RookieRank2; /**
 * Created by claudio on 11/02/17.
 */
    import java.io.*;
    import java.lang.reflect.Array;
    import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // your code goes here
            int minDiff = Integer.MAX_VALUE;

            Arrays.sort(a);

            for(int i=1; i<a.length; i++){
                    int diff = Math.abs(a[i-1]-a[i]);
                    if(diff<minDiff) {
                        minDiff = diff;
                    }
                }


            System.out.print(minDiff);

        }
    }
