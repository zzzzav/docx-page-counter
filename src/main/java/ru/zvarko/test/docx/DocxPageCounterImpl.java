package ru.zvarko.test.docx;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.docx4j.Docx4J;
import org.docx4j.convert.out.FOSettings;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Реализация {@link DocxPageCounter}
 */
public class DocxPageCounterImpl implements DocxPageCounter {

    /**
     * {@inheritDoc}
     */
    @Override
    public int countPages(InputStream is) throws Docx4JException, IOException {
        WordprocessingMLPackage document = Docx4J.load(is);

        FOSettings foSettings = Docx4J.createFOSettings();
        foSettings.setWmlPackage(document);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Docx4J.toFO(foSettings, baos, Docx4J.FLAG_EXPORT_PREFER_NONXSL);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

        PDDocument pdf = PDDocument.load(bais);
        return pdf.getNumberOfPages();
    }
}
