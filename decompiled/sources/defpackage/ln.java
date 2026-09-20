package defpackage;

import java.util.Arrays;

/* renamed from: ln  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ln {
    public final int a;
    public final qc3 b;
    public final ym c;
    public final String d;

    public ln(qc3 qc3, ym ymVar, String str) {
        this.b = qc3;
        this.c = ymVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qc3, ymVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        if (!b35.j(this.b, lnVar.b) || !b35.j(this.c, lnVar.c) || !b35.j(this.d, lnVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
