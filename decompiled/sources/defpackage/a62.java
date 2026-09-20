package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* renamed from: a62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a62 implements zr3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Object c;
    public final nz3 d;

    public a62(String str, Object obj) {
        obj.getClass();
        this.b = obj;
        this.c = a42.w;
        this.d = rg3.y(i44.w, new qm3(12, (Object) str, (Object) this));
    }

    public final Object deserialize(ok1 ok1) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b /*0*/:
                Enum[] enumArr = (Enum[]) obj;
                int u = ok1.u(getDescriptor());
                if (u >= 0 && u < enumArr.length) {
                    return enumArr[u];
                }
                String a2 = getDescriptor().a();
                int length = enumArr.length;
                throw new IllegalArgumentException(u + " is not among valid " + a2 + " enum values, values size is " + length);
            default:
                ll6 descriptor = getDescriptor();
                gy0 c2 = ok1.c(descriptor);
                int h = c2.h(getDescriptor());
                if (h == -1) {
                    c2.b(descriptor);
                    return obj;
                }
                throw new IllegalArgumentException(hl6.k(h, "Unexpected index "));
        }
    }

    public final ll6 getDescriptor() {
        switch (this.a) {
            case b85.b /*0*/:
                return (ll6) ((z97) this.d).getValue();
            default:
                return (ll6) this.d.getValue();
        }
    }

    public final void serialize(j42 j42, Object obj) {
        switch (this.a) {
            case b85.b /*0*/:
                Enum enumR = (Enum) obj;
                enumR.getClass();
                Enum[] enumArr = (Enum[]) this.b;
                int c1 = qs.c1(enumR, enumArr);
                if (c1 != -1) {
                    j42.u(getDescriptor(), c1);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(enumR);
                String a2 = getDescriptor().a();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(a2);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new IllegalArgumentException(sb.toString());
            default:
                obj.getClass();
                j42.c(getDescriptor()).b(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case b85.b /*0*/:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a62(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.c = asList;
    }

    public a62(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
        this.d = new z97(new f5(19, this, str));
    }
}
