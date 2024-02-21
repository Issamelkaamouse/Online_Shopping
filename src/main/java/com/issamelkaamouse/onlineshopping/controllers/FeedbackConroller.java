package com.issamelkaamouse.onlineshopping.controllers;

import com.issamelkaamouse.onlineshopping.entities.Feedback;
import com.issamelkaamouse.onlineshopping.service.IFeedbackServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
@AllArgsConstructor
public class FeedbackConroller {
    private IFeedbackServiceImpl iFeedbackService;

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedbacks(){
        return new ResponseEntity<>(iFeedbackService.viewAllFeedbacks(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteBadFeedback(@PathVariable("id") Long id){
        iFeedbackService.deleteBadFeedback(id);
    }

    @PostMapping
    public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback f){
        return new ResponseEntity<>(iFeedbackService.addFeedback(f),HttpStatus.OK);
    }

}
