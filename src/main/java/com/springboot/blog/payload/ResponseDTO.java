package com.springboot.blog.payload;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private Boolean status;
    private String message;
    private Object data;
}
