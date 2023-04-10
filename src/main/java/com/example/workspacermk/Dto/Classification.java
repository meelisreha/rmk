package com.example.workspacermk.Dto;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;


@XmlRootElement(name="classification")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Classification {

    @XmlAttribute
    private String label;

    @XmlAttribute
    private String desc;

    @XmlAttribute
    private int order;

    @XmlElement(name = "document")
    private List<Document> documents;

    public void addDocuments(Document document){
        documents.add(document);
    }
}