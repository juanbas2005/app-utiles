package defpackage;

/* renamed from: am2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am2 implements Comparable {
    public static final am2 A;
    public static final am2 B;
    public static final am2 x;
    public static final am2 y;
    public static final am2 z;
    public final int w;

    static {
        am2 am2 = new am2(100);
        am2 am22 = new am2(200);
        am2 am23 = new am2(300);
        am2 am24 = new am2(400);
        am2 am25 = new am2(500);
        am2 am26 = new am2(600);
        x = am26;
        am2 am27 = new am2(700);
        am2 am28 = new am2(800);
        am2 am29 = new am2(900);
        y = am24;
        z = am25;
        A = am26;
        B = am27;
        sg3.E(am2, am22, am23, am24, am25, am26, am27, am28, am29);
    }

    public am2(int i) {
        this.w = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (!z2) {
            zb3.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    public final int compareTo(Object obj) {
        return sg3.k(this.w, ((am2) obj).w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof am2) && this.w == ((am2) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.w;
    }

    public final String toString() {
        return pb4.i(this.w, "FontWeight(weight=", ")");
    }
}
