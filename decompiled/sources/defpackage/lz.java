package defpackage;

import java.util.List;

/* renamed from: lz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lz extends qa1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final y91 g;
    public final pa1 h;
    public final oa1 i;
    public final z91 j;
    public final List k;
    public final int l;

    public lz(String str, String str2, String str3, long j2, Long l2, boolean z, y91 y91, pa1 pa1, oa1 oa1, z91 z91, List list, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j2;
        this.e = l2;
        this.f = z;
        this.g = y91;
        this.h = pa1;
        this.i = oa1;
        this.j = z91;
        this.k = list;
        this.l = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, kz] */
    public final kz a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qa1) {
            lz lzVar = (lz) ((qa1) obj);
            if (this.a.equals(lzVar.a) && this.b.equals(lzVar.b)) {
                String str = lzVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == lzVar.d) {
                        Long l2 = lzVar.e;
                        Long l3 = this.e;
                        if (l3 != null ? l3.equals(l2) : l2 == null) {
                            if (this.f == lzVar.f && this.g.equals(lzVar.g)) {
                                pa1 pa1 = lzVar.h;
                                pa1 pa12 = this.h;
                                if (pa12 != null ? pa12.equals(pa1) : pa1 == null) {
                                    oa1 oa1 = lzVar.i;
                                    oa1 oa12 = this.i;
                                    if (oa12 != null ? oa12.equals(oa1) : oa1 == null) {
                                        z91 z91 = lzVar.j;
                                        z91 z912 = this.j;
                                        if (z912 != null ? z912.equals(z91) : z91 == null) {
                                            List list = lzVar.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == lzVar.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i8 = 0;
        String str = this.c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j2 = this.d;
        int i9 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.e;
        if (l2 == null) {
            i3 = 0;
        } else {
            i3 = l2.hashCode();
        }
        int i10 = (i9 ^ i3) * 1000003;
        if (this.f) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode2 = (((i10 ^ i4) * 1000003) ^ this.g.hashCode()) * 1000003;
        pa1 pa1 = this.h;
        if (pa1 == null) {
            i5 = 0;
        } else {
            i5 = pa1.hashCode();
        }
        int i11 = (hashCode2 ^ i5) * 1000003;
        oa1 oa1 = this.i;
        if (oa1 == null) {
            i6 = 0;
        } else {
            i6 = oa1.hashCode();
        }
        int i12 = (i11 ^ i6) * 1000003;
        z91 z91 = this.j;
        if (z91 == null) {
            i7 = 0;
        } else {
            i7 = z91.hashCode();
        }
        int i13 = (i12 ^ i7) * 1000003;
        List list = this.k;
        if (list != null) {
            i8 = list.hashCode();
        }
        return this.l ^ ((i13 ^ i8) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return hl6.n(sb, this.l, "}");
    }
}
