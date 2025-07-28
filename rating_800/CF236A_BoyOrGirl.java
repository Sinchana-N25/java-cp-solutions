/*
 * Problem Number: CF236A
 * Problem Name: Boy or Girl
 * Difficulty: 800 (Easy)
 * Link: https://codeforces.com/problemset/problem/236/A
*/

package rating_800;
import java.util.*;
public class CF236A_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the username in lowercase: (alphabets only)");
        String username= sc.next();
        String s="";
        int len=username.length();
        for(int i=0;i<len;i++)
        {
            char ch=username.charAt(i);
            if(s.indexOf(ch)==-1)
            {
              s+=ch;
            }
        }
        if ((s.length())%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}
