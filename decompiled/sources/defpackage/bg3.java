package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: bg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bg3 extends sj0 implements db0 {
    public final Object e;

    public bg3(Method method, Object obj) {
        super(method, a42.w);
        this.e = obj;
    }

    public final Object d(Object[] objArr) {
        e(objArr.length);
        return ((Method) this.c).invoke(this.e, Arrays.copyOf(objArr, objArr.length));
    }
}
