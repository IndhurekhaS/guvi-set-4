import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0,b=1;
       for(int i=0;i<n;i++){
       int sum=a+b;
       a=b;
       b=sum;
       System.out.print(a+" ");
       }
       
    }
}
