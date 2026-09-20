package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j06 extends bt0 {
    public final gq3 b;
    public final zr c;

    public j06(gq3 gq3, zr3 zr3) {
        super(zr3);
        this.b = gq3;
        ll6 descriptor = zr3.getDescriptor();
        descriptor.getClass();
        this.c = new zr(descriptor, 0);
    }

    public final Object a() {
        return new ArrayList();
    }

    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new e2(objArr);
    }

    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    public final Object g(Object obj) {
        throw null;
    }

    public final ll6 getDescriptor() {
        return this.c;
    }

    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance(kl8.u(this.b), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
