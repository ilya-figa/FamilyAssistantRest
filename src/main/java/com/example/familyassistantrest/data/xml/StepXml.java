package com.example.familyassistantrest.data.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Buyevich_IG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "steps", propOrder = {
        "num",
        "step"
})
public class StepXml {
    @XmlElement(required = true)
    private int num;
    @XmlElement(required = true)
    private String step;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "StepXml{" +
                "num=" + num +
                ", step='" + step + '\'' +
                '}';
    }
}
