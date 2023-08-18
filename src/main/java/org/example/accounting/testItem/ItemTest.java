package org.example.accounting.testItem;

import javax.xml.bind.JAXBException;

public class ItemTest {
    public static void main(String[] args) throws JAXBException {
        Application application=new Application();
        application.createItem("Computer",1,1,1,1);
        application.createItem("Computer2",2,2,2,2);
        application.writeXml();
    }

}
