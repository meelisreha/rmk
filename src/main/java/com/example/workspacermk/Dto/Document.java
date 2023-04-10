package com.example.workspacermk.Dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Document {

    @XmlAttribute
    private String label;

    @XmlAttribute
    private int order;

    @XmlAttribute
    private String type;

    @XmlValue
    private String url;

}