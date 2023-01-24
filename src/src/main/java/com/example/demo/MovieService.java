package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 *  This class should contain methods that handle the 
 * business logic of the application. For example, 
 * it may contain methods to search for movies or books based on certain criteria, 
 * or to retrieve information about a specific movie or book.
 */

 @Service
 public class MovieService {
     private final MovieRepository movieRepository;
 
     public MovieService(MovieRepository movieRepository) {
         this.movieRepository = movieRepository;
     }
 
     public List<Movie> findMoviesByTitle(String title) {
         return movieRepository.findByTitle(title);
     }
 }
 

