package com.tcs.java8.service;

import com.tcs.java8.dao.Java8Dao;
import com.tcs.java8.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Java8ServiceImpl implements  Java8Service{

    @Autowired
    Java8Dao javaDao;



        @Override
        public List<String> getEmployeeNames() {
            return javaDao.getEmployee().stream()
                                        .map(e->"Mr. "+e.getEmpName())
                                        .collect(Collectors.toList());
        }


}
