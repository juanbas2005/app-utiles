package defpackage;

import java.util.Arrays;

/* renamed from: ez4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ez4 {
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final boolean e;

    public ez4(String str, String str2, String str3, byte[] bArr, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez4)) {
            return false;
        }
        ez4 ez4 = (ez4) obj;
        if (sg3.e(this.a, ez4.a) && sg3.e(this.b, ez4.b) && sg3.e(this.c, ez4.c) && sg3.e(this.d, ez4.d) && this.e == ez4.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h = hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        byte[] bArr = this.d;
        if (bArr == null) {
            i = 0;
        } else {
            i = Arrays.hashCode(bArr);
        }
        return Boolean.hashCode(this.e) + ((h + i) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.d);
        StringBuilder o = f21.o("NewForumPost(title=", this.a, ", body=", this.b, ", categoryKey=");
        f21.v(o, this.c, ", imageJpeg=", arrays, ", imageChanged=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
