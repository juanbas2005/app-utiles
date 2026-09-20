package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: kl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kl0 implements jl0 {
    public final xp7 w;
    public cz4 x;

    public kl0(xp7 xp7) {
        xp7.getClass();
        this.w = xp7;
        xp7.a();
    }

    public final xp7 C() {
        return this.w;
    }

    public final Collection e() {
        Object obj;
        xp7 xp7 = this.w;
        if (xp7.a() == k28.A) {
            obj = xp7.b();
        } else {
            obj = g().p();
        }
        obj.getClass();
        return sg3.D(obj);
    }

    public final fv3 g() {
        fv3 g = this.w.b().L().g();
        g.getClass();
        return g;
    }

    public final List getParameters() {
        return a42.w;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.w + ')';
    }

    public final /* bridge */ /* synthetic */ vq0 u() {
        return null;
    }

    public final boolean y() {
        return false;
    }
}
