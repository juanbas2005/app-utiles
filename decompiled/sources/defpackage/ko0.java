package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ko0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ko0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i;
        long j;
        long j2;
        long j3;
        ie1.s(i53.j, new j5(19), new vw0(4));
        int i2 = 0;
        pe3 pe3 = new pe3(0, 255, 1);
        ArrayList arrayList = new ArrayList(et0.e0(pe3, 10));
        Iterator it = pe3.iterator();
        while (((qe3) it).y) {
            int nextInt = ((je3) it).nextInt();
            if (48 > nextInt || nextInt >= 58) {
                j2 = (long) nextInt;
                if (j2 >= 97 && j2 <= 102) {
                    j3 = 87;
                } else if (j2 < 65 || j2 > 70) {
                    j = -1;
                    arrayList.add(Long.valueOf(j));
                } else {
                    j3 = 55;
                }
            } else {
                j2 = (long) nextInt;
                j3 = 48;
            }
            j = j2 - j3;
            arrayList.add(Long.valueOf(j));
        }
        dt0.c1(arrayList);
        pe3 pe32 = new pe3(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(et0.e0(pe32, 10));
        Iterator it2 = pe32.iterator();
        while (((qe3) it2).y) {
            int nextInt2 = ((je3) it2).nextInt();
            if (nextInt2 < 10) {
                i = nextInt2 + 48;
            } else {
                i = (char) (((char) (nextInt2 + 97)) - 10);
            }
            arrayList2.add(Byte.valueOf((byte) i));
        }
        byte[] bArr = new byte[arrayList2.size()];
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            bArr[i2] = ((Number) it3.next()).byteValue();
            i2++;
        }
    }

    public static final int a(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static final void b(un0 un0, int i) {
        throw new NumberFormatException("Invalid number: " + un0 + ", wrong digit: " + un0.charAt(i) + " at position " + i);
    }
}
