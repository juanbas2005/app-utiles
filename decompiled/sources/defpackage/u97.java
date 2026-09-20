package defpackage;

/* renamed from: u97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u97 {
    public final int a;
    public final int b;

    public u97(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u97)) {
            return false;
        }
        u97 u97 = (u97) obj;
        if (this.a == u97.a && this.b == u97.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31) - 815803566;
    }

    public final String toString() {
        return pb4.k("SyncProgress(total=", this.a, ", current=", this.b, ", message=Syncing jetpacks locally)");
    }
}
