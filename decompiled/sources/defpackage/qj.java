package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: qj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qj implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ qj(vr2 vr2, List list, se4 se4, Context context) {
        this.w = 14;
        this.z = vr2;
        this.x = list;
        this.y = se4;
        this.A = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r6v2, types: [int] */
    /* JADX WARNING: type inference failed for: r6v4, types: [int] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        long j;
        int i;
        long j2;
        md2 md2;
        Throwable th;
        Object obj3;
        int i2 = this.w;
        Object obj4 = null;
        ? r6 = 0;
        vs7 vs7 = vs7.a;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        Object obj8 = this.x;
        switch (i2) {
            case b85.b:
                uj ujVar = (uj) obj8;
                il ilVar = (il) obj7;
                vr2 vr2 = (vr2) obj6;
                d06 d06 = (d06) obj5;
                gl glVar = (gl) obj;
                i95.K(glVar, ujVar.c);
                ed5 ed5 = glVar.e;
                Object a = uj.a(ujVar, ed5.getValue());
                if (!sg3.e(a, ed5.getValue())) {
                    ujVar.c.x.setValue(a);
                    ilVar.x.setValue(a);
                    if (vr2 != null) {
                        vr2.y(ujVar);
                    }
                    glVar.a();
                    d06.w = true;
                } else if (vr2 != null) {
                    vr2.y(ujVar);
                }
                return vs7;
            case 1:
                String str5 = (String) obj7;
                ku7 ku7 = (ku7) obj5;
                y53 y53 = (y53) obj;
                y53.getClass();
                y53.d((i53) obj8);
                y53.d = new pc0(ku7, str5, (ju7) obj6);
                y53.b((fp7) null);
                q51 q51 = ku7.a;
                if (q51 == null) {
                    q51 q512 = q51.e;
                    q51 = tc2.a(str5);
                }
                b35.t(y53, "Content-Type", q51);
                b35.t(y53, "x-upsert", String.valueOf(false));
                for (vr2 y2 : ku7.b) {
                    y2.y(y53);
                }
                return vs7;
            case 2:
                u44 u44 = (u44) obj8;
                rf7 rf7 = (rf7) obj7;
                hf7 hf7 = (hf7) obj6;
                c93 c93 = (c93) obj5;
                kw1 kw1 = (kw1) obj;
                if (u44.b()) {
                    jz0 jz0 = u44.d;
                    j71 j71 = u44.v;
                    j71 j712 = u44.w;
                    ? obj9 = new Object();
                    h17 h17 = new h17(jz0, j71, obj9, 2);
                    ck5 ck5 = rf7.a;
                    ck5.g(hf7, c93, h17, j712);
                    vf7 vf7 = new vf7(rf7, ck5);
                    rf7.b.set(vf7);
                    obj9.w = vf7;
                    u44.e = vf7;
                }
                return new qh(1);
            case 3:
                Set set = (Set) obj8;
                kw1 kw12 = (kw1) obj;
                set.add(obj7);
                return new wk1(set, obj7, (Set) obj6, (aq4) obj5);
            case 4:
                ez4 ez4 = (ez4) obj8;
                String str6 = (String) obj7;
                String str7 = (String) obj6;
                np2 np2 = (np2) obj5;
                mo2 mo2 = (mo2) obj;
                Iterator it = mo2.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (sg3.e(((qm2) obj2).a, ez4.c)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                qm2 qm2 = (qm2) obj2;
                if (qm2 != null) {
                    str = qm2.b;
                } else {
                    str = null;
                }
                List<en2> list = mo2.a;
                ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                for (en2 en2 : list) {
                    if (sg3.e(en2.a, str6)) {
                        String str8 = ez4.c;
                        if (str == null) {
                            str3 = str8;
                        } else {
                            str3 = str;
                        }
                        en2 = en2.a(en2, new qm2(str8, str3), ez4.a, ez4.b, (String) null, (String) null, false, 0, 0, 0, 0, 16369);
                        if (ez4.e) {
                            if (str7 != null) {
                                str4 = ((lo2) np2.b).q(str7);
                            } else {
                                str4 = null;
                            }
                            if (str7 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = str7;
                            en2 = en2.a(en2, (qm2) null, (String) null, (String) null, str4, str2, z2, 0, 0, 0, 0, 16271);
                            arrayList.add(en2);
                            str7 = str2;
                        }
                    }
                    str2 = str7;
                    arrayList.add(en2);
                    str7 = str2;
                }
                boolean z3 = ez4.e;
                Map map = mo2.l;
                if (z3) {
                    map.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.remove(str6);
                    map = sf4.W(linkedHashMap);
                }
                return mo2.a(mo2, arrayList, (List) null, (String) null, (String) null, false, false, new hv2(25, (Object) Boolean.FALSE), (String) null, (List) null, false, (Boolean) null, map, false, false, 14270);
            case 5:
                CancellationSignal cancellationSignal = (CancellationSignal) obj8;
                mv2 mv2 = (mv2) obj7;
                Context context = mv2.c;
                Executor executor = (Executor) obj6;
                lb1 lb1 = (lb1) obj5;
                if5 if5 = (if5) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!ac1.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    sb1.a(mv2.g, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", if5.w);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!ac1.a(cancellationSignal)) {
                            executor.execute(new xb1(lb1, 7));
                        }
                    }
                }
                return vs7;
            case 6:
                c23 c23 = (c23) obj7;
                d37 d37 = c23.j;
                Context context2 = (Context) obj6;
                se4 se4 = (se4) obj5;
                int intValue = ((Integer) obj).intValue();
                if (!((o03) obj8).H) {
                    if (intValue == 0) {
                        ar7.H(u58.a(c23), (e81) null, (r81) null, new ju1(c23, (f61) null, 10), 3);
                    } else if (intValue == 1) {
                        c23.f(az7.CONSULTAR_BONO);
                    } else if (intValue == 2) {
                        c23.f(az7.CONSULTAR_SALDO_NACIONAL);
                    }
                } else if (!sg3.A(context2, "android.permission.CALL_PHONE")) {
                    se4.d0("android.permission.CALL_PHONE");
                } else if (intValue == 0) {
                    c23.h();
                } else if (intValue != 1) {
                    if (intValue == 2 && !((is7) d37.getValue()).b) {
                        ar7.H(u58.a(c23), (e81) null, (r81) null, new z13(d37, (f61) null, c23, 1), 3);
                    }
                } else if (!((is7) d37.getValue()).b) {
                    ar7.H(u58.a(c23), (e81) null, (r81) null, new z13(d37, (f61) null, c23, 0), 3);
                }
                return vs7;
            case 7:
                o81 o81 = (o81) obj8;
                is2 is2 = (is2) obj6;
                String str9 = (String) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((aq4) obj7).setValue(Boolean.FALSE);
                if (booleanValue) {
                    ar7.H(o81, (e81) null, (r81) null, new ep2(is2, str9, (f61) null, 2), 3);
                }
                return vs7;
            case 8:
                lb3 lb3 = (lb3) obj7;
                e06 e06 = (e06) obj6;
                o81 o812 = (o81) obj5;
                long longValue = ((Long) obj).longValue();
                a37 a37 = (a37) ((aq4) obj8).getValue();
                if (a37 != null) {
                    j = ((Number) a37.getValue()).longValue();
                } else {
                    j = longValue;
                }
                long j3 = lb3.c;
                eq4 eq4 = lb3.a;
                if (j3 == Long.MIN_VALUE || e06.w != i95.p(o812.k())) {
                    lb3.c = longValue;
                    Object[] objArr = eq4.w;
                    int i3 = eq4.y;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((jb3) objArr[i4]).B = true;
                    }
                    e06.w = i95.p(o812.k());
                }
                float f = e06.w;
                if (f == 0.0f) {
                    Object[] objArr2 = eq4.w;
                    int i5 = eq4.y;
                    while (r6 < i5) {
                        jb3 jb3 = (jb3) objArr2[r6];
                        jb3.y.setValue(jb3.z.c);
                        jb3.B = true;
                        r6++;
                    }
                } else {
                    long j4 = (long) (((float) (j - lb3.c)) / f);
                    Object[] objArr3 = eq4.w;
                    int i6 = eq4.y;
                    boolean z4 = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        jb3 jb32 = (jb3) objArr3[i7];
                        if (!jb32.A) {
                            jb32.D.b.setValue(Boolean.FALSE);
                            if (jb32.B) {
                                jb32.B = false;
                                jb32.C = j4;
                            }
                            long j5 = j4 - jb32.C;
                            jb32.y.setValue(jb32.z.f(j5));
                            jb32.A = jb32.z.e(j5);
                        }
                        if (!jb32.A) {
                            z4 = false;
                        }
                    }
                    lb3.d.setValue(Boolean.valueOf(!z4));
                }
                return vs7;
            case 9:
                List list2 = (List) obj8;
                f06 f06 = (f06) obj7;
                List list3 = (List) obj6;
                d04 d04 = (d04) obj5;
                tn5 tn5 = (tn5) obj;
                n67 n67 = tn5.e;
                if (n67 != null) {
                    i = n67.d();
                } else {
                    i = 0;
                }
                int i8 = 0;
                while (r6 < i) {
                    z75 z75 = d04.q;
                    n67 n672 = tn5.e;
                    long j6 = 0;
                    if (z75 == z75.w) {
                        if (n672 != null) {
                            j6 = n672.c(r6);
                        }
                        j2 = 4294967295L & j6;
                    } else {
                        if (n672 != null) {
                            j6 = n672.c(r6);
                        }
                        j2 = j6 >> 32;
                    }
                    i8 += (int) j2;
                    r6++;
                }
                if (list2 != null) {
                    list2.add(Integer.valueOf(i8));
                }
                if (f06.w != list3.size()) {
                    f06.w++;
                }
                return vs7;
            case 10:
                t24 t24 = (t24) obj8;
                kw1 kw13 = (kw1) obj;
                t24.c = new l90((g24) obj7, (p67) obj6, (un5) obj5);
                return new d9(10, t24);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                e06 e062 = (e06) obj8;
                en4 en4 = (en4) obj7;
                xh6 xh6 = (xh6) obj6;
                b9 b9Var = (b9) obj5;
                gl glVar2 = (gl) obj;
                float floatValue = ((Number) glVar2.e.getValue()).floatValue() - e062.w;
                if (!gr8.s(floatValue)) {
                    if (!gr8.s(floatValue - en4.e(xh6, floatValue))) {
                        glVar2.a();
                        return vs7;
                    }
                    e062.w += floatValue;
                }
                if (((Boolean) b9Var.y(Float.valueOf(e062.w))).booleanValue()) {
                    glVar2.a();
                }
                return vs7;
            case 12:
                zs4 zs4 = (zs4) obj;
                zs4.getClass();
                ((d06) obj5).w = true;
                ((ht4) obj8).a((qt4) obj7, (Bundle) obj6, zs4, a42.w);
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                md2 = (md2) obj6;
                e81 e81 = (e81) obj5;
                try {
                    ((f06) obj8).w = ((ed0) obj7).read((ByteBuffer) obj);
                    return vs7;
                } catch (Throwable th2) {
                    obj3 = new m66(th2);
                    break;
                }
            case 14:
                vr2 vr22 = (vr2) obj6;
                List list4 = (List) obj8;
                se4 se42 = (se4) obj7;
                Context context3 = (Context) obj5;
                if (!((Boolean) obj).booleanValue()) {
                    vr22.y(Boolean.FALSE);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : list4) {
                        if (!sg3.A(context3, (String) next)) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        vr22.y(Boolean.TRUE);
                    } else {
                        se42.d0(arrayList2.toArray(new String[0]));
                    }
                }
                return vs7;
            default:
                Context context4 = (Context) obj8;
                se4 se43 = (se4) obj7;
                aq4 aq4 = (aq4) obj6;
                aq4 aq42 = (aq4) obj5;
                if (!((Boolean) obj).booleanValue()) {
                    aq4.setValue(Boolean.FALSE);
                    aq42.setValue((Object) null);
                } else if (ag8.k(context4, "android.permission.ACCESS_COARSE_LOCATION") == 0 || ag8.k(context4, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    aq42.setValue(q17.m(context4));
                    if (((yb5) aq42.getValue()) != null) {
                        r6 = 1;
                    }
                    aq4.setValue(Boolean.valueOf(r6));
                } else {
                    se43.d0("android.permission.ACCESS_COARSE_LOCATION");
                }
                return vs7;
        }
        if (!(obj3 instanceof m66)) {
            obj4 = obj3;
        }
        Throwable th3 = (CancellationException) obj4;
        if (th3 != null) {
            th = th3;
        }
        if (th instanceof SocketTimeoutException) {
            th = a73.a(md2, (IOException) th);
        }
        throw th;
    }

    public /* synthetic */ qj(i53 i53, am6 am6, String str, ju7 ju7, ku7 ku7) {
        this.w = 1;
        this.x = i53;
        this.y = str;
        this.z = ju7;
        this.A = ku7;
    }

    public /* synthetic */ qj(d06 d06, ht4 ht4, qt4 qt4, Bundle bundle) {
        this.w = 12;
        this.A = d06;
        this.x = ht4;
        this.y = qt4;
        this.z = bundle;
    }

    public /* synthetic */ qj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public /* synthetic */ qj(ArrayList arrayList, f06 f06, List list, int i, d04 d04) {
        this.w = 9;
        this.x = arrayList;
        this.y = f06;
        this.z = list;
        this.A = d04;
    }
}
