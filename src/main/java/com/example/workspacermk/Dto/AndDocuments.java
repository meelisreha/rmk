package com.example.workspacermk.Dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "and-documents")
@JsonRootName(value = "and-documents")
@Data
public class AndDocuments {

    private List<Classification> classification;

}