package com.base.skut.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


//TODO add file support
@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @NotNull
    private User owner;

    @NotNull
    private String text;

    @NotNull
    private LocalDateTime creationDate;

    @NotNull
    private Boolean edited;
}
