/*
 * Problem Number: CF263A
 * Problem Name: Beautiful Matrix
 * Difficulty: 800 (Easy)
 * Link: https://codeforces.com/problemset/problem/263/A
 */

package rating_800;

import java.util.*;
public class CF263A_BeautifulMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5]; 
        Scanner sc = new Scanner(System.in); 
        int m=0;
        int n=0;
        int count=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt(); 
                if(matrix[i][j]==1) 
                {
                    m=i;
                    n=j;
                }
            }
        }
        if(m!=2 || n!=2)
        {
            switch(m)
            {
                case 0: count+=2;
                        break;
                case 1: count+=1;
                        break;
                case 2: break;
                case 3: count+=1;
                        break;
                case 4: count+=2;
                        break;
            }
            switch(n)
            {
                case 0: count+=2;
                        break;
                case 1: count+=1;
                        break;
                case 2: break;
                case 3: count+=1;
                        break;
                case 4: count+=2;
                        break;
        }
    }
    System.out.println(count);
    sc.close();
}
}
