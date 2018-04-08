package cn.jcloud.srm.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月13日 上午9:42:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Bootstrap implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//将静态资源交给defaultServlet
		servletContext.getServletRegistration("default").addMapping("/css/*","/js/*","/images/*","/fonts/*");
		//注册根容器
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		root.register(ApplicationConfig.class);
		servletContext.addListener(new ContextLoaderListener(root));
		//注册web容器
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebMvcConfig.class);
		webContext.setParent(root);
		//注册servlet
		DispatcherServlet servlet = new EncodingDispatcherServlet(webContext,"UTF-8");
		Dynamic dynamic =servletContext.addServlet("springDispatcher", servlet);
		dynamic.addMapping("/");
	}

}
