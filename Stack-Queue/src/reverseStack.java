import java.util.Scanner;
import java.util.Stack;
public class reverseStack
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     Stack<Integer>st=new Stack<>();
     st.push(1);
     st.push(2);
     st.push(3);
     st.push(4);
     st.push(5);
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
                                 //dono kar sakte haii
            //int x=st.peek();
           // rt.push(x);
            //st.pop();
        }
        System.out.println(rt);
    }
}