package com.example.designbookmyshowjava.controllers;

import com.example.designbookmyshowjava.dtos.CreateShowRequestDTO;
import com.example.designbookmyshowjava.dtos.CreateShowResponseDTO;
import com.example.designbookmyshowjava.dtos.ResponseStatus;
import com.example.designbookmyshowjava.models.Show;
import com.example.designbookmyshowjava.services.CreateShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CreateShowController {
     CreateShowService createShowService;

     @Autowired
     public CreateShowController(CreateShowService createShowService){
         this.createShowService=createShowService;
     }
    public CreateShowResponseDTO createShow(CreateShowRequestDTO request){
        CreateShowResponseDTO response=new CreateShowResponseDTO();
        try{
            Show show=createShowService.createShow(request.getMovieId(),request.getScreenId(),request.getDuration(),request.getStartTime());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setShow(show);
        }
        catch(Exception e){
           response.setResponseStatus(ResponseStatus.FAILED);
        }
        return response;
    }
}
