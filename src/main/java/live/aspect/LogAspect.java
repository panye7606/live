package live.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author rcer
 * @Date 17/2/18 下午3:17
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(public * live.service.Impl.LiveServiceImpl.*(..))")
    public void logAop() {}

    @Before("logAop()")
    public void logBefore() {
        System.out.println("前置通知Before");
    }

    @AfterReturning("logAop()")
    public void logAfterReturning(){
        System.out.println("返回通知AfterReturning");
    }

    @After("logAop()")
    public void logAfter(){
        System.out.println("后置通知After");
    }

    @AfterThrowing("logAop()")
    public void logAfterThrow(){
        System.out.println("异常通知AfterThrowing");
    }

}
