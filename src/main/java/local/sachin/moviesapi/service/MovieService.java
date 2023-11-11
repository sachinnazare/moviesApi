package local.sachin.moviesapi.service;

import local.sachin.moviesapi.repository.MovieRepository;
import local.sachin.moviesapi.utils.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}
