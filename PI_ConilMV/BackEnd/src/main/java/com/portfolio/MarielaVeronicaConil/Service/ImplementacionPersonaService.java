package com.portfolio.MarielaVeronicaConil.Service;

import com.portfolio.MarielaVeronicaConil.Entity.Persona;
import com.portfolio.MarielaVeronicaConil.Interface.InterfacePersonaService;
import com.portfolio.MarielaVeronicaConil.Repository.InterfacePersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaService implements InterfacePersonaService{
    @Autowired InterfacePersonaRepository interfacepersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
      List<Persona> persona = interfacepersonaRepository.findAll();
      return persona;    
}

    @Override
    public void savePersona(Persona persona) {
       interfacepersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        interfacepersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = interfacepersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
