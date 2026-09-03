import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import itsc2214.*;

/**
 * Project2 processes a document by loading words from a file or string.
 * Words are stored in a list, unique words in a set, and misspelled
 * words in a bag. The class also provides statistics about the document.
 */
public class Project2 extends Document {

    /** Name of the file loaded. */
    private String fileName;

    /** List containing all document words (duplicates allowed). */
    private ListADT<String> docWords;

    /** Bag containing misspelled words. */
    private BagADT<String> misspelledWords;

    /** Set representing the dictionary of valid words. */
    private SetADT<String> dictionary;

    /** Set containing unique words from the document. */
    private SetADT<String> uniqueWords;

    /**
     * Default constructor.
     * Initializes all data structures and loads an empty document.
     */
    public Project2() {

        fileName = "";

        docWords = new ListArray<String>();
        misspelledWords = new BagArray<String>();
        dictionary = new SetArrayList<String>();
        uniqueWords = new SetArrayList<String>();

        loadFromString("");
    }

    /**
     * Returns the filename associated with this document.
     *
     * @return the name of the file used
     */
    @Override
    public String getFilename() {

        if (fileName == null) {
            return "";
        }

        return fileName;
    }

    /**
     * Loads text from a file and processes it.
     *
     * @param fileName name of the file to load
     * @return true if loaded successfully, false otherwise
     */
    public boolean loadFromFile(String fileName) {

        try {

            this.fileName = fileName;

            java.util.List<String> lines = Files.readAllLines(Paths.get(fileName));

            StringBuilder builder = new StringBuilder();

            for (String line : lines) {
                builder.append(line);
                builder.append(" ");
            }

            return loadFromString(builder.toString().trim());
        }

        catch (IOException e) {

            if (fileName == null) {
                this.fileName = "";
            } else {
                this.fileName = fileName;
            }

            return loadFromString("");
        }
    }

    /**
     * Breaks a string into tokens separated by whitespace or punctuation
     * and processes each word using addWord().
     *
     * @param data string to process
     * @return true if processed correctly
     */
    public boolean loadFromString(String data) {

        docWords.clear();
        misspelledWords.clear();
        uniqueWords.clear();

        if (data == null) {
            return true;
        }

        try {

            String[] tokens = data.split("[^A-Za-z0-9]+");

            for (String token : tokens) {
                addWord(token);
            }

            return true;
        }

        catch (Exception e) {
            return false;
        }
    }

    /**
     * Adds a word to the document.
     *
     * Steps:
     * - Ignore null words
     * - Trim whitespace and convert to lowercase
     * - Ignore words shorter than 3 characters
     * - Add word to document list
     * - Track unique words
     * - Track misspelled words
     *
     * @param w word to add
     */
    public void addWord(String w) {

        if (w == null) {
            return;
        }

        String word = w.trim().toLowerCase();

        if (word.length() < 3) {
            return;
        }

        docWords.add(word);

        if (!uniqueWords.contains(word)) {
            uniqueWords.add(word);
        }

        if (dictionary != null && !dictionary.contains(word)) {
            misspelledWords.add(word);
        }
    }

    /**
     * Returns the total number of words in the document.
     *
     * @return total word count
     */
    public int numWords() {
        return docWords.size();
    }

    /**
     * Returns the number of unique words.
     *
     * @return number of unique words
     */
    public int numUniqueWords() {
        return uniqueWords.size();
    }

    /**
     * Returns a bag of misspelled words.
     *
     * @return bag of misspelled words
     */
    public BagADT<String> getMisspelledWords() {
        return misspelledWords;
    }

    /**
     * Returns the contents of the document as a string.
     *
     * @return document contents
     */
    public String getContents() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < docWords.size(); i++) {

            if (i > 0) {
                builder.append(" ");
            }

            builder.append(docWords.get(i));
        }

        return builder.toString();
    }

    /**
     * Returns total number of syllables in the document.
     *
     * @return syllable count
     */
    public int numOfSyllables() {

        int total = 0;

        for (int i = 0; i < docWords.size(); i++) {
            total += countSyllables(docWords.get(i));
        }

        return total;
    }

    /**
     * Counts words with syllables greater than or equal to arg0.
     *
     * @param arg0 syllable threshold
     * @return number of polysyllabic words
     */
    public int numOfPolySyllabic(int arg0) {

        int count = 0;

        for (int i = 0; i < docWords.size(); i++) {

            if (countSyllables(docWords.get(i)) >= arg0) {
                count++;
            }
        }

        return count;
    }
}
