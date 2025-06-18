import java.util.HashMap;
import java.util.Scanner;

public class MiniDictionary {
    public static void main(String[] args) {
        // Create dictionary
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("book", "A set of written pages");
        dictionary.put("pen", "A tool for writing");
        dictionary.put("sun", "The star at the center of the solar system");
        dictionary.put("moon", "A natural satellite of the Earth");
        dictionary.put("phone", "A device used to make calls");
        dictionary.put("car", "A vehicle with four wheels, usually used for transport");
        dictionary.put("water", "A clear liquid that forms rivers, lakes, and oceans");
        dictionary.put("earth", "The planet we live on");
        dictionary.put("music", "The art of combining sounds to produce harmony");
        dictionary.put("language", "A system of communication using words or symbols");
        dictionary.put("school", "A place where children go to learn");
        dictionary.put("clock", "A device used to measure and show time");
        dictionary.put("computer", "An electronic machine that processes data");
        dictionary.put("internet", "A global network that connects computers worldwide");
        dictionary.put("food", "Any nutritious substance that people or animals eat or drink");
        dictionary.put("air", "The invisible gas we breathe to live");
        dictionary.put("flower", "The colorful part of a plant that often has a pleasant smell");
        dictionary.put("friend", "Someone you like and enjoy being with");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String word = scanner.nextLine().toLowerCase();
        String meaning = dictionary.get(word);
        if (meaning != null) {
            System.out.println(word + " : " + meaning);
        } else {
            System.out.println("Word not found.");
        }

        scanner.close();
    }
}
