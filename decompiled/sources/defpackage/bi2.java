package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: bi2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bi2 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final ri a;

    public bi2(ri riVar) {
        this.a = riVar;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.a.getClass();
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.a(menu);
        if (menu.size() > 0) {
            return true;
        }
        return false;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.close();
    }

    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ly5 ly5 = (ly5) this.a.c.b();
        rect.set(Math.round(ly5.a), Math.round(ly5.b), Math.round(ly5.c), Math.round(ly5.d));
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.a.a(menu);
    }
}
