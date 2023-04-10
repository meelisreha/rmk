package com.example.workspacermk.Controller;

import com.example.workspacermk.Dto.AndDocuments;
import com.example.workspacermk.Dto.Document;
import com.example.workspacermk.Service.DocumentService;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping(value ="/api")
public class DocumentsController {

    @Autowired
    DocumentService documentService;

    @RequestMapping(method = RequestMethod.GET,value="xmlDocument", produces = "application/xml")
    public ResponseEntity<AndDocuments> returnXml() throws JAXBException {
        return ResponseEntity.ok(documentService.getDocumentsList());
    }

    @RequestMapping(method = RequestMethod.GET, value="getDocuments", produces="application/json")
        public ResponseEntity<AndDocuments> getDocuments(){
        return ResponseEntity.ok(documentService.getAndDocumentsKeptInMemory());
    }

    @RequestMapping(method = RequestMethod.POST, value="add_document", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addDocument(@RequestBody Document document, @RequestParam String label) {
        documentService.getAndDocumentsKeptInMemory().getClassification().stream().filter(c-> c.getLabel().equals(label)).forEach(d-> {
            if (d.getDocuments() == null) {
                d.setDocuments(new ArrayList<>());
                d.addDocuments(document);
            } else {
                d.addDocuments(document);
            }
        });
    }

}

