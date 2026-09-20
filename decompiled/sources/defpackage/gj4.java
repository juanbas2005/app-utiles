package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: gj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gj4 implements qs6, rj4, AdapterView.OnItemClickListener {
    public Rect w;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public final boolean e(yi4 yi4) {
        return false;
    }

    public final boolean h(yi4 yi4) {
        return false;
    }

    public abstract void l(ti4 ti4);

    public abstract void n(View view);

    public abstract void o(boolean z);

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qi4 qi4;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            qi4 = (qi4) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            qi4 = (qi4) listAdapter;
        }
        ti4 ti4 = qi4.a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof am0)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        ti4.q(menuItem, this, i2);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public final void k(Context context, ti4 ti4) {
    }
}
