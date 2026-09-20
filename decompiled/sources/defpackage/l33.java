package defpackage;

import java.util.List;

/* renamed from: l33  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l33 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ p33 x;
    public final /* synthetic */ int y;

    public /* synthetic */ l33(p33 p33, int i, List list, boolean z) {
        this.w = 2;
        this.x = p33;
        this.y = i;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final Object b() {
        switch (this.w) {
            case b85.b:
                p33 p33 = this.x;
                int i = this.y;
                p33.G.getClass();
                p33.S.B(i, k62.D);
                synchronized (p33) {
                    p33.U.remove(Integer.valueOf(i));
                }
                return vs7.a;
            case 1:
                p33 p332 = this.x;
                int i2 = this.y;
                p332.G.getClass();
                synchronized (p332) {
                    p332.U.remove(Integer.valueOf(i2));
                }
                return vs7.a;
            default:
                p33 p333 = this.x;
                int i3 = this.y;
                p333.G.getClass();
                p333.S.B(i3, k62.D);
                synchronized (p333) {
                    p333.U.remove(Integer.valueOf(i3));
                }
                return vs7.a;
        }
    }

    public /* synthetic */ l33(p33 p33, int i, Object obj, int i2) {
        this.w = i2;
        this.x = p33;
        this.y = i;
    }
}
