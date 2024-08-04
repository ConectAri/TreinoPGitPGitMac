package com.guardaItemPaulo.guardaItemPaulo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {

    private int status;
    private Object data;

}
