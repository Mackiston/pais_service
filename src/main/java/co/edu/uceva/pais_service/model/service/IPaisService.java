package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.entities.Pais;

import java.util.List;

public interface IPaisService {
    public Pais save (Pais pais);
    public void delete(Pais pais);
    public Pais update(Pais pais);
    public List<Pais> findAll(); /*No pasamos nada porque va mostrar lo que tengo*/
    public Pais findByID(Long ID);
}
