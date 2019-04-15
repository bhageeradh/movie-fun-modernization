package org.superbiz.moviefun.album;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumsRestController {


    private final AlbumsRepository albumssrepository;

    public AlbumsRestController(AlbumsRepository moviesrepository) {
        this.albumsrepository = albumsrepository;
    }


    public void addMovie(@RequestBody Album album){


    }



}
