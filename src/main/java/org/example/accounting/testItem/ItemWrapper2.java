package org.example.accounting.testItem;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ItemWrapper2 {
    @XmlElement(name = "item")
    public List<Item2> items = new ArrayList<Item2>();
}
