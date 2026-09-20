package defpackage;

import java.io.IOException;

/* renamed from: j33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j33 implements sr2 {
    public final /* synthetic */ p33 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ long y;

    public /* synthetic */ j33(p33 p33, int i, long j) {
        this.w = p33;
        this.x = i;
        this.y = j;
    }

    public final Object b() {
        p33 p33 = this.w;
        int i = this.x;
        try {
            p33.S.D(this.y, i);
        } catch (IOException e) {
            k62 k62 = k62.z;
            p33.a(k62, k62, e);
        }
        return vs7.a;
    }
}
