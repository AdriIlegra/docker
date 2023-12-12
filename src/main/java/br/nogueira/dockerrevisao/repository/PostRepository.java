package br.nogueira.dockerrevisao.repository;




import br.nogueira.dockerrevisao.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAll();

    Post save(Post post);
}
