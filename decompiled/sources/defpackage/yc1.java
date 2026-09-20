package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: yc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yc1 extends q42 {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc1(p42 p42, int i) {
        super(p42);
        this.e = i;
    }

    public void q() {
        switch (this.e) {
            case b85.b:
                p42 p42 = this.b;
                p42.K = null;
                CheckableImageButton checkableImageButton = p42.C;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                t49.a0(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
