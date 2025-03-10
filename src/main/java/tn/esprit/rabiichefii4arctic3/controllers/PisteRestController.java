package tn.esprit.rabiichefii4arctic3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rabiichefii4arctic3.entities.Piste;
import tn.esprit.rabiichefii4arctic3.services.IPisteService;

import java.util.List;

@RestController
@RequestMapping("piste")
public class PisteRestController {


    @Autowired
    private IPisteService pisteService;
    @PostMapping("add")
    public void  addPiste(@RequestBody Piste piste)
    {
        pisteService.addPiste(piste);
    }

    @PutMapping
    public void updatePiste(@RequestBody Piste piste) {
        pisteService.updatePiste(piste);
    }

    @GetMapping("get/{numPiste}")
    public Piste getPisteById(Long numPiste) {
        return pisteService.getPisteById(numPiste);

    }

    @GetMapping("all")
    public List<Piste> getAllPiste() {
        return pisteService.getAllPistes();
    }

    @DeleteMapping("delete/{numPiste}")
    public void deletePiste(Long numPiste)
    {
        pisteService.deletePiste(numPiste);
    }


}
