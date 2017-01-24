package application.controllers;

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * Created by Стрела on 24.01.2017.
 */

public class Echo {
    public String echo (String name){
        return "echo from " + name;
    }
}
