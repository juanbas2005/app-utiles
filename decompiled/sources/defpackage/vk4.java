package defpackage;

/* renamed from: vk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vk4 {
    public final int a;
    public final int b;

    public vk4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(ir2 ir2) {
        ir2.getClass();
        throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(ua6 ua6) {
        ua6.getClass();
        if (ua6 instanceof h87) {
            a(((h87) ua6).w);
            return;
        }
        throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
