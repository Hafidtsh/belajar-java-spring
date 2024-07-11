package belajar.java.spring.demo;

import belajar.java.spring.demo.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryBeanConfiguration {

}
