package com.base.skut.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "magic_link")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MagicLink {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String link;

    @OneToOne
    private User user;

    @NotNull
    private LocalDateTime expireDate;
}
