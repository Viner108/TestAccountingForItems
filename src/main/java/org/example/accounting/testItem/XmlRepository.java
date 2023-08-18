package org.example.accounting.testItem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.nio.file.Path;

public class XmlRepository {
    private Path path;

    public XmlRepository(Path path) {
        this.path = path;
    }

    public void itemMarshal(ItemMap2 itemMap) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ItemMap2.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(itemMap, System.out);
    }
}
