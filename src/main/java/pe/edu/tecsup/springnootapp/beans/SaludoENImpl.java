package pe.edu.tecsup.springnootapp.beans;

import org.springframework.stereotype.Component;

@Component("EN")
public class SaludoENImpl implements Saludo{

    @Override
    public String dia(String nombre) {
        return "Good Morning " + nombre;
    }

}
