package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: uw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum uw3 {
    y(true),
    z(true),
    A(false),
    B(true),
    C(true),
    D(true),
    E(true),
    F(true),
    G(true),
    H(true),
    I(true),
    J(false),
    K(false),
    L(false),
    M(false),
    N(false),
    O(false),
    P(false),
    Q(false),
    R(false),
    S(false);
    
    public static final HashMap x = null;
    public final boolean w;

    static {
        uw3[] uw3Arr;
        w52 w52 = new w52(uw3Arr);
        U = w52;
        x = new HashMap();
        e2 e2Var = new e2(0, w52);
        while (e2Var.hasNext()) {
            uw3 uw3 = (uw3) e2Var.next();
            x.put(uw3.name(), uw3);
        }
        w52 w522 = U;
        ArrayList arrayList = new ArrayList();
        w522.getClass();
        e2 e2Var2 = new e2(0, w522);
        while (e2Var2.hasNext()) {
            Object next = e2Var2.next();
            if (((uw3) next).w) {
                arrayList.add(next);
            }
        }
        dt0.g1(arrayList);
        dt0.g1(U);
        uw3 uw32 = z;
        uw3 uw33 = y;
        sg3.E(uw32, uw33);
        sg3.E(S, uw33);
        sg3.E(L, uw33);
        uw3 uw34 = O;
        uw3 uw35 = M;
        sg3.E(uw34, uw35, uw33);
        sg3.E(N, uw35, uw33);
        sg3.E(P, uw33);
        sg3.E(Q, uw33);
        uw3 uw36 = R;
        uw3 uw37 = B;
        uw3 uw38 = C;
        sg3.E(uw36, uw37, uw38);
        uw3 uw39 = I;
        sg3.D(uw39);
        uw3 uw310 = H;
        sg3.D(uw310);
        sg3.D(G);
        uw3 uw311 = K;
        sg3.D(uw311);
        mm mmVar = mm.CONSTRUCTOR_PARAMETER;
        uw3 uw312 = E;
        sf4.V(new yb5(mmVar, uw312), new yb5(mm.FIELD, uw38), new yb5(mm.PROPERTY, uw37), new yb5(mm.FILE, uw311), new yb5(mm.PROPERTY_GETTER, uw310), new yb5(mm.PROPERTY_SETTER, uw39), new yb5(mm.RECEIVER, uw312), new yb5(mm.SETTER_PARAMETER, uw312), new yb5(mm.PROPERTY_DELEGATE_FIELD, uw38));
    }

    /* access modifiers changed from: public */
    uw3(boolean z2) {
        this.w = z2;
    }
}
