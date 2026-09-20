package defpackage;

import java.util.Arrays;

/* renamed from: i42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i42 {
    public final m42 a;
    public final byte[] b;

    public i42(m42 m42, byte[] bArr) {
        if (m42 == null) {
            ku4.j("encoding is null");
            throw null;
        } else if (bArr != null) {
            this.a = m42;
            this.b = bArr;
        } else {
            ku4.j("bytes is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i42)) {
            return false;
        }
        i42 i42 = (i42) obj;
        if (!this.a.equals(i42.a)) {
            return false;
        }
        return Arrays.equals(this.b, i42.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
