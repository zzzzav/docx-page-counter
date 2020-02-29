/*
package ru.zvarko.test.docx;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PoiParser {

    public static void main(String[] args) throws IOException {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("it_null.docx");
        XWPFDocument document = new XWPFDocument(is);
        XWPFStyles styles = document.createStyles();
        CTSectPr ctSectPr = document.getDocument().getBody().addNewSectPr();
        CTPageSz ctPageSz = ctSectPr.addNewPgSz();
        ctPageSz.setW(BigInteger.valueOf(12240));
        ctPageSz.setH(BigInteger.valueOf(15840));

        PdfOptions options = PdfOptions.create();
        Path path = Paths.get("c:\\temp", "out.pdf");
        if (Files.exists(path)) {
            Files.delete(path);
        }

        OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.CREATE_NEW, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        PdfConverter.getInstance().convert(document, outputStream, options);
        document.close();
        outputStream.close();
        int i = 0;
    }
}
*/
