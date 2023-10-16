package com.maxime.milkshake.Data;

import com.maxime.milkshake.Entity.Recette;
import com.maxime.milkshake.Entity.Vendeur;
import com.maxime.milkshake.Repository.RecetteRepository;
import com.maxime.milkshake.Repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RecetteRepository recetteRepository;

    @Autowired
    private VendeurRepository vendeurRepository;

    @Override
    public void run(String... args) throws Exception {
        recetteRepository.save(new Recette(25, "Chocolat", "Cacao"));
        recetteRepository.save(new Recette(45, "Fraise", "Fraise"));
        recetteRepository.save(new Recette(68, "Vanille", "Vanille"));
        recetteRepository.save(new Recette(9, "Banane", "Banane"));
        vendeurRepository.save(new Vendeur("Maxime", 25));
        vendeurRepository.save(new Vendeur("Alexandre", 25));
    }
}
