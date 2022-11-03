package uppgift;

import java.util.Scanner;

public class TextPrinter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextPrinter myPrinter = new TextPrinter();

        System.out.println("Skriv in text sedan tryck på enter.");
        System.out.println("Avsluta programmet genom att skriv: stop");

        while (myPrinter.getBoolean()) {
            System.out.println("Skriv din text här:");
            String text = scan.nextLine();
            myPrinter.addToArrayList(text);
        }

        int countChars = myPrinter.getCountChars();
        int countLines = myPrinter.getCountLines();
        int countWords = myPrinter.getCountWords();
        String longestWord = myPrinter.getLongestWord();

        System.out.println("Du skrev: " + countChars + " antal tecken.");
        System.out.println("Du skrev: " + countLines + " antal rader.");
        System.out.println("Du skrev: " + countWords + " antal ord.");
        System.out.println("Det längsta ordet du skrivit var: " + longestWord + "" +
                "\nordet är " + longestWord.length() + " tecken långt.");

    }
}