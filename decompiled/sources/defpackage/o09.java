package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: o09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o09 extends d19 {
    public final mt8 w;
    public final int x;

    public o09(nu8 nu8) {
        nu8.getClass();
        this.w = nu8;
        int i = 0;
        int i2 = 0;
        while (true) {
            mt8 mt8 = this.w;
            if (i >= mt8.size()) {
                break;
            }
            int b = ((d19) mt8.get(i)).b();
            if (i2 < b) {
                i2 = b;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.x = i3;
        if (i3 > 8) {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int a() {
        return d19.d(Byte.MIN_VALUE);
    }

    public final int b() {
        return this.x;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d19 d19 = (d19) obj;
        int a = d19.a();
        int d = d19.d(Byte.MIN_VALUE);
        if (d != a) {
            return d - d19.a();
        }
        mt8 mt8 = ((o09) d19).w;
        mt8 mt82 = this.w;
        if (mt82.size() != mt8.size()) {
            return mt82.size() - mt8.size();
        }
        for (int i = 0; i < mt82.size(); i++) {
            int compareTo = ((d19) mt82.get(i)).compareTo((d19) mt8.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o09.class == obj.getClass()) {
            return this.w.equals(((o09) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d19.d(Byte.MIN_VALUE)), this.w});
    }

    public final String toString() {
        mt8 mt8 = this.w;
        if (mt8.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mt8.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((d19) mt8.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(tz2.n(it.next()));
                while (it.hasNext()) {
                    sb.append(",\n  ");
                    sb.append(tz2.n(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
