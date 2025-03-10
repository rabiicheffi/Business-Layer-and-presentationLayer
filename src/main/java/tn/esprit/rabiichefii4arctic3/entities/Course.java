package tn.esprit.rabiichefii4arctic3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    @Id
    Long numCourse;
    int level;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    Support support;
    Float price;
    int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registration;

}
