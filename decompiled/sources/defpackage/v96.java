package defpackage;

import java.util.LinkedHashMap;

/* renamed from: v96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v96 extends bb0 {
    public final kg5 b0;
    public int c0 = -1;
    public String d0 = "";
    public final z53 e0 = wl6.a;

    public v96(ye6 ye6, LinkedHashMap linkedHashMap) {
        ye6.getClass();
        this.b0 = new kg5(ye6, linkedHashMap);
    }

    public final Object E0() {
        Object r = this.b0.r(this.d0);
        if (r != null) {
            return r;
        }
        ku4.k("Unexpected null value for non-nullable argument ", this.d0);
        return null;
    }

    public final z53 a() {
        return this.e0;
    }

    public final Object e0() {
        return E0();
    }

    public final Object g(zr3 zr3) {
        zr3.getClass();
        return E0();
    }

    public final int h(ll6 ll6) {
        String f;
        o9 o9Var;
        ll6.getClass();
        int i = this.c0;
        do {
            i++;
            if (i >= ll6.e()) {
                return -1;
            }
            f = ll6.f(i);
            kg5 kg5 = this.b0;
            kg5.getClass();
            f.getClass();
            ye6 ye6 = (ye6) kg5.x;
            ye6.getClass();
            o9Var = ye6.b;
            o9Var.getClass();
        } while (!((LinkedHashMap) o9Var.x).containsKey(f));
        this.c0 = i;
        this.d0 = f;
        return i;
    }

    public final ok1 q(ll6 ll6) {
        ll6.getClass();
        if (b35.v(ll6)) {
            this.d0 = ll6.f(0);
            this.c0 = 0;
        }
        return this;
    }

    public final boolean w() {
        if (this.b0.r(this.d0) != null) {
            return true;
        }
        return false;
    }
}
