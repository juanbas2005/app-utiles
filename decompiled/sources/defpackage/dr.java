package defpackage;

import cu.lestebang.utiletecsa.App;

/* renamed from: dr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dr implements nu2 {
    public volatile vd1 w;
    public final Object x = new Object();
    public final wv2 y;

    public dr(wv2 wv2) {
        this.y = wv2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, er] */
    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        ? obj = new Object();
                        obj.a = (App) this.y.x;
                        this.w = new vd1(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w;
    }
}
