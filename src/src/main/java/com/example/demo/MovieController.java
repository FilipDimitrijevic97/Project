package com.example.demo;

import java.util.List;

/**
 * This class should contain methods that handle web requests and responses. 
 * For example, it may contain methods to handle requests to view a specific movie or book, 
 * or to search for movies or books based on certain criteria. 
 * The methods in this class should also handle mapping the request and response to the appropriate views and models.
 */

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    
    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String title) {
        return movieService.findMoviesByTitle(title);
    }
}
