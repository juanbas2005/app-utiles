package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.VpnService;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.UUID;

/* renamed from: mm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mm0 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mm0(xz1 xz1, tp1 tp1, je2 je2, je2 je22, je2 je23) {
        this.w = 5;
        this.x = xz1;
        this.y = tp1;
        this.z = je2;
        this.A = je22;
    }

    public final Object b() {
        fv6 fv6;
        int[] iArr;
        yo4 yo4;
        boolean z2;
        String str;
        Object obj;
        switch (this.w) {
            case b85.b:
                ((Handler) this.x).post(new ti((h06) this.y, (HandlerThread) this.z, (TelephonyManager) this.A, 2));
                return vs7.a;
            case 1:
                yt2 yt2 = (yt2) this.x;
                bn0 bn0 = (bn0) this.y;
                fv6 fv62 = (fv6) this.z;
                hn4 hn4 = (hn4) this.A;
                by0 by0 = yt2.M;
                bn0 bn02 = by0.b;
                try {
                    by0.b = bn0;
                    fv6 = yt2.G;
                    iArr = yt2.o;
                    yo4 = yt2.v;
                    yt2.o = null;
                    yt2.v = null;
                    yt2.G = fv62;
                    z2 = by0.e;
                    by0.e = false;
                    yt2.H(hn4.a, hn4.g, hn4.b, true);
                    by0.e = z2;
                    yt2.G = fv6;
                    yt2.o = iArr;
                    yt2.v = yo4;
                    by0.b = bn02;
                    return vs7.a;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    by0.b = bn02;
                    throw th2;
                }
            case 2:
                hs2 hs2 = (hs2) this.x;
                aq4 aq4 = (aq4) this.y;
                aq4 aq42 = (aq4) this.z;
                aq4 aq43 = (aq4) this.A;
                if (d57.y0((String) aq4.getValue(), '.') || d57.y0((String) aq4.getValue(), ',')) {
                    str = "";
                } else {
                    str = (String) aq4.getValue();
                }
                hs2.u((String) aq42.getValue(), (String) aq43.getValue(), str);
                return vs7.a;
            case 3:
                Float f = (Float) this.x;
                jb3 jb3 = (jb3) this.y;
                Float f2 = (Float) this.z;
                ib3 ib3 = (ib3) this.A;
                if (!f.equals(jb3.w) || !f2.equals(jb3.x)) {
                    jb3.w = f;
                    jb3.x = f2;
                    jb3.z = new ub7(ib3, we.v, f, f2, (ol) null);
                    jb3.D.b.setValue(Boolean.TRUE);
                    jb3.A = false;
                    jb3.B = true;
                }
                return vs7.a;
            case 4:
                vs4 vs4 = (vs4) this.y;
                se4 se4 = (se4) this.z;
                aq4 aq44 = (aq4) this.A;
                if (sg3.A((Context) this.x, "android.permission.ACCESS_FINE_LOCATION")) {
                    vs4.f();
                    aq44.setValue(Boolean.TRUE);
                } else {
                    se4.d0("android.permission.ACCESS_FINE_LOCATION");
                }
                return vs7.a;
            case 5:
                xz1 xz1 = (xz1) this.x;
                xz1.c.setValue((tp1) this.y);
                xz1.d = (je2) this.z;
                xz1.e = (je2) this.A;
                return vs7.a;
            case 6:
                ((td) ((cs0) this.x)).b(new vl((String) this.y));
                Toast.makeText((Context) this.z, (String) this.A, 0).show();
                return vs7.a;
            case 7:
                bw4 bw4 = (bw4) this.x;
                bw4.c.setValue((fg6) this.y);
                bw4.b.setValue((List) this.z);
                bw4.d.setValue((List) this.A);
                return vs7.a;
            case 8:
                Context context = (Context) this.z;
                aq4 aq45 = (aq4) this.A;
                vs7 vs7 = vs7.a;
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:lestebang11@gmail.com"));
                intent.putExtra("android.intent.extra.SUBJECT", (String) this.x);
                intent.putExtra("android.intent.extra.TEXT", (String) this.y);
                try {
                    context.startActivity(intent);
                    obj = vs7;
                } catch (Throwable th3) {
                    obj = new m66(th3);
                }
                if (o66.a(obj) != null) {
                    aq45.setValue(Boolean.TRUE);
                }
                return vs7;
            case 9:
                w78 w78 = (w78) this.y;
                se4 se42 = (se4) this.z;
                e88 e88 = (e88) this.A;
                Intent prepare = VpnService.prepare((Context) this.x);
                if (prepare == null || w78.d) {
                    e88.e();
                } else {
                    se42.d0(prepare);
                }
                return vs7.a;
            default:
                hd8 hd8 = (hd8) this.x;
                hm2 hm2 = (hm2) this.z;
                Context context2 = (Context) this.A;
                String uuid = ((UUID) this.y).toString();
                be8 e = hd8.c.e(uuid);
                if (e == null || e.b.a()) {
                    h.s("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    lp5 lp5 = hd8.b;
                    synchronized (lp5.k) {
                        try {
                            bc4 k = bc4.k();
                            String str2 = lp5.l;
                            k.m(str2, "Moving WorkSpec (" + uuid + ") to the foreground");
                            re8 re8 = (re8) lp5.g.remove(uuid);
                            if (re8 != null) {
                                if (lp5.a == null) {
                                    PowerManager.WakeLock a = j88.a(lp5.b);
                                    lp5.a = a;
                                    a.acquire();
                                }
                                lp5.f.put(uuid, re8);
                                ag8.H(lp5.b, fa7.c(lp5.b, z85.h(re8.a), hm2));
                            }
                        } catch (Throwable th4) {
                            while (true) {
                                throw th4;
                                break;
                            }
                        }
                    }
                    id8 h = z85.h(e);
                    String str3 = fa7.F;
                    Intent intent2 = new Intent(context2, SystemForegroundService.class);
                    intent2.setAction("ACTION_NOTIFY");
                    intent2.putExtra("KEY_NOTIFICATION_ID", hm2.a);
                    intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hm2.b);
                    intent2.putExtra("KEY_NOTIFICATION", hm2.c);
                    intent2.putExtra("KEY_WORKSPEC_ID", h.a);
                    intent2.putExtra("KEY_GENERATION", h.b);
                    context2.startService(intent2);
                }
                return null;
        }
    }

    public /* synthetic */ mm0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }
}
