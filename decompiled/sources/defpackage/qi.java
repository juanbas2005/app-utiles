package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* renamed from: qi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qi implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i;
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case b85.b:
                ((hd7) obj2).d.y(((ri) obj).a);
                return true;
            default:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String l = textClassification.getText();
                if (l != null) {
                    i = l.hashCode();
                } else {
                    i = 0;
                }
                j45.p(PendingIntent.getActivity(context, i, textClassification.getIntent(), 201326592));
                return true;
        }
    }
}
