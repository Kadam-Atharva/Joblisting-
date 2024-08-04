package com.atharva.joblisting.repository;

import com.atharva.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {


}
