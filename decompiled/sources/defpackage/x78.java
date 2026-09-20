package defpackage;

import android.net.Uri;

/* renamed from: x78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class x78 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ e88 x;

    public /* synthetic */ x78(e88 e88, int i) {
        this.w = i;
        this.x = e88;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    e88 e88 = this.x;
                    d37 d37 = e88.c;
                    if (!((is7) d37.getValue()).b) {
                        ar7.H(u58.a(e88), (e81) null, (r81) null, new ng(d37, (f61) null, (r58) e88, (Object) uri, 25), 3);
                    }
                }
                return vs7;
            default:
                q8 q8Var = (q8) obj;
                q8Var.getClass();
                if (q8Var.w == -1) {
                    this.x.e();
                }
                return vs7;
        }
    }
}
