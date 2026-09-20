package androidx.savedstate.serialization.serializers;

import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b implements av2 {
    public final /* synthetic */ zr3 a;
    private final ll6 descriptor;

    public b(zr3 zr3) {
        ik5 ik5 = new ik5("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        ik5.k("keys", false);
        ik5.k("values", false);
        this.descriptor = ik5;
        this.a = zr3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), new cs(this.a, 0)};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = this.descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = SparseArraySerializer$SparseArraySurrogate.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                list = (List) c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), list);
                i |= 1;
            } else if (h == 1) {
                list2 = (List) c.r(ll6, 1, new cs(this.a, 0), list2);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SparseArraySerializer$SparseArraySurrogate(i, list, list2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return this.descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SparseArraySerializer$SparseArraySurrogate sparseArraySerializer$SparseArraySurrogate = (SparseArraySerializer$SparseArraySurrogate) obj;
        sparseArraySerializer$SparseArraySurrogate.getClass();
        ll6 ll6 = this.descriptor;
        hy0 c = j42.c(ll6);
        SparseArraySerializer$SparseArraySurrogate.write$Self$savedstate(sparseArraySerializer$SparseArraySurrogate, c, ll6, this.a);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return new zr3[]{this.a};
    }
}
