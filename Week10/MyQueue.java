// Jakob Vendegna
// CSC 161
// 3.28.17

// my queue class insert at back, remove from front.

public class MyQueue<T> extends List<T>
{
   // default
   public MyQueue()
   {
      super("MyQueue");
   }
   
   // name your own queue
   public MyQueue(String n) 
   {
      super(n);
   }
   
   // last in
   public void enqueue(T obj)
   {
      insertAtBack(obj);
   }
   
   // first out
   public T dequeify() throws EmptyListException
   {
      return removeFromFront();
   }
   
    public void peek()
   {
      super.print();
   }
}