package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: j19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j19 extends g89 implements rp8 {
    public final js A = new zt6(0);
    public final js B = new zt6(0);
    public final js C = new zt6(0);
    public final js D = new zt6(0);
    public final js E = new zt6(0);
    public final js F = new zt6(0);
    public final t11 G = new t11(this);
    public final ay4 H = new ay4(19, this);
    public final js I = new zt6(0);
    public final js J = new zt6(0);
    public final js K = new zt6(0);
    public final js z = new zt6(0);

    /* JADX WARNING: type inference failed for: r2v1, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v2, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v3, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v4, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v5, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v6, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v7, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v8, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v9, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v10, types: [js, zt6] */
    public j19(v89 v89) {
        super(v89);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [js, zt6] */
    public static final js m1(bz8 bz8) {
        ? zt6 = new zt6(0);
        for (oz8 oz8 : bz8.x()) {
            zt6.put(oz8.t(), oz8.u());
        }
        return zt6;
    }

    public static final f39 n1(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return f39.AD_STORAGE;
        }
        if (i2 == 2) {
            return f39.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return f39.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return f39.AD_PERSONALIZATION;
    }

    public final String Y(String str, String str2) {
        b1();
        i1(str);
        Map map = (Map) this.z.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final c39 g1(String str, f39 f39) {
        b1();
        i1(str);
        ry8 y1 = y1(str);
        if (y1 != null) {
            Iterator it = y1.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yx8 yx8 = (yx8) it.next();
                if (n1(yx8.t()) == f39) {
                    int u = yx8.u() - 1;
                    if (u == 1) {
                        return c39.GRANTED;
                    }
                    if (u == 2) {
                        return c39.DENIED;
                    }
                }
            }
        }
        return c39.UNINITIALIZED;
    }

    public final boolean h1(String str) {
        b1();
        i1(str);
        ry8 y1 = y1(str);
        if (y1 == null) {
            return false;
        }
        for (yx8 yx8 : y1.t()) {
            if (yx8.t() == 3 && yx8.v() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void i1(String str) {
        d1();
        b1();
        z65.h(str);
        js jsVar = this.E;
        if (jsVar.get(str) == null) {
            uq8 uq8 = this.x.y;
            v89.R(uq8);
            fm8 k2 = uq8.k2(str);
            js jsVar2 = this.K;
            js jsVar3 = this.J;
            js jsVar4 = this.I;
            js jsVar5 = this.z;
            if (k2 == null) {
                jsVar5.put(str, (Object) null);
                this.B.put(str, (Object) null);
                this.A.put(str, (Object) null);
                this.C.put(str, (Object) null);
                this.D.put(str, (Object) null);
                jsVar.put(str, (Object) null);
                jsVar4.put(str, (Object) null);
                jsVar3.put(str, (Object) null);
                jsVar2.put(str, (Object) null);
                this.F.put(str, (Object) null);
                return;
            }
            yy8 yy8 = (yy8) l1(str, (byte[]) k2.x).k();
            j1(str, yy8);
            jsVar5.put(str, m1((bz8) yy8.d()));
            jsVar.put(str, (bz8) yy8.d());
            k1(str, (bz8) yy8.d());
            jsVar4.put(str, ((bz8) yy8.x).E());
            jsVar3.put(str, (String) k2.y);
            jsVar2.put(str, (String) k2.z);
        }
    }

    public final void j1(String str, yy8 yy8) {
        ArrayList arrayList;
        String str2 = str;
        yy8 yy82 = yy8;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        zt6 zt6 = new zt6(0);
        zt6 zt62 = new zt6(0);
        zt6 zt63 = new zt6(0);
        for (ty8 t : Collections.unmodifiableList(((bz8) yy82.x).D())) {
            hashSet.add(t.t());
        }
        y19 y19 = (y19) this.w;
        tp8 tp8 = y19.z;
        pz8 pz8 = y19.B;
        ay8 ay8 = by8.V0;
        if (tp8.n1((String) null, ay8)) {
            arrayList2.addAll(Collections.unmodifiableList(((bz8) yy82.x).J()));
        }
        while (i < ((bz8) yy82.x).y()) {
            wy8 wy8 = (wy8) ((bz8) yy82.x).z(i).k();
            if (wy8.g().isEmpty()) {
                y19.g(pz8);
                pz8.E.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String g = wy8.g();
                arrayList = arrayList2;
                String G2 = b35.G(wy8.g(), r16.T, r16.Y);
                if (!TextUtils.isEmpty(G2)) {
                    wy8.b();
                    ((xy8) wy8.x).A(G2);
                    yy82.b();
                    ((bz8) yy82.x).M(i, (xy8) wy8.d());
                }
                if (((xy8) wy8.x).u() && ((xy8) wy8.x).v()) {
                    zt6.put(g, Boolean.TRUE);
                }
                if (((xy8) wy8.x).w() && ((xy8) wy8.x).x()) {
                    zt62.put(wy8.g(), Boolean.TRUE);
                }
                if (((xy8) wy8.x).y()) {
                    if (((xy8) wy8.x).z() < 2 || ((xy8) wy8.x).z() > 65535) {
                        y19.g(pz8);
                        pz8.E.c(wy8.g(), Integer.valueOf(((xy8) wy8.x).z()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        zt63.put(wy8.g(), Integer.valueOf(((xy8) wy8.x).z()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.A.put(str2, hashSet);
        if (y19.z.n1((String) null, ay8)) {
            this.D.put(str2, arrayList3);
        }
        this.B.put(str2, zt6);
        this.C.put(str2, zt62);
        this.F.put(str2, zt63);
    }

    public final void k1(String str, bz8 bz8) {
        y19 y19 = (y19) this.w;
        int C2 = bz8.C();
        t11 t11 = this.G;
        if (C2 != 0) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.J.b("EES programs found", Integer.valueOf(bz8.C()));
            v29 v29 = (v29) bz8.B().get(0);
            try {
                gt8 gt8 = new gt8();
                no7 no7 = gt8.a;
                ((HashMap) ((ay4) no7.A).x).put("internal.remoteConfig", new c19(this, str, 2));
                ((HashMap) ((ay4) no7.A).x).put("internal.appMetadata", new c19(this, str, 0));
                ((HashMap) ((ay4) no7.A).x).put("internal.logger", new hl4(1, this));
                gt8.b(v29);
                t11.l(str, gt8);
                y19.g(pz8);
                mz8 mz8 = pz8.J;
                mz8.c(str, Integer.valueOf(v29.u().u()), "EES program loaded for appId, activities");
                for (q29 t : v29.u().t()) {
                    y19.g(pz8);
                    mz8.b("EES program activity", t.t());
                }
            } catch (zzd unused) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.b("Failed to load EES program. appId", str);
            }
        } else {
            t11.m(str);
        }
    }

    public final bz8 l1(String str, byte[] bArr) {
        Long l;
        y19 y19 = (y19) this.w;
        if (bArr == null) {
            return bz8.L();
        }
        try {
            bz8 bz8 = (bz8) ((yy8) y89.N1(bz8.K(), bArr)).d();
            pz8 pz8 = y19.B;
            y19.g(pz8);
            mz8 mz8 = pz8.J;
            String str2 = null;
            if (bz8.t()) {
                l = Long.valueOf(bz8.u());
            } else {
                l = null;
            }
            if (bz8.v()) {
                str2 = bz8.w();
            }
            mz8.c(l, str2, "Parsed config. version, gmp_app_id");
            return bz8;
        } catch (zzaeh e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.E.c(pz8.k1(str), e, "Unable to merge remote config. appId");
            return bz8.L();
        } catch (RuntimeException e2) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.E.c(pz8.k1(str), e2, "Unable to merge remote config. appId");
            return bz8.L();
        }
    }

    public final bz8 o1(String str) {
        d1();
        b1();
        z65.h(str);
        i1(str);
        return (bz8) this.E.get(str);
    }

    public final String p1(String str) {
        b1();
        i1(str);
        return (String) this.I.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0400, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0401, code lost:
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.v());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0413, code lost:
        if (r5.z() == false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0415, code lost:
        r0 = java.lang.Boolean.valueOf(r5.A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x041e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x041f, code lost:
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0431, code lost:
        if (r8.T1().insertWithOnConflict("property_filters", (java.lang.String) null, r7, 5) != -1) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0433, code lost:
        r0 = r13.B;
        defpackage.y19.g(r0);
        r0.B.b("Failed to insert property filter (got -1). appId", defpackage.pz8.k1(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0444, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0446, code lost:
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r1 = r13.B;
        defpackage.y19.g(r1);
        r1.B.c(defpackage.pz8.k1(r2), r0, "Error storing property filter. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0260, code lost:
        r6 = r0.v().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x026c, code lost:
        if (r6.hasNext() == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0278, code lost:
        if (((defpackage.wx8) r6.next()).t() != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x027a, code lost:
        r0 = r13.B;
        defpackage.y19.g(r0);
        r0.E.c(defpackage.pz8.k1(r2), java.lang.Integer.valueOf(r5), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0290, code lost:
        r6 = r0.y().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x029c, code lost:
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = "app_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02ac, code lost:
        if (r6.hasNext() == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r7 = (defpackage.ox8) r6.next();
        r8.d1();
        r8.b1();
        defpackage.z65.h(r2);
        defpackage.z65.k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02c8, code lost:
        if (r7.v().isEmpty() == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02ca, code lost:
        r0 = r13.B;
        defpackage.y19.g(r0);
        r0 = r0.E;
        r4 = defpackage.pz8.k1(r2);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02df, code lost:
        if (r7.t() == false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02e1, code lost:
        r21 = java.lang.Integer.valueOf(r7.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02ef, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02f1, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02fe, code lost:
        r25 = r3;
        r3 = r7.a();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r1, r2);
        r5.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0319, code lost:
        if (r7.t() == false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x031b, code lost:
        r0 = java.lang.Integer.valueOf(r7.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0324, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0325, code lost:
        r5.put("filter_id", r0);
        r5.put("event_name", r7.v());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0335, code lost:
        if (r7.D() == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0337, code lost:
        r0 = java.lang.Boolean.valueOf(r7.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0340, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0341, code lost:
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0353, code lost:
        if (r8.T1().insertWithOnConflict("event_filters", (java.lang.String) null, r5, 5) != -1) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0355, code lost:
        r0 = r13.B;
        defpackage.y19.g(r0);
        r0.B.b("Failed to insert event filter (got -1). appId", defpackage.pz8.k1(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0366, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0368, code lost:
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r1 = r13.B;
        defpackage.y19.g(r1);
        r1.B.c(defpackage.pz8.k1(r2), r0, "Error storing event filter. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0384, code lost:
        r25 = r3;
        r26 = r5;
        r3 = r23.v().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0394, code lost:
        if (r3.hasNext() == false) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0396, code lost:
        r5 = (defpackage.wx8) r3.next();
        r8.d1();
        r8.b1();
        defpackage.z65.h(r2);
        defpackage.z65.k(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03b0, code lost:
        if (r5.v().isEmpty() == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03b2, code lost:
        r0 = r13.B;
        defpackage.y19.g(r0);
        r0 = r0.E;
        r3 = defpackage.pz8.k1(r2);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03c7, code lost:
        if (r5.t() == false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03c9, code lost:
        r5 = java.lang.Integer.valueOf(r5.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03d2, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03d3, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03dc, code lost:
        r6 = r5.a();
        r7 = new android.content.ContentValues();
        r7.put(r1, r2);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03f5, code lost:
        if (r5.t() == false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03f7, code lost:
        r1 = java.lang.Integer.valueOf(r5.u());
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x05e4 A[Catch:{ SQLiteException -> 0x05f5 }] */
    public final void q1(String str, byte[] bArr, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase;
        yy8 yy8;
        byte[] bArr2;
        uq8 uq8;
        ContentValues contentValues;
        Integer num;
        Iterator it;
        int i;
        boolean z2;
        boolean z3;
        String str4 = str;
        d1();
        b1();
        z65.h(str4);
        yy8 yy82 = (yy8) l1(str, bArr).k();
        j1(str4, yy82);
        k1(str4, (bz8) yy82.d());
        js jsVar = this.E;
        jsVar.put(str4, (bz8) yy82.d());
        this.I.put(str4, ((bz8) yy82.x).E());
        this.J.put(str4, str2);
        this.K.put(str4, str3);
        this.z.put(str4, m1((bz8) yy82.d()));
        v89 v89 = this.x;
        uq8 uq82 = v89.y;
        v89.R(uq82);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((bz8) yy82.x).A()));
        y19 y19 = (y19) uq82.w;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            ix8 ix8 = (ix8) ((kx8) arrayList.get(i2)).k();
            js jsVar2 = jsVar;
            if (((kx8) ix8.x).z() != 0) {
                int i3 = 0;
                while (i3 < ((kx8) ix8.x).z()) {
                    mx8 mx8 = (mx8) ((kx8) ix8.x).A(i3).k();
                    mx8 mx82 = (mx8) mx8.clone();
                    v89 v892 = v89;
                    yy8 yy83 = yy82;
                    String G2 = b35.G(((ox8) mx8.x).v(), r16.T, r16.Y);
                    if (G2 != null) {
                        mx82.b();
                        ((ox8) mx82.x).G(G2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i4 = 0;
                    while (i4 < ((ox8) mx8.x).x()) {
                        sx8 y = ((ox8) mx8.x).y(i4);
                        boolean z4 = z2;
                        mx8 mx83 = mx8;
                        sx8 sx8 = y;
                        String G3 = b35.G(y.A(), b96.u, b96.v);
                        if (G3 != null) {
                            qx8 qx8 = (qx8) sx8.k();
                            qx8.b();
                            ((sx8) qx8.x).C(G3);
                            mx82.b();
                            ((ox8) mx82.x).H(i4, (sx8) qx8.d());
                            z3 = true;
                        } else {
                            z3 = z4;
                        }
                        i4++;
                        mx8 = mx83;
                    }
                    if (z2) {
                        ix8.b();
                        ((kx8) ix8.x).C(i3, (ox8) mx82.d());
                        arrayList.set(i2, (kx8) ix8.d());
                    }
                    i3++;
                    String str5 = str2;
                    v89 = v892;
                    yy82 = yy83;
                }
            }
            yy8 yy84 = yy82;
            v89 v893 = v89;
            if (((kx8) ix8.x).w() != 0) {
                for (int i5 = 0; i5 < ((kx8) ix8.x).w(); i5++) {
                    wx8 x = ((kx8) ix8.x).x(i5);
                    String G4 = b35.G(x.v(), ar7.y0, ar7.z0);
                    if (G4 != null) {
                        vx8 vx8 = (vx8) x.k();
                        vx8.b();
                        ((wx8) vx8.x).C(G4);
                        ix8.b();
                        ((kx8) ix8.x).B(i5, (wx8) vx8.d());
                        arrayList.set(i2, (kx8) ix8.d());
                    }
                }
            }
            i2++;
            String str6 = str2;
            String str7 = str3;
            jsVar = jsVar2;
            v89 = v893;
            yy82 = yy84;
        }
        yy8 yy85 = yy82;
        js jsVar3 = jsVar;
        v89 v894 = v89;
        uq82.d1();
        uq82.b1();
        z65.h(str4);
        SQLiteDatabase T1 = uq82.T1();
        T1.beginTransaction();
        try {
            uq82.d1();
            uq82.b1();
            z65.h(str4);
            SQLiteDatabase T12 = uq82.T1();
            T12.delete("property_filters", "app_id=?", new String[]{str4});
            T12.delete("event_filters", "app_id=?", new String[]{str4});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                kx8 kx8 = (kx8) it2.next();
                uq82.d1();
                uq82.b1();
                z65.h(str4);
                z65.k(kx8);
                if (kx8.t()) {
                    int u = kx8.u();
                    Iterator it3 = kx8.y().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((ox8) it3.next()).t()) {
                                pz8 pz8 = y19.B;
                                y19.g(pz8);
                                pz8.E.c(pz8.k1(str4), Integer.valueOf(u), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.E.b("Audience with no ID. appId", pz8.k1(str4));
                }
            }
            sQLiteDatabase = T1;
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                kx8 kx82 = (kx8) it4.next();
                if (kx82.t()) {
                    num = Integer.valueOf(kx82.u());
                } else {
                    num = null;
                }
                arrayList2.add(num);
            }
            z65.h(str4);
            uq82.d1();
            uq82.b1();
            SQLiteDatabase T13 = uq82.T1();
            try {
                long y1 = uq82.y1("select count(1) from audience_filter_values where app_id=?", new String[]{str4});
                int max = Math.max(0, Math.min(2000, y19.z.l1(str4, by8.U)));
                if (y1 > ((long) max)) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String join = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            T13.delete("audience_filter_values", sb3.toString(), new String[]{str4, Integer.toString(max)});
                            break;
                        }
                        Integer num2 = (Integer) arrayList2.get(i6);
                        if (num2 == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num2.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e) {
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.B.c(pz8.k1(str4), e, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                yy85.b();
                yy8 = yy85;
                try {
                    ((bz8) yy8.x).N();
                    bArr2 = ((bz8) yy8.d()).a();
                } catch (RuntimeException e2) {
                    e = e2;
                    pz8 pz84 = ((y19) this.w).B;
                    y19.g(pz84);
                    pz84.E.c(pz8.k1(str4), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArr2 = bArr;
                    uq8 = v894.y;
                    v89.R(uq8);
                    y19 y192 = (y19) uq8.w;
                    z65.h(str4);
                    uq8.b1();
                    uq8.d1();
                    contentValues = new ContentValues();
                    contentValues.put("remote_config", bArr2);
                    contentValues.put("config_last_modified_time", str2);
                    contentValues.put("e_tag", str3);
                    if (((long) uq8.T1().update("apps", contentValues, "app_id = ?", new String[]{str4})) == 0) {
                    }
                    yy8.b();
                    ((bz8) yy8.x).O();
                    jsVar3.put(str4, (bz8) yy8.d());
                    return;
                }
            } catch (RuntimeException e3) {
                e = e3;
                yy8 = yy85;
                pz8 pz842 = ((y19) this.w).B;
                y19.g(pz842);
                pz842.E.c(pz8.k1(str4), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                bArr2 = bArr;
                uq8 = v894.y;
                v89.R(uq8);
                y19 y1922 = (y19) uq8.w;
                z65.h(str4);
                uq8.b1();
                uq8.d1();
                contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                contentValues.put("config_last_modified_time", str2);
                contentValues.put("e_tag", str3);
                if (((long) uq8.T1().update("apps", contentValues, "app_id = ?", new String[]{str4})) == 0) {
                }
                yy8.b();
                ((bz8) yy8.x).O();
                jsVar3.put(str4, (bz8) yy8.d());
                return;
            }
            uq8 = v894.y;
            v89.R(uq8);
            y19 y19222 = (y19) uq8.w;
            z65.h(str4);
            uq8.b1();
            uq8.d1();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (((long) uq8.T1().update("apps", contentValues, "app_id = ?", new String[]{str4})) == 0) {
                    pz8 pz85 = y19222.B;
                    y19.g(pz85);
                    pz85.B.b("Failed to update remote config (got 0). appId", pz8.k1(str4));
                }
            } catch (SQLiteException e4) {
                pz8 pz86 = y19222.B;
                y19.g(pz86);
                pz86.B.c(pz8.k1(str4), e4, "Error storing remote config. appId");
            }
            yy8.b();
            ((bz8) yy8.x).O();
            jsVar3.put(str4, (bz8) yy8.d());
            return;
            uq82.d1();
            uq82.b1();
            z65.h(str4);
            SQLiteDatabase T14 = uq82.T1();
            T14.delete("property_filters", "app_id=? and audience_id=?", new String[]{str4, String.valueOf(i)});
            T14.delete("event_filters", "app_id=? and audience_id=?", new String[]{str4, String.valueOf(i)});
            T1 = sQLiteDatabase;
            it2 = it;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = T1;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final boolean r1(String str, String str2) {
        Boolean bool;
        b1();
        i1(str);
        if ("1".equals(Y(str, "measurement.upload.blacklist_internal")) && d99.G1(str2)) {
            return true;
        }
        if ("1".equals(Y(str, "measurement.upload.blacklist_public")) && d99.c2(str2)) {
            return true;
        }
        Map map = (Map) this.B.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean s1(String str, String str2) {
        Boolean bool;
        b1();
        i1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.C.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List t1(String str) {
        b1();
        i1(str);
        return (List) this.D.get(str);
    }

    public final int u1(String str, String str2) {
        Integer num;
        b1();
        i1(str);
        Map map = (Map) this.F.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean v1(String str) {
        b1();
        i1(str);
        js jsVar = this.A;
        if (jsVar.get(str) == null) {
            return false;
        }
        if (((Set) jsVar.get(str)).contains("os_version") || ((Set) jsVar.get(str)).contains("device_info")) {
            return true;
        }
        return false;
    }

    public final boolean w1(String str) {
        b1();
        i1(str);
        js jsVar = this.A;
        if (jsVar.get(str) == null || !((Set) jsVar.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    public final boolean x1(String str, f39 f39) {
        b1();
        i1(str);
        ry8 y1 = y1(str);
        if (y1 == null) {
            return false;
        }
        for (yx8 yx8 : y1.t()) {
            if (f39 == n1(yx8.t())) {
                if (yx8.u() == 2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final ry8 y1(String str) {
        b1();
        i1(str);
        bz8 o1 = o1(str);
        if (o1 == null || !o1.F()) {
            return null;
        }
        return o1.G();
    }

    public final void f1() {
    }
}
