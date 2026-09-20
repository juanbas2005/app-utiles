package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: lj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lj4 extends e02 {
    public final int I;
    public final int J;
    public xi4 K;
    public yi4 L;

    public lj4(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.I = 21;
            this.J = 22;
            return;
        }
        this.I = 22;
        this.J = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        qi4 qi4;
        yi4 yi4;
        int pointToPosition;
        int i2;
        if (this.K != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                qi4 = (qi4) headerViewListAdapter.getWrappedAdapter();
            } else {
                qi4 = (qi4) adapter;
                i = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= qi4.getCount()) {
                yi4 = null;
            } else {
                yi4 = qi4.getItem(i2);
            }
            yi4 yi42 = this.L;
            if (yi42 != yi4) {
                ti4 ti4 = qi4.a;
                if (yi42 != null) {
                    this.K.d(ti4, yi42);
                }
                this.L = yi4;
                if (yi4 != null) {
                    this.K.l(ti4, yi4);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        qi4 qi4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.I) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.J) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                qi4 = (qi4) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                qi4 = (qi4) adapter;
            }
            qi4.a.c(false);
            return true;
        }
    }

    public void setHoverListener(xi4 xi4) {
        this.K = xi4;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
