package local.sachin.moviesapi.service;

import local.sachin.moviesapi.repository.MovieRepository;
import local.sachin.moviesapi.utils.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        System.out.println
                ("================================================================== \n" +
                 "======================== Movies ===================================\n" +
                 "===================================================================");
        List<Movie> mList=movieRepository.findAll();
        for(Movie m:mList){
            System.out.println(m.toString());
        }

        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdbId(String imdbId){
        System.out.println("\n\n ============================ Movie with id:"+imdbId+" called ============");
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
