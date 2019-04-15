package org.superbiz.moviefun.movies;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesRestController {


    private final MoviesRepository moviesrepository;

    public MoviesRestController(MoviesRepository moviesrepository) {
        this.moviesrepository = moviesrepository;
    }


    public void addMovie(@RequestBody Movie movie){


    }



}
