package az.raheddin.springbootmongodb.controller;

import az.raheddin.springbootmongodb.entity.CommonModel;
import az.raheddin.springbootmongodb.entity.MyModel;
import az.raheddin.springbootmongodb.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MyController {

    @Autowired
    private CommonService<MyModel> service;

    @PostMapping("/MB")
    public ResponseEntity<CommonModel<MyModel>> add(@RequestBody CommonModel<MyModel> model){
        return ResponseEntity.ok(service.add(model));
    }

    @GetMapping("/MB")
    public ResponseEntity<List<CommonModel<MyModel>>> allMB(){
        return ResponseEntity.ok(service.all());
    }



}
