package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: gh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gh0 {
    public final nz3 a;
    public final nz3 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final bz2 f;

    public gh0(zw5 zw5) {
        fh0 fh0 = new fh0(this, 0);
        i44 i44 = i44.x;
        this.a = rg3.y(i44, fh0);
        boolean z = true;
        this.b = rg3.y(i44, new fh0(this, 1));
        this.c = Long.parseLong(zw5.H(Long.MAX_VALUE));
        this.d = Long.parseLong(zw5.H(Long.MAX_VALUE));
        this.e = Integer.parseInt(zw5.H(Long.MAX_VALUE)) <= 0 ? false : z;
        int parseInt = Integer.parseInt(zw5.H(Long.MAX_VALUE));
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < parseInt) {
            String H = zw5.H(Long.MAX_VALUE);
            Bitmap.Config[] configArr = i.a;
            int F0 = d57.F0(H, ':', 0, 6);
            if (F0 != -1) {
                String obj = d57.k1(H.substring(0, F0)).toString();
                String substring = H.substring(F0 + 1);
                obj.getClass();
                za5.u(obj);
                arrayList.add(obj);
                arrayList.add(d57.k1(substring).toString());
                i++;
            } else {
                h.j("Unexpected header: ".concat(H));
                throw null;
            }
        }
        this.f = new bz2((String[]) arrayList.toArray(new String[0]));
    }

    public final void a(yw5 yw5) {
        long j;
        yw5.k(this.c);
        yw5.writeByte(10);
        yw5.k(this.d);
        yw5.writeByte(10);
        if (this.e) {
            j = 1;
        } else {
            j = 0;
        }
        yw5.k(j);
        yw5.writeByte(10);
        bz2 bz2 = this.f;
        yw5.k((long) bz2.size());
        yw5.writeByte(10);
        int size = bz2.size();
        for (int i = 0; i < size; i++) {
            yw5.N(bz2.g(i));
            yw5.N(": ");
            yw5.N(bz2.l(i));
            yw5.writeByte(10);
        }
    }

    public gh0(a66 a66) {
        boolean z = false;
        fh0 fh0 = new fh0(this, 0);
        i44 i44 = i44.x;
        this.a = rg3.y(i44, fh0);
        this.b = rg3.y(i44, new fh0(this, 1));
        this.c = a66.H;
        this.d = a66.I;
        this.e = a66.A != null ? true : z;
        this.f = a66.B;
    }
}
