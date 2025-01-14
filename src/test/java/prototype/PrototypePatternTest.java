package prototype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrototypePatternTest {
    @Test
    void testCloningPreservesState() {
        Document doc1 = new Document("Design Patterns", "A guide to patterns.");
        Document doc2 = doc1.clone();

        assertEquals(doc1.getTitle(), doc2.getTitle(), 
                     "Naslov kloniranog dokumenta treba da je isti.");
        assertEquals(doc1.getContent(), doc2.getContent(), 
                     "Sadržaj kloniranog dokumenta treba da je isti.");
    }

    @Test
    void testCloningCreatesNewInstance() {
        Document doc1 = new Document("Design Patterns", "A guide to patterns.");
        Document doc2 = doc1.clone();

        assertNotSame(doc1, doc2, 
                      "Klonirani objekat treba da je druga instanca.");
    }

    @Test
    void testModifyingClone() {
        Document doc1 = new Document("Design Patterns", "A guide to patterns.");
        Document doc2 = doc1.clone();

        doc2.setTitle("Advanced Patterns");

        assertNotEquals(doc1.getTitle(), doc2.getTitle(), 
                        "Promena naslova klona ne treba da utiče na original.");
    }
}
