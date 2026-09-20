package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: dy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dy4 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public dy4(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent e2;
        if (this.d && (e2 = e(0)) != null) {
            try {
                return e2.onNestedFling(this.c, f, f2, z);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        ViewParent e2;
        if (this.d && (e2 = e(0)) != null) {
            try {
                return e2.onNestedPreFling(this.c, f, f2);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent e2;
        int i4;
        int i5;
        int[] iArr3;
        int[] iArr4 = iArr2;
        if (!this.d || (e2 = e(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            ViewGroup viewGroup = this.c;
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                i5 = iArr4[0];
                i4 = iArr4[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (e2 instanceof ey4) {
                ViewGroup viewGroup2 = viewGroup;
                ((ey4) e2).f(viewGroup2, i, i2, iArr3, i3);
                viewGroup = viewGroup2;
            } else if (i3 == 0) {
                try {
                    e2.onNestedPreScroll(viewGroup, i, i2, iArr3);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
                }
            }
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i5;
                iArr4[1] = iArr4[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e2;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (this.d && (e2 = e(i8)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr4 != null) {
                    viewGroup.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr5 = this.e;
                    iArr5[0] = 0;
                    iArr5[1] = 0;
                    iArr3 = iArr5;
                } else {
                    iArr3 = iArr2;
                }
                if (e2 instanceof fy4) {
                    ((fy4) e2).a(viewGroup, i, i2, i3, i4, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (e2 instanceof ey4) {
                        ((ey4) e2).b(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            e2.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e3);
                        }
                    }
                }
                if (iArr4 != null) {
                    viewGroup.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i) {
        if (e(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2) {
        boolean z;
        if (!f(i2)) {
            if (this.d) {
                View view = this.c;
                ViewParent parent = view.getParent();
                View view2 = view;
                while (parent != null) {
                    boolean z2 = parent instanceof ey4;
                    if (z2) {
                        z = ((ey4) parent).c(view2, view, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                z = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        if (i2 == 0) {
                            this.a = parent;
                        } else if (i2 == 1) {
                            this.b = parent;
                        }
                        if (z2) {
                            ((ey4) parent).d(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                        parent = parent.getParent();
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e2 = e(i);
        if (e2 != null) {
            boolean z = e2 instanceof ey4;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((ey4) e2).e(viewGroup, i);
            } else if (i == 0) {
                try {
                    e2.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i == 0) {
                this.a = null;
            } else if (i == 1) {
                this.b = null;
            }
        }
    }
}
