// Jakob Vendegna
// csc 161
// 3.28.17

// this is my Stack object class

public class MyStack<T> extends List<T>
{
   //create a new stack, which is really just a list... shh, don't tell
   public MyStack() 
   {
      super("myStack");
   } 
   
   // name your own stack, lazy bones.
   public MyStack(String n)
   {
      super(n);
   }
   
   // add an object to the top of the stack
   public void push(T obj)
   {
      insertAtFront(obj);
   }
   
   // remove the object at the top of the stack
   public T pop() throws EmptyListException
   {
      return removeFromFront();
   }
   
   public void peek()
   {
      super.print();
   }
}