

import java.util.ArrayList;

public class Answer {   
    public static int[] answer(int[] data, int n) { 
        ArrayList<int> duplicates = new ArrayList<int>();
        ArrayList<int> dataCopy = new ArrayList<int>();
        
        for(int i : data) {
            dataCopy.add(data[i]);
        }
        
        for(int i : dataCopy) {
            if (dataCopy[i].contains(n)) {
                dataCopy.remove(i);
            }
        }
        
        int[] solution = new int[dataCopy.size()];
        
        for(int i : dataCopy) {
            solution[i] = dataCopy.get(i)
        }
        
        return solution;

    } 
}