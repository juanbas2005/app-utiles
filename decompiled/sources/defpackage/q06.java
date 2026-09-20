package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q06 extends o06 {
    public final Object[] b;

    public q06(uq4 uq4, Object[] objArr) {
        super(uq4);
        this.b = objArr;
    }

    public final ArrayList a() {
        Object obj;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            obj2.getClass();
            Class<?> cls = obj2.getClass();
            List list = m06.a;
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new d16((uq4) null, (Enum) obj2);
            } else if (obj2 instanceof Annotation) {
                obj = new p06((uq4) null, (Annotation) obj2);
            } else if (obj2 instanceof Object[]) {
                obj = new q06((uq4) null, (Object[]) obj2);
            } else if (obj2 instanceof Class) {
                obj = new z06((uq4) null, (Class) obj2);
            } else {
                obj = new f16((uq4) null, obj2);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
