package pe.edu.tecsup.springnootapp.beans;

import org.springframework.stereotype.Component;

//@Primary
@Component("ES")
public class SaludoImpl implements Saludo{
    @Override
    public String dia(String nombre) {
        return "Buenos dias " + nombre;
    }
}
