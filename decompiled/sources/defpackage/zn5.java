package defpackage;

/* renamed from: zn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zn5 {
    public static final zn5 c = new zn5(yn5.w, 0);
    public static final zn5 d = new zn5(yn5.B, 1);
    public final yn5 a;
    public final int b;

    public zn5(yn5 yn5, int i) {
        this.a = yn5;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn5.class != obj.getClass()) {
            return false;
        }
        zn5 zn5 = (zn5) obj;
        if (this.a == zn5.a && this.b == zn5.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        if (i == 1) {
            str = "meet";
        } else if (i != 2) {
            str = "null";
        } else {
            str = "slice";
        }
        sb.append(str);
        return sb.toString();
    }
}
