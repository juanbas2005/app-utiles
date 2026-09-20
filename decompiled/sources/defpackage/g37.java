package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import cu.lestebang.utiletecsa.R;

/* renamed from: g37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g37 {
    public int a;
    public z71 b;
    public int[][] c = new int[10][];
    public z71[] d = new z71[10];

    public static g37 b(z71 z71) {
        g37 g37 = new g37();
        g37.a(StateSet.WILD_CARD, z71);
        return g37;
    }

    public final void a(int[] iArr, z71 z71) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = z71;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            z71[] z71Arr = new z71[i2];
            System.arraycopy(this.d, 0, z71Arr, 0, i);
            this.d = z71Arr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = z71;
        this.a = i3 + 1;
    }

    public final z71 c(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.a) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i2 >= this.a) {
                    break;
                } else if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            i3 = i;
        }
        if (i3 < 0) {
            return this.b;
        }
        return this.d[i3];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                    Resources resources = context.getResources();
                    int[] iArr = ov5.y;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    z71 c2 = rq6.c(typedArray, 5, new a0(0.0f));
                    typedArray.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i = 0;
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                        if (attributeNameResource != R.attr.cornerSize) {
                            int i3 = i + 1;
                            if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i] = attributeNameResource;
                            i = i3;
                        }
                    }
                    a(StateSet.trimStateSet(iArr2, i), c2);
                }
            } else {
                return;
            }
        }
    }
}
