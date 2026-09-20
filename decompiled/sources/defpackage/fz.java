package defpackage;

import java.util.List;

/* renamed from: fz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fz extends t91 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public fz(int i2, String str, int i3, int i4, long j, long j2, long j3, String str2, List list) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r8 = (defpackage.fz) ((defpackage.t91) r8);
     */
    public final boolean equals(Object obj) {
        fz fzVar;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t91) && this.a == fzVar.a && this.b.equals(fzVar.b) && this.c == fzVar.c && this.d == fzVar.d && this.e == fzVar.e && this.f == fzVar.f && this.g == fzVar.g) {
            String str = fzVar.h;
            String str2 = this.h;
            if (str2 != null ? str2.equals(str) : str == null) {
                List list = fzVar.i;
                List list2 = this.i;
                if (list2 != null ? !list2.equals(list) : list != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i3 = 0;
        String str = this.h;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i4 = (hashCode ^ i2) * 1000003;
        List list = this.i;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
