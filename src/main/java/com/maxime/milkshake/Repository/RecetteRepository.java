package com.maxime.milkshake.Repository;

import com.maxime.milkshake.Entity.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
}
