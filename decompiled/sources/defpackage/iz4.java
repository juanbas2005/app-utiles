package defpackage;

/* renamed from: iz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iz4 {
    public static final gz4 a;
    public static final gz4 b = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [gz4, java.lang.Object] */
    static {
        bu5 bu5 = bu5.c;
        gz4 gz4 = null;
        try {
            gz4 = (gz4) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        a = gz4;
    }
}
