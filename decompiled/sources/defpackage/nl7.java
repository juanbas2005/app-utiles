package defpackage;

/* renamed from: nl7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nl7 {
    public final String a;
    public final long b;

    public nl7(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        str.getClass();
        this.a = str;
        this.b = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl7)) {
            return false;
        }
        nl7 nl7 = (nl7) obj;
        if (sg3.e(this.a, nl7.a) && this.b == nl7.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransferRecipientEntity(number=" + this.a + ", lastUsed=" + this.b + ")";
    }
}
