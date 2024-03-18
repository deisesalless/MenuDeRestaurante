package br.com.restaurante.cardapio.dto;

import br.com.restaurante.cardapio.entities.Food;

<<<<<<< HEAD
public class FoodResponseDTO(Integer id, String title, String image, Integer price) {
=======
public record FoodResponseDTO(Integer id, String title, String image, Integer price) {
>>>>>>> fix

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
