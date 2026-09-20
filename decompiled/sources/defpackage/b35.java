package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import io.github.jan.supabase.auth.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.json.JsonEncodingException;

/* renamed from: b35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b35 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;
    public static Context c;
    public static final /* synthetic */ int d = 0;
    public static x83 e;
    public static final /* synthetic */ int f = 0;

    public static yb9 A(List list) {
        if (list == null || list.isEmpty()) {
            return l((Object) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((yb9) it.next()) == null) {
                ku4.j("null tasks are not accepted");
                return null;
            }
        }
        yb9 yb9 = new yb9();
        tl8 tl8 = new tl8(list.size(), yb9);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            yb9 yb92 = (yb9) it2.next();
            gv1 gv1 = yb7.b;
            yb92.e(gv1, tl8);
            yb92.d(gv1, tl8);
            yb92.a(gv1, tl8);
        }
        return yb9;
    }

    public static yb9 B(yb9... yb9Arr) {
        if (yb9Arr.length == 0) {
            return l(Collections.EMPTY_LIST);
        }
        List asList = Arrays.asList(yb9Arr);
        iy2 iy2 = yb7.a;
        if (asList == null || asList.isEmpty()) {
            return l(Collections.EMPTY_LIST);
        }
        return A(asList).g(iy2, new rg4(29, (Object) asList));
    }

    public static final Object C(long j, gs2 gs2, h61 h61) {
        if (j > 0) {
            return y(new si7(j, h61), gs2);
        }
        throw new TimeoutCancellationException("Timed out immediately", (el3) null);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object D(long j, gs2 gs2, h61 h61) {
        ti7 ti7;
        int i;
        h06 h06;
        if (h61 instanceof ti7) {
            ti7 ti72 = (ti7) h61;
            int i2 = ti72.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ti72.B = i2 - Integer.MIN_VALUE;
                ti7 = ti72;
                Object obj = ti7.A;
                i = ti7.B;
                if (i != 0) {
                    o85.q(obj);
                    if (j > 0) {
                        ? obj2 = new Object();
                        try {
                            ti7.z = obj2;
                            ti7.B = 1;
                            si7 si7 = new si7(j, ti7);
                            obj2.w = si7;
                            Object y = y(si7, gs2);
                            p81 p81 = p81.w;
                            if (y == p81) {
                                return p81;
                            }
                            return y;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            h06 = obj2;
                            if (e.w != h06.w) {
                                throw e;
                            }
                            return null;
                        }
                    }
                    return null;
                } else if (i == 1) {
                    h06 = ti7.z;
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        if (e.w != h06.w) {
                        }
                        return null;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ti7 = new h61(h61);
        Object obj3 = ti7.A;
        i = ti7.B;
        if (i != 0) {
        }
        return null;
    }

    public static Object E(yb9 yb9) {
        if (yb9.k()) {
            return yb9.i();
        }
        if (yb9.d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(yb9.h());
    }

    public static String F(Context context, String str) {
        z65.k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = jb5.J(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String G(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static boolean H(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final void a(pl3 pl3, zr3 zr3, zr3 zr32, String str) {
        String str2;
        ll6 descriptor = zr32.getDescriptor();
        descriptor.getClass();
        pl3.getClass();
        rm3.d(pl3, descriptor);
        if (uq3.k(descriptor).contains(str)) {
            String a2 = zr3.getDescriptor().a();
            String a3 = zr32.getDescriptor().a();
            if (pl3.a.j != fq0.x || !sg3.e(a2, a3)) {
                str2 = pb4.h('\'', "as base class '", a2);
            } else {
                str2 = "in ALL_JSON_OBJECTS class discriminator mode";
            }
            throw new JsonEncodingException(f21.l(f21.o("Class '", a3, "' cannot be serialized ", str2, " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static Object b(yb9 yb9) {
        z65.j("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || !Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            z65.l("Task must not be null", yb9);
            if (yb9.j()) {
                return E(yb9);
            }
            aj8 aj8 = new aj8();
            gv1 gv1 = yb7.b;
            yb9.e(gv1, aj8);
            yb9.d(gv1, aj8);
            yb9.a(gv1, aj8);
            aj8.w.await();
            return E(yb9);
        }
        h.s("Must not be called on GoogleApiHandler thread.");
        return null;
    }

    public static Object c(yb9 yb9, long j, TimeUnit timeUnit) {
        z65.j("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || !Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            z65.l("Task must not be null", yb9);
            z65.l("TimeUnit must not be null", timeUnit);
            if (yb9.j()) {
                return E(yb9);
            }
            aj8 aj8 = new aj8();
            gv1 gv1 = yb7.b;
            yb9.e(gv1, aj8);
            yb9.d(gv1, aj8);
            yb9.a(gv1, aj8);
            if (aj8.w.await(j, timeUnit)) {
                return E(yb9);
            }
            throw new TimeoutException("Timed out waiting for Task");
        }
        h.s("Must not be called on GoogleApiHandler thread.");
        return null;
    }

    public static yb9 d(Executor executor, Callable callable) {
        z65.l("Executor must not be null", executor);
        yb9 yb9 = new yb9();
        executor.execute(new c49(yb9, false, callable, 14));
        return yb9;
    }

    public static final void e(n85 n85) {
        n85.getClass();
        if (n85 instanceof ql6) {
            h.s("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (n85 instanceof no5) {
            h.s("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (n85 instanceof yk5) {
            h.s("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String f(pl3 pl3, ll6 ll6) {
        ll6.getClass();
        pl3.getClass();
        for (Annotation annotation : ll6.getAnnotations()) {
            if (annotation instanceof vl3) {
                return ((vl3) annotation).discriminator();
            }
        }
        return pl3.a.g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r8 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        r8 = r7;
     */
    public static final bv4 g(ll6 ll6, Map map) {
        Object obj;
        bv4 bv4;
        bv4 bv42;
        bv4 bv43;
        boolean z;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            as3 as3 = (as3) obj;
            ll6.getClass();
            as3.getClass();
            if (ll6.c() != as3.v()) {
                z = false;
                continue;
            } else {
                zr3 E = i95.E(wl6.a, as3);
                if (E != null) {
                    z = ll6.equals(E.getDescriptor());
                    continue;
                } else {
                    h.p(ll6.a(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                    return null;
                }
            }
            if (z) {
                break;
            }
        }
        as3 as32 = (as3) obj;
        if (as32 != null) {
            bv4 = (bv4) map.get(as32);
        } else {
            bv4 = null;
        }
        if (bv4 == null) {
            bv4 = null;
        }
        vr7 vr7 = vr7.r;
        if (bv4 == null) {
            ll6.getClass();
            Class<Enum> cls = Enum.class;
            switch (dh4.G(ll6).ordinal()) {
                case b85.b /*0*/:
                    bv42 = bv4.b;
                    break;
                case 1:
                    bv42 = pv8.f;
                    break;
                case 2:
                    bv42 = bv4.k;
                    break;
                case 3:
                    bv42 = pv8.g;
                    break;
                case 4:
                    bv42 = pv8.h;
                    break;
                case 5:
                    bv42 = pv8.i;
                    break;
                case 6:
                    bv42 = bv4.h;
                    break;
                case 7:
                    bv42 = pv8.j;
                    break;
                case 8:
                    bv42 = bv4.e;
                    break;
                case 9:
                    bv42 = pv8.k;
                    break;
                case 10:
                    bv42 = pv8.l;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    bv42 = bv4.n;
                    break;
                case 12:
                    bv42 = bv4.c;
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    bv42 = bv4.l;
                    break;
                case 14:
                    bv42 = pv8.o;
                    break;
                case h75.g /*15*/:
                    bv42 = bv4.i;
                    break;
                case 16:
                    bv42 = bv4.f;
                    break;
                case 17:
                    int ordinal = dh4.G(ll6.h(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            bv42 = pv8.m;
                            break;
                        }
                    } else {
                        bv42 = bv4.o;
                        break;
                    }
                case 18:
                    int ordinal2 = dh4.G(ll6.h(0)).ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 4) {
                                if (ordinal2 != 6) {
                                    if (ordinal2 != 8) {
                                        if (ordinal2 != 19) {
                                            if (ordinal2 != 10) {
                                                if (ordinal2 == 11) {
                                                    bv42 = pv8.n;
                                                    break;
                                                }
                                            } else {
                                                bv42 = bv4.p;
                                                break;
                                            }
                                        } else {
                                            bv4 = new uf3(r16.H(ll6.h(0)));
                                            break;
                                        }
                                    } else {
                                        bv42 = bv4.g;
                                        break;
                                    }
                                } else {
                                    bv42 = bv4.j;
                                    break;
                                }
                            } else {
                                bv42 = pv8.p;
                                break;
                            }
                        } else {
                            bv42 = bv4.m;
                            break;
                        }
                    } else {
                        bv42 = bv4.d;
                        break;
                    }
                case 19:
                    Class H = r16.H(ll6);
                    if (!Parcelable.class.isAssignableFrom(H)) {
                        if (!cls.isAssignableFrom(H)) {
                            if (!Serializable.class.isAssignableFrom(H)) {
                                bv43 = null;
                                break;
                            } else {
                                bv43 = new av4(H);
                                break;
                            }
                        } else {
                            bv43 = new yu4(H);
                            break;
                        }
                    } else {
                        bv43 = new zu4(H);
                        break;
                    }
                case 20:
                    Class H2 = r16.H(ll6);
                    if (cls.isAssignableFrom(H2)) {
                        bv4 = new vf3(H2);
                        break;
                    }
            }
        }
        if (bv4.equals(vr7)) {
            return null;
        }
        return bv4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    public static boolean h(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean i2 = i(file, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return i2;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0050 A[SYNTHETIC, Splitter:B:30:0x0050] */
    public static boolean i(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                fileOutputStream2.close();
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                }
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static yb9 k(Exception exc) {
        yb9 yb9 = new yb9();
        yb9.o(exc);
        return yb9;
    }

    public static yb9 l(Object obj) {
        yb9 yb9 = new yb9();
        yb9.m(obj);
        return yb9;
    }

    public static final int m(zr3 zr3) {
        int hashCode = zr3.getDescriptor().a().hashCode();
        int e2 = zr3.getDescriptor().e();
        for (int i = 0; i < e2; i++) {
            hashCode = (hashCode * 31) + zr3.getDescriptor().f(i).hashCode();
        }
        return hashCode;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [ws4, java.lang.Object] */
    public static final ArrayList n(zr3 zr3, Map map) {
        map.getClass();
        if (!(zr3 instanceof zk5)) {
            int e2 = zr3.getDescriptor().e();
            ArrayList arrayList = new ArrayList(e2);
            int i = 0;
            while (i < e2) {
                String f2 = zr3.getDescriptor().f(i);
                f2.getClass();
                ? obj = new Object();
                ll6 h = zr3.getDescriptor().h(i);
                boolean c2 = h.c();
                bv4 g = g(h, map);
                if (g != null) {
                    obj.a = g;
                    obj.b = c2;
                    if (zr3.getDescriptor().i(i)) {
                        obj.c = true;
                    }
                    bv4 bv4 = obj.a;
                    if (bv4 == null) {
                        bv4 = bv4.n;
                    }
                    arrayList.add(new zq4(f2, new xs4(bv4, obj.b, obj.c)));
                    i++;
                } else {
                    h.q(z(f2, h.a(), zr3.getDescriptor().a(), map.toString()));
                    return null;
                }
            }
            return arrayList;
        }
        rf2.q(zr3, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
        return null;
    }

    public static final String o(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        zr3 D = i95.D(b26.a.b(obj.getClass()));
        w96 w96 = new w96(D, linkedHashMap);
        D.serialize(w96, obj);
        Map b0 = sf4.b0(w96.H);
        am6 am6 = new am6(D);
        gc5 gc5 = new gc5(19, (Object) b0, (Object) am6);
        int e2 = D.getDescriptor().e();
        int i = 0;
        while (i < e2) {
            String f2 = D.getDescriptor().f(i);
            bv4 bv4 = (bv4) linkedHashMap.get(f2);
            if (bv4 != null) {
                gc5.u(Integer.valueOf(i), f2, bv4);
                i++;
            } else {
                ku4.g(pb4.h(']', "Cannot locate NavType for argument [", f2));
                return null;
            }
        }
        return ((String) am6.x) + ((String) am6.z) + ((String) am6.A);
    }

    public static final Type[] p(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || Modifier.isStatic(declaringClass.getModifiers())) {
            declaringClass2 = null;
        }
        if (declaringClass2 == null) {
            return q(constructor);
        }
        be5 be5 = new be5(2);
        be5.a(declaringClass2);
        be5.b(q(constructor));
        ArrayList arrayList = be5.a;
        return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
    }

    public static final Type[] q(Constructor constructor) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        if (genericParameterTypes.length == constructor.getParameterTypes().length) {
            Class declaringClass = constructor.getDeclaringClass();
            if (!Modifier.isStatic(declaringClass.getModifiers()) && declaringClass.getDeclaringClass() != null) {
                return (Type[]) qs.R0(1, genericParameterTypes).toArray(new Type[0]);
            }
        }
        return genericParameterTypes;
    }

    public static final x83 r() {
        x83 x83 = b;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(15.5f, 14.0f);
        be5.g(-0.79f);
        be5.i(-0.28f, -0.27f);
        be5.d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        be5.d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        be5.k(3.0f, 5.91f, 3.0f, 9.5f);
        be5.k(5.91f, 16.0f, 9.5f, 16.0f);
        be5.e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        be5.i(0.27f, 0.28f);
        be5.n(0.79f);
        be5.i(5.0f, 4.99f);
        be5.h(20.49f, 19.0f);
        be5.i(-4.99f, -5.0f);
        be5.c();
        be5.j(9.5f, 14.0f);
        be5.d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        be5.k(7.01f, 5.0f, 9.5f, 5.0f);
        be5.k(14.0f, 7.01f, 14.0f, 9.5f);
        be5.k(11.99f, 14.0f, 9.5f, 14.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        b = b2;
        return b2;
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final void t(h53 h53, String str, Object obj) {
        h53.getClass();
        if (obj != null) {
            h53.a().p0(str, obj.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    public static void u(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (!c35.h(context).getBoolean("proxy_notification_initialized", false)) {
            try {
                Context applicationContext = context.getApplicationContext();
                PackageManager packageManager = applicationContext.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    if (Build.VERSION.SDK_INT < 29) {
                        new ou5(context, z, new xb7()).run();
                        return;
                    } else {
                        l((Object) null);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
            if (Build.VERSION.SDK_INT < 29) {
            }
        }
    }

    public static final boolean v(ll6 ll6) {
        ll6.getClass();
        if (!sg3.e(ll6.u(), n57.l) || !ll6.j() || ll6.e() != 1) {
            return false;
        }
        return true;
    }

    public static MappedByteBuffer w(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th2;
            throw th;
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    public static final void x(uu uuVar) {
        a aVar = (a) uuVar;
        if (!aVar.c.z) {
            p25.s(uuVar);
            return;
        }
        w54 w54 = gp5.E.B;
        ig0 ig0 = aVar.h;
        dn1 dn1 = aw1.a;
        ar7.H(ig0, pe4.a, (r81) null, new gv(w54, uuVar, ig0, (f61) null, 10), 2);
    }

    public static final Object y(si7 si7, gs2 gs2) {
        r16.W(si7, true, new pw1(t49.M(si7.B.r()).a(si7.C, si7, si7.A)));
        return o55.t(si7, false, si7, gs2);
    }

    public static final String z(String str, String str2, String str3, String str4) {
        return f21.m(f21.o("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
