package com.greenfox.rei.controllers;


import com.greenfox.rei.retrofit.MovieApiRetrofit;
import com.greenfox.rei.retrofit.models.Movie;
import com.greenfox.rei.retrofit.models.MovieWrapper;
import com.greenfox.rei.retrofit.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.Response;

@Controller
public class MyController {


    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("/asd")
    public ResponseEntity<?> getAsd() {
        MovieService retrofit = new MovieService();
        MovieApiRetrofit service = retrofit.createService(MovieApiRetrofit.class);
        Call<MovieWrapper> callSync = service.getMovie();

        try {
            Response<MovieWrapper> response = callSync.execute();
            MovieWrapper movieWrapper = response.body();
           return new ResponseEntity<>(movieWrapper, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}