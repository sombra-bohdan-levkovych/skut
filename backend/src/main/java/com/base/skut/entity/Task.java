package com.base.skut.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @OneToOne
    @NotNull
    private User author;


    private String description;

    @ManyToMany
    private Set<User> followers;

    @ManyToMany
    private Set<User> developers;


    private LocalDateTime deadline;

    @OneToMany
    private Set<Comment> comments;

    private TaskStatus taskStatus;

    @ManyToMany
    private Set<Attachment> attachments;


}
