package com.example.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="calendar")
@Data
public class Calendar
{
	
	@Id
	@Column(name="cal_id")
    @GeneratedValue
    private int cal_id;

    @Column(length = 500, name="cal_title")
    private String cal_title;

    @Column(columnDefinition = "TEXT", name="cal_content")
    private String cal_content;

    @Column(name="start_date")
    private Date start_date;
    
    @Column(name="end_date")
    private Date end_date;
    

    public Calendar(String cal_title, String cal_content, Date start_date, Date end_date)
    {
        this.cal_title = cal_title;
        this.cal_content = cal_content;
        this.start_date = start_date;
        this.end_date = end_date;
    }
    
    
    
}
