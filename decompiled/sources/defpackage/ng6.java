package defpackage;

import android.content.Context;

/* renamed from: ng6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng6 implements db2 {
    public final /* synthetic */ int a;
    public final mu5 b;
    public final mu5 c;
    public final db2 d;

    public /* synthetic */ ng6(mu5 mu5, mu5 mu52, db2 db2, int i) {
        this.a = i;
        this.b = mu5;
        this.c = mu52;
        this.d = db2;
    }

    public final Object get() {
        int i = this.a;
        db2 db2 = this.d;
        mu5 mu5 = this.c;
        mu5 mu52 = this.b;
        switch (i) {
            case b85.b:
                return new wr0((Object) (Context) mu52.get(), (Object) (za6) mu5.get(), (Object) (m10) ((c82) db2).get(), 28);
            default:
                return new in7(new jv2(14), new n63(13), (en1) ((fn1) mu52).get(), (z00) ((pu7) mu5).get(), (no7) ((md8) db2).get());
        }
    }
}
