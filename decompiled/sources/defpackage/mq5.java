package defpackage;

/* renamed from: mq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq5 {
    public static final mq5 c = new mq5(0.0f, new ms0(0.0f));
    public final float a;
    public final ms0 b;

    public mq5(float f, ms0 ms0) {
        this.a = f;
        this.b = ms0;
        if (Float.isNaN(f)) {
            h.q("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq5)) {
            return false;
        }
        mq5 mq5 = (mq5) obj;
        if (this.a != mq5.a || !this.b.equals(mq5.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
