package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: u10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u10 {
    public final String a;
    public final byte[] b;
    public final to5 c;

    public u10(String str, byte[] bArr, to5 to5) {
        this.a = str;
        this.b = bArr;
        this.c = to5;
    }

    public static wr0 a() {
        wr0 wr0 = new wr0(6, false);
        wr0.z = to5.w;
        return wr0;
    }

    public final u10 b(to5 to5) {
        wr0 a2 = a();
        a2.a0(this.a);
        if (to5 != null) {
            a2.z = to5;
            a2.y = this.b;
            return a2.o();
        }
        ku4.j("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u10) {
            u10 u10 = (u10) obj;
            if (!this.a.equals(u10.a) || !Arrays.equals(this.b, u10.b) || !this.c.equals(u10.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String str;
        byte[] bArr = this.b;
        if (bArr == null) {
            str = "";
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return f21.l(sb, str, ")");
    }
}
