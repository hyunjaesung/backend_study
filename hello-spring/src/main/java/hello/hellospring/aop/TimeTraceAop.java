package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
// @Component 일케 스킨도 가능한데 특별하니까 직접 등록해서 쓴다
public class TimeTraceAop {

    @Around("execution(* hello.hellospring.service..*(..))") // 적용할 것들
    public Object excute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("start= " + joinPoint.toString());
        try{
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = start - finish;
            System.out.println("END= " + joinPoint.toString() + " " + timeMs + " " + "ms");
        }
    }
}
