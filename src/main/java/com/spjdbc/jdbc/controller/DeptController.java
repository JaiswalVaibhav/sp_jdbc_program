package com.spjdbc.jdbc.controller;

import com.spjdbc.jdbc.dao.DepartmentDao;
import com.spjdbc.jdbc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DepartmentDao departmentDao;

    @PostMapping("/saveDeptAndEmp")
    public String saveDeptAndEmp(@RequestBody Department department){
        return departmentDao.addDeptAndEmp(department);
    }
}
