package com.multicampus.springex.sample;

import com.multicampus.springex.sample.SampleDAO;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DI 실습
@Service
@ToString
@RequiredArgsConstructor
public class SampleService {
          /*@Autowired
          private SampleDAO sampleDAO;    field injection */
          private final SampleDAO sampleDAO;   //생성자 injection

}
