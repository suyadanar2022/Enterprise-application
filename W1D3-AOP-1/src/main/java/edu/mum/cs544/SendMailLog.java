package edu.mum.cs544;




import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class SendMailLog {
    private static final Logger logger = LogManager.getLogger(SendMailLog.class.getName());
    LocalDateTime currDate = LocalDateTime.now();

    @After("execution(* edu.mum.cs544.EmailSender.sendEmail(..))")
    public void logAfter(JoinPoint joinPoint){
        Object[] obj = joinPoint.getArgs();
        String email = (String) obj[0];
        String message = (String) obj[1];

        /* Object objs = joinPoint.getTarget();
        System.out.println(objs); */
        //System.out.println(objs.getOutgoingMailServer());

        logger.warn(" " + currDate.getDayOfWeek() + " " +currDate.getMonth() + " " + currDate.getDayOfMonth() + " " + currDate.getHour() + 
        ":" + currDate.getMinute() + ":" + currDate.getSecond() + " GMT " + currDate.getYear() + " method=" + joinPoint.getSignature().getName()
        + " address= " + email + " message= " + message + " outgoing mail server");
    }
    
    @Around("execution(* edu.mum.cs544.CustomerDAO.save(..))")
    public Object logDuration(ProceedingJoinPoint call) throws Throwable{
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();
        long totaltime = sw.getLastTaskTimeMillis();
        System.out.println("Time to execute save = " + totaltime);
        return retVal;
    }


}
