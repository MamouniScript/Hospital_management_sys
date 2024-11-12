package ma.mundia.rendezvous.entities;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "rendez_vous")
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_patient;

    private Long id_medecin;

    @Column(name = "date")
    private Date date;

    @Column(name = "heure")
    private Time heure;

}
