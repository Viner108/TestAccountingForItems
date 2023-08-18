package org.example.accounting.entify.items;

import javax.xml.bind.JAXBException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AccountingForItemsApplication {
    private Path itemXmlPath = Path.of("library", "Items.xml");
    private ItemXmlRepository itemXmlRepository=new ItemXmlRepository(itemXmlPath);
    private ItemMap itemMap=new ItemMap();
    private Map<Integer, Item> map=new HashMap<>();
    private List<Item> items = new ArrayList<>();
    public void createItem(String name, int id, double width, double length, double height) {
        Item item =new Item(name, id, width, length, height);
        items.add(item);
        map.put(items.size(),item);
        itemMap.setItemMap(map);
    }
    public void writeXml() throws JAXBException {
        itemXmlRepository.writeToXmlFile(itemMap);
    }
}
