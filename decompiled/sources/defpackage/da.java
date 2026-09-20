package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: da  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da {
    public ba0 a;
    public bx8 b;
    public boolean c;
    public final Object d = new Object();
    public hr8 e;
    public final Context f;
    public final long g;

    public da(Context context) {
        z65.k(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1;
    }

    public static ca a(Context context) {
        da daVar = new da(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            daVar.c();
            ca e2 = daVar.e();
            d(e2, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            daVar.b();
            return e2;
        } catch (Throwable th) {
            daVar.b();
            throw th;
        }
    }

    public static void d(ca caVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (caVar != null) {
                if (true != caVar.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = caVar.c;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new ui8(hashMap).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    public final void b() {
        z65.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.a != null) {
                    if (this.c) {
                        q11.b().c(this.f, this.a);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        bx8 bx8;
        z65.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b2 = mw2.b.b(context, 12451000);
                if (b2 != 0) {
                    if (b2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                ba0 ba0 = new ba0();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (q11.b().a(context, intent, ba0, 1)) {
                    this.a = ba0;
                    IBinder a2 = ba0.a();
                    int i = dw8.d;
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (queryLocalInterface instanceof bx8) {
                        bx8 = (bx8) queryLocalInterface;
                    } else {
                        bx8 = new cv8(a2);
                    }
                    this.b = bx8;
                    this.c = true;
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new Exception();
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:44|45|(3:47|48|49)|51|52|(1:54)|55) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a4 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    public final ca e() {
        ca caVar;
        z65.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        hr8 hr8 = this.e;
                        if (hr8 == null || !hr8.z) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    c();
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
                z65.k(this.a);
                z65.k(this.b);
                cv8 cv8 = (cv8) this.b;
                cv8.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel a2 = cv8.a(obtain, 1);
                String readString = a2.readString();
                a2.recycle();
                cv8 cv82 = (cv8) this.b;
                cv82.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i = ct8.a;
                obtain2.writeInt(1);
                Parcel a3 = cv82.a(obtain2, 2);
                if (a3.readInt() == 0) {
                    z = false;
                }
                a3.recycle();
                caVar = new ca(0, readString, z);
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            } catch (Exception e3) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            hr8 hr82 = this.e;
            if (hr82 != null) {
                hr82.y.countDown();
                this.e.join();
            }
            long j = this.g;
            if (j > 0) {
                this.e = new hr8(this, j);
            }
        }
        return caVar;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
