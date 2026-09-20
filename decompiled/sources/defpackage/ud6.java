package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ud6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ud6 implements gs2 {
    public final /* synthetic */ int w;

    public /* synthetic */ ud6(int i) {
        this.w = i;
    }

    public final Object H(Object obj, Object obj2) {
        km kmVar;
        Object obj3;
        int i = 0;
        switch (this.w) {
            case b85.b:
                c81 c81 = (c81) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                ne6 ne6 = (ne6) obj;
                pe6 pe6 = (pe6) obj2;
                Map map = pe6.w;
                tp4 tp4 = pe6.x;
                Object[] objArr = tp4.b;
                Object[] objArr2 = tp4.c;
                long[] jArr = tp4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj4 = objArr[i5];
                                    Map d = ((re6) objArr2[i5]).d();
                                    if (d.isEmpty()) {
                                        map.remove(obj4);
                                    } else {
                                        map.put(obj4, d);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 2:
                ne6 ne62 = (ne6) obj;
                return obj2;
            case 3:
                vl vlVar = (vl) obj2;
                return sg3.f(vlVar.x, qf6.a(vlVar.w, qf6.b, (ne6) obj));
            case 4:
                ne6 ne63 = (ne6) obj;
                return Integer.valueOf(((rd7) obj2).a);
            case 5:
                ne6 ne64 = (ne6) obj;
                lf7 lf7 = (lf7) obj2;
                return sg3.f(Float.valueOf(lf7.a), Float.valueOf(lf7.b));
            case 6:
                ne6 ne65 = (ne6) obj;
                mf7 mf7 = (mf7) obj2;
                wg7 wg7 = new wg7(mf7.a);
                pf6 pf6 = qf6.x;
                return sg3.f(qf6.a(wg7, pf6, ne65), qf6.a(new wg7(mf7.b), pf6, ne65));
            case 7:
                ne6 ne66 = (ne6) obj;
                return Integer.valueOf(((am2) obj2).w);
            case 8:
                a74 a74 = (a74) obj2;
                return sg3.f(a74.a, qf6.a(a74.b, qf6.j, (ne6) obj));
            case 9:
                ne6 ne67 = (ne6) obj;
                return Float.valueOf(((h60) obj2).a);
            case 10:
                ne6 ne68 = (ne6) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(qf6.a((ul) list.get(i), qf6.c, ne68));
                    i++;
                }
                return arrayList;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ne6 ne69 = (ne6) obj;
                lg7 lg7 = (lg7) obj2;
                return sg3.f(Integer.valueOf((int) (lg7.a >> 32)), Integer.valueOf((int) (lg7.a & 4294967295L)));
            case 12:
                ne6 ne610 = (ne6) obj;
                lq6 lq6 = (lq6) obj2;
                return sg3.f(qf6.a(new jt0(lq6.a), qf6.r, ne610), qf6.a(new l35(lq6.b), qf6.z, ne610), Float.valueOf(lq6.c));
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                ne6 ne611 = (ne6) obj;
                return Integer.valueOf(((hc7) obj2).a);
            case 14:
                ne6 ne612 = (ne6) obj;
                return Integer.valueOf(((ud7) obj2).a);
            case h75.g:
                ne6 ne613 = (ne6) obj;
                return Integer.valueOf(((i73) obj2).a);
            case 16:
                ne6 ne614 = (ne6) obj;
                return Integer.valueOf(((yl2) obj2).a);
            case 17:
                ne6 ne615 = (ne6) obj;
                return Integer.valueOf(((zl2) obj2).a);
            case 18:
                ne6 ne616 = (ne6) obj;
                wg7 wg72 = (wg7) obj2;
                long j2 = wg7.c;
                if (wg72 != null) {
                    i = wg7.a(wg72.a, j2);
                }
                if (i != 0) {
                    return Boolean.FALSE;
                }
                return sg3.f(Float.valueOf(wg7.c(wg72.a)), qf6.a(new xg7(wg7.b(wg72.a)), qf6.y, ne616));
            case 19:
                z64 z64 = (z64) obj2;
                return sg3.f(z64.a, qf6.a(z64.b, qf6.j, (ne6) obj));
            case 20:
                ne6 ne617 = (ne6) obj;
                long j3 = ((xg7) obj2).a;
                if (xg7.a(j3, 8589934592L)) {
                    return 0;
                }
                if (xg7.a(j3, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 21:
                ne6 ne618 = (ne6) obj;
                l35 l35 = (l35) obj2;
                if (l35 != null) {
                    i = l35.b(l35.a, 9205357640488583168L);
                }
                if (i != 0) {
                    return Boolean.FALSE;
                }
                return sg3.f(Float.valueOf(Float.intBitsToFloat((int) (l35.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (l35.a & 4294967295L))));
            case 22:
                ne6 ne619 = (ne6) obj;
                ul ulVar = (ul) obj2;
                Object obj5 = ulVar.a;
                if (obj5 instanceof nc5) {
                    kmVar = km.w;
                } else if (obj5 instanceof yy6) {
                    kmVar = km.x;
                } else if (obj5 instanceof c48) {
                    kmVar = km.y;
                } else if (obj5 instanceof uu7) {
                    kmVar = km.z;
                } else if (obj5 instanceof a74) {
                    kmVar = km.A;
                } else if (obj5 instanceof z64) {
                    kmVar = km.B;
                } else if (obj5 instanceof o47) {
                    kmVar = km.C;
                } else {
                    ku4.p();
                    return null;
                }
                switch (kmVar.ordinal()) {
                    case b85.b:
                        obj5.getClass();
                        obj3 = qf6.a((nc5) obj5, qf6.h, ne619);
                        break;
                    case 1:
                        obj5.getClass();
                        obj3 = qf6.a((yy6) obj5, qf6.i, ne619);
                        break;
                    case 2:
                        obj5.getClass();
                        obj3 = qf6.a((c48) obj5, qf6.d, ne619);
                        break;
                    case 3:
                        obj5.getClass();
                        obj3 = qf6.a((uu7) obj5, qf6.e, ne619);
                        break;
                    case 4:
                        obj5.getClass();
                        obj3 = qf6.a((a74) obj5, qf6.f, ne619);
                        break;
                    case 5:
                        obj5.getClass();
                        obj3 = qf6.a((z64) obj5, qf6.g, ne619);
                        break;
                    case 6:
                        obj5.getClass();
                        obj3 = ((o47) obj5).a;
                        break;
                    default:
                        h.c();
                        return null;
                }
                return sg3.f(kmVar, obj3, Integer.valueOf(ulVar.b), Integer.valueOf(ulVar.c), ulVar.d);
            case 23:
                ne6 ne620 = (ne6) obj;
                List list2 = ((ya4) obj2).w;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(qf6.a((xa4) list2.get(i), qf6.B, ne620));
                    i++;
                }
                return arrayList2;
            case 24:
                ne6 ne621 = (ne6) obj;
                return ((xa4) obj2).a.toLanguageTag();
            case 25:
                ne6 ne622 = (ne6) obj;
                m64 m64 = (m64) obj2;
                return sg3.f(qf6.a(new j64(m64.a), qf6.D, ne622), qf6.a(new l64(m64.b), qf6.E, ne622), qf6.a(new k64(m64.c), qf6.F, ne622));
            case 26:
                ne6 ne623 = (ne6) obj;
                return Float.valueOf(((j64) obj2).a);
            case 27:
                ne6 ne624 = (ne6) obj;
                return Integer.valueOf(((l64) obj2).a);
            case 28:
                ne6 ne625 = (ne6) obj;
                return Integer.valueOf(((k64) obj2).a);
            default:
                ne6 ne626 = (ne6) obj;
                return ((c48) obj2).a;
        }
    }
}
