package descendingorder;

/**
 * testing driver for the DescendingOrderclass
 * makes sure the method works as intended
 * @author Victoria
 */
public class DescendingOrderTest {
    public static void main(String[] args) {
        // test cases
        int[] testCases = {42135, 17621, 531};

        // correct outputs
        int[] correctCases = {54321, 76211, 531};

        //runs tests
        for (int i = 0; i < testCases.length; i++) {
            int input = testCases[i];
            int correct = correctCases[i];
            int result = DescendingOrder.sortDesc(input);


            //prints result
            System.out.println("Test case " + (i + 1) + ":");
            System.out.println("Input: " + input);
            System.out.println("Expected: " + correct);
            System.out.println("Result: " + result);
            System.out.println(result == correct ? "Passed!" : "Failed...");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||");

        }
    }
}