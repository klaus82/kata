package HackerRank.RookieRank2; /**
 * Created by claudio on 11/02/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            String pattern = "h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(s);
            if(m.find())
                System.out.print("YES\r\n");
            else
                System.out.print("NO\r\n");
        }

    }

}
