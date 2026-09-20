package defpackage;

/* renamed from: pi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pi implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ui x;
    public final /* synthetic */ zc7 y;

    public /* synthetic */ pi(ui uiVar, zc7 zc7, int i) {
        this.w = i;
        this.x = uiVar;
        this.y = zc7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: dy3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: dy3} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        int i = this.w;
        Object obj = null;
        zc7 zc7 = this.y;
        ui uiVar = this.x;
        switch (i) {
            case b85.b:
                oi oiVar = uiVar.f;
                zh zhVar = new zh(1, (Object) zc7);
                ? obj2 = new Object();
                uiVar.e.e("dataBuilder", oiVar, new f5(2, obj2, zhVar));
                Object obj3 = obj2.w;
                if (obj3 != null) {
                    return (yc7) obj3;
                }
                sg3.a0("result");
                throw null;
            case 1:
                oi oiVar2 = uiVar.g;
                pi piVar = new pi(uiVar, zc7, 2);
                ? obj4 = new Object();
                uiVar.e.e("positioner", oiVar2, new f5(2, obj4, piVar));
                Object obj5 = obj4.w;
                if (obj5 != null) {
                    return (ly5) obj5;
                }
                sg3.a0("result");
                throw null;
            default:
                Object b = uiVar.c.b();
                if (((dy3) b).n()) {
                    obj = b;
                }
                dy3 dy3 = (dy3) obj;
                if (dy3 == null) {
                    return ly5.e;
                }
                return zc7.k(dy3).i(dy3.R(0));
        }
    }
}
