package com.example.apibirds.resources;

import com.example.apibirds.models.Bird;
import com.example.apibirds.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class BirdResource {
    @Autowired
    BirdRepository birdRepository;
    @GetMapping("api/birds")
    public List<Bird> listaBirds(){
        return birdRepository.findAll();
    }

    @GetMapping("")
    public Bird listaBirdsUnico(){

        return birdRepository.findById(4);
    }

    @GetMapping("api/birds/{id}")
    public Bird listaBirdsUnico(@PathVariable(value = "id")long id){
        return birdRepository.findById(id);
    }

    @PostMapping("api/bird")
    public Bird salvaBird(@RequestBody Bird bird){
        return  birdRepository.save(bird);
    }

    @DeleteMapping("api/bird/del{id}")
    public Bird deleteBird(@PathVariable(value = "id")long id){
        return birdRepository.deleteById(id);
     }

    @PutMapping("api/bird")
    public Bird atualizeBird(@RequestBody Bird bird){
        return  birdRepository.save(bird);
    }

}
