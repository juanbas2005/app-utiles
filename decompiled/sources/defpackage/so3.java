package defpackage;

/* renamed from: so3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class so3 implements Comparable {
    public final int w;
    public final int x;
    public final int y;

    static {
        new so3(rk4.g.a);
        new so3(rk4.h.a);
    }

    public so3(int i, int i2, int i3) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        if (i < 0) {
            h.q("Major version should be not less than 0");
            throw null;
        } else if (i2 < 0) {
            h.q("Minor version should be not less than 0");
            throw null;
        } else if (i3 < 0) {
            h.q("Patch version should be not less than 0");
            throw null;
        }
    }

    /* renamed from: a */
    public final int compareTo(so3 so3) {
        so3.getClass();
        int k = sg3.k(this.w, so3.w);
        if (k != 0) {
            return k;
        }
        int k2 = sg3.k(this.x, so3.x);
        if (k2 != 0) {
            return k2;
        }
        return sg3.k(this.y, so3.y);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!so3.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        so3 so3 = (so3) obj;
        if (this.w == so3.w && this.x == so3.x && this.y == so3.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.w * 31) + this.x) * 31) + this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('.');
        sb.append(this.x);
        sb.append('.');
        sb.append(this.y);
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public so3(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
