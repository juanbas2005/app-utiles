package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: la  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class la implements AdapterView.OnItemClickListener {
    public final /* synthetic */ pa w;
    public final /* synthetic */ ma x;

    public la(ma maVar, pa paVar) {
        this.x = maVar;
        this.w = paVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ma maVar = this.x;
        DialogInterface.OnClickListener onClickListener = maVar.h;
        pa paVar = this.w;
        onClickListener.onClick(paVar.b, i);
        if (!maVar.i) {
            paVar.b.dismiss();
        }
    }
}
