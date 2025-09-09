
import java.util.Collection;
import numberrangesummarizer.NumberRangeSummarizer;

/**
 * class that only has the main method only
 * it takes the input the argument from the
 * terminal.
 */
public class numberSummarizer {

  /*
   * main method gets the arguments from the terminal
   */
  public static void main(String[] args) {

    // check if arguments are availble
    if (args.length < 1) {
        System.out.println("Not enough arguments");
    }
    
    String input = args[0];
    NumberRangeSummarizer numberSummary = new NumberSummarizer();

    Collection<Integer> collection = numberSummary.collect(input); // collect the collection into integer
    String summarizedCollection = numberSummary.summarizeCollection(collection); // summarize the collection

    // print both input and output
    System.out.println("input: " + input);
    System.out.println("result: " + summarizedCollection);
  }
}
