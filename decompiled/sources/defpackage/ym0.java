package defpackage;

import android.view.ViewGroup;

/* renamed from: ym0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ym0 extends qm7 {
    public boolean a = false;
    public final ViewGroup b;

    public ym0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void a(km7 km7) {
        if (!this.a) {
            b85.s(this.b, false);
        }
        km7.z(this);
    }

    public final void b() {
        b85.s(this.b, false);
    }

    public final void e() {
        b85.s(this.b, true);
    }

    public final void f(km7 km7) {
        b85.s(this.b, false);
        this.a = true;
    }
}
