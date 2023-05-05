package az.raheddin.springbootmongodb.service;


import az.raheddin.springbootmongodb.entity.CommonModel;
import az.raheddin.springbootmongodb.repository.CommonModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CommonService {

    @Autowired
    private CommonModelRepository repository;


    @PostMapping("/MB")
    public CommonModel<?> add(CommonModel<?> model){
        return repository.save(model);
    }

    @GetMapping("/MB")
    public List<CommonModel<?>> all(){
        return repository.findAll();
    }

}
