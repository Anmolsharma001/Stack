import java.util.Stack;
public class stack1
{
    public static void main(String[] args)
    {
      Stack<Integer>st=new Stack<>();
      st.push(10);
      st.push(20);
      st.push(30);
        System.out.println(st); //element ko push kar diya h
        st.pop();                //pop kara h
        System.out.println(st);
        System.out.println(st.size());   //size ka pata kiya h isse
    }
}
