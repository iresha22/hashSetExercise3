import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // object
        String dogName = "Snowy";

        // confirmation that the myCatNameList() is empty
        myCatNameList();

        //the iterator
        Iterator<String> theIterator = myCatNameList().iterator();

        //while loop to print the mycatNameList and
        while (theIterator.hasNext()){
            String element = theIterator.next();
            System.out.println(element);

            //if statement to check whether myCatNameList() == object dog, and delete myCatNameList() values if it is not
            if (element == dogName){
                System.out.println(true);
            } else {
                theIterator.remove();
            }
        }

    }

    // function that returns a filled hashset
    public static Set<String> myCatNameList(){
        Set<String> names = new HashSet<String>(Arrays.asList("Luna","Fiona","serena","laura"));
        return names;
    }
}