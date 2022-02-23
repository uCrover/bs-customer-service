package com.p1.customerservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection="customer")
public class Customer {

    @Id
    private String _id;
    private String name;
    private String lastName;
    private String nroDocument;
    private String type;
    private String subType;


}