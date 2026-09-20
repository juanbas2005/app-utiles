package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.util.List;

/* renamed from: ti0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ti0 implements eq3, Serializable, nv3 {
    public final String A;
    public final boolean B;
    public transient eq3 w;
    public final Object x;
    public final Class y;
    public final String z;

    public ti0(Object obj, Class cls, String str, String str2, boolean z2) {
        this.x = obj;
        this.y = cls;
        this.z = str;
        this.A = str2;
        this.B = z2;
    }

    public eq3 N() {
        eq3 eq3 = this.w;
        if (eq3 != null) {
            return eq3;
        }
        eq3 O = O();
        this.w = O;
        return O;
    }

    public abstract eq3 O();

    public final wq3 P() {
        Class cls = this.y;
        if (cls == null) {
            return null;
        }
        if (this.B) {
            return b26.a.c(cls);
        }
        return b26.a.b(cls);
    }

    public eq3 Q() {
        eq3 N = N();
        if (N != this) {
            return N;
        }
        throw new u81();
    }

    public final List getAnnotations() {
        return Q().getAnnotations();
    }

    public final String getName() {
        return this.z;
    }

    public final List getParameters() {
        return Q().getParameters();
    }

    public final List getTypeParameters() {
        return Q().getTypeParameters();
    }

    public final as3 k() {
        return Q().k();
    }

    public final GenericDeclaration s() {
        return pd8.p(P(), this.A);
    }
}
