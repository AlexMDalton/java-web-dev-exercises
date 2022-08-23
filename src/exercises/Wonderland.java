package exercises;

import java.util.Scanner;

public class Wonderland {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by" +
                "her sister on the bank, and of having nothing to do: once or" +
                "twice she had peeped into the book her sister was reading, but" +
                "it had no pictures or conversations in it, 'and what is the use" +
                "of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter the search term:");
        String searchTerm = input.nextLine();
        boolean hasTerm = sentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println(hasTerm);
        if(hasTerm){
            System.out.println("The index of the term is: " + sentence.indexOf(searchTerm) + "and the length of the string is " + searchTerm.length());
            //String[] shortSentence = sentence.split(sentence.indexOf(searchTerm));
        }
    }
}
