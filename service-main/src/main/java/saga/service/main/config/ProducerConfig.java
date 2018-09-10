package saga.service.main.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProducerConfig {
	
	/**** QUEUE CONFIGURATION ***/
	public static final String q1 = "Q1"; 	// queue name
	public static final String e1 = "E1"; 	// exchange name
	public static final String r1 = "R1"; // route key
	
	@Bean
	Queue queue() {
		return new Queue(q1);
	}

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(e1);
	}

	@Bean
	Binding binding(DirectExchange exchange) {
		return BindingBuilder.bind(queue()).to(exchange).with(r1);
	}
	
	@Bean
	public Jackson2JsonMessageConverter jsonConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
