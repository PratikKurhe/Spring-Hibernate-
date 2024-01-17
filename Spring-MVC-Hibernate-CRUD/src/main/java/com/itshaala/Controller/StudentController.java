package com.itshaala.Controller;

import com.itshaala.Model.Student;
import com.itshaala.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
   @Autowired
    StudentService studentService;
   @RequestMapping(value = "/student",method = RequestMethod.POST)
   public ModelAndView CreateStudent(@ModelAttribute Student student){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        studentService.addStudent(student);
        modelAndView.addObject("data",student);
        return modelAndView;
   }


}
