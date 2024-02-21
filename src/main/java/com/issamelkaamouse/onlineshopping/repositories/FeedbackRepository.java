package com.issamelkaamouse.onlineshopping.repositories;

import com.issamelkaamouse.onlineshopping.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
