package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wl {
    public static final vl a = new vl("");

    public static final List a(vl vlVar, int i, int i2, j5 j5Var) {
        List list;
        boolean z;
        if (i == i2 || (list = vlVar.w) == null) {
            return null;
        }
        int i3 = 0;
        if (i != 0 || i2 < vlVar.x.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                ul ulVar = (ul) list.get(i3);
                if (j5Var != null) {
                    z = ((Boolean) j5Var.y(ulVar.a)).booleanValue();
                } else {
                    z = true;
                }
                if (z) {
                    int i4 = ulVar.b;
                    int i5 = ulVar.c;
                    if (b(i, i2, i4, i5)) {
                        String str = ulVar.d;
                        arrayList.add(new ul(z65.p(ulVar.b, i, i2) - i, z65.p(i5, i, i2) - i, (rl) ulVar.a, str));
                    }
                }
                i3++;
            }
            return arrayList;
        } else if (j5Var == null) {
            return list;
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            while (i3 < size2) {
                Object obj = list.get(i3);
                if (((Boolean) j5Var.y(((ul) obj).a)).booleanValue()) {
                    arrayList2.add(obj);
                }
                i3++;
            }
            return arrayList2;
        }
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & z3;
        if (i < i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 < i2) {
            z5 = true;
        }
        return (z4 & z5) | z7;
    }
}
