/**
 * Created by claudio on 05/02/17.
 */
public class Accumul {

    public static String accum(String s) {
        // your code
        String ret = "";

        for(Integer i = 0; i < s.length(); i++)
        {
            StringBuilder strB = new StringBuilder();

            char a_char = s.charAt(i);

            String cap = "" + a_char;
            strB.append(cap.toUpperCase());

            for(int k=1; k<=i;k++)
            {
                String low = "" + a_char;
                strB.append(low.toLowerCase());
            }

            if(i+1<s.length())
                ret = ret + strB.append('-').toString();
            else
                ret = ret + strB.toString();
        }

        return ret;
    }
}
