package defpackage;

import java.util.ArrayList;

/* renamed from: pa6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pa6 {
    public h98 a;
    public ArrayList b;

    public static long a(eq1 eq1, long j) {
        h98 h98 = eq1.d;
        ArrayList arrayList = eq1.k;
        if (h98 instanceof oz2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            aq1 aq1 = (aq1) arrayList.get(i);
            if (aq1 instanceof eq1) {
                eq1 eq12 = (eq1) aq1;
                if (eq12.d != h98) {
                    j2 = Math.min(j2, a(eq12, ((long) eq12.f) + j));
                }
            }
        }
        eq1 eq13 = h98.i;
        eq1 eq14 = h98.h;
        if (eq1 != eq13) {
            return j2;
        }
        long j3 = j - h98.j();
        return Math.min(Math.min(j2, a(eq14, j3)), j3 - ((long) eq14.f));
    }

    public static long b(eq1 eq1, long j) {
        h98 h98 = eq1.d;
        ArrayList arrayList = eq1.k;
        if (h98 instanceof oz2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            aq1 aq1 = (aq1) arrayList.get(i);
            if (aq1 instanceof eq1) {
                eq1 eq12 = (eq1) aq1;
                if (eq12.d != h98) {
                    j2 = Math.max(j2, b(eq12, ((long) eq12.f) + j));
                }
            }
        }
        eq1 eq13 = h98.h;
        eq1 eq14 = h98.i;
        if (eq1 != eq13) {
            return j2;
        }
        long j3 = h98.j() + j;
        return Math.max(Math.max(j2, b(eq14, j3)), j3 - ((long) eq14.f));
    }
}
