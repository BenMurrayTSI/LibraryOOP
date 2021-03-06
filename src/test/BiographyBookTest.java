package test;

import com.softwareinstitute.training.murray.ben.BiographyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiographyBookTest {

    BiographyBook myBiographyBook = new BiographyBook("A", "B", "C", 4);

    @Test
    public void  testBiographyBookItemTitleMethod() {
        assertEquals("This biography book is not A", "A", myBiographyBook.getItemTitle());
    }

    @Test
    public void  testBiographyBookWriterNameMethod() {
        assertEquals("This biography book is not by B.", "B", myBiographyBook.getWriterName());
    }

    @Test
    public void  testBiographyBookCoverTypeMethod() {
        assertEquals("This biography book is not a C", "C", myBiographyBook.getCoverType());
    }

    @Test
    public void  testBiographyBookPagesMethod() {
        assertEquals("This biography book is not 4 pages.", 4, myBiographyBook.getPages());
    }

}
