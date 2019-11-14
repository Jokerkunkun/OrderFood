package com.eight.leqia.controller;

import com.eight.leqia.entity.*;
import com.eight.leqia.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private FoodTypeService foodTypeService;

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IFdTasteService iFdTasteService;

    @Autowired
    private FoodOrderService foodOrderService;

    @Autowired
    private IPermissionService iPermissionService;

    @Autowired
    private IStaffService iStaffService;


    /**
     * 跳转登陆页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 跳转首页welcome
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome(Model model){
        Food foodcount = foodService.findCount();
        FoodType foodTypecount = foodTypeService.findCount();
        Staff staff = iStaffService.findCount();
        Customer customercount = iCustomerService.findCount();
        FdTaste fdTastecount = iFdTasteService.findCount();
        FoodOrder foodOrdercount = foodOrderService.findCount();
        List<FoodOrder> foodOrders = foodOrderService.findAllOrderNew();
        List<Food> foods = foodService.findFoodNew();

        model.addAttribute("foods",foods);
        model.addAttribute("foodOrders",foodOrders);
        model.addAttribute("foodcount",foodcount.getCount());
        model.addAttribute("foodTypecount",foodTypecount.getCount());
        model.addAttribute("staff",staff.getCount());
        model.addAttribute("customercount",customercount.getCount());
        model.addAttribute("fdTastecount",fdTastecount.getCount());
        model.addAttribute("foodOrdercount",foodOrdercount.getCount());

        return "welcome";
    }

    @RequestMapping("index")
    public String index(){

        return "index";
    }

    /**
     * 后台登陆
     * @param AUserName
     * @param APassword
     * @return
     */
    @RequestMapping("login")
    public String login(String AUserName, String APassword, Model model, HttpSession session){

        Admin login = iAdminService.login(AUserName,APassword);

        //String error = "请确认账号or密码!";
        if (login == null){
            //session.setAttribute("error", error);
            return "redirect:toLogin";
        }else {
            session.setAttribute("AUserName", AUserName);
            model.addAttribute("login",login);
            if (login.getALevel() == 1){
                return "index";
            }else {

                List<Permission> permissions = iPermissionService.findAll_1();
                model.addAttribute("permissions",permissions);
                return "staffIndex";
            }
        }
    }

    /**
     * 注销方法
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:toLogin";
    }

    /**
     * 查询所有管理员
     * @param currentPage
     * @param model
     * @return
     */
    @RequestMapping("findAll")
    public String findAll(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Admin> admins = iAdminService.findAll();
        PageInfo pageInfo = new  PageInfo(admins);

        model.addAttribute("pageInfo",pageInfo);
        return "adminMgr";
    }

    /**
     * 根据注册日期查询管理员
     * @param currentPage
     * @param registration1
     * @param registration2
     * @param model
     * @return
     */
    @RequestMapping("findDateNameAll")
    public String findDateNameAll(Integer currentPage, String registration1, String registration2,String AUserName,Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        if(AUserName != "" && registration1 == "" && registration2 == ""){
            List<Admin> admins = iAdminService.findNameAll(AUserName);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "adminMgr";
        }else if(registration1 != "" && registration2 != "" && AUserName == ""){
            List<Admin> admins = iAdminService.findDateAll(registration1,registration2);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "adminMgr";
        }else if(registration1 != "" && registration2 != "" && AUserName != ""){
            List<Admin> admins = iAdminService.findDateNameAll(registration1,registration2,AUserName);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "adminMgr";
        }else {
            return "redirect:findAll";
        }
    }

    /**
     * 查询需要修改密码的管理员
     * @param AdId
     * @param model
     * @return
     */
    @RequestMapping("updatePasswordFind")
    public String updatePasswordFind(Integer AdId,Model model){
        Admin updatePasswordFind = iAdminService.updatePasswordFind(AdId);
        model.addAttribute("updatePasswordFind",updatePasswordFind);
        return "adminPasswordUpdate";
    }

    /**
     * 修改管理员密码
     * @param admin
     * @return
     */
    @RequestMapping("updatePassword")
    public String updatePassword(Admin admin){
        iAdminService.updatePassword(admin);
        return "redirect:findAll";
    }

    /**
     * 禁用该管理员
     * @param AdId
     * @return
     */
    @RequestMapping("updateStatusForbidden")
    public String updateStatusForbidden(Integer AdId){
        iAdminService.updateStatusForbidden(AdId);
        return "redirect:findAll";
    }

    /**
     * 启用该管理员
     * @param AdId
     * @return
     */
    @RequestMapping("updateStatusStart")
    public String updateStatusStart(Integer AdId){
        iAdminService.updateStatusStart(AdId);
        return "redirect:findAll";
    }

    /**
     * 删除该管理员
     * @param AdId
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer AdId){
        iAdminService.delete(AdId);
        return "redirect:findAll";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping("addHtml")
    public String addHtml(){
        return "adminAdd";
    }

    /**
     * 新增管理员
     * @param admin
     * @return
     */
    @RequestMapping("add")
    public String add(Admin admin){
        iAdminService.add(admin);
        return "redirect:findAll";
    }
}
