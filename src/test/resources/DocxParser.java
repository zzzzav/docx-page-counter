import org.apache.pdfbox.pdmodel.PDDocument;
import org.docx4j.Docx4J;
import org.docx4j.convert.out.FOSettings;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class DocxParser {

    public static void main(String[] args) throws Exception {

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("it_null.docx");
        WordprocessingMLPackage load = Docx4J.load(is);

        FOSettings foSettings = Docx4J.createFOSettings();
        foSettings.setWmlPackage(load);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        Docx4J.toFO(foSettings, baos, Docx4J.FLAG_EXPORT_PREFER_NONXSL);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

        PDDocument pdf = PDDocument.load(bais);
        System.out.println(pdf.getNumberOfPages());
        int i = 0;
    }
}
