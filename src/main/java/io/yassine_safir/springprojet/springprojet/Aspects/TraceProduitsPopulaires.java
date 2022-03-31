package io.yassine_safir.springprojet.springprojet.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import ch.qos.logback.classic.Logger;

@Aspect
@Configuration
public class TraceProduitsPopulaires {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(TraceProduitsPopulaires.class);

    @Pointcut("execution(* io.yassine_safir.springprojet.springprojet.Services.ProduitService.getProduitById(*))")
    public void traceProduitsPopulairesPointcut() { }

    @Around("traceProduitsPopulairesPointcut()")
    public Object afficherTrace( ProceedingJoinPoint joinpoint) throws Throwable {
        String nomMethode = joinpoint.getTarget().getClass().getSimpleName() + "."
                + joinpoint.getSignature().getName();
        Object obj =joinpoint.proceed();
        logger.trace(nomMethode+" "+joinpoint.getArgs()[0]);
        return obj;
    }
}
