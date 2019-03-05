package com.base.skut.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permission {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String permission;
}
