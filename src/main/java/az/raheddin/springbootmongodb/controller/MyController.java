package az.raheddin.springbootmongodb.controller;

import az.raheddin.springbootmongodb.entity.CommonModel;
import az.raheddin.springbootmongodb.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MyController {

    @Autowired
    private CommonService service;

    @PostMapping("/MB")
    public ResponseEntity<CommonModel<?>> add(@RequestBody CommonModel<Object> model){
        return ResponseEntity.ok(service.add(model));
    }

    @GetMapping("/MB")
    public ResponseEntity<List<CommonModel<?>>> allMB(){
        return ResponseEntity.ok(service.all());
    }



}
