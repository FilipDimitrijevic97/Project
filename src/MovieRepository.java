import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This class should contain methods to perform CRUD 
 * (create, read, update, delete) operations on the movie or book data in the database. 
 * For example, it may contain methods to find a movie or book by ID, save a new movie or book, 
 * update an existing movie or book, and delete a movie or book.
 */
 
 @Repository
 public interface MovieRepository extends JpaRepository<Movie, Long> {
 
     List<Movie> findByTitle(String title);
     List<Movie> findByDirector(String director);
     List<Movie> findByReleaseYear(int releaseYear);
 
 }
 
