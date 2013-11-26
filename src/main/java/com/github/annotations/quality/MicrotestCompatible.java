package com.github.annotations.quality;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation for a class that is able to participate in a micro-test (fast unit test w/ maximum real code)
 * without being awkward.
 * It is awkward if it is slow, uses the network or filesystem, or behaves inconsistently.
 *
 * @author Eric Pabst (epabst@gmail.com)
 *         Date: 5/29/13
 *         Time: 5:34 PM
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface MicrotestCompatible {
  /**
   * Which sub-class or factory method should be used to obtain a microtest-compatible instance.
   * A class Bar might have use="BarForTesting" where BarForTesting is a subclass that is microtest-compatible.
   */
  String use() default "self";
}
