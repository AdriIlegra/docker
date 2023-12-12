package br.nogueira.dockerrevisao.service;


import br.nogueira.dockerrevisao.model.Post;
import br.nogueira.dockerrevisao.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}
