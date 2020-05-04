package com.jumpcode.seed.system.backend.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author jumpcode
 */
@Aspect
@Component
public class ControllerLogAspectJ {
    Logger logger = LoggerFactory.getLogger(ControllerLogAspectJ.class);
    
    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("execution(public * com.jumpcode.seed.system.bz.controller..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            sb.append(joinPoint.getArgs()[i]).append(",");
        }
        String args = sb.toString();

        logger.info("The method {} begin, Args: {}", joinPoint.getSignature(), args);
    }
    
    /**
     * 最终通知（after advice）在连接点结束之后执行，不管返回结果还是抛出异常
     * @param joinPoint
     */
    @After("execution(public * com.jumpcode.seed.system.bz.controller..*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("The method {} end", joinPoint.getSignature());
    }
    
    /**
     * 异常通知：仅当连接点抛出异常时执行
     * @param joinPoint
     * @param throwable
     */
    @AfterThrowing(pointcut = "execution(public * com.jumpcode.seed.system.bz.controller..*.*(..))", throwing = "throwable")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
        logger.error("Exception {} in method {}", throwable, joinPoint.getSignature());
    }

}
