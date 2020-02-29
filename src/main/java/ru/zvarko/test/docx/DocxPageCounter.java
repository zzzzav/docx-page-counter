package ru.zvarko.test.docx;

import org.docx4j.openpackaging.exceptions.Docx4JException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Компонент пдсчета кол-ва страниц в pdf документе
 */
public interface DocxPageCounter {

    /**
     * Подсчитывает кол-во страниц во входящем потоке документа docx
     * @param is поток байт
     * @return кол-во страниц документа
     * @throws Docx4JException в случае ошибки парсинга данных
     * @throws IOException в случае ошибки чтения данных
     */
    int countPages(InputStream is) throws Docx4JException, IOException;
}
