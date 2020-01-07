package springtest.javaconfig.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springtest.javaconfig.beans.Beef;
import springtest.javaconfig.beans.Cheese;
import springtest.javaconfig.beans.Chicken;
import springtest.javaconfig.beans.ChickenSandwich;
import springtest.javaconfig.beans.Layer;
import springtest.javaconfig.beans.Lettuce;
import springtest.javaconfig.beans.Sandwich;
import springtest.javaconfig.beans.Tomato;

@Configuration
public class AppConfig {
	
	
	
	@Bean
	public Sandwich chickenSandwich() {
		return new ChickenSandwich(lettuce(), chicken(), tomato());
	}
	
	@Bean
	public Layer beef() {
		return new Beef();
	}
	
	@Bean
	public Layer cheese() {
		return new Cheese();
	}
	
	@Bean
	public Layer chicken() {
		return new Chicken();
	}
	
	@Bean
	public Layer lettuce() {
		return new Lettuce();
	}
	
	@Bean
	public Layer tomato() {
		return new Tomato();
	}

}
