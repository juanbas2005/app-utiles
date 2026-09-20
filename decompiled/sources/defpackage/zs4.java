package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: zs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zs4 implements t54, a68, ry2, if6 {
    public final it4 A;
    public final String B;
    public final Bundle C;
    public final bt4 D = new bt4(this);
    public final tb1 w;
    public qt4 x;
    public final Bundle y;
    public k54 z;

    public zs4(tb1 tb1, qt4 qt4, Bundle bundle, k54 k54, it4 it4, String str, Bundle bundle2) {
        this.w = tb1;
        this.x = qt4;
        this.y = bundle;
        this.z = k54;
        this.A = it4;
        this.B = str;
        this.C = bundle2;
        new z97(new zh(28, (Object) this));
    }

    public final void a(k54 k54) {
        bt4 bt4 = this.D;
        bt4.getClass();
        bt4.k = k54;
        bt4.b();
    }

    public final w58 c() {
        return this.D.l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    public final to4 d() {
        Application application;
        Context context;
        bt4 bt4 = this.D;
        bt4.getClass();
        to4 to4 = new to4(0);
        zs4 zs4 = bt4.a;
        LinkedHashMap linkedHashMap = to4.a;
        linkedHashMap.put(cf6.a, zs4);
        linkedHashMap.put(cf6.b, zs4);
        Bundle a = bt4.a();
        if (a != null) {
            linkedHashMap.put(cf6.c, a);
        }
        Application application2 = null;
        tb1 tb1 = this.w;
        if (tb1 != null) {
            Context context2 = tb1.a;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
                if (application != null) {
                    application2 = application;
                }
                if (application2 != null) {
                    linkedHashMap.put(v58.d, application2);
                }
                return to4;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return to4;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (obj != null && (obj instanceof zs4)) {
            zs4 zs4 = (zs4) obj;
            Bundle bundle = zs4.y;
            if (sg3.e(this.B, zs4.B) && sg3.e(this.x, zs4.x) && sg3.e(this.D.j, zs4.D.j) && sg3.e(h(), zs4.h())) {
                Bundle bundle2 = this.y;
                if (sg3.e(bundle2, bundle)) {
                    return true;
                }
                if (!(bundle2 == null || (keySet = bundle2.keySet()) == null)) {
                    Iterable<String> iterable = keySet;
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        return true;
                    }
                    for (String str : iterable) {
                        Object obj3 = bundle2.get(str);
                        if (bundle != null) {
                            obj2 = bundle.get(str);
                        } else {
                            obj2 = null;
                        }
                        if (!sg3.e(obj3, obj2)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final z58 g() {
        bt4 bt4 = this.D;
        if (!bt4.i) {
            h.s("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        } else if (bt4.j.E != k54.w) {
            it4 it4 = bt4.e;
            if (it4 != null) {
                String str = bt4.f;
                str.getClass();
                LinkedHashMap linkedHashMap = it4.b;
                z58 z58 = (z58) linkedHashMap.get(str);
                if (z58 != null) {
                    return z58;
                }
                z58 z582 = new z58();
                linkedHashMap.put(str, z582);
                return z582;
            }
            h.s("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        } else {
            h.s("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
    }

    public final kg5 h() {
        return (kg5) this.D.h.y;
    }

    public final int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = this.x.hashCode() + (this.B.hashCode() * 31);
        Bundle bundle = this.y;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        int hashCode2 = this.D.j.hashCode();
        return h().hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final in8 k() {
        return this.D.j;
    }

    public final String toString() {
        return this.D.toString();
    }
}
