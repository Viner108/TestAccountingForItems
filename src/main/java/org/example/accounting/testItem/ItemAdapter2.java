package org.example.accounting.testItem;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemAdapter2 extends XmlAdapter<ItemWrapper2, Map<Integer, Item2>> {

    @Override
    public Map<Integer, Item2> unmarshal(ItemWrapper2 itemWrapper) throws Exception {
        Map<Integer, Item2> itemMap = null;
        if (itemWrapper != null && itemWrapper.items != null && !itemWrapper.items.isEmpty()) {
            itemMap = new HashMap<Integer, Item2>();
            for (Item2 item : itemWrapper.items) {
                int i=0;
                itemMap.put(i,item);
                i++;
            }
        }
        return itemMap;
    }

    @Override
    public ItemWrapper2 marshal(Map<Integer, Item2> stringItemMap) throws Exception {
        ItemWrapper2 wrapper = new ItemWrapper2();
        List<Item2> elements = new ArrayList<Item2>();
        for (Map.Entry<Integer, Item2> property : stringItemMap.entrySet()) {
            elements.add(property.getValue());
        }
        wrapper.items = elements;
        return wrapper;
    }
}
