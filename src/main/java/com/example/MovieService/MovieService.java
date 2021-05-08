package com.example.MovieService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    public List<MovieModel> getAllMovies(){
        MovieModel m1 = new MovieModel(1L,"Titanic", "Sad movie", "29.02.1993",4);
        MovieModel m2 = new MovieModel(2L,"Titanic 2", "Sad movie", "29.02.1994",1);
        MovieModel m3 = new MovieModel(3L,"Titanic 3: Final Redemption", "VERY Sad movie", "29.02.1995",99);

        return List.of(m1, m2, m3);
    }
    public void save(MovieModel movieModel){

    }

    public void update(MovieModel movieModel){

    }

    public void delete(MovieModel movieModel){

    }

}
