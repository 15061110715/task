package com.ptteng.controller;

import com.ptteng.pojo.Category;
import com.ptteng.service.CategoryService;
import com.ptteng.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 包子 on 2017/9/28.
 */
@Controller
@RequestMapping("")
public class CategoryController {
//    ????????????????????????????????????????????????
@Autowired
CategoryService categoryService;
    @RequestMapping("/login")
    public String login(Category category , HttpServletRequest request ){
        boolean loginType =categoryService.login(category.getName());
        if(loginType ){
            request.setAttribute("category",category);
            return "listCategory";

        }else{
            request.setAttribute("massage","用户名密码错误");
            return "error";
        }
    }
//    ??????????????????????????????????????????????????

        @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page){
            ModelAndView mav=new ModelAndView();
            List<Category> cs =categoryService.list(page);
            int total=categoryService.total();
            page.caculateLast(total);
            mav.addObject("cs",cs);
            mav.setViewName("listCategory");
            return mav;
        }
        @RequestMapping("addCategory")
    public ModelAndView addCategory(Category category){
        categoryService.add(category);
        ModelAndView mav=new ModelAndView("redirect:/listCategory");
        return mav;
        }
    @RequestMapping("deleteCategory")
    public ModelAndView deleteCategory(Category category){
        categoryService.delete(category);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }
    @RequestMapping("editCategory")
    public ModelAndView editCategory(Category category){
        Category c= categoryService.get(category.getId());
        ModelAndView mav = new ModelAndView("editCategory");
        mav.addObject("c", c);
        return mav;
    }
    @RequestMapping("updateCategory")
    public ModelAndView updateCategory(Category category){
        categoryService.update(category);
        ModelAndView mav = new ModelAndView("redirect:/listCategory");
        return mav;
    }
}
