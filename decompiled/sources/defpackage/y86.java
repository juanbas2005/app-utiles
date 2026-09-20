package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: y86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y86 {
    public final gq3 a;
    public final Context b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public Executor f;
    public Executor g;
    public c9 h;
    public boolean i;
    public final z86 j = z86.w;
    public final long k = -1;
    public final ld4 l = new ld4(1);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public boolean q;
    public boolean r;
    public final boolean s = true;

    public y86(Context context, Class cls, String str) {
        this.a = b26.a.b(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(vk4... vk4Arr) {
        for (vk4 vk4 : vk4Arr) {
            Integer valueOf = Integer.valueOf(vk4.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(vk4.b));
        }
        vk4[] vk4Arr2 = (vk4[]) Arrays.copyOf(vk4Arr, vk4Arr.length);
        ld4 ld4 = this.l;
        ld4.getClass();
        for (vk4 a2 : vk4Arr2) {
            ld4.a(a2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0202, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x035f  */
    public final a96 b() {
        boolean z;
        String str;
        String str2;
        t22 t22;
        j87 j87;
        dq1 dq1;
        j87 j872;
        boolean z2;
        ActivityManager activityManager;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            or orVar = pr.e;
            this.g = orVar;
            this.f = orVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet<Number> linkedHashSet = this.n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            for (Number intValue : linkedHashSet) {
                int intValue2 = intValue.intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue2))) {
                    h.j(hl6.k(intValue2, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        i87 i87 = this.h;
        if (i87 == null) {
            i87 = new or2(0);
        }
        i87 i872 = i87;
        if (this.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            boolean z3 = this.i;
            z86 z86 = this.j;
            z86.getClass();
            Context context = this.b;
            context.getClass();
            if (z86 == z86.w) {
                Object systemService = context.getSystemService("activity");
                if (systemService instanceof ActivityManager) {
                    activityManager = (ActivityManager) systemService;
                } else {
                    activityManager = null;
                }
                if (activityManager == null || activityManager.isLowRamDevice()) {
                    z86 = z86.x;
                } else {
                    z86 = z86.y;
                }
            }
            Executor executor2 = this.f;
            if (executor2 != null) {
                Executor executor3 = this.g;
                if (executor3 != null) {
                    z86 z862 = z86;
                    mf1 mf1 = new mf1(context, this.c, i872, this.l, this.d, z3, z862, executor2, executor3, (Intent) null, this.p, this.q, linkedHashSet2, (String) null, (File) null, (Callable) null, this.e, this.o, this.r, (va6) null, (e81) null);
                    mf1.q = this.s;
                    Class u = kl8.u(this.a);
                    Package packageR = u.getPackage();
                    if (packageR == null || (str = packageR.getName()) == null) {
                        str = "";
                    }
                    String canonicalName = u.getCanonicalName();
                    canonicalName.getClass();
                    if (str.length() != 0) {
                        canonicalName = canonicalName.substring(str.length() + 1);
                    }
                    String replace = canonicalName.replace('.', '_');
                    replace.getClass();
                    String concat = replace.concat("_Impl");
                    try {
                        if (str.length() == 0) {
                            str2 = concat;
                        } else {
                            str2 = str + '.' + concat;
                        }
                        Class<?> cls = Class.forName(str2, true, u.getClassLoader());
                        cls.getClass();
                        a96 a96 = (a96) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                        a96.getClass();
                        a96.k = mf1.q;
                        try {
                            t22 = a96.e();
                            t22.getClass();
                        } catch (s05 unused) {
                            t22 = null;
                        }
                        if (t22 != null) {
                            a96.e = new dq1(mf1, t22, new yv(2, a96, b96.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 12));
                            a96.f = a96.d();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Set i2 = a96.i();
                            List list = mf1.n;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            Iterator it = i2.iterator();
                            while (true) {
                                int i3 = -1;
                                if (it.hasNext()) {
                                    gq3 gq3 = (gq3) it.next();
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i4 = size2 - 1;
                                            if (gq3.L(list.get(size2))) {
                                                zArr[size2] = true;
                                                i3 = size2;
                                                break;
                                            } else if (i4 < 0) {
                                                break;
                                            } else {
                                                size2 = i4;
                                            }
                                        }
                                    }
                                    if (i3 >= 0) {
                                        linkedHashMap.put(gq3, list.get(i3));
                                    } else {
                                        ku4.w(gq3.l(), ") is missing in the database configuration.", "A required auto migration spec (");
                                        return null;
                                    }
                                } else {
                                    int size3 = list.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i5 = size3 - 1;
                                            if (size3 >= size || !zArr[size3]) {
                                                h.q("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                            } else if (i5 < 0) {
                                                break;
                                            } else {
                                                size3 = i5;
                                            }
                                        }
                                    }
                                    for (vk4 vk4 : a96.c(linkedHashMap)) {
                                        int i6 = vk4.a;
                                        int i7 = vk4.b;
                                        ld4 ld4 = mf1.d;
                                        LinkedHashMap linkedHashMap2 = ld4.a;
                                        if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                                            if (map == null) {
                                                map = b42.w;
                                            }
                                            z2 = map.containsKey(Integer.valueOf(i7));
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            ld4.a(vk4);
                                        }
                                    }
                                    LinkedHashMap j2 = a96.j();
                                    List list2 = mf1.m;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (Map.Entry entry : j2.entrySet()) {
                                        gq3 gq32 = (gq3) entry.getKey();
                                        Iterator it2 = ((List) entry.getValue()).iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                gq3 gq33 = (gq3) it2.next();
                                                int size4 = list2.size() - 1;
                                                if (size4 >= 0) {
                                                    while (true) {
                                                        int i8 = size4 - 1;
                                                        if (gq33.L(list2.get(size4))) {
                                                            zArr2[size4] = true;
                                                            break;
                                                        } else if (i8 < 0) {
                                                            break;
                                                        } else {
                                                            size4 = i8;
                                                        }
                                                    }
                                                }
                                                size4 = -1;
                                                if (size4 >= 0) {
                                                    Object obj = list2.get(size4);
                                                    gq33.getClass();
                                                    obj.getClass();
                                                    a96.j.put(gq33, obj);
                                                } else {
                                                    ku4.m("A required type converter (", gq33.l(), ") for ", gq32.l(), " is missing in the database configuration.");
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                    int size5 = list2.size() - 1;
                                    if (size5 >= 0) {
                                        while (true) {
                                            int i9 = size5 - 1;
                                            if (!zArr2[size5]) {
                                                rf2.q(list2.get(size5), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                                return null;
                                            } else if (i9 < 0) {
                                                break;
                                            } else {
                                                size5 = i9;
                                            }
                                        }
                                    }
                                    a96.c = mf1.h;
                                    a96.d = new ol6(mf1.i, 1);
                                    Executor executor4 = a96.c;
                                    if (executor4 != null) {
                                        ig0 E = gl0.E(rc9.D0(we.l(executor4), b85.d()));
                                        a96.a = E;
                                        e81 e81 = E.x;
                                        ol6 ol6 = a96.d;
                                        if (ol6 != null) {
                                            a96.b = e81.X(we.l(ol6));
                                            a96.h = mf1.f;
                                            dq1 dq12 = a96.e;
                                            if (dq12 != null) {
                                                j87 j873 = (j87) dq12.h;
                                                if (j873 != null) {
                                                    j87 = j873;
                                                    while (true) {
                                                        if (!(j87 instanceof mm5)) {
                                                            if (!(j87 instanceof xo1)) {
                                                                break;
                                                            }
                                                            j87 = ((xo1) j87).a();
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                    mm5 mm5 = (mm5) j87;
                                                    dq1 = a96.e;
                                                    if (dq1 == null) {
                                                        j87 j874 = (j87) dq1.h;
                                                        if (j874 != null) {
                                                            j872 = j874;
                                                            while (true) {
                                                                if (!(j872 instanceof xw)) {
                                                                    if (!(j872 instanceof xo1)) {
                                                                        break;
                                                                    }
                                                                    j872 = ((xo1) j872).a();
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                            xw xwVar = (xw) j872;
                                                            return a96;
                                                        }
                                                        j872 = null;
                                                        xw xwVar2 = (xw) j872;
                                                        return a96;
                                                    }
                                                    sg3.a0("connectionManager");
                                                    throw null;
                                                }
                                                j87 = null;
                                                mm5 mm52 = (mm5) j87;
                                                dq1 = a96.e;
                                                if (dq1 == null) {
                                                }
                                            } else {
                                                sg3.a0("connectionManager");
                                                throw null;
                                            }
                                        } else {
                                            sg3.a0("internalTransactionExecutor");
                                            throw null;
                                        }
                                    } else {
                                        sg3.a0("internalQueryExecutor");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            new dq1(mf1, new b86(a96), new yv(2, a96, b96.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 11));
                            throw null;
                        }
                    } catch (ClassNotFoundException e2) {
                        throw new RuntimeException("Cannot find implementation for " + u.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e2);
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException("Cannot access the constructor " + u.getCanonicalName(), e3);
                    } catch (InstantiationException e4) {
                        throw new RuntimeException("Failed to create an instance of " + u.getCanonicalName(), e4);
                    }
                } else {
                    h.q("Required value was null.");
                    return null;
                }
            } else {
                h.q("Required value was null.");
                return null;
            }
        } else if (this.c != null) {
            h.q("Required value was null.");
            return null;
        } else {
            h.q("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
    }
}
