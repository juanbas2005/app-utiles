package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w83 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final v83 j;
    public boolean k;

    public w83(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z, int i3) {
        long j3;
        int i4;
        boolean z2;
        int i5 = i3;
        str = (i5 & 1) != 0 ? "" : str;
        if ((i5 & 32) != 0) {
            j3 = jt0.g;
        } else {
            j3 = j2;
        }
        if ((i5 & 64) != 0) {
            i4 = 5;
        } else {
            i4 = i2;
        }
        if ((i5 & 128) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this.a = str;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j3;
        this.g = i4;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        v83 v83 = new v83((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, 1023);
        this.j = v83;
        arrayList.add(v83);
    }

    public static void a(w83 w83, List list, ky6 ky6, int i2) {
        float f2;
        int i3;
        w83 w832 = w83;
        int i4 = i2;
        if ((i4 & 2) != 0) {
            int i5 = e38.a;
        }
        float f3 = 1.0f;
        if ((i4 & 128) != 0) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if ((i4 & 256) != 0) {
            int i6 = e38.a;
        }
        if ((i4 & 512) != 0) {
            int i7 = e38.a;
            i3 = 0;
        } else {
            i3 = 2;
        }
        int i8 = i3;
        if ((i4 & 1024) != 0) {
            f3 = 4.0f;
        }
        float f4 = f3;
        if (w832.k) {
            yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((v83) b81.k(1, w832.i)).j.add(new l38("", list, 0, ky6, 1.0f, (kc0) null, 1.0f, f2, 0, i8, f4, 0.0f, 1.0f, 0.0f));
    }

    public final x83 b() {
        if (this.k) {
            yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() > 1) {
                if (this.k) {
                    yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                v83 v83 = (v83) arrayList.remove(arrayList.size() - 1);
                ((v83) b81.k(1, arrayList)).j.add(new b38(v83.a, v83.b, v83.c, v83.d, v83.e, v83.f, v83.g, v83.h, v83.i, v83.j));
            } else {
                v83 v832 = this.j;
                b38 b38 = new b38(v832.a, v832.b, v832.c, v832.d, v832.e, v832.f, v832.g, v832.h, v832.i, v832.j);
                b38 b382 = b38;
                x83 x83 = new x83(this.a, this.b, this.c, this.d, this.e, b382, this.f, this.g, this.h);
                this.k = true;
                return x83;
            }
        }
    }
}
