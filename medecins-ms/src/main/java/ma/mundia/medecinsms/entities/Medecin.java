package ma.mundia.medecinsms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medecins")
@NoArgsConstructor
@AllArgsConstructor
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "specialite")
    private String specialite;

    @Column(name = "contact")
    private String contact;

}