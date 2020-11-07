package com.hongdu.demo.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.hongdu.demo.comm.Constants;
import com.hongdu.demo.entity.res.ResResultEntity;

@Controller
public class UploadController extends BaseController {
	@RequestMapping(value = "/api/upload", method = RequestMethod.POST)
	@ResponseBody
	public ResResultEntity upload(@RequestParam("file") MultipartFile file,
	       @RequestParam("phone") String phone,
	       @RequestParam("id") String id,
		   HttpServletRequest request) {
//		RequestContext requestContext = new RequestContext(request);
		ResResultEntity resultEntity = new ResResultEntity();
		resultEntity.setCode(Constants.ResultCode.ERROR);
		 resultEntity.setMessage("file error");
		 if (file.isEmpty()) {
		     return resultEntity;
	      }
	        String fileName = file.getOriginalFilename();
	        String temp = "upload";
	        try {

//	            File path = new File(ResourceUtils.getURL("classpath:").getPath());
	            String path = request.getServletContext().getRealPath("/");  
//	            File upload = new File(path.getAbsolutePath(),temp);
	            File upload = new File(path,File.separator+temp);
	            if(!upload.exists()) {
	                upload.mkdirs();
	            }
	           
	            
	            
	            File realFile = new File(upload + File.separator + id + "_" + phone + "_" + fileName);
	            file.transferTo(realFile);
	            
	            resultEntity.setCode(Constants.ResultCode.OK);
	            resultEntity.setMessage("sucess");
	            return resultEntity;
	        } catch (Exception e) {
	            return resultEntity;
	        }
		
		
	}
}