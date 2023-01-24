import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class should contain methods to perform CRUD 
 * (create, read, update, delete) operations on the movie or book data in the database. 
 * For example, it may contain methods to find a movie or book by ID, save a new movie or book, 
 * update an existing movie or book, and delete a movie or book.
 */

 public interface MovieRepository extends JpaRepository<Movie, Long> {
     List<Movie> findByTitle(String title);
 }
 
