package defpackage;

import java.lang.reflect.Method;

/* renamed from: rj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rj0 extends jj0 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj0(Method method) {
        super(method, false, 6);
        this.f = 0;
        method.getClass();
    }

    public final Object d(Object[] objArr) {
        Object[] objArr2;
        Object[] objArr3;
        switch (this.f) {
            case b85.b:
                e(objArr.length);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = qs.Q0(objArr, 1, objArr.length);
                }
                return h(obj, objArr2);
            case 1:
                e(objArr.length);
                g(qs.X0(objArr));
                if (objArr.length <= 1) {
                    objArr3 = new Object[0];
                } else {
                    objArr3 = qs.Q0(objArr, 1, objArr.length);
                }
                return h((Object) null, objArr3);
            default:
                e(objArr.length);
                return h((Object) null, objArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(Method method, boolean z, int i, int i2) {
        super(method, z, i);
        this.f = i2;
    }
}
