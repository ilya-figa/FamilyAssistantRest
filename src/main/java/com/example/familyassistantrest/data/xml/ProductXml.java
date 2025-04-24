package com.example.familyassistantrest.data.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Buyevich_IG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "products", propOrder = {
        "name",
        "quantity",
        "unitsMeasurementId"
})
public class ProductXml {
    @XmlElement(name = "nameProduct", required = true)
    private String name;
    @XmlElement(name = "quantityProduct", required = true)
    private int quantity;
    @XmlElement(name = "unitsMeasurementId", required = true)
    private int unitsMeasurementId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitsMeasurementId() {
        return unitsMeasurementId;
    }

    public void setUnitsMeasurementId(int unitsMeasurementId) {
        this.unitsMeasurementId = unitsMeasurementId;
    }

    @Override
    public String toString() {
        return "ProductXml{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitsMeasurementId=" + unitsMeasurementId +
                '}';
    }
}
