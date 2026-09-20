package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ti4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ti4 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public ri4 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l = 0;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public yi4 v;
    public boolean w = false;
    public boolean x;

    public ti4(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = h58.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = bn.u(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final yi4 a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            h.q("order does not contain a valid category.");
            return null;
        }
        int i7 = (y[i6] << 16) | (65535 & i4);
        yi4 yi4 = new yi4(this, i2, i3, i4, i7, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            } else if (((yi4) arrayList.get(size)).d <= i7) {
                i5 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i5, yi4);
        p(true);
        return yi4;
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] r15) {
        int i6;
        Intent intent2;
        int i7;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i6 = queryIntentActivityOptions.size();
        } else {
            i6 = 0;
        }
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i8 = 0; i8 < i6; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            if (i9 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i9];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            yi4 a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.g = intent3;
            if (r15 != 0 && (i7 = resolveInfo.specificIndex) >= 0) {
                r15[i7] = a2;
            }
        }
        return i6;
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        yi4 a2 = a(i2, i3, i4, charSequence);
        i67 i67 = new i67(this.a, this, a2);
        a2.o = i67;
        i67.setHeaderTitle(a2.e);
        return i67;
    }

    public final void b(rj4 rj4, Context context) {
        this.u.add(new WeakReference(rj4));
        rj4.k(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (!this.s) {
            this.s = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                rj4 rj4 = (rj4) weakReference.get();
                if (rj4 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    rj4.a(this, z);
                }
            }
            this.s = false;
        }
    }

    public final void clear() {
        yi4 yi4 = this.v;
        if (yi4 != null) {
            d(yi4);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(yi4 yi4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == yi4) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                rj4 rj4 = (rj4) weakReference.get();
                if (rj4 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = rj4.e(yi4);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(ti4 ti4, MenuItem menuItem) {
        ri4 ri4 = this.e;
        if (ri4 == null || !ri4.g(ti4, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(yi4 yi4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            rj4 rj4 = (rj4) weakReference.get();
            if (rj4 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = rj4.h(yi4);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = yi4;
        }
        return z;
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yi4 yi4 = (yi4) arrayList.get(i3);
            if (yi4.a == i2) {
                return yi4;
            }
            if (yi4.hasSubMenu() && (findItem = yi4.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final yi4 g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (yi4) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            yi4 yi4 = (yi4) arrayList.get(i3);
            if (n2) {
                c2 = yi4.j;
            } else {
                c2 = yi4.h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == 8 && i2 == 67))) {
                return yi4;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f.get(i2);
    }

    public final void h(List list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                yi4 yi4 = (yi4) arrayList.get(i4);
                if (yi4.hasSubMenu()) {
                    yi4.o.h(list, i2, keyEvent);
                }
                if (n2) {
                    c2 = yi4.j;
                } else {
                    c2 = yi4.h;
                }
                if (n2) {
                    i3 = yi4.k;
                } else {
                    i3 = yi4.i;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == 8 && i2 == 67)) && yi4.isEnabled()) {
                        list.add(yi4);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((yi4) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                rj4 rj4 = (rj4) weakReference.get();
                if (rj4 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= rj4.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yi4 yi4 = (yi4) l2.get(i2);
                    if ((yi4.x & 32) == 32) {
                        arrayList.add(yi4);
                    } else {
                        arrayList2.add(yi4);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (g(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            yi4 yi4 = (yi4) arrayList2.get(i2);
            if (yi4.isVisible()) {
                arrayList.add(yi4);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (!this.p) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    rj4 rj4 = (rj4) weakReference.get();
                    if (rj4 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        rj4.i();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.q = true;
        if (z) {
            this.r = true;
        }
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), (rj4) null, i3);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z;
        yi4 g2 = g(i2, keyEvent);
        if (g2 != null) {
            z = q(g2, (rj4) null, i3);
        } else {
            z = false;
        }
        if ((i3 & 2) != 0) {
            c(true);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    public final boolean q(MenuItem menuItem, rj4 rj4, int i2) {
        boolean z;
        zi4 zi4;
        boolean z2;
        yi4 yi4 = (yi4) menuItem;
        boolean z3 = false;
        if (yi4 == null || !yi4.isEnabled()) {
            return false;
        }
        ti4 ti4 = yi4.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = yi4.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(yi4)) && !ti4.e(ti4, yi4)) {
            Intent intent = yi4.g;
            if (intent != null) {
                try {
                    ti4.a.startActivity(intent);
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            zi4 zi42 = yi4.A;
            if (zi42 == null || !zi42.b.onPerformDefaultAction()) {
                z = false;
                zi4 = yi4.A;
                if (zi4 == null || !zi4.b.hasSubMenu()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!yi4.e()) {
                    z |= yi4.expandActionView();
                    if (z) {
                        c(true);
                    }
                } else if (yi4.hasSubMenu() || z2) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!yi4.hasSubMenu()) {
                        i67 i67 = new i67(this.a, this, yi4);
                        yi4.o = i67;
                        i67.setHeaderTitle(yi4.e);
                    }
                    i67 i672 = yi4.o;
                    if (z2) {
                        zi4.b.onPrepareSubMenu(i672);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        if (rj4 != null) {
                            z3 = rj4.c(i672);
                        }
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            rj4 rj42 = (rj4) weakReference.get();
                            if (rj42 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!z3) {
                                z3 = rj42.c(i672);
                            }
                        }
                    }
                    z |= z3;
                    if (!z) {
                        c(true);
                    }
                } else if ((i2 & 1) == 0) {
                    c(true);
                }
                return z;
            }
        }
        z = true;
        zi4 = yi4.A;
        if (zi4 == null || !zi4.b.hasSubMenu()) {
        }
        if (!yi4.e()) {
        }
        return z;
    }

    public final void r(rj4 rj4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            rj4 rj42 = (rj4) weakReference.get();
            if (rj42 == null || rj42 == rj4) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((yi4) arrayList.get(i4)).b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((yi4) arrayList.get(i4)).b != i2) {
                    p(true);
                } else {
                    if (i4 >= 0 && i4 < arrayList.size()) {
                        arrayList.remove(i4);
                    }
                    i3 = i5;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((yi4) arrayList.get(i3)).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0 && i3 < arrayList.size()) {
            arrayList.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((i67) item.getSubMenu()).s(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        int i3;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            yi4 yi4 = (yi4) arrayList.get(i4);
            if (yi4.b == i2) {
                int i5 = yi4.x & -5;
                if (z2) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                yi4.x = i5 | i3;
                yi4.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    public final void setGroupEnabled(int i2, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yi4 yi4 = (yi4) arrayList.get(i3);
            if (yi4.b == i2) {
                yi4.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z) {
        int i3;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            yi4 yi4 = (yi4) arrayList.get(i4);
            if (yi4.b == i2) {
                int i5 = yi4.x;
                int i6 = i5 & -9;
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                int i7 = i6 | i3;
                yi4.x = i7;
                if (i5 != i7) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i67) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i2 > 0) {
                this.m = this.b.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i3 > 0) {
                this.n = this.a.getDrawable(i3);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.b.getString(i2));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public ti4 k() {
        return this;
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.b.getString(i5));
    }
}
