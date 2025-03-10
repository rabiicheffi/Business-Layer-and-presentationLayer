package tn.esprit.rabiichefii4arctic3.services;

import tn.esprit.rabiichefii4arctic3.entities.Skier;
import tn.esprit.rabiichefii4arctic3.repositories.ISkierRepository;

import java.util.List;

public interface ISkierService {

    public Skier addSkier(Skier skier);
    public void deleteById(Long id);
    public void update(Skier skier);
    public Skier getSkierById(Long id);
    public List<Skier> getAllSkiers();

}
