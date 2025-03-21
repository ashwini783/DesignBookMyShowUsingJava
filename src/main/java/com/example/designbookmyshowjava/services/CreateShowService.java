package com.example.designbookmyshowjava.services;

import com.example.designbookmyshowjava.exceptions.MovieNotFoundException;
import com.example.designbookmyshowjava.exceptions.ScreenNotFoundException;
import com.example.designbookmyshowjava.models.Movie;
import com.example.designbookmyshowjava.models.Screen;
import com.example.designbookmyshowjava.models.Show;
import com.example.designbookmyshowjava.repositories.MovieRepository;
import com.example.designbookmyshowjava.repositories.ScreenRepository;
import com.example.designbookmyshowjava.repositories.ShowRepository;
import org.springframework.stereotype.Service;

import javax.sound.midi.InvalidMidiDataException;
import java.util.Date;
import java.util.Optional;

@Service
public class CreateShowService {
   MovieRepository movieRepository;
   ScreenRepository screenRepository;
   ShowRepository showRepository;

   CreateShowService(MovieRepository movieRepository,ScreenRepository screenRepository,ShowRepository showRepository){
       this.movieRepository=movieRepository;
       this.screenRepository=screenRepository;
       this.showRepository=showRepository;
   }
    public Show createShow(int movieId,int screenId, int duration, Date startTime) throws Exception {
       Show show=new Show();
        Optional<Movie>movieOptional=movieRepository.findById(movieId);
        if(movieOptional.isEmpty()){
            throw new MovieNotFoundException("Movie Not Found");
        }
        Movie movie=movieOptional.get();
        Optional<Screen> screenOptional=screenRepository.findById(screenId);
        if(screenOptional.isEmpty()){
            throw new ScreenNotFoundException("Screen Not Found");
        }
        Screen screen=screenOptional.get();
        System.out.println("screen "+screen);
//        Date now =new Date();
//        if(startTime.before(now)){
//            throw new InvalidMidiDataException("Start time cant be before end time");
//        }
        show.setScreen(screen);
        show.setMovie(movie);
        show.setDuration(duration);
        show.setStartTime(startTime);
        show.setCreatedAt(new Date());
        show.setUpdatedAt(new Date());
        return showRepository.save(show);
    }
}
