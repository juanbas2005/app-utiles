package defpackage;

/* renamed from: ab6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface ab6 extends AutoCloseable {
    void F(int i, String str);

    boolean J() {
        if (getLong(0) != 0) {
            return true;
        }
        return false;
    }

    void K(double d);

    String R(int i);

    void f(long j, int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    void h(int i, byte[] bArr);

    boolean i0();

    boolean isNull(int i);

    void m(int i);

    void n();

    void reset();
}
