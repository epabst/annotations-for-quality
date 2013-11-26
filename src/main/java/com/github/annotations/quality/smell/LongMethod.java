package com.github.annotations.quality.smell;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for a code with the code smell of "long method".
 *
 * @author Eric Pabst (epabst@gmail.com)
 *         Date: 5/29/13
 *         Time: 5:34 PM
 * @see <a href="http://www.industriallogic.com/blog/smells-to-refactorings-cheatsheet/">Code Smells</a>
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface LongMethod {
}
