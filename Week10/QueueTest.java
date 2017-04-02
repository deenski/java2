// queue test

public class QueueTest
{
   public static void main(String[] args)
   {
      try
      {
         // create empty lists
    		MyQueue<Integer> list1 = new MyQueue<>("new queue");
    		
            
         // test a peek method with an empty list
         list1.peek();
            
         // add items to list1
    		list1.enqueue(1);
         list1.peek();
    		list1.enqueue(5);
         list1.peek();
    		list1.enqueue(2);
         list1.peek();
            
                     
         list1.dequeify();
         list1.peek();
         list1.dequeify();
         list1.peek();
         list1.dequeify();
         list1.peek();
         list1.dequeify();
         list1.peek();
      }
      catch(EmptyListException e)
      {
         System.out.println("Empty Queue");
      }

   }
}