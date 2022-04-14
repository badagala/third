package com.example.demo.daolayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Samsung;

@Repository
public interface Mobiles extends CrudRepository<Samsung, Integer> {

}
