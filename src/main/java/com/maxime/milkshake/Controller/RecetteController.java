package com.maxime.milkshake.Controller;

import com.maxime.milkshake.Entity.Recette;
import com.maxime.milkshake.Repository.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recette")
public class RecetteController {

    @Autowired
    private RecetteRepository recetteRepository;

    @GetMapping
    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Recette getRecetteById(@PathVariable Long id) {
        return recetteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Recette createRecette(@RequestBody Recette recette) {
        return recetteRepository.save(recette);
    }

    @PutMapping("/{id}")
    public Recette updateRecette(@PathVariable Long id, @RequestBody Recette recette) {
        recette.setId(id);
        return recetteRepository.save(recette);
    }

    @DeleteMapping("/{id}")
    public void deleteRecette(@PathVariable Long id) {
        recetteRepository.deleteById(id);
    }
}
