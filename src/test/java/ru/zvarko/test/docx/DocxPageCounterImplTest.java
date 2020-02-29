package ru.zvarko.test.docx;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.testng.Assert.assertEquals;

/**
 * Test for {@link DocxPageCounterImpl}
 */
public class DocxPageCounterImplTest {

    private DocxPageCounter subj = new DocxPageCounterImpl();

    @Test
    public void testCountPages() throws IOException, Docx4JException {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("it_null.docx");
        assertEquals(7, subj.countPages(is));
    }

    @Test
    @Ignore
    public void testCountPages2() throws IOException, Docx4JException {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("resume.docx");
        assertEquals(4, subj.countPages(is));
    }
}