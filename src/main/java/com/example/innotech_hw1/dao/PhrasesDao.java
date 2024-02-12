package com.example.innotech_hw1.dao;

import com.example.innotech_hw1.model.Phrase;
import com.example.springframework.annotation.stereotype.Component;
import com.example.springframework.annotation.stereotype.Log;

import java.util.concurrent.CopyOnWriteArrayList;
@Component
public interface PhrasesDao {
    @Log
    String getRandomPhrase();
    @Log
    CopyOnWriteArrayList getWords();

}
