package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sun.glass.ui.Application;
import com.sun.org.apache.xpath.internal.operations.Mod;

import net.sf.json.JSONObject;
import util.ReadExcel;

@Controller
public class KPIExaminationController {

	private ReadExcel readexclutil;
	
	// 定义全局变量存放已经登陆的账户id  目前不知如何判断session登陆销毁 目前暂时不用
	private  List<String> ApplicationCountId=new ArrayList<String>();
	
	// 文件上传处理
	@RequestMapping("importExcel.action")
	public ModelAndView importExcel(@RequestParam("file_excel") MultipartFile files,HttpServletRequest request) throws Exception{
		JSONObject rs = new JSONObject();
		int code = 200;
		ModelAndView modelAndView=new ModelAndView();
		//判断文件是否为空
//		if(file.isEmpty()){
//			rs.put("message","文件为空");
//			return rs;
//		}
//		
//		//判断文件类型是否错误(xlsx/xls)
//		if(file.getOriginalFilename().indexOf("xlsx")<0||file.getOriginalFilename().indexOf("xls")<0){
//			rs.put("message","文件类型错误");
//			return rs;
//		}
//		
		
		String path = request.getSession().getServletContext().getRealPath("/")+files.getOriginalFilename();
		
		
		try{
			files.transferTo(new File(path)); //这里是上传文件
			// 这是删除上传的文件
			// new File(path).delete();
		}catch (IOException e) {
			
			e.printStackTrace();
			rs.put("message","文件读取错误");
		}
		File localFile = new File(path);
			
		//读取excel文档  
		ArrayList<ArrayList<Object>> result = ReadExcel.readExcel(localFile);
		int i=0,j=0;
		for (ArrayList<Object> arrayList : result) {
			for (Object object : arrayList) {
				System.out.println("第"+i+"行"+"第"+j+"列数据为 "+object.toString());
				j++;
			}
			i++;
			System.out.println();
		}
		
		modelAndView.setViewName("index");
		//这里的result就是整个excel的数据。根据需求自行确定校验规则及后续加数据库等操作
		return modelAndView;
		
		
		}
	
	// modelandview 方法用来返回界面
	@RequestMapping("Login.action")
	public ModelAndView Loginconfirm(@RequestParam(value="username",required=false)String username,
			@RequestParam(value="userpwd",required=false)String userpwd,HttpSession session){
		
		ModelAndView modelAndView=new ModelAndView();
		/*
		 * 1 查询数据库验证密码的正确性，用户名放入session，且同一账户只允许登录三次
		 * 2 登录后讲账户放入application域中，以此实现一个账户只允许登陆一次。
		 * 3 查询账户对应的权限，存入session中
		 * */
		if(username.equals(userpwd)){
			/*if (ApplicationCountId.contains(username)) {
				modelAndView.addObject("action", "此账号已有人登陆");
				modelAndView.setViewName("index");
			}*/
			session.setAttribute(username, "online");
			
			//if(session.getAttribute(username).toString()==null){}  判断session中是否有id
			
			modelAndView.setViewName("first");
		}
		else{
			session.setAttribute(username, "offline");
			modelAndView.setViewName("index");
		}

		return modelAndView;
	
	}
	
	@RequestMapping("ToFirst.action")
	public ModelAndView ToFirst(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("first");
		return modelAndView;
	}
	
	@RequestMapping("ToSecond.action")
	public ModelAndView ToSecond(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("second");
		return modelAndView;
	}
	
	@RequestMapping("ToThird.action")
	public ModelAndView ToThird(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("third");
		return modelAndView;
	}
	
	@RequestMapping("ToFour.action")
	public ModelAndView ToFour(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("four");
		return modelAndView;
	}
	
	
	@RequestMapping("ToFive.action")
	public ModelAndView ToFive(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("five");
		return modelAndView;
	}
	
	
	
	// json方法用来处理ajax方法 返回json数据对
	@RequestMapping("tougao.action")
	@ResponseBody
	public JSONObject tougao(@RequestBody String mapjson)throws IOException {
		//字符串编码修改，防止乱码			HttpServletResponse res,HttpServletRequest request
		JSONObject mapmap=JSONObject.fromObject(mapjson);
		JSONObject returnjson=new JSONObject();
		
		return  returnjson;
	}
}
