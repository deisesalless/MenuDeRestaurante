package br.com.restaurante.cardapio.dto;

import br.com.restaurante.cardapio.entities.Food;

public record FoodResponseDTO(Integer id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food) {

        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
