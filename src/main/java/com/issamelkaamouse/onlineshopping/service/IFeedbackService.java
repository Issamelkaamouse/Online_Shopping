package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Feedback;

import java.util.List;

public interface IFeedbackService {
    List<Feedback> viewAllFeedbacks();
    void deleteBadFeedback(Long id);
    Feedback addFeedback(Feedback f);
}
