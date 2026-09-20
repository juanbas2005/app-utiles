package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: op  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class op implements up, DialogInterface.OnClickListener {
    public ra w;
    public pp x;
    public CharSequence y;
    public final /* synthetic */ vp z;

    public op(vp vpVar) {
        this.z = vpVar;
    }

    public final boolean b() {
        ra raVar = this.w;
        if (raVar != null) {
            return raVar.isShowing();
        }
        return false;
    }

    public final int c() {
        return 0;
    }

    public final void dismiss() {
        ra raVar = this.w;
        if (raVar != null) {
            raVar.dismiss();
            this.w = null;
        }
    }

    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final CharSequence f() {
        return this.y;
    }

    public final Drawable h() {
        return null;
    }

    public final void i(CharSequence charSequence) {
        this.y = charSequence;
    }

    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void o(int i, int i2) {
        if (this.x != null) {
            vp vpVar = this.z;
            qa qaVar = new qa(vpVar.getPopupContext());
            ma maVar = (ma) qaVar.y;
            CharSequence charSequence = this.y;
            if (charSequence != null) {
                maVar.d = charSequence;
            }
            pp ppVar = this.x;
            int selectedItemPosition = vpVar.getSelectedItemPosition();
            maVar.g = ppVar;
            maVar.h = this;
            maVar.j = selectedItemPosition;
            maVar.i = true;
            ra e = qaVar.e();
            this.w = e;
            AlertController$RecycleListView alertController$RecycleListView = e.C.e;
            alertController$RecycleListView.setTextDirection(i);
            alertController$RecycleListView.setTextAlignment(i2);
            this.w.show();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        vp vpVar = this.z;
        vpVar.setSelection(i);
        if (vpVar.getOnItemClickListener() != null) {
            vpVar.performItemClick((View) null, i, this.x.getItemId(i));
        }
        dismiss();
    }

    public final int p() {
        return 0;
    }

    public final void q(ListAdapter listAdapter) {
        this.x = (pp) listAdapter;
    }
}
