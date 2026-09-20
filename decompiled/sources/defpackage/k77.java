package defpackage;

import android.view.View;
import coil.request.NullRequestDataException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k77 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ k77(Thread thread, o81 o81) {
        this.w = 14;
        this.y = thread;
        this.x = o81;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: yy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: yy6} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v5, types: [pq6] */
    /* JADX WARNING: type inference failed for: r0v69, types: [java.util.Map, js, zt6] */
    /* JADX WARNING: type inference failed for: r15v7, types: [java.util.Map, js, zt6] */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03e4  */
    public final Object y(Object obj) {
        yy6 yy6;
        yy6 yy62;
        yy6 yy63;
        gg7 a;
        gg7 a2;
        gg7 a3;
        vl vlVar;
        eh ehVar;
        bg7 bg7;
        ag7 ag7;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.w;
        float f = 0.0f;
        int i2 = 16;
        int i3 = 4;
        int i4 = 0;
        yy6 yy64 = 0;
        boolean z5 = true;
        vs7 vs7 = vs7.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                j77 j77 = (j77) obj;
                j77.getClass();
                return ((q77) obj3).e(j77, obj2);
            case 1:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ((ja7) obj3).b.v(ua6, (ga7) obj2);
                return vs7;
            case 2:
                aq4 aq4 = (aq4) obj2;
                wu6 wu6 = (wu6) obj;
                float floatValue = ((Number) ((sr2) obj3).b()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (wu6.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (wu6.a & 4294967295L)) * floatValue;
                if (!(Float.intBitsToFloat((int) (((wu6) aq4.getValue()).a >> 32)) == intBitsToFloat && Float.intBitsToFloat((int) (((wu6) aq4.getValue()).a & 4294967295L)) == intBitsToFloat2)) {
                    aq4.setValue(new wu6((((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32)));
                }
                return vs7;
            case 3:
                kw1 kw1 = (kw1) obj;
                return new m30(7, (aq4) obj3, (ap4) obj2);
            case 4:
                sr2 sr2 = (sr2) obj2;
                md7 md7 = (md7) obj;
                ((sr2) obj3).b();
                if (sr2 != null) {
                    z5 = ((Boolean) sr2.b()).booleanValue();
                }
                if (z5) {
                    md7.close();
                }
                return vs7;
            case 5:
                ul ulVar = (ul) obj3;
                bd5 bd5 = ((c74) obj2).b;
                oc7 oc7 = (oc7) obj;
                b74 b74 = (b74) ulVar.a;
                gg7 a4 = b74.a();
                if (a4 != null) {
                    yy6 = a4.a;
                } else {
                    yy6 = null;
                }
                if ((bd5.d() & 1) == 0 || (a3 = b74.a()) == null) {
                    yy62 = null;
                } else {
                    yy62 = a3.b;
                }
                if (yy6 != null) {
                    yy62 = yy6.c(yy62);
                }
                if ((2 & bd5.d()) == 0 || (a2 = b74.a()) == null) {
                    yy63 = null;
                } else {
                    yy63 = a2.c;
                }
                if (yy62 != null) {
                    yy63 = yy62.c(yy63);
                }
                if (!((bd5.d() & 4) == 0 || (a = b74.a()) == null)) {
                    yy64 = a.d;
                }
                if (yy63 != null) {
                    yy64 = yy63.c(yy64);
                }
                oc7.b = oc7.a.b(new h17(new Object(), ulVar, yy64, 1));
                return vs7;
            case 6:
                fg7 fg7 = (fg7) obj3;
                ul ulVar2 = (ul) obj2;
                l76 l76 = (l76) obj;
                vl vlVar2 = fg7.b;
                ed5 ed5 = fg7.a;
                bg7 bg72 = (bg7) ed5.getValue();
                if (bg72 == null || (ag7 = bg72.a) == null) {
                    vlVar = null;
                } else {
                    vlVar = ag7.a;
                }
                if (sg3.e(vlVar2, vlVar) && (bg7 = (bg7) ed5.getValue()) != null) {
                    pn4 pn4 = bg7.b;
                    ul c = fg7.c(ulVar2, bg7);
                    if (c != null) {
                        int i5 = c.c;
                        int i6 = c.b;
                        ehVar = bg7.i(i6, i5);
                        ly5 b = bg7.b(i6);
                        int i7 = i5 - 1;
                        ly5 b2 = bg7.b(i7);
                        if (pn4.d(i6) == pn4.d(i7)) {
                            f = Math.min(b2.a, b.a);
                        }
                        ehVar.i(((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(b.b)) & 4294967295L)) ^ -9223372034707292160L);
                        if (ehVar != null) {
                            yy64 = new eg7(ehVar);
                        }
                        if (yy64 != 0) {
                            l76.r(yy64);
                            l76.f(true);
                        }
                        return vs7;
                    }
                }
                ehVar = null;
                if (ehVar != null) {
                }
                if (yy64 != 0) {
                }
                return vs7;
            case 7:
                List list = (List) obj3;
                List list2 = (List) obj2;
                dh5 dh5 = (dh5) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        yb5 yb5 = (yb5) list.get(i8);
                        dh5.j(dh5, (eh5) yb5.w, ((oe3) yb5.x).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        yb5 yb52 = (yb5) list2.get(i9);
                        eh5 eh5 = (eh5) yb52.w;
                        sr2 sr22 = (sr2) yb52.x;
                        if (sr22 != null) {
                            j = ((oe3) sr22.b()).a;
                        } else {
                            j = 0;
                        }
                        dh5.j(dh5, eh5, j);
                    }
                }
                return vs7;
            case 8:
                ua6 ua62 = (ua6) obj;
                ua62.getClass();
                ((ml7) obj3).b.v(ua62, (nl7) obj2);
                return vs7;
            case 9:
                kw1 kw12 = (kw1) obj;
                ar7.H((o81) obj3, (e81) null, r81.z, new xt4((mm7) obj2, (f61) null), 1);
                return new qh(3);
            case 10:
                mm7 mm7 = (mm7) obj3;
                im7 im7 = (im7) obj2;
                kw1 kw13 = (kw1) obj;
                mm7.j.add(im7);
                return new m30(11, mm7, im7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                in8 in8 = (in8) obj3;
                kw1 kw14 = (kw1) obj;
                ((oi6) in8).o1(new cy6(new k77(Thread.currentThread(), (o81) obj2)));
                return new d9(12, in8);
            case 12:
                mm7 mm72 = (mm7) obj3;
                mm7 mm73 = (mm7) obj2;
                kw1 kw15 = (kw1) obj;
                mm72.k.add(mm73);
                return new m30(9, mm72, mm73);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                kw1 kw16 = (kw1) obj;
                return new m30(10, (mm7) obj3, (bm7) obj2);
            case 14:
                o81 o81 = (o81) obj3;
                sr2 sr23 = (sr2) obj;
                if (obj2 == Thread.currentThread()) {
                    sr23.b();
                } else {
                    ar7.H(o81, (e81) null, (r81) null, new f70(sr23, (f61) null, 16), 3);
                }
                return vs7;
            case h75.g:
                fu7 fu7 = (fu7) obj3;
                ((Long) obj).getClass();
                float f2 = fu7.e;
                fu7.e = 0.0f;
                ((vr2) obj2).y(Float.valueOf(f2));
                return vs7;
            case 16:
                ua6 ua63 = (ua6) obj;
                ua63.getClass();
                ((xy7) obj3).b.a0(ua63, (ArrayList) obj2);
                return vs7;
            case 17:
                ua6 ua64 = (ua6) obj;
                ua64.getClass();
                ((oz7) obj3).b.a0(ua64, (ArrayList) obj2);
                return vs7;
            case 18:
                vb5 vb5 = (vb5) obj3;
                vb5 vb52 = (vb5) obj2;
                mt mtVar = (mt) obj;
                if (mtVar instanceof kt) {
                    if (vb5 != null) {
                        return new kt(vb5);
                    }
                    return (kt) mtVar;
                } else if (!(mtVar instanceof jt)) {
                    return mtVar;
                } else {
                    jt jtVar = (jt) mtVar;
                    s62 s62 = jtVar.b;
                    if (!(s62.c instanceof NullRequestDataException) || vb52 == null) {
                        return jtVar;
                    }
                    return new jt(vb52, s62);
                }
            case 19:
                ib8 ib8 = (ib8) obj3;
                View view = (View) obj2;
                kw1 kw17 = (kw1) obj;
                ib8.a(view);
                return new m30(12, ib8, view);
            case 20:
                ua6 ua65 = (ua6) obj;
                ua65.getClass();
                ((td8) obj3).b.v(ua65, (rd8) obj2);
                return vs7;
            case 21:
                kd8 kd8 = (kd8) obj3;
                String str = (String) obj2;
                ua6 ua66 = (ua6) obj;
                ua66.getClass();
                ab6 k0 = ua66.k0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    k0.f((long) i95.I(kd8), 1);
                    k0.F(2, str);
                    k0.i0();
                    int k = o55.k(ua66);
                    k0.close();
                    return Integer.valueOf(k);
                } catch (Throwable th) {
                    k0.close();
                    throw th;
                }
            case 22:
                String str2 = (String) obj3;
                fe8 fe8 = (fe8) obj2;
                ua6 ua67 = (ua6) obj;
                ua67.getClass();
                ab6 k02 = ua67.k0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    k02.F(1, str2);
                    ? zt6 = new zt6(0);
                    ? zt62 = new zt6(0);
                    while (k02.i0()) {
                        String R = k02.R(0);
                        if (!zt6.containsKey(R)) {
                            zt6.put(R, new ArrayList());
                        }
                        String R2 = k02.R(0);
                        if (!zt62.containsKey(R2)) {
                            zt62.put(R2, new ArrayList());
                        }
                    }
                    k02.reset();
                    fe8.b(ua67, zt6);
                    fe8.a(ua67, zt62);
                    ArrayList arrayList = new ArrayList();
                    while (k02.i0()) {
                        String R3 = k02.R(i4);
                        kd8 v = i95.v((int) k02.getLong(1));
                        byte[] blob = k02.getBlob(2);
                        ce1 ce1 = ce1.b;
                        ce1 D = r16.D(blob);
                        int i10 = (int) k02.getLong(3);
                        long j2 = k02.getLong(14);
                        long j3 = k02.getLong(15);
                        long j4 = k02.getLong(i2);
                        int i11 = i3;
                        int i12 = (int) k02.getLong(i3);
                        d40 s = i95.s((int) k02.getLong(17));
                        long j5 = k02.getLong(18);
                        long j6 = k02.getLong(19);
                        int i13 = (int) k02.getLong(20);
                        long j7 = k02.getLong(21);
                        int i14 = (int) k02.getLong(22);
                        yy4 t = i95.t((int) k02.getLong(5));
                        ny4 J = i95.J(k02.getBlob(6));
                        if (((int) k02.getLong(7)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((int) k02.getLong(8)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((int) k02.getLong(9)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((int) k02.getLong(10)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j31 j31 = new j31(J, t, z, z2, z3, z4, k02.getLong(11), k02.getLong(12), i95.i(k02.getBlob(13)));
                        Object U = sf4.U(k02.R(0), zt6);
                        U.getClass();
                        Object U2 = sf4.U(k02.R(0), zt62);
                        U2.getClass();
                        arrayList.add(new ae8(R3, v, D, j2, j3, j4, j31, i10, s, j5, j6, i13, i12, j7, i14, (List) U, (List) U2));
                        i4 = 0;
                        i3 = i11;
                        i2 = 16;
                    }
                    k02.close();
                    return arrayList;
                } catch (Throwable th2) {
                    k02.close();
                    throw th2;
                }
            case 23:
                ce1 ce12 = (ce1) obj3;
                String str3 = (String) obj2;
                ua6 ua68 = (ua6) obj;
                ua68.getClass();
                ab6 k03 = ua68.k0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    ce1 ce13 = ce1.b;
                    k03.h(1, r16.g0(ce12));
                    k03.F(2, str3);
                    k03.i0();
                    return vs7;
                } finally {
                    k03.close();
                }
            default:
                ua6 ua69 = (ua6) obj;
                ua69.getClass();
                ((he8) obj3).b.v(ua69, (ge8) obj2);
                return vs7;
        }
    }

    public /* synthetic */ k77(fg7 fg7, ul ulVar, c74 c74) {
        this.w = 5;
        this.x = ulVar;
        this.y = c74;
    }

    public /* synthetic */ k77(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
