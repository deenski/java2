
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Testing {
    public static void main(String[] args) {
        List<Entertainment> listTest = new ArrayList<Entertainment>();
        Movie dieHard = new Movie();
        dieHard.setTitle("Die Hard");
        dieHard.setCreator("Bruce Willis");
        dieHard.setRating("pg13");
        dieHard.setDescription("The best christmas movie of all time");
        
       

        Movie theMatrix = new Movie();
        theMatrix.setTitle("The Matrix");
        theMatrix.setCreator("Waichoski Brothers");
        theMatrix.setRating("R");
        theMatrix.setDescription("The worst rendition of the new testament," +
            " since the new testament.");

        listTest.add(dieHard);
        listTest.add(theMatrix);
        
        TVShow friends = new TVShow();
        friends.setTitle("Friends");
        friends.setRating("PG");
        friends.setDayOfWeek("Monday");
        friends.setDescription("Tune in to see Jennifer Aniston's haircut.");
        
        listTest.add(friends);
        
        Iterator iterator = listTest.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}