package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: m22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m22 implements vi0 {
    public static final long[] A = new long[0];
    public long w;
    public Object x;
    public Object y;
    public final Object z;

    public m22(ll6 ll6, yv yvVar) {
        ll6.getClass();
        this.x = ll6;
        this.y = yvVar;
        int e = ll6.e();
        long j = 0;
        if (e <= 64) {
            this.w = e != 64 ? -1 << e : j;
            this.z = A;
            return;
        }
        this.w = 0;
        int i = (e - 1) >>> 6;
        long[] jArr = new long[i];
        if ((e & 63) != 0) {
            jArr[i - 1] = -1 << e;
        }
        this.z = jArr;
    }

    public void M(zh0 zh0, IOException iOException) {
        sy4 sy4 = (sy4) this.y;
        kd6 kd6 = ((dx5) zh0).x;
        if (kd6 != null) {
            g73 g73 = (g73) kd6.x;
            if (g73 != null) {
                sy4.j(g73.i().toString());
            }
            String str = (String) kd6.y;
            if (str != null) {
                sy4.c(str);
            }
        }
        sy4.f(this.w);
        f21.t((ui7) this.z, sy4, sy4);
        ((vi0) this.x).M(zh0, iOException);
    }

    public int a(ex5 ex5, long j) {
        TimeZone timeZone = fg8.a;
        ArrayList arrayList = ex5.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                ej5 ej5 = ej5.a;
                ej5.a.j("A connection to " + ex5.c.a.h + " was leaked. Did you forget to close a response body?", ((bx5) reference).a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ex5.q = j - this.w;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: h19} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: android.util.Pair} */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
        if (r6 != null) goto L_0x0100;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    public h19 b(String str, h19 h19) {
        Serializable serializable;
        Object obj;
        Serializable serializable2;
        long j;
        Cursor cursor;
        h19 h192;
        Pair pair;
        Object obj2;
        Cursor cursor2;
        Pair pair2;
        String str2 = str;
        h19 h193 = h19;
        String y2 = h193.y();
        List v = h193.v();
        dl8 dl8 = (dl8) this.z;
        v89 v89 = dl8.x;
        v89 v892 = dl8.x;
        y19 y19 = (y19) dl8.w;
        v89.h0();
        n19 m1 = y89.m1("_eid", h193);
        if (m1 == null) {
            serializable = null;
        } else {
            serializable = y89.u1(m1);
        }
        Long l = (Long) serializable;
        if (l != null) {
            if (y2.equals("_ep")) {
                v89.h0();
                n19 m12 = y89.m1("_en", h193);
                if (m12 == null) {
                    serializable2 = null;
                } else {
                    serializable2 = y89.u1(m12);
                }
                String str3 = (String) serializable2;
                if (TextUtils.isEmpty(str3)) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.C.b("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (((h19) this.x) == null || ((Long) this.y) == null || l.longValue() != ((Long) this.y).longValue()) {
                    uq8 uq8 = v89.y;
                    v89.R(uq8);
                    y19 y192 = (y19) uq8.w;
                    uq8.b1();
                    uq8.d1();
                    try {
                        cursor2 = uq8.T1().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str2, l.toString()});
                        try {
                            if (!cursor2.moveToFirst()) {
                                pz8 pz82 = y192.B;
                                y19.g(pz82);
                                pz82.J.a("Main event not found");
                                cursor2.close();
                                pair2 = null;
                                h192 = null;
                            } else {
                                h192 = null;
                                try {
                                } catch (IOException e) {
                                    pz8 pz83 = y192.B;
                                    y19.g(pz83);
                                    j = 0;
                                    try {
                                        pz83.B.d("Failed to merge main event. appId, eventId", pz8.k1(str2), l, e);
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        try {
                                            pz8 pz84 = y192.B;
                                            y19.g(pz84);
                                            pz84.B.b("Error selecting main event", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    cursor2.close();
                                    pair = h192;
                                    if (pair == 0 || (obj2 = pair.first) == null) {
                                    }
                                }
                                try {
                                    Pair create = Pair.create((h19) ((f19) y89.N1(h19.J(), cursor2.getBlob(0))).d(), Long.valueOf(cursor2.getLong(1)));
                                    cursor2.close();
                                    pair2 = create;
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    j = 0;
                                    pz8 pz842 = y192.B;
                                    y19.g(pz842);
                                    pz842.B.b("Error selecting main event", e);
                                }
                            }
                            j = 0;
                            pair = pair2;
                        } catch (SQLiteException e4) {
                            e = e4;
                            h192 = null;
                            j = 0;
                            pz8 pz8422 = y192.B;
                            y19.g(pz8422);
                            pz8422.B.b("Error selecting main event", e);
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        h192 = null;
                        j = 0;
                        cursor2 = null;
                        pz8 pz84222 = y192.B;
                        y19.g(pz84222);
                        pz84222.B.b("Error selecting main event", e);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (pair == 0 || (obj2 = pair.first) == null) {
                        Long l2 = l;
                        pz8 pz85 = y19.B;
                        y19.g(pz85);
                        pz85.C.c(str3, l2, "Extra parameter without existing main event. eventName, eventId");
                        return h192;
                    }
                    this.x = (h19) obj2;
                    this.w = ((Long) pair.second).longValue();
                    v892.h0();
                    this.y = (Long) y89.o1("_eid", (h19) this.x);
                } else {
                    j = 0;
                }
                long j2 = this.w - 1;
                this.w = j2;
                if (j2 <= j) {
                    uq8 uq82 = v892.y;
                    v89.R(uq82);
                    y19 y193 = (y19) uq82.w;
                    uq82.b1();
                    pz8 pz86 = y193.B;
                    y19.g(pz86);
                    pz86.J.b("Clearing complex main event info. appId", str2);
                    try {
                        uq82.T1().execSQL("delete from main_event_params where app_id=?", new String[]{str2});
                    } catch (SQLiteException e6) {
                        pz8 pz87 = y193.B;
                        y19.g(pz87);
                        pz87.B.b("Error clearing complex main event", e6);
                    }
                } else {
                    uq8 uq83 = v892.y;
                    v89.R(uq83);
                    uq83.u1(str2, l, this.w, (h19) this.x);
                }
                ArrayList arrayList = new ArrayList();
                for (n19 n19 : ((h19) this.x).v()) {
                    v892.h0();
                    if (y89.m1(n19.u(), h193) == null) {
                        arrayList.add(n19);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(v);
                    v = arrayList;
                } else {
                    pz8 pz88 = y19.B;
                    y19.g(pz88);
                    pz88.C.b("No unique parameters in main event. eventName", str3);
                }
                y2 = str3;
            } else {
                Long l3 = l;
                this.y = l3;
                this.x = h193;
                v89.h0();
                long j3 = 0L;
                n19 m13 = y89.m1("_epc", h193);
                if (m13 == null) {
                    obj = null;
                } else {
                    obj = y89.u1(m13);
                }
                if (obj != null) {
                    j3 = obj;
                }
                long longValue = ((Long) j3).longValue();
                this.w = longValue;
                if (longValue <= 0) {
                    pz8 pz89 = y19.B;
                    y19.g(pz89);
                    pz89.C.b("Complex event with zero extra param count. eventName", y2);
                } else {
                    uq8 uq84 = v89.y;
                    v89.R(uq84);
                    uq84.u1(str, l3, this.w, h193);
                }
            }
        }
        f19 f19 = (f19) h19.k();
        f19.n(y2);
        f19.b();
        ((h19) f19.x).N();
        f19.b();
        ((h19) f19.x).M(v);
        return (h19) f19.d();
    }

    public void z(zh0 zh0, a66 a66) {
        a66 a662 = a66;
        FirebasePerfOkHttpClient.a(a662, (sy4) this.y, this.w, ((ui7) this.z).b());
        ((vi0) this.x).z(zh0, a662);
    }

    public /* synthetic */ m22(dl8 dl8) {
        this.z = dl8;
    }

    public m22(bc7 bc7) {
        bc7.getClass();
        TimeUnit.MINUTES.getClass();
        this.w = 300000000000L;
        this.x = bc7.d();
        this.y = new fx5(this, f21.l(new StringBuilder(), fg8.b, " ConnectionPool connection closer"));
        this.z = new ConcurrentLinkedQueue();
    }

    public m22(vi0 vi0, hn7 hn7, ui7 ui7, long j) {
        this.x = vi0;
        this.y = new sy4(hn7);
        this.w = j;
        this.z = ui7;
    }
}
