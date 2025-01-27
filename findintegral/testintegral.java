package findintegral;

public class testintegral {
    public static void main(String[] args) {

        //test cases
        int[][] testCases = {
            {3, 2},
            {12, 5},
            {40, 3}
        };
        //correct outputs
        String[] correctCases = {
            "1x^3",
            "2x^6",
            "10x^4"
        };
        //runs test
        for (int i = 0; i< testCases.length; i++) {
            int coefficient = testCases[i][0];
            int exponent = testCases[i][1];
            String expected = correctCases[i];
        
            
        // Call the integrate method
        String result = findintegral.integrate(coefficient, exponent);

        // Print test results
        System.out.println("Test Case " + (i + 1) + ":");
        System.out.println("Input: Coefficient = " + coefficient + ", Exponent = " + exponent);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        System.out.println(result.equals(expected) ? "PASS" : "FAIL");
        System.out.println("---------------------------------");
    }
    }
    
}
