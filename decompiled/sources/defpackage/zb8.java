package defpackage;

import java.util.ArrayList;

/* renamed from: zb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zb8 implements q54 {
    public final /* synthetic */ ig0 w;
    public final /* synthetic */ gj x;
    public final /* synthetic */ gy5 y;
    public final /* synthetic */ h06 z;

    public zb8(ig0 ig0, gj gjVar, gy5 gy5, h06 h06) {
        this.w = ig0;
        this.x = gjVar;
        this.y = gy5;
        this.z = h06;
    }

    /* JADX INFO: finally extract failed */
    public final void o(t54 t54, j54 j54) {
        boolean z2;
        ik0 ik0 = null;
        switch (yb8.a[j54.ordinal()]) {
            case 1:
                ar7.H(this.w, (e81) null, r81.z, new ng(this.z, this.y, t54, this, (f61) null, 26), 1);
                return;
            case 2:
                gj gjVar = this.x;
                if (gjVar != null) {
                    l90 l90 = (l90) gjVar.y;
                    synchronized (l90.b) {
                        try {
                            synchronized (l90.b) {
                                z2 = l90.a;
                            }
                            if (!z2) {
                                ArrayList arrayList = (ArrayList) l90.c;
                                l90.c = (ArrayList) l90.d;
                                l90.d = arrayList;
                                l90.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((f61) arrayList.get(i)).f(vs7.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                gy5 gy5 = this.y;
                synchronized (gy5.c) {
                    try {
                        if (gy5.t) {
                            gy5.t = false;
                            ik0 = gy5.C();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ik0 != null) {
                    ((kk0) ik0).f(vs7.a);
                    return;
                }
                return;
            case 3:
                gy5 gy52 = this.y;
                synchronized (gy52.c) {
                    try {
                        gy52.t = true;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 4:
                this.y.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                h.c();
                return;
        }
    }
}
