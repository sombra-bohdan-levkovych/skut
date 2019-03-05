package com.base.skut.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "attachment")
@Getter
@Setter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attachment {

    @Id
    @GeneratedValue
    private Long id;

    private String url;

    private LocalDateTime uploadedDate;

}
