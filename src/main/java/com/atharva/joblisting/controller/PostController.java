package com.atharva.joblisting.controller;

import com.atharva.joblisting.repository.SearchRepository;
import com.atharva.joblisting.repository.PostRepository;
import com.atharva.joblisting.model.Post;
import com.atharva.joblisting.repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController{

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
      return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
      return repo.save(post);
    }

}
