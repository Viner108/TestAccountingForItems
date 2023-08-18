package org.example.accounting.testItem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Map;

@XmlRootElement(name = "ItemMap")
public class ItemMap2 {
    Map<Integer,Item2> itemMap2;

    public Map<Integer, Item2> getItemMap2() {
        return itemMap2;
    }
    @XmlElement(name = "Items")
    @XmlJavaTypeAdapter(ItemAdapter2.class)
    public void setItemMap2(Map<Integer, Item2> itemMap) {
        this.itemMap2 = itemMap;
    }
}
