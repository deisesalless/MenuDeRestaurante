package br.com.restaurante.cardapio.controller;

import br.com.restaurante.cardapio.dto.FoodRequestDTO;
import br.com.restaurante.cardapio.dto.FoodResponseDTO;
import br.com.restaurante.cardapio.entities.Food;
import br.com.restaurante.cardapio.interfaces.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        foodRepository.save(foodData);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
