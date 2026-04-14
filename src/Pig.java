public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    //sentenceSplitter (piglatin)
    //first method split the sentence into words 
    //String[] words = sentence.split(" ");
    // for loop to split each word
    //for (String word : sentence){
            //result += pigLatinSingleWord(word)
            //result += " ",}
            //results = result.substring(0, result.length() -1 );
            //return results;
    //}
    //store each word separated by the .split() into a variable called word

    //Second Method is pigLatinSingleWord private (String word)
     // have a if statementcharAt(0) === "a" || word.charAt(0) == "e" || word.charAt(0) == "i" ||
    // takes the word and adds charAt(0) to that word
    // have a if statement
    // reads index 0
    // if the character starts with a vowel then it will return the input back no changes
    // else it will take the index zero 
    // takes the word and adds charAt(0) to that word
    // adds index 0 to end of word
    // and than takes that word and adds "ay"
    // return the piglatin sentence.
    // Implement your solution here!
    // Method 1: splits sentence into words, converts each, rejoins with spaces
    public static String pigLatin(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {          // iterate over the array, not sentence
            result += pigLatinSingleWord(word) + " ";
        }

        return result.substring(0, result.length() - 1);  // trim trailing space
    }

    // Method 2: converts a single word to pig Latin
    private static String pigLatinSingleWord(String word) {
        char firstLetter = word.charAt(0);

        // If starts with a vowel, return unchanged
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' ||
            firstLetter == 'o' || firstLetter == 'u') {
            return word;
        }

        // Move first letter to end and add "ay"
        return word.substring(1) + firstLetter + "ay";
    }
    

    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  