package defpackage;

import java.util.List;

/* renamed from: q16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class q16 implements p16 {
    public final fq3 w;

    public q16(fq3 fq3) {
        fq3.getClass();
        this.w = fq3;
        p25.u((ri0) null, new xi5(0, this, r16.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, 0, 15));
    }

    public final Object O(Object... objArr) {
        try {
            return n().d(objArr);
        } catch (IllegalAccessException e) {
            throw new Exception(e);
        }
    }

    public List a() {
        return getParameters();
    }
}
