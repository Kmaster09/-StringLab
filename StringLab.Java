import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        
        String original = " Welcome to the Java String Lab! ";
        System.out.println("Original String: \"" + original + "\"");

        
        System.out.println("Length: " + original.length());

        
        System.out.println("Character at index 7: " + original.charAt(7));

        
        System.out.println("Substring (\"Java\"): " + original.substring(15, 19));

        
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());

        
        System.out.println("Index of \"Java\": " + original.indexOf("Java"));

        
        System.out.println("Contains \"Lab\"?: " + original.contains("Lab"));

        
        System.out.println("Replace \"Java\" with \"Java Programming\": " + original.replace("Java", "Java Programming"));

        
        System.out.println("Split by space:");
        String[] words = original.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        
        System.out.println("Trimmed: \"" + original.trim() + "\"");

        
        String compareStr = "java string lab!";
        System.out.println("Equals (case-sensitive): " + original.trim().equals(compareStr));
        System.out.println("Equals (ignore case): " + original.trim().equalsIgnoreCase(compareStr));

        

        
        int vowelCount = 0;
        String lowerOriginal = original.toLowerCase();
        for (int i = 0; i < lowerOriginal.length(); i++) {
            char ch = lowerOriginal.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is \"" + word + "\" a palindrome? " + isPalindrome);

        
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence containing the word \"Java\": ");
            input = scanner.nextLine();
        } while (!input.contains("Java"));
        System.out.println("Thank you!");

        
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("StringBuilder reversed: " + sb.reverse());

        
        StringBuffer sf = new StringBuffer("Multithreading Lab");
        sf.append(" - Learning Java");
        sf.insert(sf.indexOf("Lab") + 3, " is fun");
        int s = sf.indexOf("Learning");
        int e = s + "Learning".length();
        sf.delete(s, e);
        System.out.println("StringBuffer reversed: " + sf.reverse());
    }
}

