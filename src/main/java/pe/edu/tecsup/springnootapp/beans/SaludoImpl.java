package pe.edu.tecsup.springnootapp.beans;

import org.springframework.stereotype.Component;

@Component
public class SaludoImpl implements Saludo{
    @Override
    public String dia(String nombre) {
        return "Buenos dias " + nombre;
    }
}
