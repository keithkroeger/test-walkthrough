package com.test.testwalkthrough.service;

import com.test.testwalkthrough.domain.Returning;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    public List<Returning> getList(){
        List<Returning> retval = new ArrayList<>();
        retval.add(new Returning("abc","{list:['a','b']}"));
        return retval;
    }
}
