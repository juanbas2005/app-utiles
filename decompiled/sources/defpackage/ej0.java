package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: ej0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ej0 extends sj0 implements db0 {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ej0(Constructor constructor, Object obj, int i) {
        super(constructor, r6, (Type[]) r0);
        Object obj2;
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                super(constructor, declaringClass, b35.p(constructor));
                this.f = obj;
                return;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                if (genericParameterTypes.length <= 2) {
                    obj2 = new Type[0];
                } else {
                    obj2 = qs.Q0(genericParameterTypes, 1, genericParameterTypes.length - 1);
                }
                this.f = obj;
                return;
        }
    }

    public final Object d(Object[] objArr) {
        int i = this.e;
        Object obj = this.f;
        Member member = this.c;
        switch (i) {
            case b85.b:
                e(objArr.length);
                be5 be5 = new be5(3);
                be5.a(obj);
                be5.b(objArr);
                be5.a((Object) null);
                ArrayList arrayList = be5.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                e(objArr.length + 1);
                be5 be52 = new be5(2);
                be52.a(obj);
                be52.b(objArr);
                ArrayList arrayList2 = be52.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
