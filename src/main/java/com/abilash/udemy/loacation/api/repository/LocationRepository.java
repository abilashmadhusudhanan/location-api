package com.abilash.udemy.loacation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abilash.udemy.loacation.api.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
