package HackerRank.RookieRank2;

/**
 * Created by claudio on 12/02/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrefixNeightbours {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.next();
        }

        ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(s));

        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){

                String prefix = greatestCommonPrefix(s[i], s[k]);

                if(!prefix.isEmpty())
                {
                    arraylist.remove(i);
                }

            }
        }

        int benefit = 0;
        for(int j=0;j<arraylist.size();j++)
        {
            char[] charArray = arraylist.get(j).toCharArray();

            for(int m=0;m<charArray.length;m++)
                benefit +=(int)charArray[m];
        }


        System.out.print(benefit);



    }

    public static String greatestCommonPrefix(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.substring(0, i);
            }
        }
        return a.substring(0, minLength);
    }

}
