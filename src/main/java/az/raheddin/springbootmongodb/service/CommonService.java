package az.raheddin.springbootmongodb.service;


import az.raheddin.springbootmongodb.entity.CommonModel;
import az.raheddin.springbootmongodb.repository.CommonModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CommonService<T> {

    @Autowired
    private CommonModelRepository<T> repository;


    @PostMapping("/MB")
    public CommonModel<T> add(CommonModel<T> model){
        return repository.save(model);
    }

    @GetMapping("/MB")
    public List<CommonModel<T>> all(){
        return repository.findAll();
    }

}
