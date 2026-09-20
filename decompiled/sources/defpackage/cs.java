package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: cs  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cs extends bt0 {
    public final /* synthetic */ int b;
    public final x74 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cs(zr3 zr3, int i) {
        super(zr3);
        this.b = i;
        zr3.getClass();
        switch (i) {
            case 1:
                super(zr3);
                ll6 descriptor = zr3.getDescriptor();
                descriptor.getClass();
                this.c = new zr(descriptor, 2);
                return;
            case 2:
                super(zr3);
                ll6 descriptor2 = zr3.getDescriptor();
                descriptor2.getClass();
                this.c = new zr(descriptor2, 3);
                return;
            default:
                ll6 descriptor3 = zr3.getDescriptor();
                descriptor3.getClass();
                this.c = new zr(descriptor3, 1);
                return;
        }
    }

    public final Object a() {
        switch (this.b) {
            case b85.b:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    public final int b(Object obj) {
        switch (this.b) {
            case b85.b:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    public final Object g(Object obj) {
        switch (this.b) {
            case b85.b:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    public final ll6 getDescriptor() {
        switch (this.b) {
            case b85.b:
                return (zr) this.c;
            case 1:
                return (zr) this.c;
            default:
                return (zr) this.c;
        }
    }

    public final Object h(Object obj) {
        switch (this.b) {
            case b85.b:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case b85.b:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
