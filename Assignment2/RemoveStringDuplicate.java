package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveStringDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String ch = sc.nextLine();
        char [] s = ch.toCharArray();
        int in = 0;
        int j;
        for (int i=0;i<s.length;i++)
        {
            for (j=0;j<i;j++)
            {
                if (s[i] == s[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                s[in++] = s[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(s, in)));
    }
}
