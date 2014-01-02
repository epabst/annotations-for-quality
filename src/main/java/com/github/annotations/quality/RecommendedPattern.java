package com.github.annotations.quality;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for marking patterns that should be followed.
 * As best practices change, these annotations should be moved to examples using the latest pattern.
 *
 * @author Eric Pabst (epabst@gmail.com)
 *         Date: 1/2/14
 *         Time: 11:02 AM
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.PARAMETER,ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
public @interface RecommendedPattern {
}
