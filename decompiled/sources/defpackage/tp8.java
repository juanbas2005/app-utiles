package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: tp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tp8 extends in8 {
    public Boolean A;
    public Boolean x;
    public String y;
    public rp8 z;

    public final boolean d1(String str) {
        y19.e(((y19) this.w).E);
        if (d99.E1((String) by8.g1.a((Object) null), str) || d99.E1((String) by8.h1.a((Object) null), str) || d99.E1((String) by8.i1.a((Object) null), str)) {
            return true;
        }
        return "1".equals(this.z.Y(str, "gaia_collection_enabled"));
    }

    public final boolean e1(String str) {
        return "1".equals(this.z.Y(str, "measurement.event_sampling_enabled"));
    }

    public final boolean f1() {
        if (this.x == null) {
            Boolean p1 = p1("app_measurement_lite");
            this.x = p1;
            if (p1 == null) {
                this.x = Boolean.FALSE;
            }
        }
        if (this.x.booleanValue() || !((y19) this.w).x) {
            return true;
        }
        return false;
    }

    public final String g1(String str) {
        Class<String> cls = String.class;
        y19 y19 = (y19) this.w;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            z65.k(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.B.b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            pz8 pz84 = y19.B;
            y19.g(pz84);
            pz84.B.b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final int h1(String str, boolean z2) {
        int i = 500;
        if (z2) {
            i = Math.max(Math.min(l1(str, by8.g0), 500), 100);
        }
        return Math.max(i, 256);
    }

    public final void i1() {
        ((y19) this.w).getClass();
    }

    public final String j1(String str, ay8 ay8) {
        if (TextUtils.isEmpty(str)) {
            return (String) ay8.a((Object) null);
        }
        return (String) ay8.a(this.z.Y(str, ay8.a));
    }

    public final long k1(String str, ay8 ay8) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) ay8.a((Object) null)).longValue();
        }
        String Y = this.z.Y(str, ay8.a);
        if (TextUtils.isEmpty(Y)) {
            return ((Long) ay8.a((Object) null)).longValue();
        }
        try {
            return ((Long) ay8.a(Long.valueOf(Long.parseLong(Y)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) ay8.a((Object) null)).longValue();
        }
    }

    public final int l1(String str, ay8 ay8) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) ay8.a((Object) null)).intValue();
        }
        String Y = this.z.Y(str, ay8.a);
        if (TextUtils.isEmpty(Y)) {
            return ((Integer) ay8.a((Object) null)).intValue();
        }
        try {
            return ((Integer) ay8.a(Integer.valueOf(Integer.parseInt(Y)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) ay8.a((Object) null)).intValue();
        }
    }

    public final double m1(String str, ay8 ay8) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) ay8.a((Object) null)).doubleValue();
        }
        String Y = this.z.Y(str, ay8.a);
        if (TextUtils.isEmpty(Y)) {
            return ((Double) ay8.a((Object) null)).doubleValue();
        }
        try {
            return ((Double) ay8.a(Double.valueOf(Double.parseDouble(Y)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) ay8.a((Object) null)).doubleValue();
        }
    }

    public final boolean n1(String str, ay8 ay8) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) ay8.a((Object) null)).booleanValue();
        }
        String Y = this.z.Y(str, ay8.a);
        if (TextUtils.isEmpty(Y)) {
            return ((Boolean) ay8.a((Object) null)).booleanValue();
        }
        return ((Boolean) ay8.a(Boolean.valueOf("1".equals(Y)))).booleanValue();
    }

    public final Bundle o1() {
        y19 y19 = (y19) this.w;
        try {
            Context context = y19.w;
            Context context2 = y19.w;
            pz8 pz8 = y19.B;
            if (context.getPackageManager() == null) {
                y19.g(pz8);
                pz8.B.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = cf8.a(context2).b(128, context2.getPackageName());
            if (b != null) {
                return b.metaData;
            }
            y19.g(pz8);
            pz8.B.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.B.b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean p1(String str) {
        z65.h(str);
        Bundle o1 = o1();
        if (o1 == null) {
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.B.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!o1.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(o1.getBoolean(str));
        }
    }

    public final boolean q1() {
        ((y19) this.w).getClass();
        Boolean p1 = p1("firebase_analytics_collection_deactivated");
        if (p1 == null || !p1.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        Boolean p1 = p1("google_analytics_automatic_screen_reporting_enabled");
        if (p1 == null || p1.booleanValue()) {
            return true;
        }
        return false;
    }

    public final c39 s1(String str, boolean z2) {
        Object obj;
        z65.h(str);
        y19 y19 = (y19) this.w;
        Bundle o1 = o1();
        if (o1 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = o1.get(str);
        }
        c39 c39 = c39.UNINITIALIZED;
        if (obj == null) {
            return c39;
        }
        if (Boolean.TRUE.equals(obj)) {
            return c39.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return c39.DENIED;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return c39.POLICY;
        }
        pz8 pz82 = y19.B;
        y19.g(pz82);
        pz82.E.b("Invalid manifest metadata for", str);
        return c39;
    }
}
