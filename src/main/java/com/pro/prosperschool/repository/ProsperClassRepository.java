package com.pro.prosperschool.repository;

import com.pro.prosperschool.model.ProsperClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProsperClassRepository extends JpaRepository<ProsperClass, Integer> {

}
