package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: ov1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ov1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public l90 g;
    public int h;
    public final /* synthetic */ rv1 i;

    public ov1(rv1 rv1, String str) {
        this.i = rv1;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < 2; i2++) {
            sb.append(i2);
            this.c.add(this.i.w.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.w.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final pv1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            rv1 rv1 = this.i;
            if (i2 < size) {
                if (!rv1.L.v((ae5) arrayList.get(i2))) {
                    try {
                        rv1.G(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i2++;
            } else {
                this.h++;
                return new pv1(rv1, this);
            }
        }
    }
}
