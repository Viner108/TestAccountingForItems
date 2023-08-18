package org.example.accounting.testItem;

import javax.xml.bind.JAXBException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    private Path itemXmlPath = Path.of("library", "Items.xml");
    private XmlRepository itemXmlRepository=new XmlRepository(itemXmlPath);
    private ItemMap2 itemMap=new ItemMap2();
    private Map<Integer, Item2> map=new HashMap<>();
    private List<Item2> items = new ArrayList<>();
    public void createItem(String name, int id, double width, double length, double height) {
       Item2 item =new Item2(name, id, width, length, height);
        items.add(item);
        map.put(items.size(),item);
        itemMap.setItemMap2(map);
    }
    public void writeXml() throws JAXBException {
        itemXmlRepository.itemMarshal(itemMap);
    }
}
