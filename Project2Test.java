import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for the Project2 class.
 */
public class Project2Test {

    /**
     * testWordByWord() testing adding words by hand.
     */
    @Test
    public void testWordByWord() {
        Project2 runner = new Project2();
        runner.addWord("Hello");
        runner.addWord("Hello");
        runner.addWord("World");

        int n = runner.numUniqueWords();
        assertEquals("numUniqueWords() is wrong", 2, n);
    }

    /**
     * testLoadFromString() testing adding a long string.
     */
    @Test
    public void testLoadFromString() {
        Project2 runner = new Project2();
        runner.loadFromString("Hello, Hello, World");

        int n = runner.numWords();
        assertEquals("numWords() is wrong", 3, n);
    }

    /**
     * testLoadFromString() testing adding a long string.
     */
    @Test
    public void testLoadFromFile() {
        Project2 runner = new Project2();
        runner.loadFromFile("shortdoc.txt");

        // you must update these numbers
        int n = runner.numUniqueWords();
        assertEquals("numUniqueWords() is wrong", 2, n);
    }

    /**
     * These methods tested here are not required for this project
     * but are called here so you get full coverage points.
     */
    @Test
    public void testCallingMethodsNotUsed() {
        Project2 runner = new Project2();
        assertEquals(0, runner.numOfPolySyllabic(0));
        assertEquals(0, runner.numOfSyllables());
        assertEquals("", runner.getContents());
    }

    // Add your own test cases here
}
