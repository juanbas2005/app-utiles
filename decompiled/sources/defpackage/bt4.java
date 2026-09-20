package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: bt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bt4 {
    public final zs4 a;
    public final qt4 b;
    public final Bundle c;
    public k54 d;
    public final it4 e;
    public final String f;
    public final Bundle g;
    public final kg5 h;
    public boolean i;
    public final w54 j;
    public k54 k = k54.x;
    public final jf6 l;
    public final z97 m;

    public bt4(zs4 zs4) {
        this.a = zs4;
        this.b = zs4.x;
        this.c = zs4.y;
        this.d = zs4.z;
        this.e = zs4.A;
        this.f = zs4.B;
        this.g = zs4.C;
        this.h = new kg5(new hf6(zs4, new hx4(18, zs4)));
        z97 z97 = new z97(new jk4(4));
        this.j = new w54(zs4, true);
        this.l = (jf6) z97.getValue();
        this.m = new z97(new jk4(5));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle j2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
        j2.putAll(bundle);
        return j2;
    }

    public final void b() {
        if (!this.i) {
            kg5 kg5 = this.h;
            kg5.F();
            this.i = true;
            if (this.e != null) {
                cf6.b(this.a);
            }
            kg5.G(this.g);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.k.ordinal();
        w54 w54 = this.j;
        if (ordinal < ordinal2) {
            w54.h1(this.d);
        } else {
            w54.h1(this.k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b26.a.b(zs4.class).A());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
