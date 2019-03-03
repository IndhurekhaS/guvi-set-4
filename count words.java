import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
           if(Character.isLetter(a[i]))
            count++;
        }
        System.out.println(count);
    }
}
