package com.test.backend.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.test.backend.model.entities.Author;
import lombok.*;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookDto {

    private Long id;

    private String title;

    private boolean state;

    private Date publicationDate;

    private AuthorDto author;
}
