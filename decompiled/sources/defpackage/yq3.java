package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: yq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yq3 implements vp0 {
    public static final k26 w = new k26("<v#(\\d+)>");

    public static void D(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        int i;
        Object obj = hl1.class;
        boolean e = sg3.e(dt0.H0(arrayList2), obj);
        List list = arrayList2;
        if (e) {
            list = arrayList2.subList(0, arrayList2.size() - 1);
        }
        if (z2) {
            i = list.size() - 1;
        } else {
            i = list.size();
        }
        arrayList.addAll(list);
        int i2 = (i + 31) / 32;
        for (int i3 = 0; i3 < i2; i3++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            arrayList.add(cls);
        }
        if (!z) {
            obj = Object.class;
        }
        arrayList.add(obj);
    }

    public static Method W(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Method W;
        if (z) {
            clsArr[0] = cls;
        }
        Method X = X(cls, str, clsArr, cls2);
        if (X != null) {
            return X;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (W = W(superclass, str, clsArr, cls2, z)) != null) {
            return W;
        }
        Class[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i >= length) {
                return null;
            }
            Class cls4 = interfaces[i];
            cls4.getClass();
            Method W2 = W(cls4, str, clsArr, cls2, z);
            if (W2 != null) {
                return W2;
            }
            if (z) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, m06.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method X2 = X(cls3, str, clsArr, cls2);
                    if (X2 != null) {
                        return X2;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public static Method X(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (sg3.e(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (sg3.e(method.getName(), str) && sg3.e(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final mw3 F(int i, String str) {
        str.getClass();
        su3 T = T(i);
        if (T == null) {
            return null;
        }
        if (T.f != null) {
            throw new Error(f21.l(new StringBuilder("Local property "), T.b, " is an extension, which is not yet supported"));
        } else if (!su.q.C(su.a[36], T)) {
            return new mw3(this, str, (Object) null, T, fq3.j);
        } else {
            return new xv3(this, str, (Object) null, T, fq3.j);
        }
    }

    public final Method H(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(b());
        }
        jz0 m = g18.m(m06.d(b()), str2, true);
        D(arrayList, (ArrayList) m.x, false, z2);
        Class cls = (Class) m.y;
        cls.getClass();
        return W(U(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), cls, z);
    }

    public final Field K(String str) {
        String str2;
        str.getClass();
        Class cls = ((oq3) this).x;
        Field declaredField = cls.getDeclaredField(str);
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(cls);
        sb.append(':');
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        if (declaredFields.length == 0) {
            str2 = " no fields found";
        } else {
            str2 = "\n".concat(qs.f1(declaredFields, "\n", (String) null, (String) null, jo3.F, 30));
        }
        sb.append(str2);
        throw new Error(sb.toString());
    }

    public final Method N(String str, String str2) {
        Method W;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        jz0 m = g18.m(m06.d(b()), str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) m.x).toArray(new Class[0]);
        Class cls = (Class) m.y;
        cls.getClass();
        Method W2 = W(U(), str, clsArr, cls, false);
        if (W2 != null) {
            return W2;
        }
        if (!U().isInterface() || (W = W(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return W;
    }

    public final su3 O(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = new ArrayList();
        for (ru3 ru3 : (List) ((or3) ((pr3) this).y.getValue()).c.getValue()) {
            it0.h0(arrayList, ru3.b);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            su3 su3 = (su3) next;
            if (sg3.e(su3.b, str) && sg3.e(pd8.l(su3, this), str2)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            StringBuilder o = f21.o("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            o.append(this);
            throw new Error(o.toString());
        } else if (arrayList2.size() <= 1) {
            return (su3) dt0.Q0(arrayList2);
        } else {
            StringBuilder o2 = f21.o("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
            o2.append(this);
            throw new Error(o2.toString());
        }
    }

    public abstract Collection P();

    public abstract Collection Q();

    public abstract Collection R(uq4 uq4);

    public abstract cr5 S(int i);

    public abstract su3 T(int i);

    public Class U() {
        Class b = b();
        List list = m06.a;
        b.getClass();
        Class cls = (Class) m06.c.get(b);
        if (cls == null) {
            return b();
        }
        return cls;
    }

    public abstract Collection V(uq4 uq4);
}
