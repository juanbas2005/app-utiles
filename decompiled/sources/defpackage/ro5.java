package defpackage;

import java.util.Set;

/* renamed from: ro5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum ro5 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set A = null;
    public final uq4 w;
    public final uq4 x;
    public final nz3 y;
    public final nz3 z;

    static {
        ro5 ro5;
        ro5 ro52;
        ro5 ro53;
        ro5 ro54;
        ro5 ro55;
        ro5 ro56;
        ro5 ro57;
        ro5 ro58 = ro57;
        ro5 ro59 = ro54;
        ro5 ro510 = ro5;
        A = qs.r1(new ro5[]{ro510, ro52, ro53, ro59, ro55, ro56, ro58});
    }

    /* access modifiers changed from: public */
    ro5(String str) {
        this.w = uq4.e(str);
        this.x = uq4.e(str.concat("Array"));
        qo5 qo5 = new qo5(this, 0);
        i44 i44 = i44.w;
        this.y = rg3.y(i44, qo5);
        this.z = rg3.y(i44, new qo5(this, 1));
    }
}
