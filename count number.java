import java.util.*;
public class word{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(a[i]))
            count++;
        }
        System.out.println(count);
    }
}
