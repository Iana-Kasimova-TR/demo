package com.example.simplyCook.Client;

import com.simply.simplyCookcommon.model.Recipe;
import java.util.List;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("simplyCook-data")
public interface  SimplyCookClient {

  @GetMapping("recipe")
  Optional<Recipe> getRecipeByName(@RequestParam String name);

  @GetMapping("recipe/all")
  List<Recipe> findAll();

}
