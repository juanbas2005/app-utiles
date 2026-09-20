package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: mu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mu1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ ou1 w;

    public mu1(ou1 ou1) {
        this.w = ou1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ou1 ou1 = this.w;
        Dialog dialog = ou1.E0;
        if (dialog != null) {
            ou1.onDismiss(dialog);
        }
    }
}
