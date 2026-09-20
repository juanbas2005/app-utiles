package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmq6;", "Lpl4;", "Lw90;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mq6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq6 extends pl4 {
    public final pq6 w;
    public final boolean x;
    public final long y;
    public final long z;

    public mq6(pq6 pq6, boolean z2, long j, long j2) {
        this.w = pq6;
        this.x = z2;
        this.y = j;
        this.z = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq6)) {
            return false;
        }
        mq6 mq6 = (mq6) obj;
        if (lx1.b(3.0f, 3.0f) && sg3.e(this.w, mq6.w) && this.x == mq6.x && jt0.c(this.y, mq6.y) && jt0.c(this.z, mq6.z)) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new w90(new pb(21, this));
    }

    public final void h(ll4 ll4) {
        w90 w90 = (w90) ll4;
        pb pbVar = new pb(21, this);
        w90.K = pbVar;
        su0.Q(w90, pbVar);
    }

    public final int hashCode() {
        int i = hl6.i((this.w.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.x);
        int i2 = jt0.h;
        return Long.hashCode(this.z) + pb4.b(i, 31, this.y);
    }

    public final String toString() {
        String c = lx1.c(3.0f);
        String i = jt0.i(this.y);
        String i2 = jt0.i(this.z);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(c);
        sb.append(", shape=");
        sb.append(this.w);
        sb.append(", clip=");
        sb.append(this.x);
        sb.append(", ambientColor=");
        sb.append(i);
        sb.append(", spotColor=");
        return f21.l(sb, i2, ")");
    }
}
