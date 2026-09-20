package defpackage;

import android.os.Build;
import cu.lestebang.utiletecsa.R;

/* renamed from: id7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum id7 {
    ;
    
    public final Object w;
    public final int x;
    public final int y;

    static {
        int i;
        id7 id7 = new id7("Cut", 0, hj8.k, 17039363, 16843537);
        id7 id72 = new id7("Copy", 1, hj8.l, 17039361, 16843538);
        id7 id73 = new id7("Paste", 2, hj8.m, 17039371, 16843539);
        id7 id74 = new id7("SelectAll", 3, hj8.n, 17039373, 16843646);
        Object obj = hj8.o;
        if (Build.VERSION.SDK_INT <= 26) {
            i = R.string.androidx_compose_foundation_autofill;
        } else {
            i = 17039386;
        }
        id7 id75 = new id7("Autofill", 4, obj, i, 0);
        z = id75;
        A = new id7[]{id7, id72, id73, id74, id75};
    }

    /* access modifiers changed from: public */
    id7(Object obj, int i, int i2) {
        this.w = obj;
        this.x = i;
        this.y = i2;
    }
}
