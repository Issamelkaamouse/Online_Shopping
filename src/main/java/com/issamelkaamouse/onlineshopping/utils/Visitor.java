package com.issamelkaamouse.onlineshopping.utils;

import com.issamelkaamouse.onlineshopping.entities.SupportMessage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

//@Entity
@Data @NoArgsConstructor @AllArgsConstructor
//@Inheritance(strategy = InheritanceType.JOINED)
public class Visitor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sessionId;
    private String ipAddress;
    private Date timestamp = new Date();
    @OneToMany(mappedBy = "visitor")
    private List<SupportMessage> supportMessages;
}
