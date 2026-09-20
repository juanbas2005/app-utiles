package defpackage;

import android.content.DialogInterface;

/* renamed from: al0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class al0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ bl0 w;

    public /* synthetic */ al0(bl0 bl0) {
        this.w = bl0;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.w.a.finish();
    }
}
