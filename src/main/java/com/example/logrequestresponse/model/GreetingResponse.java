package com.example.logrequestresponse.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Vibol rim
 */

@Data
public class GreetingResponse implements Serializable {

    private String id;
    private String message;


}
