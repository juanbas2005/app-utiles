package defpackage;

import java.util.ArrayList;

/* renamed from: su  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class su {
    public static final qc3 A;
    public static final /* synthetic */ yr3[] a;
    public static final am6 b = b96.I(hu.D);
    public static final am6 c = b96.T(qu.D);
    public static final am6 d;
    public static final qc3 e;
    public static final qc3 f;
    public static final am6 g = b96.T(ru.D);
    public static final am6 h = b96.T(mu.D);
    public static final am6 i = b96.I(iu.D);
    public static final qc3 j;
    public static final qc3 k;
    public static final qc3 l;
    public static final qc3 m;
    public static final qc3 n;
    public static final am6 o = b96.T(nu.D);
    public static final am6 p = b96.I(fu.D);
    public static final qc3 q;
    public static final qc3 r;
    public static final am6 s = b96.T(ou.D);
    public static final am6 t = b96.I(gu.D);
    public static final qc3 u;
    public static final qc3 v;
    public static final qc3 w;
    public static final qc3 x;
    public static final qc3 y;
    public static final qc3 z = new qc3((qp4) bu.D, new sg2(0, 1, 1));

    static {
        Class<su> cls = su.class;
        qp4 qp4 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp42 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1);
        qp4 qp43 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp44 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp45 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1);
        qp4 qp46 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1);
        qp4 qp47 = new qp4(cls, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1);
        qp4 qp48 = new qp4(cls, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1);
        qp4 qp49 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp410 = new qp4(cls, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", 1);
        qp4 qp411 = qp4;
        qp4 qp412 = qp48;
        qp4 qp413 = new qp4(cls, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp414 = qp42;
        qp4 qp415 = new qp4(cls, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp416 = new qp4(cls, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp417 = qp43;
        qp4 qp418 = new qp4(cls, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp419 = qp44;
        qp4 qp420 = new qp4(cls, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp421 = new qp4(cls, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp422 = new qp4(cls, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1);
        qp4 qp423 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp424 = new qp4(cls, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1);
        qp4 qp425 = new qp4(cls, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1);
        qp4 qp426 = qp45;
        qp4 qp427 = new qp4(cls, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1);
        qp4 qp428 = new qp4(cls, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1);
        qp4 qp429 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp430 = new qp4(cls, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1);
        qp4 qp431 = qp46;
        qp4 qp432 = new qp4(cls, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp433 = new qp4(cls, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp434 = new qp4(cls, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp435 = qp47;
        qp4 qp436 = new qp4(cls, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp437 = new qp4(cls, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp438 = qp436;
        qp4 qp439 = new qp4(cls, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp440 = new qp4(cls, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp441 = new qp4(cls, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1);
        qp4 qp442 = new qp4(cls, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1);
        qp4 qp443 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp444 = new qp4(cls, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1);
        qp4 qp445 = new qp4(cls, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1);
        qp4 qp446 = new qp4(cls, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp447 = new qp4(cls, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp448 = new qp4(cls, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp449 = new qp4(cls, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp450 = new qp4(cls, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp451 = qp449;
        qp4 qp452 = new qp4(cls, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp453 = new qp4(cls, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1);
        qp4 qp454 = new qp4(cls, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1);
        qp4 qp455 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp456 = qp453;
        qp4 qp457 = new qp4(cls, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1);
        qp4 qp458 = qp454;
        qp4 qp459 = new qp4(cls, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1);
        qp4 qp460 = new qp4(cls, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1);
        qp4 qp461 = new qp4(cls, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1);
        qp4 qp462 = new qp4(cls, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1);
        qp4 qp463 = new qp4(cls, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1);
        qp4 qp464 = new qp4(cls, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1);
        qp4 qp465 = qp462;
        qp4 qp466 = new qp4(cls, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1);
        qp4 qp467 = new qp4(cls, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1);
        qp4 qp468 = qp467;
        a = new yr3[]{qp411, qp414, qp417, qp419, qp426, qp431, qp435, qp412, qp49, qp410, qp413, qp415, qp416, qp418, qp420, qp421, qp422, qp423, qp424, qp425, qp427, qp428, qp429, qp430, qp432, qp433, qp434, qp438, qp437, qp439, qp440, qp441, qp442, qp443, qp444, qp445, qp446, qp447, qp448, qp451, qp450, qp452, qp456, qp458, qp455, qp457, qp459, qp460, qp461, qp465, qp463, qp464, qp466, qp468, new qp4(cls, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new qp4(cls, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new qp4(cls, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new qp4(cls, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new qp4(cls, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
        tg2 tg2 = wg2.c;
        tg2.getClass();
        sg2 sg2 = new sg2(tg2, 1);
        lg2 lg2 = lg2.D;
        if (sg2.b == 1 && sg2.c == 1) {
            sg2 sg22 = new sg2(tg2, 1);
            int i2 = mg2.D;
            if (sg22.b == 1) {
                sg2 sg23 = new sg2(tg2, 1);
                ng2 ng2 = ng2.D;
                if (sg23.b == 1 && sg23.c == 1) {
                    sg2 sg24 = new sg2(tg2, 1);
                    pg2 pg2 = pg2.D;
                    if (sg24.b == 1 && sg24.c == 1) {
                        sg2 sg25 = new sg2(tg2, 1);
                        og2 og2 = og2.D;
                        if (sg25.b == 1 && sg25.c == 1) {
                            sg2 sg26 = new sg2(tg2, 1);
                            rg2 rg2 = rg2.D;
                            if (sg26.b == 1 && sg26.c == 1) {
                                sg2 sg27 = new sg2(tg2, 1);
                                if (sg27.b == 1) {
                                    du duVar = du.D;
                                    ug2 ug2 = wg2.f;
                                    ug2.getClass();
                                    w52 w52 = hq0.F;
                                    ArrayList arrayList = new ArrayList(et0.e0(w52, 10));
                                    e2 e2Var = new e2(0, w52);
                                    while (e2Var.hasNext()) {
                                        arrayList.add(((hq0) e2Var.next()).w);
                                    }
                                    d = new am6((qp4) duVar, (vg2) ug2, (u52) w52, arrayList);
                                    tg2 tg22 = wg2.g;
                                    tg22.getClass();
                                    sg2 sg28 = new sg2(tg22, 1);
                                    lg2 lg22 = lg2.D;
                                    e = new qc3((qp4) lg22, sg28);
                                    tg2 tg23 = wg2.h;
                                    tg23.getClass();
                                    sg2 sg29 = new sg2(tg23, 1);
                                    if (sg29.b == 1 && sg29.c == 1) {
                                        tg2 tg24 = wg2.i;
                                        tg24.getClass();
                                        sg2 sg210 = new sg2(tg24, 1);
                                        if (sg210.b == 1 && sg210.c == 1) {
                                            tg2 tg25 = wg2.j;
                                            tg25.getClass();
                                            sg2 sg211 = new sg2(tg25, 1);
                                            if (sg211.b == 1 && sg211.c == 1) {
                                                tg2 tg26 = wg2.k;
                                                tg26.getClass();
                                                f = new qc3((qp4) lg22, new sg2(tg26, 1));
                                                tg2 tg27 = wg2.l;
                                                tg27.getClass();
                                                sg2 sg212 = new sg2(tg27, 1);
                                                if (sg212.b == 1 && sg212.c == 1) {
                                                    tg2 tg28 = wg2.m;
                                                    tg28.getClass();
                                                    sg2 sg213 = new sg2(tg28, 1);
                                                    if (sg213.b == 1 && sg213.c == 1) {
                                                        tg2 tg29 = wg2.n;
                                                        tg29.getClass();
                                                        sg2 sg214 = new sg2(tg29, 1);
                                                        int i3 = mg2.D;
                                                        if (sg214.b == 1) {
                                                            tg2 tg210 = wg2.o;
                                                            tg210.getClass();
                                                            sg2 sg215 = new sg2(tg210, 1);
                                                            if (sg215.b == 1) {
                                                                ku kuVar = ku.D;
                                                                ug2 ug22 = wg2.p;
                                                                ug22.getClass();
                                                                b96.Q(kuVar, ug22);
                                                                b96.H(eu.D);
                                                                tg2 tg211 = wg2.r;
                                                                tg211.getClass();
                                                                sg2 sg216 = new sg2(tg211, 1);
                                                                ng2 ng22 = ng2.D;
                                                                j = new qc3((qp4) ng22, sg216);
                                                                tg2 tg212 = wg2.s;
                                                                tg212.getClass();
                                                                k = new qc3((qp4) ng22, new sg2(tg212, 1));
                                                                tg2 tg213 = wg2.t;
                                                                tg213.getClass();
                                                                l = new qc3((qp4) ng22, new sg2(tg213, 1));
                                                                tg2 tg214 = wg2.u;
                                                                tg214.getClass();
                                                                sg2 sg217 = new sg2(tg214, 1);
                                                                if (sg217.b == 1 && sg217.c == 1) {
                                                                    tg2 tg215 = wg2.v;
                                                                    tg215.getClass();
                                                                    m = new qc3((qp4) ng22, new sg2(tg215, 1));
                                                                    tg2 tg216 = wg2.w;
                                                                    tg216.getClass();
                                                                    n = new qc3((qp4) ng22, new sg2(tg216, 1));
                                                                    tg2 tg217 = wg2.x;
                                                                    tg217.getClass();
                                                                    sg2 sg218 = new sg2(tg217, 1);
                                                                    if (sg218.b == 1 && sg218.c == 1) {
                                                                        tg2 tg218 = wg2.y;
                                                                        tg218.getClass();
                                                                        sg2 sg219 = new sg2(tg218, 1);
                                                                        if (sg219.b == 1 && sg219.c == 1) {
                                                                            lu luVar = lu.D;
                                                                            ug2 ug23 = wg2.z;
                                                                            ug23.getClass();
                                                                            b96.Q(luVar, ug23);
                                                                            b96.H(cu.D);
                                                                            tg2 tg219 = wg2.A;
                                                                            tg219.getClass();
                                                                            sg2 sg220 = new sg2(tg219, 1);
                                                                            pg2 pg22 = pg2.D;
                                                                            q = new qc3((qp4) pg22, sg220);
                                                                            tg2 tg220 = wg2.D;
                                                                            tg220.getClass();
                                                                            sg2 sg221 = new sg2(tg220, 1);
                                                                            if (sg221.b == 1 && sg221.c == 1) {
                                                                                tg2 tg221 = wg2.E;
                                                                                tg221.getClass();
                                                                                sg2 sg222 = new sg2(tg221, 1);
                                                                                if (sg222.b == 1 && sg222.c == 1) {
                                                                                    tg2 tg222 = wg2.F;
                                                                                    tg222.getClass();
                                                                                    sg2 sg223 = new sg2(tg222, 1);
                                                                                    if (sg223.b == 1 && sg223.c == 1) {
                                                                                        tg2 tg223 = wg2.G;
                                                                                        tg223.getClass();
                                                                                        sg2 sg224 = new sg2(tg223, 1);
                                                                                        if (sg224.b == 1 && sg224.c == 1) {
                                                                                            tg2 tg224 = wg2.H;
                                                                                            tg224.getClass();
                                                                                            r = new qc3((qp4) pg22, new sg2(tg224, 1));
                                                                                            tg2 tg225 = wg2.I;
                                                                                            tg225.getClass();
                                                                                            sg2 sg225 = new sg2(tg225, 1);
                                                                                            if (sg225.b == 1 && sg225.c == 1) {
                                                                                                ju juVar = ju.D;
                                                                                                ug2 ug24 = wg2.J;
                                                                                                ug24.getClass();
                                                                                                b96.Q(juVar, ug24);
                                                                                                tg2 tg226 = wg2.N;
                                                                                                tg226.getClass();
                                                                                                sg2 sg226 = new sg2(tg226, 1);
                                                                                                og2 og22 = og2.D;
                                                                                                if (sg226.b == 1 && sg226.c == 1) {
                                                                                                    tg2 tg227 = wg2.O;
                                                                                                    tg227.getClass();
                                                                                                    u = new qc3((qp4) og22, new sg2(tg227, 1));
                                                                                                    tg2 tg228 = wg2.P;
                                                                                                    tg228.getClass();
                                                                                                    v = new qc3((qp4) og22, new sg2(tg228, 1));
                                                                                                    sg2 sg227 = new sg2(0, 1, 1);
                                                                                                    qg2 qg2 = qg2.D;
                                                                                                    w = new qc3((qp4) qg2, sg227);
                                                                                                    tg2 tg229 = wg2.a;
                                                                                                    x = new qc3((qp4) qg2, new sg2(tg229.b + 1, tg229.c, 1));
                                                                                                    tg2 tg230 = wg2.b;
                                                                                                    y = new qc3((qp4) qg2, new sg2(tg230.b + 1, tg230.c, 1));
                                                                                                    b96.T(pu.D);
                                                                                                    tg2 tg231 = wg2.K;
                                                                                                    tg231.getClass();
                                                                                                    A = new qc3((qp4) rg2.D, new sg2(tg231, 1));
                                                                                                    tg2 tg232 = wg2.L;
                                                                                                    tg232.getClass();
                                                                                                    sg2 sg228 = new sg2(tg232, 1);
                                                                                                    if (sg228.b == 1 && sg228.c == 1) {
                                                                                                        tg2 tg233 = wg2.M;
                                                                                                        tg233.getClass();
                                                                                                        sg2 sg229 = new sg2(tg233, 1);
                                                                                                        if (sg229.b == 1 && sg229.c == 1) {
                                                                                                            tg2 tg234 = wg2.Q;
                                                                                                            tg234.getClass();
                                                                                                            sg2 sg230 = new sg2(tg234, 1);
                                                                                                            if (sg230.b == 1) {
                                                                                                                tg2 tg235 = wg2.R;
                                                                                                                tg235.getClass();
                                                                                                                sg2 sg231 = new sg2(tg235, 1);
                                                                                                                if (sg231.b != 1) {
                                                                                                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg231, " was passed"));
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg230, " was passed"));
                                                                                                            return;
                                                                                                        }
                                                                                                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg229, " was passed"));
                                                                                                        return;
                                                                                                    }
                                                                                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg228, " was passed"));
                                                                                                    return;
                                                                                                }
                                                                                                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg226, " was passed"));
                                                                                                return;
                                                                                            }
                                                                                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg225, " was passed"));
                                                                                            return;
                                                                                        }
                                                                                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg224, " was passed"));
                                                                                        return;
                                                                                    }
                                                                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg223, " was passed"));
                                                                                    return;
                                                                                }
                                                                                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg222, " was passed"));
                                                                                return;
                                                                            }
                                                                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg221, " was passed"));
                                                                            return;
                                                                        }
                                                                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg219, " was passed"));
                                                                        return;
                                                                    }
                                                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg218, " was passed"));
                                                                    return;
                                                                }
                                                                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg217, " was passed"));
                                                                return;
                                                            }
                                                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg215, " was passed"));
                                                            return;
                                                        }
                                                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg214, " was passed"));
                                                        return;
                                                    }
                                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg213, " was passed"));
                                                    return;
                                                }
                                                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg212, " was passed"));
                                                return;
                                            }
                                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg211, " was passed"));
                                            return;
                                        }
                                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg210, " was passed"));
                                        return;
                                    }
                                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg29, " was passed"));
                                    return;
                                }
                                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg27, " was passed"));
                                return;
                            }
                            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg26, " was passed"));
                            return;
                        }
                        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg25, " was passed"));
                        return;
                    }
                    h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg24, " was passed"));
                    return;
                }
                h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg23, " was passed"));
                return;
            }
            h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg22, " was passed"));
            return;
        }
        h.j(b81.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", sg2, " was passed"));
    }

    public static final hq0 a(gu3 gu3) {
        return (hq0) d.I(a[9], gu3);
    }

    public static final k78 b(su3 su3) {
        su3.getClass();
        return (k78) o.I(a[33], su3);
    }
}
