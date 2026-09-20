package defpackage;

import java.io.Serializable;

/* renamed from: y77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y77 implements x77, Serializable {
    public final x77 w;
    public volatile transient boolean x;
    public transient Object y;

    public y77(x77 x77) {
        x77.getClass();
        this.w = x77;
    }

    public final Object get() {
        if (!this.x) {
            synchronized (this) {
                try {
                    if (!this.x) {
                        Object obj = this.w.get();
                        this.y = obj;
                        this.x = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.y;
    }

    public final String toString() {
        Object obj;
        if (this.x) {
            String valueOf = String.valueOf(this.y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.w;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
