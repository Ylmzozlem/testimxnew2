package Question82SpringBoot.Project2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository {
     default Post save(Post post) {
    return save(post);
     }


}
