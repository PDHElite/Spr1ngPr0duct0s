package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Producto;

public interface ProductRepository extends CrudRepository<Producto, Long>  {

}
