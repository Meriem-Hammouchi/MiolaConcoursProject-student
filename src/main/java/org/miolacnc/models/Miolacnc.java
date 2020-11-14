package org.miolacnc.models;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="miola_cnc")
public class Miolacnc {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String salle;
    private String prof;
    private String filiere;
    private String  time_start;
    private String  time_end;
    private String  date_start;
    private String  date_end;

}
