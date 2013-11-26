package com.github.annotations.quality.smell;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for a code with the code smell of "duplicated code".
 *
 * @author Eric Pabst (epabst@gmail.com)
 *         Date: 5/29/13
 *         Time: 5:34 PM
 * @see <a href="http://www.industriallogic.com/blog/smells-to-refactorings-cheatsheet/">Code Smells</a>
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface DuplicatedCode {
}
