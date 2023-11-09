package local.sachin.moviesapi.controller;

import local.sachin.moviesapi.constants.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= Constants.basePath)
public class MovieController {

    @GetMapping
    public String allMovies(){
        return "All Movies";
    }
}
