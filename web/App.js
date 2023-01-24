const getMovies = () => {
  fetch('http://localhost:8080/movies')
    .then(response => response.json())
    .then(movies => movies.map(movie => movie.title))
    .then(titles => console.log('Movies:', titles))
    
    // TODO: Handle errors
    .catch(error => {
      console.error('Error fetching movies:', error);
    });
}
