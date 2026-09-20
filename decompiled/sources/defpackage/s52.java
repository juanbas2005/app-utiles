package defpackage;

import java.io.IOException;

/* renamed from: s52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class s52 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s52(o81 o81, um1 um1, int i) {
        this.w = 3;
        this.y = o81;
        this.z = um1;
        this.x = i;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                String str = (String) obj2;
                t52 t52 = (t52) obj;
                ll6[] ll6Arr = new ll6[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    ll6Arr[i3] = b85.g(str + '.' + t52.e[i3], n57.o, new ll6[0]);
                }
                return ll6Arr;
            case 1:
                ((bd5) obj).e(i2);
                ((vr2) obj2).y(Integer.valueOf(i2));
                return vs7;
            case 2:
                p33 p33 = (p33) obj2;
                try {
                    p33.S.B(i2, (k62) obj);
                } catch (IOException e) {
                    k62 k62 = k62.z;
                    p33.a(k62, k62, e);
                }
                return vs7;
            default:
                ar7.H((o81) obj2, (e81) null, (r81) null, new bi1((um1) obj, i2, (f61) null, 3), 3);
                return vs7;
        }
    }

    public /* synthetic */ s52(p33 p33, int i, k62 k62) {
        this.w = 2;
        this.y = p33;
        this.x = i;
        this.z = k62;
    }

    public /* synthetic */ s52(Object obj, int i, Object obj2, int i2) {
        this.w = i2;
        this.x = i;
        this.y = obj;
        this.z = obj2;
    }
}
