package defpackage;

import android.net.Uri;

/* renamed from: a13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a13 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ c23 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ a13(c23 c23, aq4 aq4, int i) {
        this.w = i;
        this.x = c23;
        this.y = aq4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        aq4 aq4 = this.y;
        switch (i) {
            case b85.b /*0*/:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    String str = (String) aq4.getValue();
                    c23 c23 = this.x;
                    c23.getClass();
                    str.getClass();
                    ar7.H(u58.a(c23), (e81) null, (r81) null, new w6(c23, uri, str, (f61) null), 3);
                }
                return vs7;
            default:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    xi xiVar = new xi(aq4, 20);
                    c23 c232 = this.x;
                    c232.getClass();
                    ar7.H(u58.a(c232), (e81) null, (r81) null, new gv(c232, uri2, xiVar, (f61) null, 2), 3);
                }
                return vs7;
        }
    }
}
