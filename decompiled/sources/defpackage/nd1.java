package defpackage;

import java.io.Serializable;

/* renamed from: nd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nd1 extends uq3 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Serializable r;

    public nd1(h06 h06, vr2 vr2) {
        this.p = 1;
        this.r = h06;
        this.q = vr2;
    }

    public final Object K() {
        int i = this.p;
        Serializable serializable = this.r;
        switch (i) {
            case b85.b:
                return Boolean.valueOf(((boolean[]) serializable)[0]);
            case 1:
                return (ri0) ((h06) serializable).w;
            default:
                wn3 wn3 = (wn3) ((h06) serializable).w;
                if (wn3 == null) {
                    return wn3.z;
                }
                return wn3;
        }
    }

    public void h(Object obj) {
        switch (this.p) {
            case 1:
                ri0 ri0 = (ri0) obj;
                ri0.getClass();
                h06 h06 = (h06) this.r;
                if (h06.w == null && ((Boolean) ((vr2) this.q).y(ri0)).booleanValue()) {
                    h06.w = ri0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean j(Object obj) {
        String str;
        int i = this.p;
        Object obj2 = this.q;
        Serializable serializable = this.r;
        switch (i) {
            case b85.b:
                boolean[] zArr = (boolean[]) serializable;
                if (((Boolean) ((vr2) obj2).y(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                ((ri0) obj).getClass();
                if (((h06) serializable).w == null) {
                    return true;
                }
                return false;
            default:
                ql4 ql4 = (ql4) obj;
                h06 h06 = (h06) serializable;
                ql4.getClass();
                String str2 = (String) obj2;
                String str3 = tj3.a;
                gq0 h = tj3.h(ts1.g(ql4).a);
                if (h != null) {
                    str = co3.c(h);
                } else {
                    str = ed1.j(ql4, hz2.N);
                }
                String str4 = str + '.' + str2;
                if (ao3.b.contains(str4)) {
                    h06.w = wn3.w;
                } else if (ao3.d.contains(str4)) {
                    h06.w = wn3.x;
                } else if (ao3.c.contains(str4)) {
                    h06.w = wn3.y;
                } else if (ao3.a.contains(str4)) {
                    h06.w = wn3.A;
                }
                if (h06.w == null) {
                    return true;
                }
                return false;
        }
    }

    public /* synthetic */ nd1(Object obj, Serializable serializable, int i) {
        this.p = i;
        this.q = obj;
        this.r = serializable;
    }
}
