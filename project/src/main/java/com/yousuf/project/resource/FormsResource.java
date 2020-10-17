package com.yousuf.project.resource;

import com.yousuf.project.model.Form;
import com.yousuf.project.repo.appRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/form")
public class FormsResource {

    @Autowired
    appRepo appRepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/all")
    private List<Form> getAll(){
        return appRepo.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/load")
    public List<Form> presist(@RequestBody final Form form){
        appRepo.save(form);
        return appRepo.findAll();
    }

}
