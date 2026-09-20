package defpackage;

import java.io.Serializable;

/* renamed from: m9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class m9 implements qs2, Serializable {
    public final boolean A = false;
    public final int B;
    public final int C;
    public final Object w;
    public final Class x;
    public final String y;
    public final String z;

    public m9(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.w = obj;
        this.x = cls;
        this.y = str;
        this.z = str2;
        this.B = i;
        this.C = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        if (this.A != m9Var.A || this.B != m9Var.B || this.C != m9Var.C || !sg3.e(this.w, m9Var.w) || !this.x.equals(m9Var.x) || !this.y.equals(m9Var.y) || !this.z.equals(m9Var.z)) {
            return false;
        }
        return true;
    }

    public final int g() {
        return this.B;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int h = hl6.h(hl6.h((this.x.hashCode() + (i * 31)) * 31, 31, this.y), 31, this.z);
        if (this.A) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((h + i2) * 31) + this.B) * 31) + this.C;
    }

    public final String toString() {
        return b26.a.j(this);
    }
}
