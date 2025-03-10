package tn.esprit.rabiichefii4arctic3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Skier implements Serializable {
@Id
     int numSkier;
     int firstName;
     String lastName;
     Date dateOfBirth;
     String city;
     // ken jet 1 to 1 @OneToOne(mappedBy="subscription") wel skier houni houwa el child donc el subscription tekhou el fk
     @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
     Subscription subscription;
     @OneToMany(mappedBy = "skier")
     List<Registration> registrationList;

     @ManyToMany
     Set<Piste> pisteList;

}

/*Exemple
el 1 to many (unidirecition) bech nchoufou annou sna3 table jdida 3lech khater el 1 mawjouda 3and el skier donc el fk
//malezmouc ikoune 3and el skier lezem 3and el registration w comme elli hiya uniderction skier1->*registration heka 3lech bech izidna table okhra
w ki nheb ell ihiya tkoune primary key m3ab3adhom nroudha set m3ach list*/

// // par contre el *->1 3adi ya3mel fk w khw
