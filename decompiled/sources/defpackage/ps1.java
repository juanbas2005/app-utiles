package defpackage;

import java.util.Set;

/* renamed from: ps1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ps1 implements os1 {
    public static final /* synthetic */ yr3[] Z;
    public final jz0 A;
    public final jz0 B;
    public final jz0 C;
    public final jz0 D;
    public final jz0 E;
    public final jz0 F;
    public final jz0 G;
    public final jz0 H;
    public final jz0 I;
    public final jz0 J;
    public final jz0 K;
    public final jz0 L;
    public final jz0 M;
    public final jz0 N;
    public final jz0 O;
    public final jz0 P;
    public final jz0 Q;
    public final jz0 R;
    public final jz0 S;
    public final jz0 T;
    public final jz0 U;
    public final jz0 V;
    public final jz0 W;
    public final jz0 X;
    public final jz0 Y;
    public boolean a;
    public final jz0 b = new jz0(12, xq0.d, this);
    public final jz0 c;
    public final jz0 d;
    public final jz0 e;
    public final jz0 f;
    public final jz0 g;
    public final jz0 h;
    public final jz0 i;
    public final jz0 j;
    public final jz0 k;
    public final jz0 l;
    public final jz0 m;
    public final jz0 n;
    public final jz0 o;
    public final jz0 p;
    public final jz0 q;
    public final jz0 r;
    public final jz0 s;
    public final jz0 t;
    public final jz0 u;
    public final jz0 v;
    public final jz0 w;
    public final jz0 x;
    public final jz0 y;
    public final jz0 z;

    static {
        Class<ps1> cls = ps1.class;
        qp4 qp4 = new qp4(cls, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        qp4 qp42 = new qp4(cls, "withDefinedIn", "getWithDefinedIn()Z", 0);
        qp4 qp43 = qp4;
        qp4 qp44 = qp42;
        Z = new yr3[]{qp43, qp44, new qp4(cls, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new qp4(cls, "modifiers", "getModifiers()Ljava/util/Set;", 0), new qp4(cls, "startFromName", "getStartFromName()Z", 0), new qp4(cls, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new qp4(cls, "debugMode", "getDebugMode()Z", 0), new qp4(cls, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new qp4(cls, "verbose", "getVerbose()Z", 0), new qp4(cls, "unitReturnType", "getUnitReturnType()Z", 0), new qp4(cls, "withoutReturnType", "getWithoutReturnType()Z", 0), new qp4(cls, "enhancedTypes", "getEnhancedTypes()Z", 0), new qp4(cls, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new qp4(cls, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new qp4(cls, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new qp4(cls, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new qp4(cls, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new qp4(cls, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new qp4(cls, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new qp4(cls, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new qp4(cls, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new qp4(cls, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new qp4(cls, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new qp4(cls, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new qp4(cls, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new qp4(cls, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new qp4(cls, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new qp4(cls, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new qp4(cls, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new qp4(cls, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new qp4(cls, "receiverAfterName", "getReceiverAfterName()Z", 0), new qp4(cls, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new qp4(cls, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new qp4(cls, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new qp4(cls, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new qp4(cls, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new qp4(cls, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new qp4(cls, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new qp4(cls, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new qp4(cls, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new qp4(cls, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new qp4(cls, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new qp4(cls, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new qp4(cls, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new qp4(cls, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new qp4(cls, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new qp4(cls, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new qp4(cls, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new qp4(cls, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new qp4(cls, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    }

    public ps1() {
        Boolean bool = Boolean.TRUE;
        this.c = new jz0(12, bool, this);
        this.d = new jz0(12, bool, this);
        this.e = new jz0(12, ns1.x, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new jz0(12, bool2, this);
        this.g = new jz0(12, bool2, this);
        this.h = new jz0(12, bool2, this);
        this.i = new jz0(12, bool2, this);
        this.j = new jz0(12, bool2, this);
        this.k = new jz0(12, bool, this);
        this.l = new jz0(12, bool2, this);
        this.m = new jz0(12, bool2, this);
        this.n = new jz0(12, bool2, this);
        this.o = new jz0(12, bool, this);
        this.p = new jz0(12, bool, this);
        this.q = new jz0(12, bool2, this);
        this.r = new jz0(12, bool2, this);
        this.s = new jz0(12, bool2, this);
        this.t = new jz0(12, bool2, this);
        this.u = new jz0(12, bool2, this);
        this.v = new jz0(12, (Object) null, this);
        this.w = new jz0(12, bool2, this);
        this.x = new jz0(12, bool2, this);
        this.y = new jz0(12, v61.N, this);
        this.z = new jz0(12, v61.O, this);
        this.A = new jz0(12, bool, this);
        this.B = new jz0(12, f95.x, this);
        this.C = new jz0(12, js1.a, this);
        this.D = new jz0(12, n46.w, this);
        this.E = new jz0(12, qc5.w, this);
        this.F = new jz0(12, bool2, this);
        this.G = new jz0(12, bool2, this);
        this.H = new jz0(12, br5.w, this);
        this.I = new jz0(12, bool2, this);
        this.J = new jz0(12, bool2, this);
        this.K = new jz0(12, g42.w, this);
        this.L = new jz0(12, z72.a, this);
        this.M = new jz0(12, (Object) null, this);
        this.N = new jz0(12, am.y, this);
        this.O = new jz0(12, bool2, this);
        this.P = new jz0(12, bool, this);
        this.Q = new jz0(12, bool, this);
        this.R = new jz0(12, bool2, this);
        this.S = new jz0(12, bool2, this);
        this.T = new jz0(12, bool, this);
        this.U = new jz0(12, bool, this);
        this.V = new jz0(12, bool2, this);
        this.W = new jz0(12, bool2, this);
        this.X = new jz0(12, bool2, this);
        this.Y = new jz0(12, bool, this);
    }

    public final boolean A() {
        yr3 yr3 = Z[4];
        jz0 jz0 = this.f;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final n46 B() {
        yr3 yr3 = Z[28];
        jz0 jz0 = this.D;
        jz0.getClass();
        yr3.getClass();
        return (n46) jz0.x;
    }

    public final js1 C() {
        yr3 yr3 = Z[27];
        jz0 jz0 = this.C;
        jz0.getClass();
        yr3.getClass();
        return (js1) jz0.x;
    }

    public final boolean D() {
        yr3 yr3 = Z[8];
        jz0 jz0 = this.j;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final boolean E() {
        yr3 yr3 = Z[21];
        jz0 jz0 = this.w;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final void F(Set set) {
        set.getClass();
        this.L.U(Z[36], set);
    }

    public final void a(boolean z2) {
        this.f.U(Z[4], Boolean.valueOf(z2));
    }

    public final void b(Set set) {
        set.getClass();
        this.e.U(Z[3], set);
    }

    public final void c(boolean z2) {
        this.c.U(Z[1], Boolean.valueOf(z2));
    }

    public final void d(n46 n46) {
        n46.getClass();
        this.D.U(Z[28], n46);
    }

    public final void e(boolean z2) {
        this.x.U(Z[22], Boolean.valueOf(z2));
    }

    public final void f(boolean z2) {
        this.h.U(Z[6], Boolean.valueOf(z2));
    }

    public final void g(boolean z2) {
        this.G.U(Z[31], Boolean.valueOf(z2));
    }

    public final void h(boolean z2) {
        this.F.U(Z[30], Boolean.valueOf(z2));
    }

    public final void i(qc5 qc5) {
        qc5.getClass();
        this.E.U(Z[29], qc5);
    }

    public final void j(xq0 xq0) {
        xq0.getClass();
        this.b.U(Z[0], xq0);
    }

    public final void k(boolean z2) {
        this.w.U(Z[21], Boolean.valueOf(z2));
    }

    public final boolean l() {
        yr3 yr3 = Z[39];
        jz0 jz0 = this.O;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final am m() {
        yr3 yr3 = Z[38];
        jz0 jz0 = this.N;
        jz0.getClass();
        yr3.getClass();
        return (am) jz0.x;
    }

    public final boolean n() {
        yr3 yr3 = Z[48];
        jz0 jz0 = this.X;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final xq0 o() {
        Z[0].getClass();
        return (xq0) this.b.x;
    }

    public final boolean p() {
        yr3 yr3 = Z[6];
        jz0 jz0 = this.h;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final vr2 q() {
        yr3 yr3 = Z[24];
        jz0 jz0 = this.z;
        jz0.getClass();
        yr3.getClass();
        return (vr2) jz0.x;
    }

    public final boolean r() {
        yr3 yr3 = Z[11];
        jz0 jz0 = this.m;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final Set s() {
        yr3 yr3 = Z[36];
        jz0 jz0 = this.L;
        jz0.getClass();
        yr3.getClass();
        return (Set) jz0.x;
    }

    public final boolean t() {
        yr3 yr3 = Z[44];
        jz0 jz0 = this.T;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final Set u() {
        yr3 yr3 = Z[3];
        jz0 jz0 = this.e;
        jz0.getClass();
        yr3.getClass();
        return (Set) jz0.x;
    }

    public final f95 v() {
        yr3 yr3 = Z[26];
        jz0 jz0 = this.B;
        jz0.getClass();
        yr3.getClass();
        return (f95) jz0.x;
    }

    public final br5 w() {
        yr3 yr3 = Z[32];
        jz0 jz0 = this.H;
        jz0.getClass();
        yr3.getClass();
        return (br5) jz0.x;
    }

    public final boolean x() {
        yr3 yr3 = Z[13];
        jz0 jz0 = this.o;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final boolean y() {
        yr3 yr3 = Z[25];
        jz0 jz0 = this.A;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }

    public final boolean z() {
        yr3 yr3 = Z[5];
        jz0 jz0 = this.g;
        jz0.getClass();
        yr3.getClass();
        return ((Boolean) jz0.x).booleanValue();
    }
}
