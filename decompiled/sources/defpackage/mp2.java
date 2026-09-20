package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: mp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mp2 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mp2(o48 o48, eh5 eh5, int i) {
        this.w = 4;
        this.x = o48;
        this.z = eh5;
        this.y = i;
    }

    public final Object y(Object obj) {
        jy0 jy0;
        long[] jArr;
        jy0 jy02;
        int i;
        long[] jArr2;
        boolean z2;
        int i2;
        int i3;
        bg7 bg7;
        int i4 = this.w;
        vs7 vs7 = vs7.a;
        int i5 = 0;
        int i6 = this.y;
        Object obj2 = this.z;
        Object obj3 = this.x;
        switch (i4) {
            case b85.b:
                String str = (String) obj3;
                tm2 tm2 = (tm2) obj2;
                mo2 mo2 = (mo2) obj;
                List<tm2> list = mo2.i;
                ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                for (tm2 tm22 : list) {
                    if (sg3.e(tm22.a, str) && tm22.h == i6) {
                        tm22 = tm2;
                    }
                    arrayList.add(tm22);
                }
                return mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, arrayList, false, (Boolean) null, (Map) null, false, false, 16127);
            case 1:
                String str2 = (String) obj3;
                en2 en2 = (en2) obj2;
                mo2 mo22 = (mo2) obj;
                List<en2> list2 = mo22.a;
                ArrayList arrayList2 = new ArrayList(et0.e0(list2, 10));
                for (en2 en22 : list2) {
                    if (sg3.e(en22.a, str2) && en22.m == i6) {
                        en22 = en2;
                    }
                    arrayList2.add(en22);
                }
                return mo2.a(mo22, arrayList2, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, (Map) null, false, false, 16382);
            case 2:
                yx5 yx5 = (yx5) obj3;
                hp4 hp4 = (hp4) obj2;
                jy0 jy03 = (jy0) obj;
                if (yx5.e == i6 && sg3.e(hp4, yx5.f) && (jy03 instanceof py0)) {
                    long[] jArr3 = hp4.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr3[i7];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i5;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        Object obj4 = hp4.b[i11];
                                        if (hp4.c[i11] != i6) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i = i8;
                                            py0 py0 = (py0) jy03;
                                            jy02 = jy03;
                                            tp4 tp4 = py0.C;
                                            fb5.r(tp4, obj4, yx5);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof oq1) {
                                                oq1 oq1 = (oq1) obj4;
                                                if (!tp4.c(oq1)) {
                                                    fb5.t(py0.F, oq1);
                                                }
                                                tp4 tp42 = yx5.g;
                                                if (tp42 != null) {
                                                    tp42.k(obj4);
                                                }
                                            }
                                        } else {
                                            jy02 = jy03;
                                            jArr2 = jArr3;
                                            i = i8;
                                        }
                                        if (z2) {
                                            hp4.f(i11);
                                        }
                                    } else {
                                        jy02 = jy03;
                                        jArr2 = jArr3;
                                        i = i8;
                                    }
                                    j >>= i;
                                    i10++;
                                    i8 = i;
                                    jy03 = jy02;
                                    jArr3 = jArr2;
                                }
                                jy0 = jy03;
                                jArr = jArr3;
                                if (i9 != i8) {
                                }
                            } else {
                                jy0 = jy03;
                                jArr = jArr3;
                            }
                            if (i7 != length) {
                                i7++;
                                jy03 = jy0;
                                jArr3 = jArr;
                                i5 = 0;
                            }
                        }
                    }
                }
                return vs7;
            case 3:
                ch6 ch6 = (ch6) obj3;
                eh5 eh5 = (eh5) obj2;
                dh5 dh5 = (dh5) obj;
                int d = ch6.K.a.d();
                if (d < 0) {
                    d = 0;
                }
                if (d <= i6) {
                    i6 = d;
                }
                int i12 = -i6;
                boolean z3 = ch6.L;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = i12;
                }
                if (z3) {
                    i3 = i12;
                } else {
                    i3 = 0;
                }
                dh5.w = true;
                dh5.l(dh5, eh5, i2, i3, (vr2) null, 12);
                dh5.w = false;
                return vs7;
            default:
                o48 o48 = (o48) obj3;
                eh5 eh52 = (eh5) obj2;
                dh5 dh52 = (dh5) obj;
                int i13 = o48.x;
                se7 se7 = o48.w;
                tl7 tl7 = o48.y;
                cg7 cg7 = (cg7) o48.z.b();
                if (cg7 != null) {
                    bg7 = cg7.a;
                } else {
                    bg7 = null;
                }
                se7.a(z75.w, h75.c(dh52, i13, tl7, bg7, false, eh52.w), i6, eh52.x);
                dh5.k(dh52, eh52, 0, Math.round(-se7.a.d()));
                return vs7;
        }
    }

    public /* synthetic */ mp2(Object obj, int i, Object obj2, int i2) {
        this.w = i2;
        this.x = obj;
        this.y = i;
        this.z = obj2;
    }
}
