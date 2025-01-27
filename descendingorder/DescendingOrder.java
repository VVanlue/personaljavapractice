package descendingorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
* takes input and changes it into descending order of digits
* @author Victoria
*/
public class DescendingOrder {
  public static int sortDesc(final int num) {
    //changes int into string
    String str = num + "";
    //splits string by digit and turns it into an array
    String[] numberarray = str.split("");
    //creates list
    List<String> numberlist = new ArrayList<>();
    //adds everything from array into list
    Collections.addAll(numberlist, numberarray);
    //sorts list
    numberlist.sort(Collections.reverseOrder());
    // turns sorted list into string
    StringBuilder sortedNumber = new StringBuilder();
    for (String digit : numberlist) {
      sortedNumber.append(digit);
    }
    //returns sorted string
    return Integer.parseInt(sortedNumber.toString());
    }
  
    //sort highest to lowest
    
      
  }