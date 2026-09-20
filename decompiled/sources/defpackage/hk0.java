package defpackage;

import android.graphics.Typeface;

/* renamed from: hk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hk0 extends t35 {
    public final Typeface c;
    public final ns8 d;
    public boolean e;

    public hk0(ns8 ns8, Typeface typeface) {
        this.c = typeface;
        this.d = ns8;
    }

    public final void y(int i) {
        if (!this.e) {
            zs0 zs0 = (zs0) this.d.x;
            if (zs0.l(this.c)) {
                zs0.j(false);
            }
        }
    }

    public final void z(Typeface typeface, boolean z) {
        if (!this.e) {
            zs0 zs0 = (zs0) this.d.x;
            if (zs0.l(typeface)) {
                zs0.j(false);
            }
        }
    }
}
