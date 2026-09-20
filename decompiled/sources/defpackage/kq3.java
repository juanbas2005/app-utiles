package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: kq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kq3 extends xq3 {
    public static final /* synthetic */ yr3[] w;
    public final nz3 c;
    public final y16 d;
    public final y16 e;
    public final y16 f;
    public final y16 g;
    public final y16 h;
    public final y16 i;
    public final y16 j;
    public final y16 k;
    public final nz3 l;
    public final y16 m;
    public final y16 n;
    public final y16 o;
    public final y16 p;
    public final y16 q = p25.u((ri0) null, new jq3(this, 0));
    public final y16 r = p25.u((ri0) null, new jq3(this, 1));
    public final y16 s = p25.u((ri0) null, new jq3(this, 2));
    public final y16 t;
    public final y16 u;
    public final /* synthetic */ oq3 v;

    static {
        Class<kq3> cls = kq3.class;
        gr5 gr5 = new gr5(cls, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        gr5 gr52 = new gr5(cls, "annotations", "getAnnotations()Ljava/util/List;", 0);
        gr5 gr53 = gr5;
        gr5 gr54 = gr52;
        w = new yr3[]{gr53, gr54, new gr5(cls, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new gr5(cls, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new gr5(cls, "constructors", "getConstructors()Ljava/util/Collection;", 0), new gr5(cls, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new gr5(cls, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new gr5(cls, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new gr5(cls, "supertypes", "getSupertypes()Ljava/util/List;", 0), new gr5(cls, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new gr5(cls, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new gr5(cls, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new gr5(cls, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new gr5(cls, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new gr5(cls, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new gr5(cls, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new gr5(cls, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new gr5(cls, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new gr5(cls, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq3(oq3 oq3) {
        super(oq3);
        this.v = oq3;
        iq3 iq3 = new iq3(oq3, this, 0);
        i44 i44 = i44.w;
        this.c = rg3.y(i44, iq3);
        this.d = p25.u((ri0) null, new hq3(oq3, 4));
        this.e = p25.u((ri0) null, new hq3(oq3, this, 6));
        this.f = p25.u((ri0) null, new hq3(oq3, this, 7));
        this.g = p25.u((ri0) null, new hq3(oq3, 8));
        this.h = p25.u((ri0) null, new iq3(oq3, this, 6));
        p25.u((ri0) null, new iq3(this, oq3, 7));
        rg3.y(i44, new iq3(this, oq3, 8));
        this.i = p25.u((ri0) null, new iq3(this, oq3, 9));
        this.j = p25.u((ri0) null, new iq3(this, oq3, 10));
        this.k = p25.u((ri0) null, new iq3(oq3, this, 1));
        p25.u((ri0) null, new iq3(oq3, this, 2));
        this.l = rg3.y(i44, new iq3(this, oq3, 3));
        this.m = p25.u((ri0) null, new hq3(oq3, 1));
        this.n = p25.u((ri0) null, new iq3(this, oq3, 4));
        this.o = p25.u((ri0) null, new hq3(oq3, 2));
        this.p = p25.u((ri0) null, new hq3(oq3, 3));
        this.t = p25.u((ri0) null, new iq3(this, oq3, 5));
        this.u = p25.u((ri0) null, new hq3(oq3, 5));
    }

    public final Collection a() {
        yr3 yr3 = w[17];
        Object b = this.t.b();
        b.getClass();
        return (Collection) b;
    }

    public final ql4 b() {
        yr3 yr3 = w[0];
        Object b = this.d.b();
        b.getClass();
        return (ql4) b;
    }

    public final gu3 c() {
        return (gu3) this.c.getValue();
    }

    public final vp7 d() {
        yr3 yr3 = w[7];
        Object b = this.j.b();
        b.getClass();
        return (vp7) b;
    }

    public final boolean e() {
        if (!oa7.b || oa7.a) {
            return true;
        }
        c26 c26 = b26.a;
        gq3 b = c26.b(Iterable.class);
        oq3 oq3 = this.v;
        if (uq3.C(oq3, b) || uq3.C(oq3, c26.b(Map.class)) || uq3.C(oq3, c26.b(CharSequence.class)) || uq3.C(oq3, c26.b(Number.class))) {
            return true;
        }
        return false;
    }
}
