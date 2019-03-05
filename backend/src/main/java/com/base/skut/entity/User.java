package com.base.skut.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

//TODO ADD AUTO GENERATED PICTURE
@Entity
@Getter
@Setter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Set<Project> owningProjects;

    @NotNull
    private String email;

    @NotNull
    private String password;

    private String avatarUrl;

    @OneToOne
    private Permission permission;
}
