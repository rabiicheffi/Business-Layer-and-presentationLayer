package tn.esprit.rabiichefii4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rabiichefii4arctic3.entities.Piste;
import tn.esprit.rabiichefii4arctic3.repositories.IPisteRepository;

import java.util.List;

@Service
public class PisteService implements IPisteService{

    @Autowired
    private IPisteRepository pisteRepo;
    @Override
    public void addPiste(Piste piste) {
        pisteRepo.save(piste);
    }

    @Override
    public void updatePiste(Piste piste) {
        pisteRepo.save(piste);
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepo.deleteById(id);
    }

    @Override
    public Piste getPisteById(Long id) {
      return  pisteRepo.findById(id).orElse(null);

    }

    @Override
    public List<Piste> getAllPistes() {
    return pisteRepo.findAll();
    }
}
