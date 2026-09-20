package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: kz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kz8 implements Runnable {
    public final Object A;
    public final Object B;
    public final Object C;
    public final /* synthetic */ int w = 1;
    public final int x;
    public final String y;
    public final Object z;

    public /* synthetic */ kz8(String str, tz8 tz8, int i, IOException iOException, byte[] bArr, Map map) {
        z65.k(tz8);
        this.z = tz8;
        this.x = i;
        this.A = iOException;
        this.B = bArr;
        this.y = str;
        this.C = map;
    }

    public final void run() {
        boolean z2;
        switch (this.w) {
            case b85.b:
                pz8 pz8 = (pz8) this.C;
                q09 q09 = ((y19) pz8.w).A;
                y19.e(q09);
                if (q09.x) {
                    if (pz8.y == 0) {
                        tp8 tp8 = ((y19) pz8.w).z;
                        if (tp8.A == null) {
                            synchronized (tp8) {
                                try {
                                    if (tp8.A == null) {
                                        y19 y19 = (y19) tp8.w;
                                        ApplicationInfo applicationInfo = y19.w.getApplicationInfo();
                                        String q = i95.q();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str == null || !str.equals(q)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            tp8.A = Boolean.valueOf(z2);
                                        }
                                        if (tp8.A == null) {
                                            tp8.A = Boolean.TRUE;
                                            pz8 pz82 = y19.B;
                                            y19.g(pz82);
                                            pz82.B.a("My process not in the list of running processes");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (tp8.A.booleanValue()) {
                            pz8.y = 'C';
                        } else {
                            pz8.y = 'c';
                        }
                    }
                    if (pz8.z < 0) {
                        ((y19) pz8.w).z.i1();
                        pz8.z = 161000;
                    }
                    int i = this.x;
                    char c = pz8.y;
                    long j = pz8.z;
                    String str2 = this.y;
                    Object obj = this.z;
                    Object obj2 = this.A;
                    Object obj3 = this.B;
                    char charAt = "01VDIWEA?".charAt(i);
                    String n1 = pz8.n1(true, str2, obj, obj2, obj3);
                    StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + n1.length());
                    sb.append("2");
                    sb.append(charAt);
                    sb.append(c);
                    sb.append(j);
                    sb.append(":");
                    sb.append(n1);
                    String sb2 = sb.toString();
                    if (sb2.length() > 1024) {
                        sb2 = str2.substring(0, 1024);
                    }
                    rb2 rb2 = q09.A;
                    if (rb2 != null) {
                        String str3 = (String) rb2.z;
                        q09 q092 = (q09) rb2.A;
                        q092.b1();
                        if (((q09) rb2.A).g1().getLong((String) rb2.x, 0) == 0) {
                            rb2.d();
                        }
                        SharedPreferences g1 = q092.g1();
                        String str4 = (String) rb2.y;
                        long j2 = g1.getLong(str4, 0);
                        if (j2 <= 0) {
                            SharedPreferences.Editor edit = q092.g1().edit();
                            edit.putString(str3, sb2);
                            edit.putLong(str4, 1);
                            edit.apply();
                            return;
                        }
                        d99 d99 = ((y19) q092.w).E;
                        y19.e(d99);
                        long j3 = j2 + 1;
                        SharedPreferences.Editor edit2 = q092.g1().edit();
                        if ((d99.b2().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
                            edit2.putString(str3, sb2);
                        }
                        edit2.putLong(str4, j3);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, pz8.m1(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((tz8) this.z).j(this.y, this.x, (Throwable) this.A, (byte[]) this.B, (Map) this.C);
                return;
        }
    }

    public kz8(pz8 pz8, int i, String str, Object obj, Object obj2, Object obj3) {
        this.x = i;
        this.y = str;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = pz8;
    }
}
