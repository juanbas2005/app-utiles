package defpackage;

import java.util.List;

/* renamed from: w14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w14 implements yr3 {
    public final nz3 w;

    public w14(sr2 sr2) {
        this.w = rg3.y(i44.w, sr2);
    }

    public final boolean equals(Object obj) {
        return sg3.e(s(), obj);
    }

    public final List getAnnotations() {
        return s().getAnnotations();
    }

    public final List getParameters() {
        return s().getParameters();
    }

    public final List getTypeParameters() {
        return s().getTypeParameters();
    }

    public final int hashCode() {
        return s().hashCode();
    }

    public final as3 k() {
        return s().k();
    }

    public final yr3 s() {
        return (yr3) this.w.getValue();
    }

    public final String toString() {
        return s().toString();
    }
}
