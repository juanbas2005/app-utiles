package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: uj4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class uj4 extends f1 implements Menu {
    public final ti4 c;

    public uj4(Context context, ti4 ti4) {
        super(context);
        if (ti4 != null) {
            this.c = ti4;
        } else {
            h.q("Wrapped Object can not be null.");
            throw null;
        }
    }

    public final MenuItem add(CharSequence charSequence) {
        return g(this.c.a(0, 0, 0, charSequence));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr4 = menuItemArr2;
        int addIntentOptions = this.c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr4);
        if (menuItemArr4 != null) {
            int length = menuItemArr4.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = g(menuItemArr4[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        zt6 zt6 = (zt6) this.b;
        if (zt6 != null) {
            zt6.clear();
        }
        this.c.clear();
    }

    public final void close() {
        this.c.close();
    }

    public final MenuItem findItem(int i) {
        return g(this.c.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return g(this.c.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.c.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.c.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (((zt6) this.b) != null) {
            int i2 = 0;
            while (true) {
                zt6 zt6 = (zt6) this.b;
                if (i2 >= zt6.y) {
                    break;
                }
                if (((g87) zt6.g(i2)).getGroupId() == i) {
                    ((zt6) this.b).h(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.c.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((zt6) this.b) != null) {
            int i2 = 0;
            while (true) {
                zt6 zt6 = (zt6) this.b;
                if (i2 >= zt6.y) {
                    break;
                } else if (((g87) zt6.g(i2)).getItemId() == i) {
                    ((zt6) this.b).h(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.c.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.c.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.c.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.c.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.c.setQwertyMode(z);
    }

    public final int size() {
        return this.c.size();
    }

    public final SubMenu addSubMenu(int i) {
        return this.c.addSubMenu(i);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.c.addSubMenu(i, i2, i3, charSequence);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.c.addSubMenu(i, i2, i3, i4);
    }

    public final MenuItem add(int i) {
        return g(this.c.add(i));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return g(this.c.a(i, i2, i3, charSequence));
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return g(this.c.add(i, i2, i3, i4));
    }
}
