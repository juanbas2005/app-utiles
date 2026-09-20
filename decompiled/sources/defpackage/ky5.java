package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: ky5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ky5 implements q54 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ ky5(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void o(t54 t54, j54 j54) {
        View view;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                if6 if6 = (if6) obj;
                if (j54 == j54.ON_CREATE) {
                    t54.k().M0(this);
                    Bundle i2 = if6.h().i("androidx.savedstate.Restarter");
                    if (i2 != null) {
                        ArrayList<String> stringArrayList = i2.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String next : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(next, false, ky5.class.getClassLoader()).asSubclass(ff6.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance((Object[]) null);
                                            newInstance.getClass();
                                            ff6 ff6 = (ff6) newInstance;
                                            if (if6 instanceof a68) {
                                                z58 g = ((a68) if6).g();
                                                kg5 h = if6.h();
                                                LinkedHashMap linkedHashMap = g.a;
                                                LinkedHashMap linkedHashMap2 = g.a;
                                                for (Object obj2 : dt0.g1(linkedHashMap.keySet())) {
                                                    r58 r58 = (r58) linkedHashMap2.get(obj2);
                                                    if (r58 != null) {
                                                        pv8.n(r58, h, if6.k());
                                                    }
                                                }
                                                if (!dt0.g1(linkedHashMap2.keySet()).isEmpty()) {
                                                    h.O();
                                                }
                                            } else {
                                                ku4.k("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", if6);
                                                return;
                                            }
                                        } catch (Exception e) {
                                            ku4.o(b81.y("Failed to instantiate ", next), e);
                                            return;
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        String simpleName = asSubclass.getSimpleName();
                                        throw new IllegalStateException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    ku4.o(f21.h("Class ", next, " wasn't found"), e3);
                                    return;
                                }
                            }
                            return;
                        }
                        h.s("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                rv0 rv0 = (rv0) obj;
                if (rv0.A == null) {
                    nv0 nv0 = (nv0) rv0.getLastNonConfigurationInstance();
                    if (nv0 != null) {
                        rv0.A = nv0.a;
                    }
                    if (rv0.A == null) {
                        rv0.A = new z58();
                    }
                }
                rv0.w.M0(this);
                return;
            case 2:
                new HashMap();
                lu2[] lu2Arr = (lu2[]) obj;
                if (lu2Arr.length > 0) {
                    lu2 lu2 = lu2Arr[0];
                    throw null;
                } else if (lu2Arr.length > 0) {
                    lu2 lu22 = lu2Arr[0];
                    throw null;
                } else {
                    return;
                }
            case 3:
                if (j54 == j54.ON_STOP && (view = ((bq2) obj).c0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            default:
                if (j54 == j54.ON_CREATE) {
                    t54.k().M0(this);
                    ((df6) obj).b();
                    return;
                }
                ku4.k("Next event must be ON_CREATE, it was ", j54);
                return;
        }
    }
}
