package co.edu.uts.appdemo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String email;

}
