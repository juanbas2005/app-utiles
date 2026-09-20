package defpackage;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: vd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vd2 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ vd2(kz2 kz2) {
        this.w = 8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [int] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c8, code lost:
        r0 = new java.lang.StringBuilder();
        r1 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        if (r1.hasNext() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d7, code lost:
        r6 = (java.nio.charset.Charset) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e1, code lost:
        if (r0.length() <= 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        r0.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e6, code lost:
        r6.getClass();
        r6 = r6.name();
        r6.getClass();
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f4, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fc, code lost:
        if (r1.hasNext() == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fe, code lost:
        r6 = (defpackage.yb5) r1.next();
        r7 = (java.nio.charset.Charset) r6.w;
        r6 = ((java.lang.Number) r6.x).floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0214, code lost:
        if (r0.length() <= 0) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0216, code lost:
        r0.append(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        r8 = (double) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021e, code lost:
        if (0.0d > r8) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0224, code lost:
        if (r8 > 1.0d) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0226, code lost:
        r6 = new java.lang.StringBuilder();
        r7.getClass();
        r7 = r7.name();
        r7.getClass();
        r6.append(r7);
        r6.append(";q=");
        r6.append(((double) defpackage.dh4.C(100.0f * r6)) / 100.0d);
        r0.append(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0253, code lost:
        defpackage.h.s("Check failed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0259, code lost:
        r13 = r0.toString();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        ? r4 = 0;
        switch (this.w) {
            case b85.b:
                return wd2.a(obj);
            case 1:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
                return km6.x;
            case 2:
                mk6.f((ok6) obj, 0);
                return vs7.a;
            case 3:
                ku7 ku7 = (ku7) obj;
                ku7.getClass();
                ku7.a = n51.a;
                return vs7.a;
            case 4:
                en2 en2 = (en2) obj;
                en2.getClass();
                return en2.a;
            case 5:
                ((String) obj).getClass();
                return vs7.a;
            case 6:
                tm2 tm2 = (tm2) obj;
                tm2.getClass();
                return tm2.a;
            case 7:
                synchronized (nx6.c) {
                    List list = nx6.i;
                    int size = list.size();
                    while (r4 < size) {
                        ((vr2) list.get(r4)).y(obj);
                        r4++;
                    }
                }
                return vs7.a;
            case 8:
                pp4 pp4 = (pp4) obj;
                in5 in5 = kz2.c;
                Map a = pp4.a();
                LinkedHashMap linkedHashMap = pp4.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            in5 in52 = (in5) entry.getKey();
                            String b = kz2.b(System.currentTimeMillis());
                            if (((Set) entry.getValue()).contains(b)) {
                                Object[] objArr = {b};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    pp4.c(in52, Collections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    kj6.o("duplicate element: ", obj2);
                                }
                            } else {
                                in52.getClass();
                                pp4.b();
                                linkedHashMap.remove(in52);
                            }
                        }
                    } else if (j == 0) {
                        in5.getClass();
                        pp4.b();
                        linkedHashMap.remove(in5);
                    } else {
                        pp4.c(in5, Long.valueOf(j));
                    }
                }
                return null;
            case 9:
                xu4 xu4 = (xu4) obj;
                xu4.getClass();
                xu4.b = true;
                return vs7.a;
            case 10:
                xu4 xu42 = (xu4) obj;
                xu42.getClass();
                xu42.b = true;
                return vs7.a;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                xu4 xu43 = (xu4) obj;
                xu43.getClass();
                xu43.b = true;
                return vs7.a;
            case 12:
                vr0 vr0 = (vr0) obj;
                vr0.getClass();
                y33 y33 = (y33) vr0.b;
                List O0 = dt0.O0(y33.a);
                List O02 = dt0.O0(y33.b);
                vr0.a(me6.L, new b43(y33.c, (f61) null, 0));
                vr0.a(xb4.Z, new yi2((Object) O0, (f61) null, 4));
                vr0.a(kw5.J, new c43(O02, (f61) null, 0));
                vr0.a(td0.K, new c43(O02, (f61) null, 1));
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                j43 j43 = (j43) obj;
                j43.getClass();
                cc4 cc4 = fo1.a;
                j43.z.f(s53.m, new do1(3, (f61) null, 0));
                s53 s53 = j43.A;
                zk2 zk2 = s53.p;
                s53.f(zk2, new eo1(j43, (f61) null));
                s53.f(zk2, new do1(3, (f61) null, 1));
                return vs7.a;
            case 14:
                ((e45) obj).getClass();
                return vs7.a;
            case h75.g:
                obj.getClass();
                return vs7.a;
            case 16:
                vr0 vr02 = (vr0) obj;
                vr02.getClass();
                m53 m53 = (m53) vr02.b;
                LinkedHashMap linkedHashMap2 = m53.b;
                List U0 = dt0.U0(sf4.Z(linkedHashMap2), new a91(18));
                Charset charset = m53.c;
                LinkedHashSet linkedHashSet = m53.a;
                ArrayList arrayList = new ArrayList();
                for (Object next : linkedHashSet) {
                    if (!linkedHashMap2.containsKey((Charset) next)) {
                        arrayList.add(next);
                    }
                }
                List U02 = dt0.U0(arrayList, new a91(17));
                if (!linkedHashSet.isEmpty()) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!sg3.e((Charset) it2.next(), mo0.a)) {
                                break;
                            }
                        }
                    }
                }
                Iterable keySet = linkedHashMap2.keySet();
                if (!(keySet instanceof Collection) || !((Collection) keySet).isEmpty()) {
                    Iterator it3 = keySet.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!sg3.e((Charset) it3.next(), mo0.a)) {
                                break;
                            }
                        }
                    }
                }
                String str = null;
                Charset charset2 = (Charset) dt0.y0(U02);
                if (charset2 == null) {
                    yb5 yb5 = (yb5) dt0.y0(U0);
                    if (yb5 != null) {
                        charset2 = (Charset) yb5.w;
                    } else {
                        charset2 = null;
                    }
                    if (charset2 == null) {
                        charset2 = mo0.a;
                    }
                }
                vr02.a(xb4.Y, new o53(str, charset2, (f61) null));
                vr02.a(g22.L, new p53(charset, (f61) null));
                return vs7.a;
            case 17:
                vr0 vr03 = (vr0) obj;
                vr03.getClass();
                ((t53) vr03.b).getClass();
                vr03.a(xb4.Z, new ea((Object) vr03, (f61) null, 4));
                return vs7.a;
            case 18:
                vr0 vr04 = (vr0) obj;
                vr04.getClass();
                vr04.a(td0.M, new yi2((Object) vr04, (f61) null, 5));
                return vs7.a;
            case 19:
                vr0 vr05 = (vr0) obj;
                vr05.getClass();
                y63 y63 = (y63) vr05.b;
                vr05.a(xb4.Z, new p43(y63.a, y63.b, y63.c, (f61) null));
                return vs7.a;
            case 20:
                dh5 dh5 = (dh5) obj;
                return vs7.a;
            case 21:
                if (((Character) obj).charValue() == '-') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 22:
                if (((Character) obj).charValue() == '-') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 23:
                char charValue = ((Character) obj).charValue();
                if (charValue == 'T' || charValue == 't') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 24:
                if (((Character) obj).charValue() == ':') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 25:
                if (((Character) obj).charValue() == ':') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 26:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    r4 = 1;
                }
                return Boolean.valueOf(r4);
            case 27:
                ((i04) obj).getClass();
                return new px2(rj1.g(i04.b));
            case 28:
                lk7 lk7 = (lk7) obj;
                lk7.getClass();
                return lk7.name();
            default:
                nq0 nq0 = (nq0) obj;
                nq0.getClass();
                nq0.b(nq0, "JsonPrimitive", new hm3(new q83(10)), 12);
                nq0.b(nq0, "JsonNull", new hm3(new q83(11)), 12);
                nq0.b(nq0, "JsonLiteral", new hm3(new q83(12)), 12);
                nq0.b(nq0, "JsonObject", new hm3(new q83(13)), 12);
                nq0.b(nq0, "JsonArray", new hm3(new q83(14)), 12);
                return vs7.a;
        }
    }

    public /* synthetic */ vd2(int i) {
        this.w = i;
    }
}
