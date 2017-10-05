package com.ptteng.controller;


import com.ptteng.pojo.Student;
import com.ptteng.service.StudentService;
import com.ptteng.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 包子 on 2017/10/1.
 */
@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    StudentService studentService;
//登录界面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login() {
        return "login";
    }
//登录界面传值
    @RequestMapping(value = "/loginI", method = RequestMethod.POST)
    public String LoginInto(HttpSession session, String username, String password) {
        if (studentService.Login(username, password) != null) {
            session.setAttribute("username", username);
            return "redirect:/listCategory";
        } else {
            return "error";
        }
    }
    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        List<Student> cs = studentService.list(page);
        int total = studentService.total();
        page.caculateLast(total);
        mav.addObject("cs", cs);
        mav.setViewName("listCategory");
        return mav;
    }
    //添加界面
    @RequestMapping(value = "/addone", method = RequestMethod.GET)
    public String addone() {
       // System.out.print("添加");
        return "addone";
    }
//    添加界面传值
    @RequestMapping(value = "/addInto",method = RequestMethod.POST)
    public ModelAndView addCategory(Student student){
        studentService.add(student);
        ModelAndView mav=new ModelAndView("redirect:/listCategory");
        return mav;
    }
//    删除根据id
    @RequestMapping("deleteCategory")
    public ModelAndView deleteCategory(Student student){
        studentService.delete(student);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }

    @RequestMapping("editCategory")
    public ModelAndView editCategory(Student student){
        Student s= studentService.get(student.getId());
        ModelAndView mav = new ModelAndView("editCategory");
        mav.addObject("s", s);
        return mav;
    }
    //修改数据
    @RequestMapping("updateCategory")
    public ModelAndView updateCategory(Student student){
        studentService.update(student);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }
}
