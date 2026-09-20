package defpackage;

import android.content.res.Configuration;

/* renamed from: jq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jq2 implements v31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq2 b;

    public /* synthetic */ jq2(rq2 rq2, int i) {
        this.a = i;
        this.b = rq2;
    }

    public final void accept(Object obj) {
        int i = this.a;
        rq2 rq2 = this.b;
        switch (i) {
            case b85.b:
                Configuration configuration = (Configuration) obj;
                if (rq2.N()) {
                    rq2.i(false);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                if (rq2.N() && num.intValue() == 80) {
                    rq2.m(false);
                    return;
                }
                return;
            case 2:
                do4 do4 = (do4) obj;
                if (rq2.N()) {
                    boolean z = do4.a;
                    rq2.n(false);
                    return;
                }
                return;
            default:
                ug5 ug5 = (ug5) obj;
                if (rq2.N()) {
                    boolean z2 = ug5.a;
                    rq2.s(false);
                    return;
                }
                return;
        }
    }
}
