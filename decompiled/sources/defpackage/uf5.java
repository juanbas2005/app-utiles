package defpackage;

/* renamed from: uf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf5 extends yf5 {
    public vf5 C;

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

    /* JADX WARNING: type inference failed for: r1v3, types: [wf5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    public final vf5 b() {
        rn7 rn7 = this.y;
        vf5 vf5 = this.C;
        rn7 rn72 = vf5.w;
        vf5 vf52 = vf5;
        if (rn7 != rn72) {
            this.x = new jv2(4);
            vf52 = new wf5(this.y, c());
        }
        this.C = vf52;
        return vf52;
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

    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof hu5)) {
            return null;
        }
        return (c28) super.remove((hu5) obj);
    }
}
