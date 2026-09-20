package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: y16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y16 implements sr2 {
    public static final n63 y = new n63(7);
    public final sr2 w;
    public volatile SoftReference x;

    public y16(Object obj, sr2 sr2) {
        if (sr2 != null) {
            this.x = null;
            this.w = sr2;
            if (obj != null) {
                this.x = new SoftReference(obj);
                return;
            }
            return;
        }
        h.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        throw null;
    }

    public final Object b() {
        Object obj;
        Object obj2 = y;
        SoftReference softReference = this.x;
        if (softReference == null || (obj = softReference.get()) == null) {
            Object b = this.w.b();
            if (b != null) {
                obj2 = b;
            }
            this.x = new SoftReference(obj2);
            return b;
        } else if (obj == obj2) {
            return null;
        } else {
            return obj;
        }
    }
}
