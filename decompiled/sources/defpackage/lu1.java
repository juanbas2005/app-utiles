package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: lu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lu1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ou1 w;

    public lu1(ou1 ou1) {
        this.w = ou1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ou1 ou1 = this.w;
        Dialog dialog = ou1.E0;
        if (dialog != null) {
            ou1.onCancel(dialog);
        }
    }
}
