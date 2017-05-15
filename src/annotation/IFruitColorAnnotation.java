package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 4个元注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// @Inherited
public @interface IFruitColorAnnotation {

	public enum Color{
		white,
		red,
		yellow
	}
	
	Color getColor() default Color.red;
	int getHeight() default 2;
	
	
}
