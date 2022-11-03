package uppgift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TextPrinter {
    private final ArrayList<String> myArrayList = new ArrayList<>();
    private boolean isRunning;
    public TextPrinter() {
        isRunning = true;
    }
    public void addToArrayList(String input) {
        if (input.equals("Stop") || input.equals("stop")) {
            isRunning = false;
        } else {
            myArrayList.add(input);
        }
    }
    public boolean getBoolean() {
        return isRunning;
    }
    public int getCountChars() {
        int countChars = 0;
        for (String scanEntities : myArrayList) {
            countChars += scanEntities.length();
        }
        return countChars;
    }
    public int getCountLines() {
        return myArrayList.size();
    }
    public int getCountWords() {
        String text = myArrayList.toString();
        return text.split("\\s+").length; ////Skriver ut ord och även separerade med blanksteg
    }
    public String getLongestWord() {
        String text = myArrayList.toString();
        String replace1 = text.replaceAll(",", " ");
        String replace2 = replace1.replaceAll("]", " ");
        String replace3 = replace2.replaceAll("\\[", " ");

        return Arrays.stream(replace3.split(" "))
                .max(Comparator.comparingInt(String::length)) //Hittar det längsta ordet
                .orElse(null);

            //Made by Filip :)
    }
}