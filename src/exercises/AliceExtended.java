package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do:once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        String phrase;
        boolean found;
        int l3ntgh;
        int index_;
        String newParagraph;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Insert the phrase you want to find: ");
        phrase = input.nextLine();
        input.close();

        found = paragraph.toLowerCase().contains(phrase.toLowerCase());
        l3ntgh = phrase.length();
        index_ = paragraph.toLowerCase().indexOf(phrase.toLowerCase());
        newParagraph = paragraph.substring(0,index_) + paragraph.substring(index_ + l3ntgh);

        System.out.println("Length: ".concat(String.valueOf(l3ntgh)).concat(" Index: ".concat(String.valueOf(index_))).concat(" New Sentence: ").concat(newParagraph));
    }
}
