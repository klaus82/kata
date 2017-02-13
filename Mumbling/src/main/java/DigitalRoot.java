/**
 * Created by claudio on 05/02/17.
 */
public class DigitalRoot {

    public static int digital_root(int n) {

        int ret = n;
        while (ret>=10)
        {
            ret = sumOfDigit(ret);
        }

        return ret;
    }

    private static int sumOfDigit(int n){

        String strNum = Integer.toString(n);
        int sum = 0;

        for(int i=0; i<strNum.length(); i++){


            int test = Integer.parseInt(strNum.substring(i,i+1));
            sum = sum + test;

        }

        return sum;


    }

}
