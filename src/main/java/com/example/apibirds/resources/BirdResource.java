package com.example.apibirds.resources;

import com.example.apibirds.models.Bird;
import com.example.apibirds.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders = "erros, content-type")
@RequestMapping(value="/api/")
public class BirdResource {
    @Autowired
    BirdRepository birdRepository;
    @GetMapping("birds")
    public List<Bird> listaBirds(){
        return birdRepository.findAll();
    }

    @GetMapping("")
    public Bird listaBirdsUnico(){

        return birdRepository.findById(1);
    }

    @GetMapping("birds/{id}")
    public Bird listaBirdsUnico(@PathVariable(value = "id")long id){
        return birdRepository.findById(id);
    }

    @PostMapping("bird")
    public Bird salvaBird(@RequestBody Bird bird){
        return  birdRepository.save(bird);
    }

    @DeleteMapping("bird/del{id}")
    public Bird deleteBird(@PathVariable(value = "id")long id){
        return birdRepository.deleteById(id);
     }

    @PutMapping("bird")
    public Bird atualizeBird(@RequestBody Bird bird){
        return  birdRepository.save(bird);
    }

}
