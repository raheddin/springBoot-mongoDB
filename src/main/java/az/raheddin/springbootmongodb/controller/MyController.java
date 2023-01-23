package az.raheddin.springbootmongodb.controller;

import az.raheddin.springbootmongodb.entity.Commission;
import az.raheddin.springbootmongodb.repository.MongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MyController {

    @Autowired
    private MongoDBRepository dbRepository;

    @PostMapping
    public ResponseEntity<Commission> add(@RequestBody Commission commission){
        HashMap<String,Integer> co=new HashMap<>();
        co.put("ADON",commission.getAmount()/5);
        co.put("PAKET",(commission.getAmount()/5)*2);
        co.put("STANDART",(commission.getAmount()/5)*2);
        commission.setCommission(co);
        dbRepository.save(commission);
        return ResponseEntity.ok(commission);
    }

    @GetMapping
    public ResponseEntity<List<Commission>> all(){
        return ResponseEntity.ok(dbRepository.findAll());
    }



}
