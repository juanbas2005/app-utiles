package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: oj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public @interface oj1 {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 2;
}
