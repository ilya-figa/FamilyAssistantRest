package com.example.familyassistantrest.data.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Buyevich_IG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nameRecipe",
        "productList",
        "stepList"
})
@XmlRootElement(name="recipe")
public class RecipeXml {
    @XmlElement(name = "nameRecipe", required = true)
    public String nameRecipe;
    @XmlElement(name = "products", required = true)
    public List<ProductXml> productList;
    @XmlElement(name = "steps", required = true)
    public List<StepXml> stepList;

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public List<ProductXml> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductXml> productList) {
        this.productList = productList;
    }

    public List<StepXml> getStepList() {
        return stepList;
    }

    public void setStepList(List<StepXml> stepList) {
        this.stepList = stepList;
    }

    @Override
    public String toString() {
        return "RecipeXml{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", productList=" + productList +
                ", stepList=" + stepList +
                '}';
    }
}
