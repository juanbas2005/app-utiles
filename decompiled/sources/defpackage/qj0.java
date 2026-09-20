package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: qj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qj0 extends jj0 implements db0 {
    public final boolean f;
    public final Object g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public qj0(Method method, boolean z, Object obj) {
        super(method, false, (Type[]) r0);
        Object obj2;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length <= 1) {
            obj2 = new Type[0];
        } else {
            obj2 = qs.Q0(genericParameterTypes, 1, genericParameterTypes.length);
        }
        this.f = z;
        this.g = obj;
    }

    public final Object d(Object[] objArr) {
        e(objArr.length);
        be5 be5 = new be5(2);
        be5.a(this.g);
        be5.b(objArr);
        ArrayList arrayList = be5.a;
        return h((Object) null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
