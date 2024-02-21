package com.issamelkaamouse.onlineshopping.entities;

import com.issamelkaamouse.onlineshopping.utils.Visitor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class SupportMessage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;
    private String message;
    private Date sentAt;
//    @ManyToOne
//    @JoinColumn(name = "visitor_id")
//    private Visitor visitor;
}
