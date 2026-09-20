package defpackage;

import java.util.Map;

/* renamed from: hf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hf4 implements zr3 {
    public final zr3 a;
    public final zr3 b;
    public final /* synthetic */ int c;
    public final nl6 d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public hf4(zr3 zr3, zr3 zr32, int i) {
        this(zr3, zr32, (byte) 0);
        this.c = i;
        switch (i) {
            case 1:
                this(zr3, zr32, (byte) 0);
                this.d = b85.e("kotlin.Pair", new ll6[0], new ff4(zr3, zr32, 1));
                return;
            default:
                this.d = b85.f("kotlin.collections.Map.Entry", n57.n, new ll6[0], new ff4(zr3, zr32, 0));
                return;
        }
    }

    public final Object deserialize(ok1 ok1) {
        Object obj;
        ll6 descriptor = getDescriptor();
        gy0 c2 = ok1.c(descriptor);
        Object obj2 = su0.k;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int h = c2.h(getDescriptor());
            if (h != -1) {
                if (h == 0) {
                    obj3 = c2.r(getDescriptor(), 0, this.a, (Object) null);
                } else if (h == 1) {
                    obj4 = c2.r(getDescriptor(), 1, this.b, (Object) null);
                } else {
                    throw new IllegalArgumentException(hl6.k(h, "Invalid index: "));
                }
            } else if (obj3 == obj2) {
                throw new IllegalArgumentException("Element 'key' is missing");
            } else if (obj4 != obj2) {
                switch (this.c) {
                    case b85.b:
                        obj = new gf4(obj3, obj4);
                        break;
                    default:
                        obj = new yb5(obj3, obj4);
                        break;
                }
                c2.b(descriptor);
                return obj;
            } else {
                throw new IllegalArgumentException("Element 'value' is missing");
            }
        }
    }

    public final ll6 getDescriptor() {
        switch (this.c) {
            case b85.b:
                return this.d;
            default:
                return this.d;
        }
    }

    public final void serialize(j42 j42, Object obj) {
        Object obj2;
        Object obj3;
        hy0 c2 = j42.c(getDescriptor());
        ll6 descriptor = getDescriptor();
        zr3 zr3 = this.a;
        int i = this.c;
        switch (i) {
            case b85.b:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                obj2 = entry.getKey();
                break;
            default:
                yb5 yb5 = (yb5) obj;
                yb5.getClass();
                obj2 = yb5.w;
                break;
        }
        c2.o(descriptor, 0, zr3, obj2);
        ll6 descriptor2 = getDescriptor();
        zr3 zr32 = this.b;
        switch (i) {
            case b85.b:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                obj3 = entry2.getValue();
                break;
            default:
                yb5 yb52 = (yb5) obj;
                yb52.getClass();
                obj3 = yb52.x;
                break;
        }
        c2.o(descriptor2, 1, zr32, obj3);
        c2.b(getDescriptor());
    }

    public hf4(zr3 zr3, zr3 zr32, byte b2) {
        this.a = zr3;
        this.b = zr32;
    }
}
