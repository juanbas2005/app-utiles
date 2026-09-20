package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import cu.lestebang.utiletecsa.R;

/* renamed from: j37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j37 {
    public int a;
    public br4 b;
    public int[][] c;
    public br4[] d;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        i37 i37;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
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
                    int[] iArr2 = ov5.B;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr2);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                    }
                    TypedValue peekValue = typedArray.peekValue(0);
                    if (peekValue != null) {
                        int i3 = peekValue.type;
                        if (i3 == 5) {
                            i37 = new i37(2, (float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
                        } else if (i3 == 6) {
                            i37 = new i37(1, peekValue.getFraction(1.0f, 1.0f));
                        }
                        typedArray.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr3 = new int[attributeCount];
                        int i4 = 0;
                        for (i = 0; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != R.attr.widthChange) {
                                int i5 = i4 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr3[i4] = attributeNameResource;
                                i4 = i5;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                        br4 br4 = new br4(0, 15);
                        br4.x = i37;
                        i2 = this.a;
                        if (i2 == 0 || trimStateSet.length == 0) {
                            this.b = br4;
                        }
                        iArr = this.c;
                        if (i2 >= iArr.length) {
                            int i6 = i2 + 10;
                            int[][] iArr4 = new int[i6][];
                            System.arraycopy(iArr, 0, iArr4, 0, i2);
                            this.c = iArr4;
                            br4[] br4Arr = new br4[i6];
                            System.arraycopy(this.d, 0, br4Arr, 0, i2);
                            this.d = br4Arr;
                        }
                        int[][] iArr5 = this.c;
                        int i7 = this.a;
                        iArr5[i7] = trimStateSet;
                        this.d[i7] = br4;
                        this.a = i7 + 1;
                    }
                    i37 = null;
                    typedArray.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr32 = new int[attributeCount];
                    int i42 = 0;
                    while (i < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                    br4 br42 = new br4(0, 15);
                    br42.x = i37;
                    i2 = this.a;
                    this.b = br42;
                    iArr = this.c;
                    if (i2 >= iArr.length) {
                    }
                    int[][] iArr52 = this.c;
                    int i72 = this.a;
                    iArr52[i72] = trimStateSet2;
                    this.d[i72] = br42;
                    this.a = i72 + 1;
                }
            } else {
                return;
            }
        }
    }
}
