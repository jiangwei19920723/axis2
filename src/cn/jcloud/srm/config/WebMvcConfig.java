package cn.jcloud.srm.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;

/** 
 * @author  蒋维 
 * @date 创建时间：2017年10月13日 上午9:37:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Configuration
@EnableWebMvc
@ComponentScan({
	"cn.jcloud.srm.web"
})
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	/*@Override//添加拦截器
	public void addInterceptors(InterceptorRegistry registry) {
	}*/
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(converter4());
		super.extendMessageConverters(converters);
	}
	@Bean
	public FastJsonHttpMessageConverter4 converter4(){
		FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();
		return converter;
	}
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	/*@Bean
	public CommonsMultipartResolver multipartResolver(){
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
	}*/
}
