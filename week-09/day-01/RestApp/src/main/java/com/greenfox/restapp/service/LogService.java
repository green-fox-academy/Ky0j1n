package com.greenfox.restapp.service;

import com.greenfox.restapp.model.Log;
import com.greenfox.restapp.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LogService {

   private LogRepository logRepository;

    @Autowired
    public LogService ( LogRepository logRepository) {
        this.logRepository = logRepository;
    }


    public void saveLog(String string, String input) {

        logRepository.save(new Log(string,input));
    }

    public countAllEntries() {
       List<Log> logList = (List<Log>) logRepository.findAll();
       logList.stream().filter(l -> )
    }
}
