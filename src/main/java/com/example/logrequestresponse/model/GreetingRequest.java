package com.example.logrequestresponse.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Vibol rim
 */
@Getter
@Setter
@ToString
public class GreetingRequest implements Serializable {
    private String message;


}
