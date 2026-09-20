package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: l54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l54 implements q54, o81 {
    public final in8 w;
    public final e81 x;

    public l54(in8 in8, e81 e81) {
        e81.getClass();
        this.w = in8;
        this.x = e81;
        if (in8.G0() == k54.w) {
            r16.u(e81, (CancellationException) null);
        }
    }

    public final e81 k() {
        return this.x;
    }

    public final void o(t54 t54, j54 j54) {
        in8 in8 = this.w;
        if (in8.G0().compareTo(k54.w) <= 0) {
            in8.M0(this);
            r16.u(this.x, (CancellationException) null);
        }
    }
}
