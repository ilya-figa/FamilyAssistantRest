package com.example.familyassistantrest.utils;

import com.example.familyassistantrest.data.xml.RecipeXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * @author Buyevich_IG
 */

public class ParseXml {
    public static RecipeXml getRecipeXml(String xml) throws JAXBException, UnsupportedEncodingException {
        System.out.println(xml);

        InputStream is = new ByteArrayInputStream(xml.getBytes());

        // Настройка JAXB
        JAXBContext jaxbContext = JAXBContext.newInstance(RecipeXml.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Десериализация XML
        RecipeXml recipeXml = (RecipeXml) unmarshaller.unmarshal(is);

        System.out.println(recipeXml);
        return recipeXml;
    }
}
