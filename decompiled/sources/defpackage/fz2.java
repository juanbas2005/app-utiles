package defpackage;

import java.util.ArrayList;

/* renamed from: fz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fz2 {
    public ArrayList a;

    public final int a(int i) {
        return ((int[]) this.a.get(i / 768))[i % 768];
    }

    public final void b(int i, int i2) {
        ((int[]) this.a.get(i / 768))[i % 768] = i2;
    }
}
