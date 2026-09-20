package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: w12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w12 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public w12(Context context, int i2) {
        this.a = context;
        this.b = i2;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f2;
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f2 = hn.c(edgeEffect);
        } else {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(z75 z75) {
        EdgeEffect edgeEffect;
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 >= 31) {
            edgeEffect = hn.a(context);
        } else {
            edgeEffect = new gw2(context);
        }
        edgeEffect.setColor(this.b);
        if (!we3.a(this.c, 0)) {
            long j2 = this.c;
            if (z75 == z75.w) {
                edgeEffect.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
                return edgeEffect;
            }
            edgeEffect.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return edgeEffect;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a(z75.w);
        this.e = a2;
        return a2;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a(z75.x);
        this.f = a2;
        return a2;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a(z75.x);
        this.g = a2;
        return a2;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a2 = a(z75.w);
        this.d = a2;
        return a2;
    }
}
