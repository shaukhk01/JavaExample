//Stack store 10 values print(10-------1 and 19--------11)
class Stack
{
    int stack[] = new int[10];//create same data type array object
    int tos;

    Stack()
    {
        tos = -1;
    }
    public void push(int item)
    {
        if(tos == 9)
        
            System.out.println("Stack Full");
        else
            stack[++tos] = item;
    }
    public int pop()
    {
        if(tos <= 0)
        { 
            System.out.println("Stack Overflow.");
            return 0;//because return type if int pop() last stage it will return if tos<0 
        }
        else
            return stack[tos--];
    }
}

public class BoxDemo8
{
    public static void main(String[]args)
    {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();//every object have separet copy

        for(int i=0;i<10;i++)
        {
            mystack1.push(i);
        }
        for(int i=10;i<20;i++)
        {
            mystack2.push(i);
        }

        for(int i=0;i<10;i++)
            System.out.println(mystack1.pop());

        for(int i=0;i<10;i++)
            System.out.println(mystack2.pop());

    }
}

