package com.opensmart.web;

import com.opensmart.entity.Apartment;
import com.opensmart.entity.JsonResult;
import com.opensmart.service.ApartmentManageService.ApartmentManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/apartmentManageController")
public class ApartmentManageController {
    @Resource
    ApartmentManageService apartmentManageService;

    @RequestMapping("/listAllApartmentData.do")
    @ResponseBody
    public JsonResult<List<Apartment>> listAllApartment(HttpServletRequest request){
        String userId=request.getSession().getAttribute("userId").toString();
        List<Apartment> list=apartmentManageService.listAllApartment(userId);
        return  new JsonResult<List<Apartment>>(list);
    }

    @RequestMapping("listRoomsDataByApartmentId")
    @ResponseBody
    public JsonResult<List<String>> listRoomsDataByApartmentId(String apartmentId){
        List<String> list=apartmentManageService.listRoomsDataByApartmentId(apartmentId);
        return new JsonResult<List<String>>(list);
    }
}
