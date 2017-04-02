// stack test

public class StackTest
{
   public static void main(String[] args)
   {
      try
      {
         // create empty lists
    		MyStack<Integer> list1 = new MyStack<>("new stack");
    		
            
         // test a peek method with an empty list
         list1.peek();
            
         // add items to list1
    		list1.push(1);
         list1.peek();
    		list1.push(5);
         list1.peek();
    		list1.push(2);
         list1.peek();
            
            // print the contents of list1
    		
         
         list1.pop();
         list1.peek();
         list1.pop();
         list1.peek();
         list1.pop();
         list1.peek();
         list1.pop();
         list1.peek();
      }
      catch(EmptyListException e)
      {
         System.out.println("Empty List");
      }

   }
}