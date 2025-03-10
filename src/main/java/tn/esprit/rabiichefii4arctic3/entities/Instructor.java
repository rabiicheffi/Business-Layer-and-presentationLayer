package tn.esprit.rabiichefii4arctic3.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instructor implements Serializable {
    @Id
    long numInstructor;
    String firstName;
    String lastName;
    LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
}
