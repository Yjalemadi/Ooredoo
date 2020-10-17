package com.yousuf.project.repo;

import com.yousuf.project.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface appRepo extends JpaRepository<Form, Integer> {

}
