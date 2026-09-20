package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: z15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z15 implements pd5 {
    public final List a;
    public final int b;
    public final boolean c;

    public z15(List list) {
        boolean z;
        int i;
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((x15) it.next()).a;
            if (num != null) {
                i4 = num.intValue();
            }
            i3 += i4;
        }
        this.b = i3;
        List list2 = this.a;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((x15) it2.next()).a == null) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.c = z;
        List<x15> list3 = this.a;
        if (list3 == null || !list3.isEmpty()) {
            for (x15 x15 : list3) {
                Integer num2 = x15.a;
                if (num2 != null) {
                    i = num2.intValue();
                    continue;
                } else {
                    i = Integer.MAX_VALUE;
                    continue;
                }
                if (i <= 0) {
                    h.q("Failed requirement.");
                    throw null;
                }
            }
        }
        List<x15> list4 = this.a;
        if (list4 == null || !list4.isEmpty()) {
            for (x15 x152 : list4) {
                if (x152.a == null && (i2 = i2 + 1) < 0) {
                    sg3.Y();
                    throw null;
                }
            }
        }
        if (i2 > 1) {
            List list5 = this.a;
            ArrayList<x15> arrayList = new ArrayList<>();
            for (Object next : list5) {
                if (((x15) next).a == null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
            for (x15 x153 : arrayList) {
                arrayList2.add(x153.b);
            }
            ku4.w(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, f06] */
    public final Object a(d71 d71, CharSequence charSequence, int i) {
        int i2;
        charSequence.getClass();
        int i3 = this.b;
        if (i + i3 > charSequence.length()) {
            return new ld5(i, new hx4(1, this));
        }
        ? obj = new Object();
        while (obj.w + i < charSequence.length() && fb5.m(charSequence.charAt(obj.w + i))) {
            obj.w++;
        }
        if (obj.w < i3) {
            return new ld5(i, new qm3(11, (Object) obj, (Object) this));
        }
        List list = this.a;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            Integer num = ((x15) list.get(i4)).a;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = (obj.w - i3) + 1;
            }
            int i5 = i2 + i;
            y15 a2 = ((x15) list.get(i4)).a(d71, charSequence, i, i5);
            if (a2 != null) {
                return new ld5(i, new l92(i4, 1, charSequence.subSequence(i, i5).toString(), this, a2));
            }
            i4++;
            i = i5;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        String str;
        List<x15> list = this.a;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (x15 x15 : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = x15.a;
            if (num == null) {
                str = "at least one digit";
            } else {
                str = num + " digits";
            }
            sb.append(str);
            sb.append(" for ");
            sb.append(x15.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
