package defpackage;

/* renamed from: vf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf5 extends wf5 implements ty0, qy0 {
    public static final vf5 z = new wf5(rn7.e, 0);

    /* JADX WARNING: type inference failed for: r0v0, types: [uf5, yf5] */
    public final yf5 a() {
        ? yf5 = new yf5(this);
        yf5.C = this;
        return yf5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [uf5, yf5] */
    public final yf5 b() {
        ? yf5 = new yf5(this);
        yf5.C = this;
        return yf5;
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof hu5)) {
            return false;
        }
        return super.containsKey((hu5) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof c28)) {
            return false;
        }
        return super.containsValue((c28) obj);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [vf5, wf5] */
    public final vf5 g(hu5 hu5, c28 c28) {
        qa u = this.w.u(hu5, hu5.hashCode(), c28, 0);
        if (u == null) {
            return this;
        }
        return new wf5((rn7) u.y, this.x + u.x);
    }

    public final Object g0(hu5 hu5) {
        return rc9.G0(this, hu5);
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof hu5)) {
            return null;
        }
        return (c28) super.get((hu5) obj);
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof hu5)) {
            return obj2;
        }
        return (c28) super.getOrDefault((hu5) obj, (c28) obj2);
    }
}
