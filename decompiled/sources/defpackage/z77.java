package defpackage;

import java.util.Objects;

/* renamed from: z77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z77 implements x77 {
    public volatile x77 w;
    public volatile boolean x;
    public Object y;

    public final Object get() {
        if (!this.x) {
            synchronized (this) {
                try {
                    if (!this.x) {
                        x77 x77 = this.w;
                        Objects.requireNonNull(x77);
                        Object obj = x77.get();
                        this.y = obj;
                        this.x = true;
                        this.w = null;
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
        Object obj = this.w;
        if (obj == null) {
            String valueOf = String.valueOf(this.y);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
