
import java.util.ArrayList;
import java.util.Collection;
import numberrangesummarizer.NumberRangeSummarizer;

/**
 * class that implements the NumberRangeSummarizer and adds body
 * to the NumberRangeSummarizer methods
 */
public class NumberSummarizer implements NumberRangeSummarizer {
  @Override
  public Collection<Integer> collect(String input) {

    // Seperate the string by ","
    String[] stringCollection = input.split(",");
    Collection<Integer> intCollection = new ArrayList<>();

    // changing strings to int
    for (String num : stringCollection) {
        int intNum = Integer.parseInt(num);
        intCollection.add(intNum);
    }

    return intCollection;
  }

  @Override
  public String summarizeCollection(Collection<Integer> input) {
    
    ArrayList<Integer> numList = new ArrayList<>(input);

    int i = 0;
    String output = "";

    while (i < numList.size()) {
      int index = numList.get(i);

      // the beginning of the sequence
      if ((i+1) < numList.size() && (index+1) == numList.get(i+1)) {

        String startSeq = "" + index;
        while ((i+1) < numList.size() && (index+1) == numList.get(i+1)) {
          index = index+1;
          i++;
        }

        // beginning of the output string
        if (output.equals("")) {
          output = output + startSeq + "-" + index;
        } else {
          output = output + "," + startSeq + "-" + index;
        }
        i++;
      } else { // index with no sequence

        // beginning of the output string
        if (output.equals("")) {
          output = "" + index;
        } else {
          output = output + "," + index;
        }
        i++;
      }
    }

    return output;
  }
}