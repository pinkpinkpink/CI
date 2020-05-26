package src.main.java.play_base.app.annoantions;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

@Target(TYPE)
public @interface EnumClass {
    String name() default "";

}
