package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Feedback;
import com.issamelkaamouse.onlineshopping.repositories.FeedbackRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class IFeedbackServiceImpl implements IFeedbackService {
    private FeedbackRepository feedbackRepository;
    @Override
    public List<Feedback> viewAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public void deleteBadFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }

    @Override
    public Feedback addFeedback(Feedback f) {
        return feedbackRepository.save(f);
    }
}
