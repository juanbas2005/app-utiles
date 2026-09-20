package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* renamed from: b16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b16 extends g16 implements yj3 {
    public final Constructor a;

    public b16(Constructor constructor) {
        constructor.getClass();
        this.a = constructor;
    }

    public final Member b() {
        return this.a;
    }

    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable m16 : typeParameters) {
            arrayList.add(new m16(m16));
        }
        return arrayList;
    }
}
