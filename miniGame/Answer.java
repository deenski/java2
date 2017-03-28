//package com.google.challenges; 
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Answer {   
    public static int[] answer(int[] data, int n) 
                throws NoSuchElementException       { 
        ArrayList<Integer> dataCopy = new ArrayList<Integer>();
       
        for(int i = 0; i < data.length; i++){
            
                dataCopy.add(data[i]);
        }
        Iterator<Integer> removal = dataCopy.iterator();
        Iterator<Integer> iterator = dataCopy.iterator();        
        ArrayList<Integer> dataCopy2 = new ArrayList<Integer>();
        int[] result = new int[dataCopy.size()];
        
        while(removal.hasNext()) {
            int counter = 0;
            if(removal.next().equals(n) || counter > 0){
                counter++;
                if(counter >= 1) {
                    dataCopy2.add(removal.next());
                    counter = 0;
                }
            }
        }
        
        while (iterator.hasNext()) {
            if (dataCopy2.contains(iterator.next())) {
                iterator.remove();
            }
        }
        
        Iterator<Integer> copyJob = dataCopy.iterator();
        
                
        for(int i = 0; i < dataCopy.size(); i++) {
            result[i] = (int) copyJob.next();
        }
        
        return result;
        
    }
    

    public static void main(String[] args) {
        int[] data = {10,10,3,4};
        int n = 1;
        int[] solution = answer(data, n);

        for(int i : solution) {
            System.out.printf("%d, ", i);
        }
    }
 
}