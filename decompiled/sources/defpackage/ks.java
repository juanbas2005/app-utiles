package defpackage;

/* renamed from: ks  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ks extends y1 {
    public int y = -1;
    public final /* synthetic */ ls z;

    public ks(ls lsVar) {
        this.z = lsVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.y + 1;
            this.y = i;
            objArr = this.z.w;
            if (i >= objArr.length || objArr[i] != null) {
            }
        } while (objArr[i] != null);
        if (i >= objArr.length) {
            this.w = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.x = obj;
        this.w = 1;
    }
}
