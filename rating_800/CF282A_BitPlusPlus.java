/*
 * Problem Number: CF282A
 * Problem Name: Bit++
 * Difficulty: 800 (Easy)
 * Link: https://codeforces.com/problemset/problem/282/A
 */

package rating_800;
import java.util.*;
public class CF282A_BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          String operation= sc.next();
            if(operation.startsWith("+") || operation.endsWith("+"))
            {
                X++;
            }
            else
            {
                X--;
            }
        }
        System.out.println(X);
        sc.close();
    }
}
