package cn.jcloud.srm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

/** 
 * @author  ��ά 
 * @date ����ʱ�䣺2017��9��6�� ����7:25:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Configuration
@ComponentScan({
	"cn.jcloud.srm.webservices",
	"cn.jcloud.srm.dao",
	"cn.jcloud.srm.service",
	"cn.jcloud.srm.handleException"
})
@PropertySource({
	"classpath:db.properties",
	"classpath:user.properties"
})
@ImportResource({
	"classpath:spring-quartz.xml"
})
@EnableTransactionManagement
public class ApplicationConfig {
	@Value("${db.driverClassName}")
	private String driverClassName;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String userName;
	@Value("${db.password}")
	private String password;
	@Value("${db.initialSize}")
	private int initialSize;
	@Value("${db.maxActive}")
	private int maxActive;
	@Value("${db.minIdle}")
	private int minIdle;
	@Value("${db.maxWait}")
	private long maxWait;
	@Value("${hibernate.dialect}")
	private String dialect;
	@Value("${hibernate.show_sql}")
	private String show_sql;
	@Value("${hibernate.format_sql}")
	private String format_sql;
	@Value("${hibernate.hbm2ddl.auto}")
	private String auto;
	@Value("${hibernate.query.factory_class}")
	private String factoryClass;
	@Value("${hibernate.default_schema}")
	private String schema;
	@Value("${thread.corePoolSize}")
	private int corePoolSize;
	@Value("${thread.keepAliveSeconds}")
	private int keepAliveSeconds;
	@Value("${thread.maxPoolSize}")
	private int maxPoolSize;
	@Value("${thread.queueCapacity}")
	private int queueCapacity;
	@Bean
	public DataSource dataSource(){
		DruidDataSource dds = new DruidDataSource();
		dds.setDriverClassName(driverClassName);
		dds.setUrl(url);
		dds.setUsername(userName);
		dds.setPassword(password);
		dds.setInitialSize(initialSize);
		dds.setMinIdle(minIdle);
		dds.setMaxActive(maxActive);
		dds.setMaxWait(maxWait);
		return dds;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan("cn.jcloud.srm.entity");
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", dialect);
		properties.setProperty("hibernate.show_sql", show_sql);
		properties.setProperty("hibernate.format_sql", format_sql);
		properties.setProperty("hibernate.hbm2ddl.auto", auto);
		properties.setProperty("hibernate.query.factory_class", factoryClass);
		properties.setProperty("hibernate.default_schema", schema);
		bean.setHibernateProperties(properties);
		return bean;
	}
	@Bean
	public HibernateTransactionManager transactionManager(LocalSessionFactoryBean sessionFactory){
		HibernateTransactionManager manager = new HibernateTransactionManager();
		manager.setSessionFactory(sessionFactory.getObject());
		manager.setDataSource(dataSource());
		return manager;
	}
	@Bean
	public ThreadPoolTaskExecutor threadExecutor(){
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(corePoolSize);
		taskExecutor.setKeepAliveSeconds(keepAliveSeconds);
		taskExecutor.setMaxPoolSize(maxPoolSize);
		taskExecutor.setQueueCapacity(queueCapacity);
		return taskExecutor;
	}
}
