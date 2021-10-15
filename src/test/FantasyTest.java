package test;

import com.softwareinstitute.training.murray.ben.Fantasy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyTest {

    @Test
    public void  testFantasyItemTitleMethod() {
        Fantasy myFantasy = new Fantasy("Two Towers", "Tolkien", "Paperback", 352);
        assertEquals("This fantasy is not A", "A", myFantasy.getItemTitle());
    }


}
