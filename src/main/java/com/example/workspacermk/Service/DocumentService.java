package com.example.workspacermk.Service;

import com.example.workspacermk.Dto.AndDocuments;
import com.example.workspacermk.Utility.XmlReader;
import jakarta.xml.bind.JAXBException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DocumentService {

    AndDocuments AndDocumentsKeptInMemory;

    public AndDocuments getDocumentsList() throws JAXBException {
        String filePath = "src/main/resources/app-structure.xml";
        return XmlReader.readXmlFile(filePath);
    }

    @Scheduled(fixedDelay = 120000)
    public void scheduledCheckUp(){
        String uri = "http://localhost:8080/api/xmlDocument";
        RestTemplate restTemplate = new RestTemplate();
        AndDocumentsKeptInMemory = restTemplate.getForObject(uri, AndDocuments.class);
    };

    public AndDocuments getAndDocumentsKeptInMemory() {
        return AndDocumentsKeptInMemory;
    }

}
