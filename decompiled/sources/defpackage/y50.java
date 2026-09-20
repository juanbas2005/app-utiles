package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: y50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class y50 {
    public static final cc2[] y = new cc2[0];
    public volatile String a = null;
    public ca b;
    public final Context c;
    public final g99 d;
    public final mw2 e;
    public final er8 f;
    public final Object g = new Object();
    public final Object h = new Object();
    public vi8 i;
    public x50 j;
    public IInterface k;
    public final ArrayList l = new ArrayList();
    public cw8 m;
    public int n = 1;
    public final v50 o;
    public final w50 p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile ns8 t;
    public m11 u = null;
    public boolean v = false;
    public volatile s29 w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    public y50(Context context, Looper looper, g99 g99, mw2 mw2, int i2, v50 v50, w50 w50, String str) {
        z65.l("Context must not be null", context);
        this.c = context;
        z65.l("Looper must not be null", looper);
        z65.l("Supervisor must not be null", g99);
        this.d = g99;
        z65.l("API availability must not be null", mw2);
        this.e = mw2;
        this.f = new er8(this, looper);
        this.q = i2;
        this.o = v50;
        this.p = w50;
        this.r = str;
    }

    public final void a() {
        int b2 = this.e.b(this.c, i());
        if (b2 != 0) {
            w(1, (IInterface) null);
            this.j = new ji8(this);
            int i2 = this.x.get();
            er8 er8 = this.f;
            er8.sendMessage(er8.obtainMessage(3, i2, b2, (Object) null));
            return;
        }
        this.j = new ji8(this);
        w(2, (IInterface) null);
    }

    public abstract IInterface b(IBinder iBinder);

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    si8 si8 = (si8) arrayList.get(i2);
                    synchronized (si8) {
                        si8.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        w(1, (IInterface) null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public cc2[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public abstract int i();

    public final void j(j73 j73, Set set) {
        String p2;
        Set set2 = set;
        Bundle h2 = h();
        if (Build.VERSION.SDK_INT < 31) {
            p2 = this.s;
        } else if (this.t == null) {
            p2 = this.s;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.t.x;
            if (attributionSource == null) {
                p2 = this.s;
            } else if (attributionSource.getAttributionTag() == null) {
                p2 = this.s;
            } else {
                p2 = attributionSource.getAttributionTag();
            }
        }
        String str = p2;
        int i2 = this.q;
        int i3 = mw2.a;
        Scope[] scopeArr = rv2.K;
        Bundle bundle = new Bundle();
        cc2[] cc2Arr = rv2.L;
        rv2 rv2 = new rv2(6, i2, i3, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cc2Arr, cc2Arr, true, 0, false, str);
        rv2.z = this.c.getPackageName();
        rv2.C = h2;
        if (set2 != null) {
            rv2.B = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (r()) {
            Account e2 = e();
            if (e2 == null) {
                e2 = new Account("<<default account>>", "com.google");
            }
            rv2.D = e2;
            if (j73 != null) {
                rv2.A = ((gg8) j73).e;
            }
        }
        rv2.E = y;
        rv2.F = f();
        if (s()) {
            rv2.I = true;
        }
        try {
            synchronized (this.h) {
                vi8 vi8 = this.i;
                if (vi8 != null) {
                    vi8.a(new av8(this, this.x.get()), rv2);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i4 = this.x.get();
            er8 er8 = this.f;
            er8.sendMessage(er8.obtainMessage(6, i4, 3));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RemoteException | RuntimeException e5) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
            int i5 = this.x.get();
            zw8 zw8 = new zw8(this, 8, (IBinder) null, (Bundle) null);
            er8 er82 = this.f;
            er82.sendMessage(er82.obtainMessage(1, i5, -1, zw8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                } else if (p()) {
                    iInterface = this.k;
                    z65.l("Client is connected but service is null", iInterface);
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        if (i() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            if (this.n == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            int i2 = this.n;
            z = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof i66;
    }

    public final /* synthetic */ boolean t(int i2, int i3, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i2) {
                    return false;
                }
                w(i3, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void u() {
        int i2;
        int i3;
        synchronized (this.g) {
            i2 = this.n;
        }
        if (i2 == 3) {
            this.v = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        er8 er8 = this.f;
        er8.sendMessage(er8.obtainMessage(i3, this.x.get(), 16));
    }

    public final /* synthetic */ boolean v() {
        if (this.v || TextUtils.isEmpty(m()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(m());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void w(int i2, IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3;
        ca caVar;
        boolean z4 = false;
        if (i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        z65.f(z3);
        synchronized (this.g) {
            try {
                this.n = i2;
                this.k = iInterface;
                Bundle bundle = null;
                if (i2 == 1) {
                    cw8 cw8 = this.m;
                    if (cw8 != null) {
                        g99 g99 = this.d;
                        String str = this.b.c;
                        z65.k(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        g99.c(str, cw8, this.b.b);
                        this.m = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    cw8 cw82 = this.m;
                    if (!(cw82 == null || (caVar = this.b) == null)) {
                        String str2 = caVar.c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        g99 g992 = this.d;
                        String str3 = this.b.c;
                        z65.k(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        g992.c(str3, cw82, this.b.b);
                        this.x.incrementAndGet();
                    }
                    cw8 cw83 = new cw8(this, this.x.get());
                    this.m = cw83;
                    String n2 = n();
                    boolean o2 = o();
                    this.b = new ca(2, n2, o2);
                    if (o2) {
                        if (i() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.c)));
                        }
                    }
                    g99 g993 = this.d;
                    String str4 = this.b.c;
                    z65.k(str4);
                    this.b.getClass();
                    String str5 = this.r;
                    if (str5 == null) {
                        str5 = this.c.getClass().getName();
                    }
                    m11 b2 = g993.b(new h69(str4, this.b.b), cw83, str5, g());
                    if (b2.x == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        String str6 = this.b.c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i3 = b2.x;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (b2.y != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b2.y);
                        }
                        int i4 = this.x.get();
                        dy8 dy8 = new dy8(this, i3, bundle);
                        er8 er8 = this.f;
                        er8.sendMessage(er8.obtainMessage(7, i4, -1, dy8));
                    }
                } else if (i2 == 4) {
                    z65.k(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
