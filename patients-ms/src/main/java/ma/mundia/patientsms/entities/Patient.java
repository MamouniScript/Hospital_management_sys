package ma.mundia.patientsms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "patients")
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "age")
    private Integer age;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "contact")
    private String contact;

}
