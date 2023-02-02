package gestorcitas.api_tratamiento.tratamiento;

import java.sql.Date;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Tratamiento {
 @Id

 //  @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String nombre;
 private String descripcion;
 private Date  fecha;
 private Long fk_paciente;
 private Long fk_medico;
 private Long fk_sintoma;

 
}