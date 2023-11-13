package local.sachin.moviesapi.controller;

import local.sachin.moviesapi.constants.Constants;
import local.sachin.moviesapi.service.ReviewSerice;
import local.sachin.moviesapi.utils.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.scanner.Constant;

import java.util.Map;

@RestController
@RequestMapping(value = Constants.reviewBasePath)
public class ReviewController {
    @Autowired
    private ReviewSerice reviewSerice;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(reviewSerice.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
