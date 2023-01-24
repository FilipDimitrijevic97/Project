const getMovies = () => {
  fetch('http://localhost:8080/movies')
    .then(response => response.json())
    .then(movies => {
      // Do something with the list of movies

    })
    .catch(error => {
      console.error('Error fetching movies:', error);
    });
}
