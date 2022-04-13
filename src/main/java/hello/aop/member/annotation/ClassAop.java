package hello.aop.member.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//class에다가 붙이는 어노테이션
@Retention(RetentionPolicy.RUNTIME)// 런타임 실행할 때 까지 해당 에노테이션이 살아있음
public @interface ClassAop {
}
