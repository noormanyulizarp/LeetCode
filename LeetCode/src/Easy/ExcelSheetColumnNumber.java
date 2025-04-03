public class ExcelSheetColumnNumber {
    /**
     * This method converts a column title (like "A", "B", ..., "Z", "AA", "AB", ...) 
     * to its corresponding column number in Excel.
     *
     * @param columnTitle the column title to convert
     * @return the corresponding column number
     */
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        
        for (int i = 0; i < length; i++) {
            // Convert character to its corresponding number (A=1, B=2, ..., Z=26)
            int value = columnTitle.charAt(i) - 'A' + 1;
            // Update result by shifting previous result by 26 (base 26)
            result = result * 26 + value;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        String columnTitle1 = "A";
        System.out.println("Column Title: " + columnTitle1 + " -> Column Number: " + titleToNumber(columnTitle1)); // Output: 1

        String columnTitle2 = "Z";
        System.out.println("Column Title: " + columnTitle2 + " -> Column Number: " + titleToNumber(columnTitle2)); // Output: 26

        String columnTitle3 = "AA";
        System.out.println("Column Title: " + columnTitle3 + " -> Column Number: " + titleToNumber(columnTitle3)); // Output: 27

        String columnTitle4 = "AB";
        System.out.println("Column Title: " + columnTitle4 + " -> Column Number: " + titleToNumber(columnTitle4)); // Output: 28

        String columnTitle5 = "ZY";
        System.out.println("Column Title: " + columnTitle5 + " -> Column Number: " + titleToNumber(columnTitle5)); // Output: 701
    }
}