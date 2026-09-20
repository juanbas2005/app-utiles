package defpackage;

import java.util.ArrayList;

/* renamed from: b10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b10 extends vb4 {
    public final long a;
    public final long b;
    public final zy c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public b10(long j, long j2, zy zyVar, Integer num, String str, ArrayList arrayList) {
        yu5 yu5 = yu5.w;
        this.a = j;
        this.b = j2;
        this.c = zyVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb4)) {
            return false;
        }
        b10 b10 = (b10) ((vb4) obj);
        if (this.a != b10.a || this.b != b10.b || !this.c.equals(b10.c)) {
            return false;
        }
        Integer num = b10.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = b10.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(b10.f)) {
            return false;
        }
        yu5 yu5 = yu5.w;
        if (yu5.equals(yu5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i2 = 0;
        Integer num = this.d;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((this.f.hashCode() ^ ((i3 ^ i2) * 1000003)) * 1000003) ^ yu5.w.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + yu5.w + "}";
    }
}
