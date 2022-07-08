package com.medflow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Admin")
@ReqiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {

    @Column(name = "firstName",
            nullable = false)
    private String firstName;

    @Id
    @SequenceGenerator(
            name = "admin_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id",
            updatable = false)
    private Long id;

    public Admin(String firstName) {
        this.firstName = firstName;
    }
}
