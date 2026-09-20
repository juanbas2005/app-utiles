package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: d63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d63 implements rr0, ib0, d81, v52, ux6, up7, mm8, tr, vr, dl7, j51, yw1, r62 {
    public static final d63 A = new d63(4);
    public static final /* synthetic */ d63 B = new d63(5);
    public static final ly5 C = new ly5(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final d63 D = new d63(7);
    public static final d63 E = new d63(8);
    public static final /* synthetic */ d63 F = new d63(9);
    public static final d63 G = new d63(10);
    public static final /* synthetic */ d63 H = new d63(11);
    public static final py2 I = new py2("PackageViewDescriptorFactory", 1);
    public static final d63 J = new d63(12);
    public static final ku4 K = new ku4(28);
    public static final ku4 L = new ku4(29);
    public static final kj6 M = new kj6(0);
    public static final kj6 N = new kj6(1);
    public static final d63 O = new d63(15);
    public static hx5 P;
    public static final d63 Q = new d63(16);
    public static final d63 R = new d63(17);
    public static final d63 S = new d63(18);
    public static final d63 x = new d63(1);
    public static final d63 y = new d63(2);
    public static final /* synthetic */ d63 z = new d63(3);
    public final /* synthetic */ int w;

    public /* synthetic */ d63(int i) {
        this.w = i;
    }

    public static void k(StringBuilder sb, eq3 eq3) {
        List parameters = eq3.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object next : parameters) {
            if (((t16) next).u() == qr3.x) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            dt0.D0(arrayList, sb, (String) null, "context(", ") ", l06.A, 50);
        }
    }

    public static void l(String str, StringBuilder sb) {
        sb.append(h49.L(uq4.e(str)));
    }

    public static void m(StringBuilder sb, eq3 eq3) {
        List a = ((p16) eq3).a();
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            t16 t16 = (t16) next;
            if (t16.u() == qr3.w || t16.u() == qr3.y) {
                arrayList.add(next);
            }
        }
        t16 t162 = (t16) dt0.z0(0, arrayList);
        if (t162 != null) {
            sb.append(v(t162.y(), false));
            sb.append(".");
        }
        t16 t163 = (t16) dt0.z0(1, arrayList);
        if (t163 != null) {
            sb.append("(");
            sb.append(v(t163.y(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    public static View n(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method method = je.i1;
            if (method == null) {
                method = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", (Class[]) null);
                je.i1 = method;
                method.setAccessible(true);
            }
            if (sg3.e(method.invoke(view, (Object[]) null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View n = n(viewGroup.getChildAt(i2), i);
                    if (n != null) {
                        return n;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [a00, java.lang.Object] */
    public static ArrayList o(Context context) {
        ActivityManager activityManager;
        Collection collection;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (collection = activityManager.getRunningAppProcesses()) == null) {
            collection = a42.w;
        }
        ArrayList u0 = dt0.u0(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            ? obj = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj.a = str2;
                obj.b = runningAppProcessInfo.pid;
                obj.c = runningAppProcessInfo.importance;
                obj.e = (byte) (((byte) (obj.e | 1)) | 2);
                obj.d = sg3.e(str2, str);
                obj.e = (byte) (obj.e | 4);
                arrayList2.add(obj.a());
            } else {
                ku4.j("Null processName");
                return null;
            }
        }
        return arrayList2;
    }

    public static boolean q() {
        Object obj;
        Method method;
        try {
            if (je.c1 == null) {
                je.c1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (je.d1 == null) {
                Class cls = je.c1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                } else {
                    method = null;
                }
                je.d1 = method;
            }
            Method method2 = je.d1;
            if (method2 != null) {
                obj = method2.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            return sg3.e(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String r(zq3 zq3) {
        StringBuilder sb = new StringBuilder();
        k(sb, zq3);
        sb.append("fun ");
        m(sb, zq3);
        l(zq3.getName(), sb);
        dt0.D0(su0.y(zq3), sb, ", ", "(", ")", l06.B, 48);
        sb.append(": ");
        sb.append(v(zq3.k(), false));
        return sb.toString();
    }

    public static void t(StringBuilder sb, gq3 gq3, vp2 vp2, List list, boolean z2, boolean z3) {
        boolean z4;
        StringBuilder sb2;
        if (gq3.getTypeParameters().size() >= list.size() || kl8.u(gq3).getDeclaringClass() == null) {
            sb2 = sb;
            z4 = z3;
            sb2.append(h49.K(vp2));
        } else {
            Class<?> declaringClass = kl8.u(gq3).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z4 = z3;
            t(sb2, b26.a.b(declaringClass), vp2.e(), dt0.s0(gq3.getTypeParameters().size(), list), false, z4);
            sb2.append(".");
            sb2.append(h49.L(vp2.g()));
        }
        x(sb2, dt0.V0(gq3.getTypeParameters().size(), list), z2, z4);
    }

    public static String v(as3 as3, boolean z2) {
        vp2 vp2;
        as3.getClass();
        c2 c2Var = (c2) as3;
        if (c2Var.y()) {
            c2 D2 = c2Var.D();
            D2.getClass();
            return v(D2, true);
        }
        c2 D3 = c2Var.D();
        c2 K2 = c2Var.K();
        if (D3 == null || K2 == null) {
            StringBuilder sb = new StringBuilder();
            as3 b = c2Var.b();
            if (b != null) {
                sb.append(b);
                sb.append(" /* = ");
            }
            vq3 J2 = as3.J();
            if (J2 instanceof cs3) {
                l(((cs3) J2).b(), sb);
                if (as3.v()) {
                    sb.append("?");
                } else if (c2Var.s()) {
                    sb.append(" & Any");
                }
            } else if (J2 instanceof gq3) {
                gq3 gq3 = (gq3) J2;
                if (c2Var.u()) {
                    vp2 = m27.b;
                } else {
                    gq3 g = c2Var.g();
                    if (g == null) {
                        g = gq3;
                    }
                    String l = g.l();
                    if (l != null) {
                        vp2 = new vp2(l);
                    } else {
                        vp2 = null;
                    }
                }
                if (vp2 == null) {
                    vp2 = new vp2(((oq3) gq3).x.getName());
                }
                if (!vp2.h(n27.j) || !sg3.e(ag8.t(vp2), dt2.d) || as3.I().contains(gs3.c)) {
                    t(sb, gq3, vp2, as3.I(), as3.v(), z2);
                } else {
                    if (c2Var.v()) {
                        sb.append("(");
                    }
                    if (c2Var.C()) {
                        sb.append("suspend ");
                    }
                    dt0.D0(dt0.t0(1, c2Var.I()), sb, (String) null, "(", ") -> ", (vr2) null, 114);
                    sb.append(dt0.G0(c2Var.I()));
                    if (c2Var.v()) {
                        sb.append(")?");
                    }
                }
            } else if (J2 instanceof bs3) {
                vp2 vp22 = ((bs3) J2).w.a;
                vp22.getClass();
                List f = vp2.f(vp22);
                StringBuilder sb2 = sb;
                dt0.D0(f, sb2, ".", (String) null, (String) null, l06.D, 60);
                sb = sb2;
                x(sb, as3.I(), as3.v(), z2);
            } else {
                sb.append("???");
            }
            if (c2Var.b() != null) {
                sb.append(" */");
            }
            return sb.toString();
        }
        String w2 = v(D3, false);
        String w3 = v(K2, false);
        if (sg3.e(w2, k57.s0(w3, "?", ""))) {
            return k57.s0(w3, "?", "!");
        }
        if (k57.m0(w3, "?", false)) {
            if ((w2 + '?').equals(w3)) {
                return w2 + '!';
            }
        }
        if (("(" + w2 + ")?").equals(w3)) {
            return f21.h("(", w2, ")!");
        }
        String M2 = z65.M(w2, w3, new wq5(w2, 2), new wq5(w2, 3), l06.E);
        if (M2 != null) {
            return M2;
        }
        return "(" + w2 + ".." + w3 + ')';
    }

    public static void x(StringBuilder sb, List list, boolean z2, boolean z3) {
        StringBuilder sb2;
        if (!list.isEmpty()) {
            sb2 = sb;
            dt0.D0(list, sb2, (String) null, "<", ">", new e26(z3), 50);
        } else {
            sb2 = sb;
        }
        if (z2) {
            sb2.append("?");
        }
    }

    public void D0(j43 j43, a97 a97) {
        mg5 mg5;
        z85 z85;
        ah5 ah5;
        zk2 zk2;
        hs2 hs2 = (hs2) a97;
        j43.getClass();
        zk2 zk22 = new zk2("ObservableContent", 2);
        s53 s53 = j43.z;
        zk2 zk23 = s53.m;
        ArrayList arrayList = s53.a;
        zk23.getClass();
        if (!s53.e(zk22)) {
            int c = s53.c(zk23);
            if (c != -1) {
                int i = c + 1;
                int x2 = sg3.x(arrayList);
                if (i <= x2) {
                    while (true) {
                        Object obj = arrayList.get(i);
                        if (obj instanceof mg5) {
                            mg5 = (mg5) obj;
                        } else {
                            mg5 = null;
                        }
                        if (mg5 != null && (z85 = mg5.b) != null) {
                            if (z85 instanceof ah5) {
                                ah5 = (ah5) z85;
                            } else {
                                ah5 = null;
                            }
                            if (!(ah5 == null || (zk2 = ah5.d) == null || zk2 != zk23)) {
                                c = i;
                            }
                            if (i == x2) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(c + 1, new mg5(zk22, new ah5(zk23)));
            } else {
                throw new j1("Phase " + zk23 + " was not registered for this pipeline", 3);
            }
        }
        s53.f(zk22, new fa(hs2, (f61) null, 0));
    }

    public float a() {
        return 0.0f;
    }

    public List b(String str) {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return qs.p1(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public long c(long j, long j2) {
        float f = h03.f(j, j2);
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        int i = yf6.a;
        return floatToRawIntBits;
    }

    public qp7 d(m16 m16) {
        m16.getClass();
        return null;
    }

    public void f(ri0 ri0) {
        if (ri0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"}));
        }
    }

    public boolean g(Class cls) {
        return nl8.class.isAssignableFrom(cls);
    }

    public vm8 h(Class cls) {
        Class<nl8> cls2 = nl8.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (vm8) nl8.n(cls.asSubclass(cls2)).s(3);
            } catch (Exception e) {
                ku4.o("Unable to get message info for ".concat(cls.getName()), e);
                return null;
            }
        } else {
            h.q("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
    }

    public boolean i(Object obj, Object obj2) {
        return false;
    }

    public void j(ml4 ml4, float f, long j, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        long j2;
        float f2;
        long j3;
        float f3;
        int i5;
        yt2 yt22 = yt2;
        yt22.g0(-1498258020);
        if (yt22.g(ml4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i | i3;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            if (yt22.d(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 |= i5;
        }
        if ((i2 & 4) != 0 || !yt22.f(j)) {
            i4 = 128;
        } else {
            i4 = 256;
        }
        int i8 = i6 | i4;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i8 & 1, z2)) {
            yt22.a0();
            if ((i & 1) == 0 || yt22.C()) {
                if (i7 != 0) {
                    f3 = jo5.b;
                } else {
                    f3 = f;
                }
                if ((i2 & 4) != 0) {
                    j3 = st0.e(jo5.a, yt22);
                    yt22.s();
                    mb0.a(b96.h(yu6.d(ml4.d(yu6.a), f3), j3, gr8.h), yt22, 0);
                    f2 = f3;
                    j2 = j3;
                }
            } else {
                yt22.Y();
                f3 = f;
            }
            j3 = j;
            yt22.s();
            mb0.a(b96.h(yu6.d(ml4.d(yu6.a), f3), j3, gr8.h), yt22, 0);
            f2 = f3;
            j2 = j3;
        } else {
            yt22.Y();
            f2 = f;
            j2 = j;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ya7(this, ml4, f2, j2, i, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [a00, java.lang.Object] */
    public ga1 p(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        Iterator it = o(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b00) ((ga1) obj)).b == myPid) {
                break;
            }
        }
        ga1 ga1 = (ga1) obj;
        if (ga1 != null) {
            return ga1;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        ? obj2 = new Object();
        obj2.a = str;
        obj2.b = myPid;
        obj2.c = 0;
        obj2.d = false;
        obj2.e = (byte) (((byte) (((byte) (obj2.e | 1)) | 2)) | 4);
        return obj2.a();
    }

    public Rect s(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e) {
            if ((e instanceof NoSuchFieldException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                ib0.b.getClass();
                Log.w(hb0.b, e);
                return hz2.y.s(activity);
            }
            throw e;
        }
    }

    public void s0(tp1 tp1, int i, int[] iArr, int[] iArr2) {
        wr.c(i, iArr, iArr2, false);
    }

    public String toString() {
        switch (this.w) {
            case 10:
                return "NeverEqualPolicy";
            case 20:
                return "Arrangement#SpaceEvenly";
            case 23:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public void u(tp1 tp1, int i, int[] iArr, ey3 ey3, int[] iArr2) {
        if (ey3 == ey3.w) {
            wr.c(i, iArr, iArr2, false);
        } else {
            wr.c(i, iArr, iArr2, true);
        }
    }

    public Boolean x0() {
        return Boolean.TRUE;
    }

    public void e(ql4 ql4, ArrayList arrayList) {
    }
}
