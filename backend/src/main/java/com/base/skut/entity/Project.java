package com.base.skut.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;


//TODO ADD DOCUMENTS SET
@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @NotNull
    private User owner;

    @ManyToMany
    private Set<User> members;

    @NotNull
    private String name;


    private String description;

    @ManyToMany
    private Set<Attachment> attachments;

    @OneToMany
    private Set<Project> subprojects;

    @OneToMany
    private Set<Task> tasks;

}
