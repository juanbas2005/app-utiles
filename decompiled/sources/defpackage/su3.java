package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: su3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class su3 {
    public static final /* synthetic */ yr3[] q;
    public int a;
    public final String b;
    public final tu3 c;
    public final tu3 d;
    public final ArrayList e;
    public uu3 f;
    public final ArrayList g;
    public final ArrayList h;
    public yu3 i;
    public uu3 j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    static {
        Class<su3> cls = su3.class;
        q = new yr3[]{new qp4(cls, "_hasSetter", "get_hasSetter()Z", 0), new qp4(cls, "_hasGetter", "get_hasGetter()Z", 0)};
    }

    public su3(int i2, int i3, int i4, String str) {
        int i5;
        str.getClass();
        this.a = i2;
        this.b = str;
        tg2 tg2 = wg2.C;
        tg2.getClass();
        boolean z = true;
        sg2 sg2 = new sg2(tg2, 1);
        pg2 pg2 = pg2.D;
        tu3 tu3 = null;
        int i6 = sg2.b;
        if (i6 == 1 && (i5 = sg2.c) == 1) {
            tg2 tg22 = wg2.B;
            tg22.getClass();
            sg2 sg22 = new sg2(tg22, 1);
            if (sg22.b == 1 && sg22.c == 1) {
                tu3 tu32 = new tu3(i3);
                yr3[] yr3Arr = q;
                yr3Arr[1].getClass();
                pg2.E(this, Integer.valueOf((1 << sg22.a) | this.a));
                this.c = tu32;
                yr3Arr[0].getClass();
                this.d = ((((Number) pg2.get(this)).intValue() >>> sg2.a) & ((1 << i6) - 1)) != i5 ? false : z ? new tu3(i4) : tu3;
                this.e = new ArrayList(0);
                this.g = new ArrayList(0);
                new ArrayList(0);
                this.h = new ArrayList();
                this.k = new ArrayList(0);
                this.l = new LinkedHashMap(0);
                this.m = new ArrayList(0);
                this.n = new ArrayList(0);
                this.o = new ArrayList(0);
                nk4.a.getClass();
                List<nk4> a2 = mk4.a();
                ArrayList arrayList = new ArrayList(et0.e0(a2, 10));
                for (nk4 nk4 : a2) {
                    ((ro3) nk4).getClass();
                    arrayList.add(new Object());
                }
                this.p = arrayList;
                return;
            }
            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg22, " was passed"));
            throw null;
        }
        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg2, " was passed"));
        throw null;
    }
}
