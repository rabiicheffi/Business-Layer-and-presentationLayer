package tn.esprit.rabiichefii4arctic3.services;

import org.springframework.stereotype.Service;
import tn.esprit.rabiichefii4arctic3.entities.Skier;
import tn.esprit.rabiichefii4arctic3.repositories.ISkierRepository;

import java.util.List;

@Service
public class SkierService implements ISkierService {

    ISkierRepository skierRepo;



    @Override
    public Skier addSkier(Skier skier) {
        return skierRepo.save(skier);
    }

    @Override
    public void deleteById(Long  id) {
         skierRepo.deleteById(id);

    }

    @Override
    public void update(Skier skier) {
        skierRepo.save(skier);
    }

    @Override
    public Skier getSkierById(Long id) {
        return skierRepo.findById(id).orElse(null);
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepo.findAll();
    }
}
