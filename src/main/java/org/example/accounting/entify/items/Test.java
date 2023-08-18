package org.example.accounting.entify.items;

import javax.xml.bind.JAXBException;

public class Test {
    public static void main(String[] args) throws JAXBException {
        AccountingForItemsApplication accounting=new AccountingForItemsApplication();
        accounting.createItem("Computer",1,1,1,1);
        accounting.createItem("Computer2",2,2,2,2);
        accounting.writeXml();
    }
}
