package test2;

import javax.annotation.PostConstruct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AwsomeAspect {

	@Value("Text")
	private String text;
	
	public AwsomeAspect() {
	System.out.println("Awsome Constructor");
	
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Awsome start method" + text);
	}
	
	@Around("execution(* test2.*.get*(..))")
	public Object beforeTrace(ProceedingJoinPoint pjp) throws Throwable {
		String name = pjp.getTarget().getClass().getSimpleName();
		if (name.equals("BClass")) {
			return "Something";
		}
		return pjp.proceed();
	}
}
