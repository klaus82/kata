package HackerRank.RookieRank2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by claudio on 12/02/17.
 */
public class KnightL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // your code goes here

        int chessBoardDimension = n-1;

        for(int a=1;a<n;a++) {
            for(int b=1;b<n;b++) {
                KnightMove(a,b,chessBoardDimension);
            }
            System.out.print("\r\n");
        }

    }

    private static void KnightMove(int a, int b, int chessDim){

        int startA = 0;
        int startB = 0;
        int countMove = 0;
        boolean nextMove = true;
        boolean moveOk = true;

        int[] moveTry = new int[16];

        moveTry[0] = a;
        moveTry[1] = b;
        moveTry[2] = a;
        moveTry[3] = -b;
        moveTry[4] = b;
        moveTry[5] = a;
        moveTry[6] = b;
        moveTry[7] = -a;
        moveTry[8] = -a;
        moveTry[9] = b;
        moveTry[10] = -a;
        moveTry[11] = -b;
        moveTry[12] = -b;
        moveTry[13] = a;
        moveTry[14]= -b;
        moveTry[15] = -a;

        int moveIndex = 0;

        while(nextMove){


            if(moveIndex > 16)
            {
                System.out.print(-1);
                nextMove = false;
                break;
            }

            int tryA = startA + moveTry[moveIndex];
            int tryB = startB + moveTry[moveIndex+1];

            if(tryA <= chessDim && tryB <= chessDim){

                startA = tryA;
                startB = tryB;
                countMove ++;

                if(startA >= chessDim && startB >= chessDim){
                    break;
                } else {
                    moveIndex = 0;
                    continue;
                }

            } else {
                moveIndex = moveIndex + 2;
            }

        }

        System.out.print(countMove);

    }

}
