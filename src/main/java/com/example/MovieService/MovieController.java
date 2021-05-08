package com.example.MovieService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<MovieModel>> returnAll() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieModel> returnOne(@PathVariable Long id){
        List<MovieModel> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies.get(id.intValue()-1));
    }

    @PostMapping
    public ResponseEntity<MovieModel> addOne(@RequestBody MovieModel movieModel){
        return ResponseEntity.ok(movieService.save(movieModel));
    }

    @PutMapping
    public ResponseEntity<MovieModel> updateOne(@RequestBody MovieModel movieModel){
        return ResponseEntity.ok(movieService.update(movieModel));
    }

    @DeleteMapping Mapping
    public ResponseEntity<MovieModel> updateOne(@RequestBody MovieModel movieModel){
        return ResponseEntity.ok(movieService.delete(movieModel));
    }


}
