package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: cf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class cf6 {
    public static final s63 a = new s63(8);
    public static final hr2 b = new hr2(9);
    public static final or2 c = new or2(9);

    public static final ye6 a(ib1 ib1) {
        df6 df6;
        ye6 ye6;
        ib1.getClass();
        if6 if6 = (if6) ib1.a(a);
        Bundle bundle = null;
        if (if6 != null) {
            a68 a68 = (a68) ib1.a(b);
            if (a68 != null) {
                Bundle bundle2 = (Bundle) ib1.a(c);
                String str = (String) ib1.a(y58.a);
                if (str != null) {
                    gf6 x = if6.h().x("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (x instanceof df6) {
                        df6 = (df6) x;
                    } else {
                        df6 = null;
                    }
                    if (df6 != null) {
                        LinkedHashMap linkedHashMap = c(a68).b;
                        ye6 ye62 = (ye6) linkedHashMap.get(str);
                        if (ye62 != null) {
                            return ye62;
                        }
                        df6.b();
                        Bundle bundle3 = df6.c;
                        if (bundle3 != null && bundle3.containsKey(str)) {
                            Bundle bundle4 = bundle3.getBundle(str);
                            if (bundle4 == null) {
                                bundle4 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                            }
                            bundle3.remove(str);
                            if (bundle3.isEmpty()) {
                                df6.c = null;
                            }
                            bundle = bundle4;
                        }
                        if (bundle != null) {
                            bundle2 = bundle;
                        }
                        if (bundle2 == null) {
                            ye6 = new ye6();
                        } else {
                            ClassLoader classLoader = ye6.class.getClassLoader();
                            classLoader.getClass();
                            bundle2.setClassLoader(classLoader);
                            ze4 ze4 = new ze4(bundle2.size());
                            for (String next : bundle2.keySet()) {
                                next.getClass();
                                ze4.put(next, bundle2.get(next));
                            }
                            ye6 = new ye6(ze4.b());
                        }
                        linkedHashMap.put(str, ye6);
                        return ye6;
                    }
                    h.s("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                h.q("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            h.q("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        h.q("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(if6 if6) {
        k54 G0 = if6.k().G0();
        if (G0 != k54.x && G0 != k54.y) {
            ku4.m("Failed to enable `SavedStateHandle` for `", if6, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", G0, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (if6.h().x("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            df6 df6 = new df6(if6.h(), (a68) if6);
            if6.h().K("androidx.lifecycle.internal.SavedStateHandlesProvider", df6);
            if6.k().x0(new ky5(4, df6));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, w58] */
    public static final ef6 c(a68 a68) {
        ? obj = new Object();
        ib1 k = o85.k(a68);
        k.getClass();
        z58 g = a68.g();
        g.getClass();
        return (ef6) new no7(g, obj, k).b(b26.a.b(ef6.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
