package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.oss.licenses.OssLicensesActivity;

/* renamed from: qp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qp implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ qp(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        int selectedItemPosition;
        int i2 = this.w;
        Object obj2 = this.x;
        switch (i2) {
            case b85.b:
                sp spVar = (sp) obj2;
                vp vpVar = spVar.c0;
                vpVar.setSelection(i);
                if (vpVar.getOnItemClickListener() != null) {
                    vpVar.performItemClick(view, i, spVar.Z.getItemId(i));
                }
                spVar.dismiss();
                return;
            case 1:
                zf4 zf4 = (zf4) obj2;
                h84 h84 = zf4.A;
                if (i >= 0) {
                    obj = zf4.getAdapter().getItem(i);
                } else if (!h84.V.isShowing()) {
                    obj = null;
                } else {
                    obj = h84.y.getSelectedItem();
                }
                zf4.setText(zf4.convertSelectionToString(obj), false);
                AdapterView.OnItemClickListener onItemClickListener = zf4.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (!h84.V.isShowing()) {
                            view = null;
                        } else {
                            view = h84.y.getSelectedView();
                        }
                        if (!h84.V.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = h84.y.getSelectedItemPosition();
                        }
                        i = selectedItemPosition;
                        if (!h84.V.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = h84.y.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(h84.y, view, i, j);
                }
                h84.dismiss();
                return;
            default:
                q89 q89 = (q89) obj2;
                Intent intent = new Intent(q89.y0, OssLicensesActivity.class);
                intent.putExtra("license", (jb9) adapterView.getItemAtPosition(i));
                dq2 dq2 = q89.Q;
                if (dq2 != null) {
                    dq2.M.startActivity(intent, (Bundle) null);
                    return;
                } else {
                    rf2.h(q89, " not attached to Activity", "Fragment ");
                    return;
                }
        }
    }
}
