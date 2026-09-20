package defpackage;

import java.util.Arrays;

/* renamed from: jz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jz extends v91 {
    public final String a;
    public final byte[] b;

    public jz(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v91)) {
            return false;
        }
        v91 v91 = (v91) obj;
        jz jzVar = (jz) v91;
        if (!this.a.equals(jzVar.a)) {
            return false;
        }
        if (v91 instanceof jz) {
            bArr = ((jz) v91).b;
        } else {
            bArr = jzVar.b;
        }
        if (Arrays.equals(this.b, bArr)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
