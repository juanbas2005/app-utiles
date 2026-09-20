package defpackage;

/* renamed from: mr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum mr5 implements mf3 {
    x("BYTE"),
    y("CHAR"),
    z("SHORT"),
    A("INT"),
    B("LONG"),
    C("FLOAT"),
    D("DOUBLE"),
    E("BOOLEAN"),
    F("STRING"),
    G("CLASS"),
    H("ENUM"),
    I("ANNOTATION"),
    J("ARRAY");
    
    public final int w;

    /* access modifiers changed from: public */
    mr5(String str) {
        this.w = r2;
    }

    public static mr5 b(int i) {
        switch (i) {
            case b85.b:
                return x;
            case 1:
                return y;
            case 2:
                return z;
            case 3:
                return A;
            case 4:
                return B;
            case 5:
                return C;
            case 6:
                return D;
            case 7:
                return E;
            case 8:
                return F;
            case 9:
                return G;
            case 10:
                return H;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return I;
            case 12:
                return J;
            default:
                return null;
        }
    }

    public final int a() {
        return this.w;
    }
}
