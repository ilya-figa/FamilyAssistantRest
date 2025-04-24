package com.example.familyassistantrest.utils;

import com.example.familyassistantrest.data.xml.ProductXml;
import com.example.familyassistantrest.entity.ShoppingCart;

/**
 * @author Buyevich_IG
 */

public class Util {

    public static ShoppingCart getShoppingCart(ProductXml product){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setName(product.getName());
        shoppingCart.setQuantity(Integer.toString(product.getQuantity()));
        shoppingCart.setUnitsMeasurementId((long) product.getUnitsMeasurementId());
        return shoppingCart;
    }

}
