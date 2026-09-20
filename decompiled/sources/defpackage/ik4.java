package defpackage;

import android.content.Context;

/* renamed from: ik4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ik4 implements db2 {
    public final /* synthetic */ int a;
    public final mu5 b;
    public final mu5 c;

    public /* synthetic */ ik4(mu5 mu5, mu5 mu52, int i) {
        this.a = i;
        this.b = mu5;
        this.c = mu52;
    }

    public final Object get() {
        int i = this.a;
        mu5 mu5 = this.b;
        switch (i) {
            case b85.b:
                return new hk4((Context) ((fb1) mu5).b, (wr0) ((fb1) this.c).get());
            default:
                return new za6(new jv2(14), new n63(13), q00.f, (rg6) mu5.get(), this.c);
        }
    }
}
