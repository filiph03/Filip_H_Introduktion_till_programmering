package uppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextPrinterTest {

    @Test
    public void testCountChars() {
        TextPrinter countChars = new TextPrinter();

        countChars.addToArrayList("Hejsan jag mår bra");
        countChars.addToArrayList("Hur är läget idag?");
        countChars.addToArrayList("Stop");
        countChars.addToArrayList("test");

        int actual = countChars.getCountChars();
        int expected = 40;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountLines() {
        TextPrinter countLines = new TextPrinter();

        countLines.addToArrayList("Äpple");
        countLines.addToArrayList("Banan");
        countLines.addToArrayList("Päron");
        countLines.addToArrayList("Mango");
        countLines.addToArrayList("Ananas");
        countLines.addToArrayList("Citron");
        countLines.addToArrayList("clementin");
        countLines.addToArrayList("Blåbär");
        countLines.addToArrayList("stop");

        int actual = countLines.getCountLines();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountTogether() {
        TextPrinter countTogether = new TextPrinter();

        countTogether.addToArrayList("Jag är bra på allt");
        countTogether.addToArrayList("Roligt");
        countTogether.addToArrayList("Hejsan tjena");
        countTogether.addToArrayList("Hallå där");
        countTogether.addToArrayList("Tja");
        countTogether.addToArrayList("Hallå");

        int actual1 = countTogether.getCountChars();
        int actual2 = countTogether.getCountLines();
        int expected1 = 53;
        int expected2 = 6;
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}