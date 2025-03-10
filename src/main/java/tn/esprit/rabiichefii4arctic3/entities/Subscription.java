package tn.esprit.rabiichefii4arctic3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subscription implements Serializable {

    @Id
    Long numSub;
    LocalDate startDate;
    LocalDate endDate;
    Float price;
    TypeSubscription typeSub;
    @OneToOne
    Skier skier;


}
