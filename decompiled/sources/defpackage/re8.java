package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* renamed from: re8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re8 {
    public final be8 a;
    public final Context b;
    public final String c;
    public final qd8 d;
    public final f01 e;
    public final z53 f;
    public final lp5 g;
    public final WorkDatabase h;
    public final fe8 i;
    public final cq1 j;
    public final ArrayList k;
    public final String l;
    public final fl3 m = r16.l();

    public re8(md2 md2) {
        be8 be8 = (be8) md2.f;
        this.a = be8;
        this.b = (Context) md2.h;
        String str = be8.a;
        this.c = str;
        this.d = (qd8) md2.c;
        f01 f01 = (f01) md2.b;
        this.e = f01;
        this.f = f01.d;
        this.g = (lp5) md2.d;
        WorkDatabase workDatabase = (WorkDatabase) md2.e;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) md2.g;
        this.k = arrayList;
        this.l = f21.l(b81.q("Work [ id=", str, ", tags={ "), dt0.E0(arrayList, ",", (String) null, (String) null, (vr2) null, 62), " } ]");
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023b, code lost:
        if (r0 == r1) goto L_0x023d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    public static final Object a(re8 re8, h61 h61) {
        qe8 qe8;
        int i2;
        String str;
        String str2;
        Object me8;
        String str3;
        boolean z;
        ce1 ce1;
        OverwritingInputMerger overwritingInputMerger;
        int i3;
        re8 re82 = re8;
        h61 h612 = h61;
        String str4 = re82.l;
        String str5 = re82.c;
        qd8 qd8 = re82.d;
        WorkDatabase workDatabase = re82.h;
        f01 f01 = re82.e;
        td0 td0 = f01.m;
        be8 be8 = re82.a;
        if (h612 instanceof qe8) {
            qe8 = (qe8) h612;
            int i4 = qe8.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qe8.B = i4 - Integer.MIN_VALUE;
                Object obj = qe8.z;
                i2 = qe8.B;
                if (i2 != 0) {
                    o85.q(obj);
                    td0 td02 = f01.e;
                    td0.getClass();
                    boolean p = f55.p();
                    String str6 = be8.x;
                    String str7 = be8.c;
                    String str8 = be8.d;
                    if (p && str6 != null) {
                        int hashCode = be8.hashCode();
                        if (Build.VERSION.SDK_INT >= 29) {
                            tk7.a(hashCode, f55.v(str6));
                        } else {
                            String v = f55.v(str6);
                            try {
                                if (f55.f == null) {
                                    i3 = hashCode;
                                    z = p;
                                    try {
                                        str3 = str6;
                                        str2 = str4;
                                        try {
                                            f55.f = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                                        } catch (Exception e2) {
                                            e = e2;
                                            f55.o("asyncTraceBegin", e);
                                            if (((Boolean) workDatabase.o(new hx4(12, new ke8(re82, 0)))).booleanValue()) {
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str2 = str4;
                                        str3 = str6;
                                        f55.o("asyncTraceBegin", e);
                                        if (((Boolean) workDatabase.o(new hx4(12, new ke8(re82, 0)))).booleanValue()) {
                                        }
                                    }
                                } else {
                                    i3 = hashCode;
                                    z = p;
                                    str2 = str4;
                                    str3 = str6;
                                }
                                f55.f.invoke((Object) null, new Object[]{Long.valueOf(f55.d), v, Integer.valueOf(i3)});
                            } catch (Exception e4) {
                                e = e4;
                                z = p;
                                str2 = str4;
                                str3 = str6;
                                f55.o("asyncTraceBegin", e);
                                if (((Boolean) workDatabase.o(new hx4(12, new ke8(re82, 0)))).booleanValue()) {
                                }
                            }
                            if (((Boolean) workDatabase.o(new hx4(12, new ke8(re82, 0)))).booleanValue()) {
                                return new ne8();
                            }
                            if (be8.c()) {
                                ce1 = be8.e;
                            } else {
                                f01.f.getClass();
                                str8.getClass();
                                String str9 = pc3.a;
                                try {
                                    try {
                                        Object newInstance = Class.forName(str8).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                                        newInstance.getClass();
                                        overwritingInputMerger = (OverwritingInputMerger) newInstance;
                                    } catch (Exception e5) {
                                        e = e5;
                                        bc4.k().i(pc3.a, "Trouble instantiating ".concat(str8), e);
                                        overwritingInputMerger = null;
                                        if (overwritingInputMerger == null) {
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    bc4.k().i(pc3.a, "Trouble instantiating ".concat(str8), e);
                                    overwritingInputMerger = null;
                                    if (overwritingInputMerger == null) {
                                    }
                                }
                                if (overwritingInputMerger == null) {
                                    bc4.k().h(se8.a, "Could not create Input Merger ".concat(str8));
                                    return new le8();
                                }
                                List D = sg3.D(be8.e);
                                fe8 fe8 = re82.i;
                                fe8.getClass();
                                str5.getClass();
                                ArrayList M0 = dt0.M0(D, (List) sg3.O(fe8.a, true, false, new sd8(str5, 8)));
                                be1 be1 = new be1(0);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator it = M0.iterator();
                                while (it.hasNext()) {
                                    Map unmodifiableMap = Collections.unmodifiableMap(((ce1) it.next()).a);
                                    unmodifiableMap.getClass();
                                    linkedHashMap.putAll(unmodifiableMap);
                                }
                                be1.a(linkedHashMap);
                                ce1 = new ce1(be1.a);
                                r16.g0(ce1);
                            }
                            UUID fromString = UUID.fromString(str5);
                            ArrayList arrayList = re82.k;
                            int i5 = be8.k;
                            ExecutorService executorService = f01.a;
                            dn1 dn1 = f01.b;
                            hd8 hd8 = new hd8(workDatabase, re82.g, qd8);
                            ? obj2 = new Object();
                            obj2.a = fromString;
                            obj2.b = ce1;
                            new HashSet(arrayList);
                            obj2.c = i5;
                            obj2.d = executorService;
                            obj2.e = dn1;
                            obj2.f = qd8;
                            obj2.g = td02;
                            obj2.h = hd8;
                            try {
                                t84 s = td02.s(re82.b, str7, obj2);
                                s.d = true;
                                e81 e81 = qe8.x;
                                e81.getClass();
                                c81 a0 = e81.a0(me6.E);
                                a0.getClass();
                                el3 el3 = (el3) a0;
                                re8 re83 = re82;
                                t84 t84 = s;
                                ci ciVar = new ci(t84, z, str3, re83, 1);
                                t84 t842 = t84;
                                re8 re84 = re83;
                                el3.v(ciVar);
                                Object o = workDatabase.o(new hx4(12, new ke8(re84, 1)));
                                o.getClass();
                                if (!((Boolean) o).booleanValue()) {
                                    return new ne8();
                                }
                                if (el3.isCancelled()) {
                                    return new ne8();
                                }
                                iy2 iy2 = qd8.d;
                                iy2.getClass();
                                h81 l2 = we.l(iy2);
                                try {
                                    pd7 pd7 = new pd7(re84, t842, hd8, (f61) null, 10);
                                    qe8.B = 1;
                                    obj = ar7.e0(l2, pd7, qe8);
                                    me8 = p81.w;
                                } catch (CancellationException e7) {
                                    e = e7;
                                    str = str2;
                                } catch (Throwable th) {
                                    th = th;
                                    String str10 = se8.a;
                                    bc4 k2 = bc4.k();
                                    k2.i(str10, str2 + " failed because it threw an exception/error", th);
                                    return new le8();
                                }
                            } catch (Throwable unused) {
                                String str11 = se8.a;
                                bc4 k3 = bc4.k();
                                k3.h(str11, "Could not create Worker " + str7);
                                return new le8();
                            }
                        }
                    }
                    z = p;
                    str2 = str4;
                    str3 = str6;
                    if (((Boolean) workDatabase.o(new hx4(12, new ke8(re82, 0)))).booleanValue()) {
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                        str2 = str4;
                        s84 s84 = (s84) obj;
                        s84.getClass();
                        me8 = new me8(s84);
                    } catch (CancellationException e8) {
                        e = e8;
                        str = str4;
                        String str12 = se8.a;
                        bc4 k4 = bc4.k();
                        String n = b81.n(str, " was cancelled");
                        if (k4.x <= 4) {
                            Log.i(str12, n, e);
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str4;
                        String str102 = se8.a;
                        bc4 k22 = bc4.k();
                        k22.i(str102, str2 + " failed because it threw an exception/error", th);
                        return new le8();
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return me8;
            }
        }
        qe8 = new qe8(re82, h612);
        Object obj3 = qe8.z;
        i2 = qe8.B;
        if (i2 != 0) {
        }
        return me8;
    }

    public final void b(int i2) {
        fe8 fe8 = this.i;
        kd8 kd8 = kd8.w;
        String str = this.c;
        fe8.j(kd8, str);
        this.f.getClass();
        fe8.i(System.currentTimeMillis(), str);
        fe8.h(this.a.v, str);
        fe8.g(-1, str);
        fe8.k(i2, str);
    }

    public final void c() {
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fe8 fe8 = this.i;
        String str = this.c;
        fe8.i(currentTimeMillis, str);
        fe8.j(kd8.w, str);
        a96 a96 = fe8.a;
        ((Number) sg3.O(a96, false, true, new sd8(str, 6))).intValue();
        fe8.h(this.a.v, str);
        sg3.O(a96, false, true, new sd8(str, 7));
        fe8.g(-1, str);
    }

    public final void d(s84 s84) {
        s84.getClass();
        String str = this.c;
        ArrayList I = sg3.I(str);
        while (true) {
            boolean isEmpty = I.isEmpty();
            fe8 fe8 = this.i;
            if (!isEmpty) {
                String str2 = (String) it0.k0(I);
                if (fe8.d(str2) != kd8.B) {
                    fe8.j(kd8.z, str2);
                }
                I.addAll(this.j.a(str2));
            } else {
                ce1 ce1 = ((p84) s84).a;
                ce1.getClass();
                fe8.h(this.a.v, str);
                sg3.O(fe8.a, false, true, new k77(23, (Object) ce1, (Object) str));
                return;
            }
        }
    }
}
