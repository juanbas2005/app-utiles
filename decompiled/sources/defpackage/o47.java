package defpackage;

/* renamed from: o47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o47 implements rl {
    public final String a;

    public /* synthetic */ o47(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o47)) {
            return false;
        }
        if (!this.a.equals(((o47) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f21.h("StringAnnotation(value=", this.a, ")");
    }
}
