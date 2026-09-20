package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fj0 extends sj0 {
    public final /* synthetic */ int e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public fj0(Constructor constructor, int i) {
        super(constructor, r6, (Type[]) r0);
        Object obj;
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                super(constructor, declaringClass, b35.p(constructor));
                return;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                if (genericParameterTypes.length <= 1) {
                    obj = new Type[0];
                } else {
                    obj = qs.Q0(genericParameterTypes, 0, genericParameterTypes.length - 1);
                }
                return;
        }
    }

    public final Object d(Object[] objArr) {
        int i = this.e;
        Member member = this.c;
        switch (i) {
            case b85.b:
                e(objArr.length);
                be5 be5 = new be5(2);
                be5.b(objArr);
                be5.a((Object) null);
                ArrayList arrayList = be5.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                e(objArr.length);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
