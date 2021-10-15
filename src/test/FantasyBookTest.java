package test;

import com.softwareinstitute.training.murray.ben.FantasyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyBookTest {

    FantasyBook myFantasyBook = new FantasyBook("Twp Towers", "Tolkirn", "Paperbsck", 3522);

    @Test
    public void  testFantasyBookItemTitleMethod() {
        assertEquals("This fantasy is not Two Towers.", "Two Towers", myFantasyBook.getItemTitle());
    }

    @Test
    public void  testFantasyBookWriterNameMethod() {
        assertEquals("This fantasy is not by Tolkien.", "Tolkien", myFantasyBook.getWriterName());
    }

    @Test
    public void  testFantasyBookCoverTypeMethod() {
        assertEquals("This fantasy is not a paperback.", "Paperback", myFantasyBook.getCoverType());
    }

    @Test
    public void  testFantasyBookPagesMethod() {
        assertEquals("This fantasy is not 352 pages.", 352, myFantasyBook.getPages());
    }

}
