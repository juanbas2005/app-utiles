package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: m88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m88 {
    public final WeakReference a;
    public final int b;

    public m88(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m88) || this.a.get() != ((m88) obj).a.get()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
