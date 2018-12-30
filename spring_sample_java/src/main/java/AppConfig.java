import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//Constructor injection
		//CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(getCustomerRepository());
		
		//Setter injection
		//customerServiceImpl.setCustomerRepository(getCustomerRepository());
		
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		//customerServiceImpl.setCustomerRepository(getCustomerRepository());
		
		return customerServiceImpl;
	}*/
	
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	*/

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
