package br.com.restaurante.cardapio.interfaces;

import br.com.restaurante.cardapio.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {
}
