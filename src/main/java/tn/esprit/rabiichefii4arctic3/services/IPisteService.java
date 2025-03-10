package tn.esprit.rabiichefii4arctic3.services;

import tn.esprit.rabiichefii4arctic3.entities.Piste;

import java.util.List;

public interface IPisteService {

   public void addPiste(Piste piste);
   public void updatePiste(Piste piste);
    public void deletePiste(Long id);
    public Piste getPisteById(Long id);
    public List<Piste> getAllPistes();

}
