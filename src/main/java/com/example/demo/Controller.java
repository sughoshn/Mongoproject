package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class Controller {
    @Autowired
    Postrepository pr;

   @GetMapping("/posts")
    public List<Post> findall(){


       return pr.findAll();
   }
@PostMapping("/post")
   public Post addpost(@RequestBody Post post) {
       return pr.save(post);
}
}
