// stack me element kese dete(input) k form me....
import java.util.Scanner;
import java.util.Stack;
public class stack2
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Stack<Integer>st=new Stack<>();
        System.out.println("enter the number of an element:");
        int n=sc.nextInt();
        System.out.println("enter the element:");
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}