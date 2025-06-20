package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    // order 패키지와 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))") // -> 포인트컷
    public void allOrder() {
    } // pointcut signature

    // 클래스 이름 패턴이 "*서비스"인것
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void allOrderAndService() {}


}
