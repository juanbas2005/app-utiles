package defpackage;

import java.util.HashMap;

/* renamed from: as8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum as8 {
    x("ADD"),
    y("AND"),
    z("APPLY"),
    A("ASSIGN"),
    B("BITWISE_AND"),
    C("BITWISE_LEFT_SHIFT"),
    D("BITWISE_NOT"),
    E("BITWISE_OR"),
    F("BITWISE_RIGHT_SHIFT"),
    G("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    H("BITWISE_XOR"),
    I("BLOCK"),
    J("BREAK"),
    K("CASE"),
    L("CONST"),
    M("CONTINUE"),
    N("CREATE_ARRAY"),
    O("CREATE_OBJECT"),
    P("DEFAULT"),
    Q("DEFINE_FUNCTION"),
    R("DIVIDE"),
    S("EQUALS"),
    T("EXPRESSION_LIST"),
    U("FN"),
    V("FOR_IN"),
    W("FOR_IN_CONST"),
    X("FOR_IN_LET"),
    Y("FOR_LET"),
    Z("FOR_OF"),
    a0("FOR_OF_CONST"),
    b0("FOR_OF_LET"),
    c0("GET"),
    d0("GET_INDEX"),
    e0("GET_PROPERTY"),
    f0("GREATER_THAN"),
    g0("GREATER_THAN_EQUALS"),
    h0("IDENTITY_EQUALS"),
    i0("IDENTITY_NOT_EQUALS"),
    j0("IF"),
    k0("LESS_THAN"),
    l0("LESS_THAN_EQUALS"),
    m0("MODULUS"),
    n0("MULTIPLY"),
    o0("NEGATE"),
    p0("NOT"),
    q0("NOT_EQUALS"),
    r0("NULL"),
    s0("OR"),
    t0("POST_DECREMENT"),
    u0("POST_INCREMENT"),
    v0("QUOTE"),
    w0("PRE_DECREMENT"),
    x0("PRE_INCREMENT"),
    y0("RETURN"),
    z0("SET_PROPERTY"),
    A0("SUBTRACT"),
    B0("SWITCH"),
    C0("TERNARY"),
    D0("TYPEOF"),
    E0("UNDEFINED"),
    F0("VAR"),
    G0("WHILE");
    
    public static final HashMap H0 = null;
    public final int w;

    static {
        H0 = new HashMap();
        for (as8 as8 : values()) {
            H0.put(Integer.valueOf(as8.w), as8);
        }
    }

    /* access modifiers changed from: public */
    as8(String str) {
        this.w = r2;
    }

    public final String toString() {
        return Integer.valueOf(this.w).toString();
    }
}
