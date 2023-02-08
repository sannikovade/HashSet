import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordsChecker loremIpsum = new WordsChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore " +
                "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, to check for the presence of words in a text, enter them separated by commas:");
        String input = scanner.nextLine();
        words.addAll(List.of(input.split(",")));
        for (String word : words) {
            if (loremIpsum.hasWord(word)) {
                System.out.println("Text 'Lorem Ipsum' contains the word '" + word + "'");

            } else {
                System.out.println("Text 'Lorem Ipsum' doesn't contain the word '" + word + "'");
            }

        }

    }

}
