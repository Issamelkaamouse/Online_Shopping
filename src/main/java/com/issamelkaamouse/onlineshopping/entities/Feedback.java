package com.issamelkaamouse.onlineshopping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    private String feedbackMsg;

    @Column(columnDefinition = "TIMESTAMP")
    private Date createdAt = new Date();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerFeedback;
}
