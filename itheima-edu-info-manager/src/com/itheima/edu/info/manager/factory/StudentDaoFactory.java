package com.itheima.edu.info.manager.factory;

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
//        return new StudentDao();
    }
}
