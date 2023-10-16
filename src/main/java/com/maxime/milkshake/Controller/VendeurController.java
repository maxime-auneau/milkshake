package com.maxime.milkshake.Controller;

import com.maxime.milkshake.Entity.Vendeur;
import com.maxime.milkshake.Repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendeur")
public class VendeurController {

    @Autowired
    private VendeurRepository vendeurRepository;

    @GetMapping
    public List<Vendeur> getAllVendeurs() {
        return vendeurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vendeur getVendeurById(@PathVariable Long id) {
        return vendeurRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Vendeur createVendeur(@RequestBody Vendeur vendeur) {
        return vendeurRepository.save(vendeur);
    }

    @PutMapping("/{id}")
    public Vendeur updateVendeur(@PathVariable Long id, @RequestBody Vendeur vendeur) {
        vendeur.setId(id);
        return vendeurRepository.save(vendeur);
    }

    @DeleteMapping("/{id}")
    public void deleteVendeur(@PathVariable Long id) {
        vendeurRepository.deleteById(id);
    }
}
