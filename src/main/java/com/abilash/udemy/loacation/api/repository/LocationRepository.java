package com.abilash.udemy.loacation.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.abilash.udemy.loacation.api.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
