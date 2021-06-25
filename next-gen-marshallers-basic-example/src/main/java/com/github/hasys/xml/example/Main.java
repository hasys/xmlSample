package com.github.hasys.xml.example;

import javax.xml.stream.XMLStreamException;

import com.github.hasys.xml.models.Definitions;
import com.github.hasys.xml.models.Definitions_XMLMapperImpl;

public class Main {

    static Definitions_XMLMapperImpl mapper = Definitions_XMLMapperImpl.INSTANCE;

    public static void main(String[] args) throws XMLStreamException {

        Definitions definitions = new Definitions();
        definitions.setId("_xo6H0LclEDmUduPSF37zfg");
        System.out.println(mapper.write(definitions));
    }

}
