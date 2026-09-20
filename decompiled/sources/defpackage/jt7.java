package defpackage;

import java.io.Serializable;

/* renamed from: jt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt7 implements nz3, Serializable {
    public sr2 w;
    public Object x;

    public final boolean a() {
        if (this.x != xb4.c0) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        if (this.x == xb4.c0) {
            sr2 sr2 = this.w;
            sr2.getClass();
            this.x = sr2.b();
            this.w = null;
        }
        return this.x;
    }

    public final String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
