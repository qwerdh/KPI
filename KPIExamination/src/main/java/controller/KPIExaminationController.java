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
	
	// ����ȫ�ֱ�������Ѿ���½���˻�id  Ŀǰ��֪����ж�session��½���� Ŀǰ��ʱ����
	private  List<String> ApplicationCountId=new ArrayList<String>();
	
	// �ļ��ϴ�����
	@RequestMapping("importExcel.action")
	public ModelAndView importExcel(@RequestParam("file_excel") MultipartFile files,HttpServletRequest request) throws Exception{
		JSONObject rs = new JSONObject();
		int code = 200;
		ModelAndView modelAndView=new ModelAndView();
		//�ж��ļ��Ƿ�Ϊ��
//		if(file.isEmpty()){
//			rs.put("message","�ļ�Ϊ��");
//			return rs;
//		}
//		
//		//�ж��ļ������Ƿ����(xlsx/xls)
//		if(file.getOriginalFilename().indexOf("xlsx")<0||file.getOriginalFilename().indexOf("xls")<0){
//			rs.put("message","�ļ����ʹ���");
//			return rs;
//		}
//		
		
		String path = request.getSession().getServletContext().getRealPath("/")+files.getOriginalFilename();
		
		
		try{
			files.transferTo(new File(path)); //�������ϴ��ļ�
			// ����ɾ���ϴ����ļ�
			// new File(path).delete();
		}catch (IOException e) {
			
			e.printStackTrace();
			rs.put("message","�ļ���ȡ����");
		}
		File localFile = new File(path);
			
		//��ȡexcel�ĵ�  
		ArrayList<ArrayList<Object>> result = ReadExcel.readExcel(localFile);
		int i=0,j=0;
		for (ArrayList<Object> arrayList : result) {
			for (Object object : arrayList) {
				System.out.println("��"+i+"��"+"��"+j+"������Ϊ "+object.toString());
				j++;
			}
			i++;
			System.out.println();
		}
		
		modelAndView.setViewName("index");
		//�����result��������excel�����ݡ�������������ȷ��У����򼰺��������ݿ�Ȳ���
		return modelAndView;
		
		
		}
	
	// modelandview �����������ؽ���
	@RequestMapping("Login.action")
	public ModelAndView Loginconfirm(@RequestParam(value="username",required=false)String username,
			@RequestParam(value="userpwd",required=false)String userpwd,HttpSession session){
		
		ModelAndView modelAndView=new ModelAndView();
		/*
		 * 1 ��ѯ���ݿ���֤�������ȷ�ԣ��û�������session����ͬһ�˻�ֻ�����¼����
		 * 2 ��¼���˻�����application���У��Դ�ʵ��һ���˻�ֻ�����½һ�Ρ�
		 * 3 ��ѯ�˻���Ӧ��Ȩ�ޣ�����session��
		 * */
		if(username.equals(userpwd)){
			/*if (ApplicationCountId.contains(username)) {
				modelAndView.addObject("action", "���˺������˵�½");
				modelAndView.setViewName("index");
			}*/
			session.setAttribute(username, "online");
			
			//if(session.getAttribute(username).toString()==null){}  �ж�session���Ƿ���id
			
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
	
	
	
	// json������������ajax���� ����json���ݶ�
	@RequestMapping("tougao.action")
	@ResponseBody
	public JSONObject tougao(@RequestBody String mapjson)throws IOException {
		//�ַ��������޸ģ���ֹ����			HttpServletResponse res,HttpServletRequest request
		JSONObject mapmap=JSONObject.fromObject(mapjson);
		JSONObject returnjson=new JSONObject();
		
		return  returnjson;
	}
}
