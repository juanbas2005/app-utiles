package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: ng8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng8 implements nw2, ow2 {
    public final LinkedList d = new LinkedList();
    public final iw2 e;
    public final ln f;
    public final k68 g;
    public final HashSet h = new HashSet();
    public final HashMap i = new HashMap();
    public final int j;
    public final wg8 k;
    public boolean l;
    public final ArrayList m = new ArrayList();
    public m11 n = null;
    public int o = 0;
    public final /* synthetic */ pw2 p;

    public ng8(pw2 pw2, kw2 kw2) {
        this.p = pw2;
        Looper looper = pw2.I.getLooper();
        wr0 a = kw2.a();
        kd6 kd6 = new kd6((os) a.x, (String) a.y, (String) a.z);
        h49 h49 = (h49) kw2.d.x;
        z65.k(h49);
        iw2 r = h49.r(kw2.a, looper, kd6, kw2.e, this, this);
        ns8 ns8 = kw2.c;
        if (ns8 == null || !(r instanceof y50)) {
            String str = kw2.b;
            if (str != null && (r instanceof y50)) {
                r.s = str;
            }
        } else {
            r.t = ns8;
        }
        this.e = r;
        this.f = kw2.f;
        this.g = new k68(6);
        this.j = kw2.h;
        if (r.r()) {
            Context context = pw2.A;
            ph8 ph8 = pw2.I;
            wr0 a2 = kw2.a();
            this.k = new wg8(context, ph8, new kd6((os) a2.x, (String) a2.y, (String) a2.z));
            return;
        }
        this.k = null;
    }

    public final void a(int i2) {
        pw2 pw2 = this.p;
        if (Looper.myLooper() == pw2.I.getLooper()) {
            d(i2);
            return;
        }
        pw2.I.post(new cj0(i2, 3, (Object) this));
    }

    public final void b(m11 m11) {
        o(m11, (RuntimeException) null);
    }

    public final void c() {
        iw2 iw2 = this.e;
        pw2 pw2 = this.p;
        z65.g(pw2.I);
        this.n = null;
        l(m11.B);
        if (this.l) {
            ph8 ph8 = pw2.I;
            ln lnVar = this.f;
            ph8.removeMessages(11, lnVar);
            pw2.I.removeMessages(9, lnVar);
            this.l = false;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            l90 l90 = ((vg8) it.next()).a;
            if (m((cc2[]) l90.c) != null) {
                it.remove();
            } else {
                try {
                    new yb9();
                    fm8 fm8 = (fm8) ((ge2) l90.d).b;
                    fm8.getClass();
                    d49 d49 = (d49) ((f49) iw2).l();
                    t39 t39 = new t39((b49) fm8.x, (uw2) fm8.z);
                    Parcel I = d49.I();
                    I.writeString((String) fm8.y);
                    ds8.c(I, t39);
                    d49.J(I, 28);
                } catch (DeadObjectException unused) {
                    a(3);
                    iw2.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e2) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e2);
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void d(int i2) {
        z65.g(this.p.I);
        this.n = null;
        this.l = true;
        String str = this.e.a;
        k68 k68 = this.g;
        k68.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        k68.l(true, new Status(20, sb.toString(), (PendingIntent) null, (m11) null));
        ln lnVar = this.f;
        pw2 pw2 = this.p;
        ph8 ph8 = pw2.I;
        ph8.sendMessageDelayed(Message.obtain(ph8, 9, lnVar), 5000);
        ph8 ph82 = pw2.I;
        ph82.sendMessageDelayed(Message.obtain(ph82, 11, lnVar), 120000);
        SparseIntArray sparseIntArray = (SparseIntArray) pw2.C.x;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        for (vg8 vg8 : this.i.values()) {
            vg8.getClass();
        }
    }

    public final void e() {
        pw2 pw2 = this.p;
        if (Looper.myLooper() == pw2.I.getLooper()) {
            c();
            return;
        }
        pw2.I.post(new ge(18, (Object) this));
    }

    public final boolean f(m11 m11) {
        synchronized (pw2.M) {
            this.p.getClass();
        }
        return false;
    }

    public final void g() {
        LinkedList linkedList = this.d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            jh8 jh8 = (jh8) arrayList.get(i2);
            if (this.e.p()) {
                if (h(jh8)) {
                    linkedList.remove(jh8);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final boolean h(jh8 jh8) {
        if (!(jh8 instanceof sg8)) {
            k68 k68 = this.g;
            iw2 iw2 = this.e;
            jh8.c(k68, iw2.r());
            try {
                jh8.d(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                iw2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        } else {
            sg8 sg8 = (sg8) jh8;
            cc2 m2 = m(sg8.f(this));
            if (m2 == null) {
                k68 k682 = this.g;
                iw2 iw22 = this.e;
                jh8.c(k682, iw22.r());
                try {
                    jh8.d(this);
                    return true;
                } catch (DeadObjectException unused2) {
                    a(1);
                    iw22.d("DeadObjectException thrown while running ApiCallRunner.");
                    return true;
                }
            } else {
                String name = this.e.getClass().getName();
                String str = m2.w;
                long f2 = m2.f();
                int length = name.length();
                StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(f2).length() + 2);
                f21.v(sb, name, " could not execute call because it requires feature (", str, ", ");
                sb.append(f2);
                sb.append(").");
                Log.w("GoogleApiManager", sb.toString());
                pw2 pw2 = this.p;
                if (!pw2.J || !sg8.g(this)) {
                    sg8.b(new UnsupportedApiCallException(m2));
                    return true;
                }
                int h2 = sg8.h(this);
                og8 og8 = new og8(this.f, m2);
                ArrayList arrayList = this.m;
                int indexOf = arrayList.indexOf(og8);
                if (indexOf >= 0) {
                    og8 og82 = (og8) arrayList.get(indexOf);
                    pw2.I.removeMessages(15, og82);
                    pw2.I.sendMessageDelayed(Message.obtain(pw2.I, 15, og82), 5000);
                    return false;
                }
                arrayList.add(og8);
                pw2.I.sendMessageDelayed(Message.obtain(pw2.I, 15, og8), 5000);
                pw2.I.sendMessageDelayed(Message.obtain(pw2.I, 16, og8), 120000);
                m11 m11 = new m11(1, 2, (PendingIntent) null, (String) null, Integer.valueOf(h2));
                if (f(m11)) {
                    String str2 = m2.w;
                    long f3 = m2.f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(f3).length());
                    sb2.append("A dialog should be displayed for missing feature: ");
                    sb2.append(str2);
                    sb2.append(", version: ");
                    sb2.append(f3);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                } else if (!pw2.g(m11, this.j)) {
                    return false;
                } else {
                    String str3 = m2.w;
                    long f4 = m2.f();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(f4).length());
                    sb3.append("Notification displayed for missing feature: ");
                    sb3.append(str3);
                    sb3.append(", version: ");
                    sb3.append(f4);
                    Log.w("GoogleApiManager", sb3.toString());
                    return false;
                }
            }
        }
    }

    public final void i(Status status, Exception exc, boolean z) {
        boolean z2;
        z65.g(this.p.I);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                jh8 jh8 = (jh8) it.next();
                if (!z || jh8.a == 2) {
                    if (status != null) {
                        jh8.a(status);
                    } else {
                        jh8.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        h.q("Status XOR exception should be null");
    }

    public final void j(Status status) {
        z65.g(this.p.I);
        i(status, (Exception) null, false);
    }

    public final void k() {
        pw2 pw2 = this.p;
        ph8 ph8 = pw2.I;
        ln lnVar = this.f;
        ph8.removeMessages(12, lnVar);
        ph8 ph82 = pw2.I;
        ph82.sendMessageDelayed(ph82.obtainMessage(12, lnVar), pw2.w);
    }

    public final void l(m11 m11) {
        HashSet hashSet = this.h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() == null) {
            if (b35.j(m11, m11.B)) {
                y50 y50 = this.e;
                if (!y50.p() || y50.b == null) {
                    rf2.r("Failed to connect when checking package");
                    return;
                }
            }
            throw null;
        } else {
            ku4.a();
        }
    }

    public final cc2 m(cc2[] cc2Arr) {
        cc2[] cc2Arr2;
        if (!(cc2Arr == null || cc2Arr.length == 0)) {
            s29 s29 = this.e.w;
            if (s29 == null) {
                cc2Arr2 = null;
            } else {
                cc2Arr2 = s29.x;
            }
            if (cc2Arr2 == null) {
                cc2Arr2 = new cc2[0];
            }
            zt6 zt6 = new zt6(cc2Arr2.length);
            for (cc2 cc2 : cc2Arr2) {
                zt6.put(cc2.w, Long.valueOf(cc2.f()));
            }
            for (cc2 cc22 : cc2Arr) {
                Long l2 = (Long) zt6.get(cc22.w);
                if (l2 == null || l2.longValue() < cc22.f()) {
                    return cc22;
                }
            }
        }
        return null;
    }

    public final void n(m11 m11) {
        z65.g(this.p.I);
        iw2 iw2 = this.e;
        String name = iw2.getClass().getName();
        String valueOf = String.valueOf(m11);
        y50 y50 = iw2;
        y50.d(pb4.n(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        o(m11, (RuntimeException) null);
    }

    public final void o(m11 m11, RuntimeException runtimeException) {
        ft6 ft6;
        pw2 pw2 = this.p;
        z65.g(pw2.I);
        wg8 wg8 = this.k;
        if (!(wg8 == null || (ft6 = wg8.j) == null)) {
            ft6.c();
        }
        z65.g(this.p.I);
        this.n = null;
        SparseIntArray sparseIntArray = (SparseIntArray) pw2.C.x;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(m11);
        if ((this.e instanceof rh8) && m11.x != 24) {
            pw2.x = true;
            ph8 ph8 = pw2.I;
            ph8.sendMessageDelayed(ph8.obtainMessage(19), 300000);
        }
        int i2 = m11.x;
        if (i2 == 4) {
            j(pw2.L);
        } else if (i2 == 25) {
            j(pw2.d(this.f, m11));
        } else {
            LinkedList linkedList = this.d;
            if (linkedList.isEmpty()) {
                this.n = m11;
            } else if (runtimeException != null) {
                z65.g(pw2.I);
                i((Status) null, runtimeException, false);
            } else {
                boolean z = pw2.J;
                ln lnVar = this.f;
                if (z) {
                    i(pw2.d(lnVar, m11), (Exception) null, true);
                    if (!linkedList.isEmpty() && !f(m11) && !pw2.g(m11, this.j)) {
                        if (m11.x == 18) {
                            this.l = true;
                        }
                        if (this.l) {
                            ph8 ph82 = pw2.I;
                            ph82.sendMessageDelayed(Message.obtain(ph82, 9, lnVar), 5000);
                            return;
                        }
                        j(pw2.d(lnVar, m11));
                        return;
                    }
                    return;
                }
                j(pw2.d(lnVar, m11));
            }
        }
    }

    public final void p(jh8 jh8) {
        z65.g(this.p.I);
        boolean p2 = this.e.p();
        LinkedList linkedList = this.d;
        if (!p2) {
            linkedList.add(jh8);
            m11 m11 = this.n;
            if (m11 == null || m11.x == 0 || m11.y == null) {
                r();
            } else {
                o(m11, (RuntimeException) null);
            }
        } else if (h(jh8)) {
            k();
        } else {
            linkedList.add(jh8);
        }
    }

    public final void q() {
        pw2 pw2 = this.p;
        z65.g(pw2.I);
        Status status = pw2.K;
        j(status);
        this.g.l(false, status);
        for (x84 eh8 : (x84[]) this.i.keySet().toArray(new x84[0])) {
            p(new eh8(eh8, new xb7()));
        }
        l(new m11(4, (PendingIntent) null, (String) null));
        if (this.e.p()) {
            pw2.I.post(new ge(19, (Object) new uy5(11, (Object) this)));
        }
    }

    public final void r() {
        pw2 pw2 = this.p;
        z65.g(pw2.I);
        iw2 iw2 = this.e;
        if (!iw2.p()) {
            y50 y50 = iw2;
            if (!y50.q()) {
                try {
                    int k2 = pw2.C.k(pw2.A, iw2);
                    if (k2 != 0) {
                        m11 m11 = new m11(k2, (PendingIntent) null, (String) null);
                        String name = iw2.getClass().getName();
                        String m112 = m11.toString();
                        StringBuilder sb = new StringBuilder(name.length() + 35 + m112.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(m112);
                        Log.w("GoogleApiManager", sb.toString());
                        o(m11, (RuntimeException) null);
                        return;
                    }
                    ge1 ge1 = new ge1(pw2, iw2, this.f);
                    if (iw2.r()) {
                        wg8 wg8 = this.k;
                        z65.k(wg8);
                        ft6 ft6 = wg8.j;
                        if (ft6 != null) {
                            ft6.c();
                        }
                        kd6 kd6 = wg8.i;
                        kd6.C = Integer.valueOf(System.identityHashCode(wg8));
                        wf3 wf3 = wg8.g;
                        Context context = wg8.e;
                        Handler handler = wg8.f;
                        wg8.j = (ft6) wf3.r(context, handler.getLooper(), kd6, (ht6) kd6.B, wg8, wg8);
                        wg8.k = ge1;
                        Set set = wg8.h;
                        if (set == null || set.isEmpty()) {
                            handler.post(new ge(wg8));
                        } else {
                            ft6 ft62 = wg8.j;
                            ft62.getClass();
                            ft62.j = new ji8((y50) ft62);
                            ft62.w(2, (IInterface) null);
                        }
                    }
                    try {
                        y50.j = ge1;
                        y50.w(2, (IInterface) null);
                    } catch (SecurityException e2) {
                        o(new m11(10, (PendingIntent) null, (String) null), e2);
                    }
                } catch (IllegalStateException e3) {
                    o(new m11(10, (PendingIntent) null, (String) null), e3);
                }
            }
        }
    }
}
