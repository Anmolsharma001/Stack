import java.util.*;
public class removeFromBottom
{                        //bottom me 10 jayenga then 20,30,40,50
                        // to 10 remove honga
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     Stack<Integer>st=new Stack<>();
     st.push(10);
     st.push(20);
     st.push(30);
     st.push(40);
     st.push(50);
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        while(st.size()>3 ||st.size()<3)
        {
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0)
        {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
