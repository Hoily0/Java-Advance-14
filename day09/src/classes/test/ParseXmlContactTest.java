package classes.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;

/**
 * @author 30391
 */
public class ParseXmlContactTest {
    public static void main(String[] args) throws DocumentException {

        SAXReader reader = new SAXReader();
        Document read = reader.read("day09/src/contacts2.xml");

        Element rootElement = read.getRootElement();
        ArrayList<String> list = new ArrayList<>();

        for (Element child : rootElement.elements()) {

            for (Element element : child.elements()) {

                String name = element.getName();
                String text = element.getText();
                list.add(text);
            }


        }
        System.out.print(list);


    }
}
