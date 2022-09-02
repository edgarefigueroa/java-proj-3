package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Spring component so that it will be available in the Spring application context.
@Component
public class BestMovieService {
        //Spring annotations so that it is Autowired
        //@Autowired
        private Movie movie;
        public Movie getBestMovie() {
                return movie;
        }

//        @Autowired
//        public void setMovie(Movie movie) {
//                this.movie = movie;
//        }

        // Annotate the method so that spring will use the constructor to inject a movie object.
//        @Autowired
//        public BestMovieService(Movie movie) {
//                this.movie = movie;
//        }

        // bean id for the titanic movie to inject the titanic movie object instead of the batman one.
        @Autowired
        public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
                this.movie = movie;
        }


}
