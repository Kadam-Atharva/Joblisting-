package com.atharva.joblisting.repository;

import com.atharva.joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
