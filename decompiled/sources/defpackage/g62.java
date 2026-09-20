package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: g62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g62 {
    public final ut6 a;
    public final String b;
    public final String c;
    public final List d;
    public final ArrayList e;
    public final List f;
    public final List g;
    public final boolean h;
    public final gr8 i;

    public g62(ut6 ut6, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, gr8 gr8) {
        str.getClass();
        list.getClass();
        this.a = ut6;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = gr8;
        if (ut6 == ut6.y && (!arrayList.isEmpty() || !list.isEmpty() || !list2.isEmpty())) {
            StringBuilder sb = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
            sb.append(ut6);
            boolean isEmpty = arrayList.isEmpty();
            boolean isEmpty2 = list.isEmpty();
            boolean isEmpty3 = list2.isEmpty();
            sb.append(", kotlinParameterTypes.isEmpty(): ");
            sb.append(isEmpty);
            sb.append(",typeParameters.isEmpty(): ");
            sb.append(isEmpty2);
            sb.append(", javaParameterTypesIfFunction.isEmpty(): ");
            sb.append(isEmpty3);
            sb.append(".For member: '");
            sb.append(str);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        } else if (list2.size() != list3.size()) {
            StringBuilder sb2 = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb2.append(list2.size());
            sb2.append(") and javaGenericParameterTypesIfFunction.size (");
            sb2.append(list3.size());
            sb2.append(") must be equal. For member: '");
            ku4.g(hl6.o(sb2, str, '\''));
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final boolean equals(Object r19) {
        List list;
        is3 g2;
        TypeVariable typeVariable;
        GenericDeclaration genericDeclaration;
        TypeVariable typeVariable2;
        GenericDeclaration genericDeclaration2;
        g62 g62 = r19;
        if (this != g62) {
            if (g62 instanceof g62) {
                g62 g622 = g62;
                List list2 = g622.d;
                List list3 = g622.f;
                String str = g622.b;
                ArrayList arrayList = g622.e;
                gr8 gr8 = g622.i;
                gr8 gr82 = this.i;
                boolean equals = gr82.equals(gr8);
                String str2 = this.b;
                if (equals) {
                    ut6 ut6 = g622.a;
                    ut6 ut62 = this.a;
                    if (ut62 == ut6 && this.h == g622.h) {
                        ArrayList arrayList2 = this.e;
                        if (arrayList2.size() == arrayList.size()) {
                            if (!gr82.equals(e62.j) || ut62 != ut6.w) {
                                if (!sg3.e(str2, str) || (g2 = mb2.g(list, list2)) == null) {
                                    return false;
                                }
                                int size = (list = this.d).size();
                                int i2 = 0;
                                loop1:
                                while (true) {
                                    ks3 ks3 = ks3.w;
                                    if (i2 < size) {
                                        cs3 cs3 = (cs3) list.get(i2);
                                        cs3 cs32 = (cs3) list2.get(i2);
                                        if (cs3.getUpperBounds().size() != cs32.getUpperBounds().size()) {
                                            return false;
                                        }
                                        List<as3> upperBounds = cs3.getUpperBounds();
                                        ArrayList arrayList3 = new ArrayList(et0.e0(upperBounds, 10));
                                        for (as3 b2 : upperBounds) {
                                            is3 is3 = is3.c;
                                            as3 as3 = g2.b(b2, ks3).b;
                                            if (as3 != null) {
                                                arrayList3.add(as3);
                                            } else {
                                                mb2.f(str2);
                                                throw null;
                                            }
                                        }
                                        ArrayList i1 = dt0.i1(dt0.U0(arrayList3, new la2(1, str2)), dt0.U0(cs32.getUpperBounds(), new la2(1, str)));
                                        if (!i1.isEmpty()) {
                                            Iterator it = i1.iterator();
                                            while (it.hasNext()) {
                                                yb5 yb5 = (yb5) it.next();
                                                as3 as32 = (as3) yb5.w;
                                                as3 as33 = (as3) yb5.x;
                                                if (!ie1.P(as32, as33) || !ie1.P(as33, as32)) {
                                                    return false;
                                                }
                                                while (it.hasNext()) {
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    } else {
                                        int size2 = arrayList2.size();
                                        int i3 = 0;
                                        while (i3 < size2) {
                                            is3 is32 = is3.c;
                                            as3 as34 = g2.b((as3) arrayList2.get(i3), ks3).b;
                                            if (as34 != null) {
                                                as3 as35 = (as3) arrayList.get(i3);
                                                if (!ie1.P(as34, as35) || !ie1.P(as35, as34)) {
                                                    return false;
                                                }
                                                i3++;
                                            } else {
                                                mb2.f(str2);
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                return false;
                            } else if (sg3.e(this.c, g622.c)) {
                                List list4 = this.f;
                                if (list4.size() == list3.size()) {
                                    if (list4.size() == arrayList2.size()) {
                                        int size3 = list4.size();
                                        for (int i4 = 0; i4 < size3; i4++) {
                                            Type type = (Type) this.g.get(i4);
                                            Class cls = (Class) list4.get(i4);
                                            Type type2 = (Type) g622.g.get(i4);
                                            Class cls2 = (Class) list3.get(i4);
                                            if (type instanceof TypeVariable) {
                                                typeVariable = (TypeVariable) type;
                                            } else {
                                                typeVariable = null;
                                            }
                                            if (typeVariable != null) {
                                                genericDeclaration = typeVariable.getGenericDeclaration();
                                            } else {
                                                genericDeclaration = null;
                                            }
                                            boolean z = genericDeclaration instanceof Class;
                                            if (type2 instanceof TypeVariable) {
                                                typeVariable2 = (TypeVariable) type2;
                                            } else {
                                                typeVariable2 = null;
                                            }
                                            if (typeVariable2 != null) {
                                                genericDeclaration2 = typeVariable2.getGenericDeclaration();
                                            } else {
                                                genericDeclaration2 = null;
                                            }
                                            boolean z2 = genericDeclaration2 instanceof Class;
                                            if (z || z2) {
                                                if (cls.isPrimitive() != cls2.isPrimitive()) {
                                                    return false;
                                                }
                                                as3 a2 = mb2.a((as3) arrayList2.get(i4), str2);
                                                as3 a3 = mb2.a((as3) arrayList.get(i4), str);
                                                if (!ie1.P(a2, a3) || !ie1.P(a3, a2)) {
                                                    return false;
                                                }
                                            } else if (!sg3.e(cls, cls2)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                        sb.append(list4.size());
                                        sb.append(") and kotlinParameterTypes.size (");
                                        sb.append(arrayList2.size());
                                        sb.append(") must be equal for member '");
                                        ku4.g(hl6.o(sb, str2, '\''));
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ku4.g(f21.h("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z;
        boolean equals = this.i.equals(e62.j);
        ut6 ut6 = this.a;
        if (!equals || ut6 != ut6.w) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = this.h;
        ArrayList arrayList = this.e;
        if (z) {
            Integer valueOf = Integer.valueOf(arrayList.size());
            Boolean valueOf2 = Boolean.valueOf(z2);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            return Arrays.hashCode(new Object[]{ut6, valueOf, valueOf2, str});
        } else if (!z) {
            return Arrays.hashCode(new Object[]{ut6, Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.b});
        } else {
            h.c();
            return 0;
        }
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + this.a + ", name=" + this.b + ", jvmNameIfFunction=" + this.c + ", typeParameters=" + this.d + ", kotlinParameterTypes=" + this.e + ", javaParameterTypesIfFunction=" + this.f + ", javaGenericParameterTypesIfFunction=" + this.g + ", isStatic=" + this.h + ", equalityMode=" + this.i + ')';
    }
}
