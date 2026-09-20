package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: uv3  reason: default package */
public final class uv3 implements sr2 {
    public final /* synthetic */ int w;
    public final vv3 x;

    public /* synthetic */ uv3(vv3 vv3, int i) {
        this.w = i;
        this.x = vv3;
    }

    public final Object b() {
        Object obj;
        dj0 dj0;
        Object obj2;
        dj0 dj02;
        int i = this.w;
        boolean z = false;
        vv3 vv3 = this.x;
        switch (i) {
            case b85.b:
                vv3 vv32 = this.x;
                return ag8.l(vv32, vv32.R(), vv32.S(), vv32.V(), vv32.U(), true);
            case 1:
                vv3 vv33 = this.x;
                if (r16.Z(vv33)) {
                    return ag8.l(vv33, vv33.R(), vv33.S(), vv33.V(), vv33.U(), false);
                }
                return vv33.a();
            case 2:
                boolean a0 = r16.a0(vv3);
                yq3 yq3 = vv3.x;
                if (a0 || (yq3 instanceof pr3)) {
                    to3 T = vv3.T();
                    String str = T.D;
                    if (!r16.a0(vv3) || ((yq3 instanceof oq3) && ((oq3) yq3).z())) {
                        obj = yq3.N(T.C, str);
                    } else if (r16.Y(vv3)) {
                        Class b = yq3.b();
                        List<t16> parameters = vv3.getParameters();
                        ArrayList arrayList = new ArrayList(et0.e0(parameters, 10));
                        for (t16 name : parameters) {
                            String name2 = name.getName();
                            name2.getClass();
                            arrayList.add(name2);
                        }
                        return new dm(b, arrayList, bm.x);
                    } else {
                        yq3.getClass();
                        str.getClass();
                        Class b2 = yq3.b();
                        try {
                            Class[] clsArr = (Class[]) ((ArrayList) g18.m(m06.d(yq3.b()), str, false).x).toArray(new Class[0]);
                            obj = b2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        } catch (NoSuchMethodException unused) {
                            obj = null;
                        }
                    }
                    if (obj instanceof Constructor) {
                        dj0 = vv3.P((Constructor) obj, false);
                    } else if (obj instanceof Method) {
                        dj0 = vv3.Q((Method) obj, false);
                    } else {
                        rf2.x("Could not compute caller for function: ", vv3);
                        return null;
                    }
                    return l55.j(dj0, vv3, a42.w, false);
                }
                StringBuilder sb = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                sb.append(yq3);
                rf2.n(sb, vv3.getName(), vv3.y);
                return null;
            default:
                boolean a02 = r16.a0(vv3);
                yq3 yq32 = vv3.x;
                if (a02 || (yq32 instanceof pr3)) {
                    to3 T2 = vv3.T();
                    ArrayList arrayList2 = new ArrayList();
                    if (!r16.a0(vv3) || ((yq32 instanceof oq3) && ((oq3) yq32).z())) {
                        jz0 p = fb5.p(vv3, T2.D);
                        arrayList2.addAll((Set) p.y);
                        String str2 = T2.C;
                        String str3 = (String) p.x;
                        Member b3 = vv3.n().b();
                        b3.getClass();
                        boolean z2 = !Modifier.isStatic(b3.getModifiers());
                        List a = vv3.a();
                        if (a == null || !a.isEmpty()) {
                            Iterator it = a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((t16) it.next()).u() == qr3.y) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        obj2 = yq32.H(str2, str3, z2, z);
                    } else if (r16.Y(vv3)) {
                        Class b4 = yq32.b();
                        List<t16> parameters2 = vv3.getParameters();
                        ArrayList arrayList3 = new ArrayList(et0.e0(parameters2, 10));
                        for (t16 name3 : parameters2) {
                            String name4 = name3.getName();
                            name4.getClass();
                            arrayList3.add(name4);
                        }
                        return new dm(b4, arrayList3, bm.w);
                    } else {
                        jz0 p2 = fb5.p(vv3, vv3.T().D);
                        arrayList2.addAll((Set) p2.y);
                        String str4 = (String) p2.x;
                        yq32.getClass();
                        str4.getClass();
                        Class b5 = yq32.b();
                        ArrayList arrayList4 = new ArrayList();
                        yq3.D(arrayList4, (ArrayList) g18.m(m06.d(yq32.b()), str4, false).x, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            obj2 = b5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            obj2 = null;
                        }
                    }
                    if (obj2 instanceof Constructor) {
                        dj02 = vv3.P((Constructor) obj2, true);
                    } else if (obj2 instanceof Method) {
                        dj02 = vv3.Q((Method) obj2, vv3.n().c());
                    } else {
                        dj02 = null;
                    }
                    if (dj02 != null) {
                        return l55.j(dj02, vv3, arrayList2, true);
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                sb2.append(yq32);
                rf2.n(sb2, vv3.getName(), vv3.y);
                return null;
        }
    }
}
