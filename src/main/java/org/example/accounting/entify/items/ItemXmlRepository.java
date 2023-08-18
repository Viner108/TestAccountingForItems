package org.example.accounting.entify.items;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.nio.file.Path;

public class ItemXmlRepository {
    private Path path;

    public ItemXmlRepository(Path path) {
        this.path = path;
    }

    public void writeToXmlFile(ItemMap itemMap) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ItemMap.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(itemMap, System.out);
    }
}
