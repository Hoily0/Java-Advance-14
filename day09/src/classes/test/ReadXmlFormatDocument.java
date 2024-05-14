package classes.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 30391
 */
public class ReadXmlFormatDocument {
    public static void main(String[] args) throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("day09/src/user.xml");
        Element rootElement = read.getRootElement();
        /**
         *
         *  System.out.println(rootElement.getName());
         *         String name = read.getName();
         *         System.out.println(name);
         */

        ArrayList<String> list = new ArrayList<>();


        for (Element child : rootElement.elements()) {

            List<Element> elements = child.elements();
            for (Element element : elements) {

                String key = element.getName();
                String value = element.getText();
//                System.out.print(key + " : " + value);
//                System.out.print( value);
                list.add(value);
            }

        }
        System.out.println(list);


    }
}
