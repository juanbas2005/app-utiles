package defpackage;

/* renamed from: jm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jm2 implements Comparable {
    public final int w;
    public final int x;
    public final String y;
    public final String z;

    public jm2(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.w = i;
        this.x = i2;
        this.y = str;
        this.z = str2;
    }

    public final int compareTo(Object obj) {
        jm2 jm2 = (jm2) obj;
        jm2.getClass();
        int i = this.w - jm2.w;
        if (i == 0) {
            return this.x - jm2.x;
        }
        return i;
    }
}
