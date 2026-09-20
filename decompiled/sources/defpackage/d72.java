package defpackage;

import android.content.Context;

/* renamed from: d72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d72 implements cb2 {
    public final /* synthetic */ int a;
    public final om6 b;

    public /* synthetic */ d72(om6 om6, int i) {
        this.a = i;
        this.b = om6;
    }

    public final Object get() {
        int i = this.a;
        om6 om6 = this.b;
        switch (i) {
            case b85.b:
                return new c72((nu5) om6.b);
            case 1:
                oe2 oe2 = (oe2) om6.b;
                oe2.getClass();
                sm6 sm6 = sm6.a;
                return sm6.a(oe2);
            default:
                return new ma4((Context) om6.b);
        }
    }
}
