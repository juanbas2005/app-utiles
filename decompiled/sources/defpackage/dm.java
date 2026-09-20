package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dm  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm implements dj0 {
    public final Class a;
    public final ArrayList b;
    public final bm c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public dm(Class cls, ArrayList arrayList, bm bmVar, cm cmVar, List list) {
        cls.getClass();
        list.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = bmVar;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List<Method> list2 = this.d;
        ArrayList arrayList3 = new ArrayList(et0.e0(list2, 10));
        for (Method returnType : list2) {
            Class<?> returnType2 = returnType.getReturnType();
            returnType2.getClass();
            Class<?> cls2 = (Class) m06.c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList3.add(returnType2);
        }
        this.f = arrayList3;
        List<Method> list3 = this.d;
        ArrayList arrayList4 = new ArrayList(et0.e0(list3, 10));
        for (Method defaultValue : list3) {
            arrayList4.add(defaultValue.getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == bm.x && cmVar == cm.w && !dt0.J0(this.b, "value").isEmpty()) {
            kj6.n("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    public final List a() {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r12.isInstance(r9) == false) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0139 A[LOOP:0: B:3:0x0017->B:49:0x0139, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008e A[SYNTHETIC] */
    public final Object d(Object[] objArr) {
        Object[] objArr2;
        gq3 gq3;
        String str;
        Object[] objArr3;
        Object[] objArr4 = objArr;
        int length = objArr4.length;
        ArrayList arrayList = this.e;
        if (arrayList.size() == length) {
            ArrayList arrayList2 = new ArrayList(objArr4.length);
            int length2 = objArr4.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i < length2) {
                    Object[] objArr5 = objArr4[i];
                    int i3 = i2 + 1;
                    ArrayList arrayList4 = this.f;
                    if (objArr5 == null && this.c == bm.w) {
                        objArr2 = this.g.get(i2);
                    } else {
                        Class cls = (Class) arrayList4.get(i2);
                        if (objArr5 instanceof Class) {
                            objArr2 = null;
                        } else {
                            if (objArr5 instanceof gq3) {
                                objArr5 = kl8.u((gq3) objArr5);
                            } else if (objArr5 instanceof Object[]) {
                                Object[] objArr6 = (Object[]) objArr5;
                                if (objArr6 instanceof Class[]) {
                                    objArr3 = null;
                                    objArr2 = objArr3;
                                    if (objArr2 != null) {
                                        String str2 = (String) arrayList3.get(i2);
                                        Class cls2 = (Class) arrayList4.get(i2);
                                        Class<Class> cls3 = Class.class;
                                        if (sg3.e(cls2, cls3)) {
                                            gq3 = b26.a.b(gq3.class);
                                        } else if (!cls2.isArray() || !sg3.e(cls2.getComponentType(), cls3)) {
                                            gq3 = b26.a.b(cls2);
                                        } else {
                                            gq3 = b26.a.b(gq3[].class);
                                        }
                                        String l = gq3.l();
                                        c26 c26 = b26.a;
                                        if (sg3.e(l, c26.b(Object[].class).l())) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(gq3.l());
                                            sb.append('<');
                                            Class<?> componentType = kl8.u(gq3).getComponentType();
                                            componentType.getClass();
                                            sb.append(c26.b(componentType).l());
                                            sb.append('>');
                                            str = sb.toString();
                                        } else {
                                            str = gq3.l();
                                        }
                                        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + str);
                                    }
                                    arrayList2.add(objArr2);
                                    i++;
                                    i2 = i3;
                                } else if (objArr6 instanceof gq3[]) {
                                    gq3[] gq3Arr = (gq3[]) objArr5;
                                    ArrayList arrayList5 = new ArrayList(gq3Arr.length);
                                    for (gq3 u : gq3Arr) {
                                        arrayList5.add(kl8.u(u));
                                    }
                                    objArr3 = null;
                                    objArr5 = arrayList5.toArray(new Class[0]);
                                } else {
                                    objArr3 = null;
                                    objArr5 = objArr6;
                                }
                            }
                            objArr3 = null;
                        }
                    }
                    if (objArr2 != null) {
                    }
                } else {
                    return pv8.s(this.a, sf4.a0(dt0.i1(arrayList3, arrayList2)), this.d);
                }
            }
        } else {
            h.f(arrayList.size(), length);
            return null;
        }
    }

    public final Type k() {
        return this.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ dm(Class cls, ArrayList arrayList, bm bmVar) {
        this(cls, arrayList, bmVar, cm.x, r5);
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), (Class[]) null));
        }
    }
}
