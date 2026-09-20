package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: nn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nn3 {
    public static final up2 a;
    public static final uq4 b = uq4.e("value");
    public static final up2 c = new up2(Target.class.getName());
    public static final up2 d = new up2(Retention.class.getName());
    public static final up2 e = new up2(Deprecated.class.getName());
    public static final up2 f = new up2(Documented.class.getName());
    public static final up2 g = new up2("java.lang.annotation.Repeatable");
    public static final up2 h = new up2("org.jetbrains.annotations.NotNull");
    public static final up2 i = new up2("org.jetbrains.annotations.Nullable");
    public static final up2 j = new up2("org.jetbrains.annotations.Mutable");
    public static final up2 k = new up2("org.jetbrains.annotations.ReadOnly");
    public static final up2 l = new up2("org.jetbrains.annotations.Unmodifiable");
    public static final up2 m = new up2("org.jetbrains.annotations.UnmodifiableView");
    public static final up2 n = new up2("kotlin.annotations.jvm.ReadOnly");
    public static final up2 o = new up2("kotlin.annotations.jvm.Mutable");
    public static final up2 p = new up2("kotlin.jvm.PurelyImplements");
    public static final up2 q = new up2("kotlin.jvm.internal.EnhancedNullability");
    public static final up2 r = new up2("kotlin.jvm.internal.EnhancedMutability");

    static {
        up2 up2 = new up2("kotlin.Metadata");
        a = up2;
        if (up2.a.a.replace('.', '/') != null) {
            new up2(ElementType.class.getName());
            new up2(RetentionPolicy.class.getName());
            new up2("java.lang.annotation.Inherited");
            new up2(Override.class.getName());
            new up2("kotlin.jvm.internal");
            return;
        }
        co3.a(7);
        throw null;
    }
}
