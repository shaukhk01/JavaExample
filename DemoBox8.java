//This class define an integer stack that can hold 10 value

class Stack
{
    int stack[] = new int[10];
    int tos;

    //initialize top-of-stack
    Stack()
    {
        tos = -1;
        
    }
    //push item onto the stack
    public void push(int item)
    {
        if(tos == 9)
            System.out.println("stack is full");
        else
            stack[++tos] = item;
    }
    //Pop an item from the stack
    public int pop()
    {
        if(tos < 0)
        {
            System.out.println("Stack underflow.");
            return 0;
    }
    else
        return stack[tos--];
}
}
class TestStack
{
    public static void main(String[]args)
    {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some number onto the stack

        for(int i=0;i<10;i++)
            mystack1.push(i);
        //pop those number off the stack

        System.out.println("mystack1: ");
        for(int i=0;i<10;i++)
        System.out.println(mystack1.pop());
    }
}
