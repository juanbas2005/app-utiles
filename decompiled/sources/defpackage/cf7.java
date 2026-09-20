package defpackage;

import android.os.Build;

/* renamed from: cf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cf7 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ tp1 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ cf7(int i, tp1 tp1, aq4 aq4) {
        this.w = i;
        this.x = tp1;
        this.y = aq4;
    }

    public final Object y(Object obj) {
        oj5 oj5;
        int i = this.w;
        aq4 aq4 = this.y;
        tp1 tp1 = this.x;
        switch (i) {
            case b85.b:
                sn snVar = new sn(7, (sr2) obj);
                cf7 cf7 = new cf7(1, tp1, aq4);
                if (sd4.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        oj5 = oj5.b;
                    } else {
                        oj5 = oj5.c;
                    }
                    if (sd4.a()) {
                        return new pd4(snVar, cf7, oj5);
                    }
                    return jl4.w;
                }
                kj6.n("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                px1 px1 = (px1) obj;
                int r0 = tp1.r0(px1.b(px1.a));
                aq4.setValue(new we3((((long) tp1.r0(px1.a(px1.a))) & 4294967295L) | (((long) r0) << 32)));
                return vs7.a;
        }
    }
}
