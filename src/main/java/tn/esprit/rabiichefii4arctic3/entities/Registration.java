package tn.esprit.rabiichefii4arctic3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Registration implements Serializable {

    @Id
   Long numRegistration;
    int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;

}
