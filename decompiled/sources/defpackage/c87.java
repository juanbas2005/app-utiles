package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: c87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class c87 extends ou1 {
    public Dialog J0;
    public DialogInterface.OnCancelListener K0;
    public AlertDialog L0;

    public final Dialog Q() {
        Dialog dialog = this.J0;
        if (dialog != null) {
            return dialog;
        }
        this.A0 = false;
        if (this.L0 == null) {
            Context n = n();
            z65.k(n);
            this.L0 = new AlertDialog.Builder(n).create();
        }
        return this.L0;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
