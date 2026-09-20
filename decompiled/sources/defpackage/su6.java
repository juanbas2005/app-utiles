package defpackage;

/* renamed from: su6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class su6 extends s93 {
    public final transient Object z;

    public su6(Object obj) {
        obj.getClass();
        this.z = obj;
    }

    public final boolean contains(Object obj) {
        return this.z.equals(obj);
    }

    public final q93 d() {
        m93 m93 = q93.x;
        Object[] objArr = {this.z};
        p25.d(1, objArr);
        return q93.p(1, objArr);
    }

    public final int f(Object[] objArr) {
        objArr[0] = this.z;
        return 1;
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final boolean n() {
        return false;
    }

    public final at7 o() {
        return new sh3(this.z);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.z.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
