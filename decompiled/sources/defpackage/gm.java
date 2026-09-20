package defpackage;

import java.util.Map;

/* renamed from: gm  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm implements fm {
    public final vw3 a;
    public final Map b;
    public final sy6 c;

    public gm(fu6 fu6, Map map, sy6 sy6) {
        if (fu6 == null) {
            a(0);
            throw null;
        } else if (map != null) {
            this.a = fu6;
            this.b = map;
            this.c = sy6;
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 3 || i == 4 || i == 5) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 3 || i == 4 || i == 5) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4 || i == 5) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final vw3 b() {
        vw3 vw3 = this.a;
        if (vw3 != null) {
            return vw3;
        }
        a(3);
        throw null;
    }

    public final sy6 e() {
        return this.c;
    }

    public final up2 f() {
        ql4 d = ts1.d(this);
        if (d != null) {
            if (z62.f(d)) {
                d = null;
            }
            if (d != null) {
                return ts1.c(d);
            }
        }
        return null;
    }

    public final Map g() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    public final String toString() {
        return ms1.c.p(this, (mm) null);
    }
}
