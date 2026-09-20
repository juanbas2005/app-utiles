package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.zxing.FormatException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l90 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public l90(cw0 cw0, boolean z) {
        int i;
        this.d = cw0;
        this.c = new AtomicReference((Object) null);
        this.a = z;
        if (z) {
            i = 8192;
        } else {
            i = 1024;
        }
        this.b = new AtomicMarkableReference(new jt3(i), false);
    }

    public void a(boolean z) {
        rv1 rv1 = (rv1) this.d;
        synchronized (rv1) {
            try {
                if (!this.a) {
                    if (sg3.e(((ov1) this.b).g, this)) {
                        rv1.a(rv1, this, z);
                    }
                    this.a = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(int i, int i2, int i3) {
        boolean z;
        boolean z2 = this.a;
        k90 k90 = (k90) this.b;
        if (z2) {
            z = k90.b(i2, i);
        } else {
            z = k90.b(i, i2);
        }
        if (z) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    public ae5 c(int i) {
        ae5 ae5;
        rv1 rv1 = (rv1) this.d;
        synchronized (rv1) {
            if (!this.a) {
                ((boolean[]) this.c)[i] = true;
                Object obj = ((ov1) this.b).d.get(i);
                qv1 qv1 = rv1.L;
                ae5 ae52 = (ae5) obj;
                if (!qv1.v(ae52)) {
                    i.a(qv1.I(ae52));
                }
                ae5 = (ae5) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return ae5;
    }

    public synchronized void d() {
        try {
            if (!this.a) {
                Boolean f = f();
                this.c = f;
                if (f == null) {
                    ta1 ta1 = new ta1(27);
                    b72 b72 = (b72) ((w67) this.b);
                    b72.a(b72.c, ta1);
                }
                this.a = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean e() {
        boolean z;
        try {
            d();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = ((FirebaseMessaging) this.d).a.h();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return z;
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        oe2 oe2 = ((FirebaseMessaging) this.d).a;
        oe2.a();
        Context context = oe2.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public mm2 g() {
        mm2 mm2 = (mm2) this.d;
        if (mm2 != null) {
            return mm2;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = b(i3, 8, i2);
        }
        int b2 = b(8, 7, b(8, 8, b(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            b2 = b(8, i4, b2);
        }
        int i5 = ((k90) this.b).x;
        int i6 = i5 - 7;
        for (int i7 = i5 - 1; i7 >= i6; i7--) {
            i = b(8, i7, i);
        }
        for (int i8 = i5 - 8; i8 < i5; i8++) {
            i = b(i8, 8, i);
        }
        mm2 a2 = mm2.a(b2, i);
        if (a2 == null) {
            a2 = mm2.a(b2 ^ 21522, i ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw FormatException.a();
    }

    public f48 h() {
        f48 f48 = (f48) this.c;
        if (f48 != null) {
            return f48;
        }
        int i = ((k90) this.b).x;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return f48.c(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = b(i7, i6, i5);
            }
        }
        f48 b2 = f48.b(i5);
        if (b2 == null || (b2.a * 4) + 17 != i) {
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i - 9; i9 >= i3; i9--) {
                    i4 = b(i8, i9, i4);
                }
            }
            f48 b3 = f48.b(i4);
            if (b3 == null || (b3.a * 4) + 17 != i) {
                throw FormatException.a();
            }
            this.c = b3;
            return b3;
        }
        this.c = b2;
        return b2;
    }

    public void i() {
        if (((mm2) this.d) != null) {
            int i = b81.F(8)[((mm2) this.d).b];
            k90 k90 = (k90) this.b;
            int i2 = k90.x;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (f21.a(i, i3, i4)) {
                        k90.a(i4, i3);
                    }
                }
            }
        }
    }

    public String j() {
        if (!this.a) {
            this.a = true;
            this.c = ((q09) this.d).g1().getString((String) this.b, (String) null);
        }
        return (String) this.c;
    }

    public void k(String str) {
        SharedPreferences.Editor edit = ((q09) this.d).g1().edit();
        edit.putString((String) this.b, str);
        edit.apply();
        this.c = str;
    }

    public l90(q09 q09, String str) {
        this.d = q09;
        z65.h(str);
        this.b = str;
    }

    public l90() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public l90(k90 k90) {
        int i = k90.x;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.a();
        }
        this.b = k90;
    }

    public l90(ge2 ge2, uw2 uw2, cc2[] cc2Arr, boolean z) {
        this.d = ge2;
        this.b = uw2;
        this.c = cc2Arr;
        this.a = z;
    }

    public l90(g24 g24, p67 p67, un5 un5) {
        this.b = g24;
        this.c = p67;
        this.d = un5;
        this.a = true;
    }

    public l90(rv1 rv1, ov1 ov1) {
        this.d = rv1;
        this.b = ov1;
        this.c = new boolean[2];
    }

    public l90(FirebaseMessaging firebaseMessaging, w67 w67) {
        this.d = firebaseMessaging;
        this.b = w67;
    }
}
