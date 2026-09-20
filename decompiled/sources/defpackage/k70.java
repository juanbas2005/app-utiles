package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: k70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k70 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek7 b;

    public /* synthetic */ k70(ek7 ek7, int i) {
        this.a = i;
        this.b = ek7;
    }

    public final Object invoke(uk5 uk5, f61 f61) {
        int i = this.a;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        ek7 ek7 = this.b;
        switch (i) {
            case b85.b:
                Object L = gl0.L(new j70(uk5, ek7, (f61) null, 0), f61);
                if (L == p81) {
                    return L;
                }
                return vs7;
            default:
                Object L2 = gl0.L(new j70(uk5, ek7, (f61) null, 1), f61);
                if (L2 == p81) {
                    return L2;
                }
                return vs7;
        }
    }
}
