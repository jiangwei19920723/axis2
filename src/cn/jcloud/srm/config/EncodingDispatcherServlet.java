package cn.jcloud.srm.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月13日 上午9:44:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class EncodingDispatcherServlet extends DispatcherServlet {
	private String encoding;
	private static final long serialVersionUID = 1L;

	public EncodingDispatcherServlet(WebApplicationContext webApplicationContext) {
		super(webApplicationContext);
	}
	
	public EncodingDispatcherServlet(WebApplicationContext webApplicationContext , String encoding) {
		super(webApplicationContext);
		this.encoding = encoding;
	}


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		super.service(request, response);
	}
	public String getEncoding() {
		return encoding;
	}
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	
}
