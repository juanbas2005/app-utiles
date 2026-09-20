package defpackage;

import android.os.Bundle;

/* renamed from: bv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bv4 {
    public static final ga0 b = new ga0(false, 2);
    public static final fa0 c = new fa0(true, 4);
    public static final fa0 d = new fa0(true, 5);
    public static final ga0 e = new ga0(false, 3);
    public static final fa0 f = new fa0(true, 6);
    public static final fa0 g = new fa0(true, 7);
    public static final ga0 h = new ga0(false, 1);
    public static final fa0 i = new fa0(true, 2);
    public static final fa0 j = new fa0(true, 3);
    public static final ga0 k = new ga0(false, 0);
    public static final fa0 l = new fa0(true, 0);
    public static final fa0 m = new fa0(true, 1);
    public static final ga0 n = new ga0(true, 4);
    public static final fa0 o = new fa0(true, 8);
    public static final fa0 p = new fa0(true, 9);
    public final boolean a;

    public bv4(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
