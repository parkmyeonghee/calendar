package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CalendarRepository;
import com.example.service.CalendarService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CalendarServiceImpl implements CalendarService
{
	@Autowired
    private CalendarRepository calendarRepository;

}
