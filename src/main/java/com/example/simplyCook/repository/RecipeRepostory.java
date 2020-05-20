package com.example.simplyCook.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepostory<Recipe> extends MongoRepository<Recipe, ObjectId> {
}
