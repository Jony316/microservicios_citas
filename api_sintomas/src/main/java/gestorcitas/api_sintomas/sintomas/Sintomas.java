package gestorcitas.api_sintomas.sintomas;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Sintomas {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String sintoma;
   private String diagnostico; 
   private   Date  fechas;
   private Long  fk_paciente;
   private Long  fk_medico;
  
}