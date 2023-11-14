package test;

import javax.annotation.PostConstruct;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Aspect
//@Scope("prototype")
public class TraceAspect {

	@Value("Trace")
	private String text;
	
	public TraceAspect() {
		System.out.println("TraceAspect Constructor text - "+text);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("TraceAspect start method text - "+text);
	}
	
	@Before("execution(* test.*.*(..))")
	public void beforeTrace(JoinPoint joinPoint) {
		System.out.println(text+" before method "+ joinPoint.getSignature().getName());
	}
}
