package test;

import com.softwareinstitute.training.murray.ben.FantasyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyBookTest {

    @Test
    public void  testFantasyBookItemTitleMethod() {
        FantasyBook myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);
        assertEquals("This fantasy is not Two Towers", "Two Towers", myFantasyBook.getItemTitle());
    }


}
