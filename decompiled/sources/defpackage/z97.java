package defpackage;

import java.io.Serializable;

/* renamed from: z97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z97 implements nz3, Serializable {
    public sr2 w;
    public volatile Object x = xb4.c0;
    public final Object y = this;

    public z97(sr2 sr2) {
        sr2.getClass();
        this.w = sr2;
    }

    public final boolean a() {
        if (this.x != xb4.c0) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.x;
        xb4 xb4 = xb4.c0;
        if (obj2 != xb4) {
            return obj2;
        }
        synchronized (this.y) {
            obj = this.x;
            if (obj == xb4) {
                sr2 sr2 = this.w;
                sr2.getClass();
                obj = sr2.b();
                this.x = obj;
                this.w = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
