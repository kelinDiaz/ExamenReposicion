package hn.unah.examen.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posiciones")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Posiciones {


     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoequipo" )
    private Equipos equipos; 


    @Column(name = "empates")
    private int empates; 

    @Column(name = "ganados")
    private int ganados; 

    @Column(name ="perdidos")
    private int perdidos; 

    @Column(name = "golesfavor")
    private int golesfavor;

    @Column(name = "golescontra")
    private int golescontra; 

    @Column(name = "puntos")
    private int puntos;


}
