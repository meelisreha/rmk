package com.example.workspacermk.Utility;

import com.example.workspacermk.Dto.AndDocuments;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlReader {

    public static AndDocuments readXmlFile(String filePath) throws JAXBException {
        File file = new File(filePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(AndDocuments.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (AndDocuments) unmarshaller.unmarshal(file);
    }
}