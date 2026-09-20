package defpackage;

/* renamed from: st2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class st2 {
    public int a;

    public st2(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        int i = this.a;
        return obj + "{ location = " + i + " }";
    }
}
