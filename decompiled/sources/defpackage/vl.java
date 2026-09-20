package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vl implements CharSequence {
    public final List w;
    public final String x;
    public final ArrayList y;
    public final ArrayList z;

    static {
        kg5 kg5 = qf6.a;
    }

    public vl(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.w = list;
        this.x = str;
        List list2 = null;
        if (list != null) {
            int size = list.size();
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < size; i++) {
                ul ulVar = (ul) list.get(i);
                Object obj = ulVar.a;
                if (obj instanceof yy6) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ulVar);
                } else if (obj instanceof nc5) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ulVar);
                }
            }
        } else {
            arrayList2 = null;
            arrayList = null;
        }
        this.y = arrayList2;
        this.z = arrayList;
        list2 = arrayList != null ? dt0.U0(arrayList, new a91(7)) : list2;
        if (list2 != null && !list2.isEmpty()) {
            int i2 = ((ul) dt0.w0(list2)).c;
            xo4 xo4 = ke3.a;
            xo4 xo42 = new xo4(1);
            xo42.a(i2);
            int size2 = list2.size();
            for (int i3 = 1; i3 < size2; i3++) {
                ul ulVar2 = (ul) list2.get(i3);
                while (true) {
                    if (xo42.b == 0) {
                        break;
                    }
                    int d = xo42.d();
                    if (ulVar2.b >= d) {
                        xo42.e(xo42.b - 1);
                    } else {
                        int i4 = ulVar2.c;
                        if (i4 > d) {
                            zb3.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + d);
                        }
                    }
                }
                xo42.a(ulVar2.c);
            }
        }
    }

    public final List a(int i) {
        List list = this.w;
        if (list == null) {
            return a42.w;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            ul ulVar = (ul) obj;
            if ((ulVar.a instanceof b74) && wl.b(0, i, ulVar.b, ulVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final vl b(vr2 vr2) {
        tl tlVar = new tl(this);
        ArrayList arrayList = tlVar.y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ul ulVar = (ul) vr2.y(((sl) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new sl(ulVar.b, ulVar.c, ulVar.a, ulVar.d));
        }
        return tlVar.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r2.isEmpty() != false) goto L_0x0099;
     */
    /* renamed from: c */
    public final vl subSequence(int i, int i2) {
        boolean z2;
        ArrayList arrayList;
        if (i <= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            zb3.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.x;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        vl vlVar = wl.a;
        if (i > i2) {
            zb3.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.w;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ul ulVar = (ul) list.get(i3);
                int i4 = ulVar.b;
                int i5 = ulVar.c;
                if (wl.b(i, i2, i4, i5)) {
                    arrayList.add(new ul(Math.max(i, ulVar.b) - i, Math.min(i2, i5) - i, ulVar.a, ulVar.d));
                }
            }
        }
        arrayList = null;
        return new vl((List) arrayList, substring);
    }

    public final char charAt(int i) {
        return this.x.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        if (sg3.e(this.x, vlVar.x) && sg3.e(this.w, vlVar.w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.x.hashCode() * 31;
        List list = this.w;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final int length() {
        return this.x.length();
    }

    public final String toString() {
        return this.x;
    }

    public /* synthetic */ vl(String str) {
        this(str, (List) a42.w);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vl(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
