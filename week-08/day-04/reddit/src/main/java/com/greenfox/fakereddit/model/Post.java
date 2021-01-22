package com.greenfox.fakereddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Type(type="text")
    private String content;
    private Long rating = 0L;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
    @Transient
    Date date = new Date();
    Timestamp timestamp = new Timestamp(date.getTime());



    public Post(String title, String content) {

        this.title = title;
        this.content = content;

    }

    public String getPostDateAndTime(){
        return sdf.format(timestamp);
    }



}
