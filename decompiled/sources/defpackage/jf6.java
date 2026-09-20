package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: jf6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jf6 implements w58 {
    public final Application a;
    public final v58 b;
    public final Bundle c;
    public final in8 d;
    public final kg5 e;

    public jf6(Application application, if6 if6, Bundle bundle) {
        v58 v58;
        this.e = if6.h();
        this.d = if6.k();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (v58.c == null) {
                v58.c = new v58(application);
            }
            v58 = v58.c;
            v58.getClass();
        } else {
            v58 = new v58((Application) null);
        }
        this.b = v58;
    }

    public final r58 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        h.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final r58 b(Class cls, to4 to4) {
        Constructor constructor;
        LinkedHashMap linkedHashMap = to4.a;
        String str = (String) linkedHashMap.get(y58.a);
        if (str == null) {
            h.s("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        } else if (linkedHashMap.get(cf6.a) != null && linkedHashMap.get(cf6.b) != null) {
            Application application = (Application) linkedHashMap.get(v58.d);
            boolean isAssignableFrom = kj.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = kf6.a(cls, kf6.b);
            } else {
                constructor = kf6.a(cls, kf6.a);
            }
            if (constructor == null) {
                return this.b.b(cls, to4);
            }
            if (!isAssignableFrom || application == null) {
                return kf6.b(cls, constructor, cf6.a(to4));
            }
            return kf6.b(cls, constructor, application, cf6.a(to4));
        } else if (this.d != null) {
            return d(cls, str);
        } else {
            h.s("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
    }

    public final r58 c(gq3 gq3, to4 to4) {
        gq3.getClass();
        return b(kl8.u(gq3), to4);
    }

    /* JADX WARNING: type inference failed for: r9v20, types: [java.lang.Object, x58] */
    public final r58 d(Class cls, String str) {
        Constructor constructor;
        ye6 ye6;
        r58 r58;
        in8 in8 = this.d;
        if (in8 != null) {
            boolean isAssignableFrom = kj.class.isAssignableFrom(cls);
            Application application = this.a;
            if (!isAssignableFrom || application == null) {
                constructor = kf6.a(cls, kf6.b);
            } else {
                constructor = kf6.a(cls, kf6.a);
            }
            if (constructor != null) {
                kg5 kg5 = this.e;
                kg5.getClass();
                Bundle i = kg5.i(str);
                if (i == null) {
                    i = this.c;
                }
                if (i == null) {
                    ye6 = new ye6();
                } else {
                    ClassLoader classLoader = ye6.class.getClassLoader();
                    classLoader.getClass();
                    i.setClassLoader(classLoader);
                    ze4 ze4 = new ze4(i.size());
                    for (String next : i.keySet()) {
                        next.getClass();
                        ze4.put(next, i.get(next));
                    }
                    ye6 = new ye6(ze4.b());
                }
                ze6 ze6 = new ze6(str, ye6);
                ze6.k(kg5, in8);
                k54 G0 = in8.G0();
                if (G0 == k54.x || G0.compareTo(k54.z) >= 0) {
                    kg5.O();
                } else {
                    in8.x0(new pm1(kg5, in8));
                }
                if (!isAssignableFrom || application == null) {
                    r58 = kf6.b(cls, constructor, ye6);
                } else {
                    r58 = kf6.b(cls, constructor, application, ye6);
                }
                r58.a("androidx.lifecycle.savedstate.vm.tag", ze6);
                return r58;
            } else if (application != null) {
                return this.b.a(cls);
            } else {
                if (x58.a == null) {
                    x58.a = new Object();
                }
                x58.a.getClass();
                return rc9.G(cls);
            }
        } else {
            kj6.n("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
    }

    public jf6() {
        this.b = new v58((Application) null);
    }
}
