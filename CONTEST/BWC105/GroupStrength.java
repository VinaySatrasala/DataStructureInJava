public class GroupStrength {
    
    // Recursive function to find the maximum strength of a group
    private static int findMaxStrength(int[] strengths, int index, int currentPositive, int currentNegative) {
        // Base case: if all members have been considered
        if (index >= strengths.length) {
            return currentPositive;
        }
        
        // Recursive case: include or exclude the current member
        int includeCurrentPositive = findMaxStrength(strengths, index + 1, currentPositive * strengths[index], currentNegative);
        int includeCurrentNegative = findMaxStrength(strengths, index + 1, currentNegative * strengths[index], currentPositive);
        int excludeCurrent = findMaxStrength(strengths, index + 1, currentPositive, currentNegative);
        
        // Return the maximum strength among the positive and negative cases
        return Math.max(includeCurrentPositive, Math.max(includeCurrentNegative, excludeCurrent));
    }
    
    // Main function to test the example
    public static void main(String[] args) {
        int[] strengths = {-9};
        int maxStrength = findMaxStrength(strengths, 0, 1, 1);
        System.out.println("Maximum group strength: " + maxStrength);
    }
}
