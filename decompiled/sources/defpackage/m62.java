package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: m62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class m62 extends DialogFragment {
    public Dialog w;
    public DialogInterface.OnCancelListener x;
    public AlertDialog y;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.w;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.y == null) {
            Activity activity = getActivity();
            z65.k(activity);
            this.y = new AlertDialog.Builder(activity).create();
        }
        return this.y;
    }
}
