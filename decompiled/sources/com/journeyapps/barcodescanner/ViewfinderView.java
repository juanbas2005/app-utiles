package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ViewfinderView extends View {
    public static final int[] H = {0, 64, 128, 192, 255, 192, 128, 64};
    public boolean A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public dk0 E;
    public Rect F;
    public vu6 G;
    public final Paint w = new Paint(1);
    public int x;
    public final int y;
    public final int z;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pv5.b);
        this.x = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.y = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.z = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.A = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.B = 0;
        this.C = new ArrayList(20);
        this.D = new ArrayList(20);
    }

    public final void onDraw(Canvas canvas) {
        vu6 vu6;
        dk0 dk0 = this.E;
        if (dk0 != null) {
            Rect framingRect = dk0.getFramingRect();
            vu6 previewSize = this.E.getPreviewSize();
            if (!(framingRect == null || previewSize == null)) {
                this.F = framingRect;
                this.G = previewSize;
            }
        }
        Rect rect = this.F;
        if (rect != null && (vu6 = this.G) != null) {
            int width = getWidth();
            int height = getHeight();
            int i = this.x;
            Paint paint = this.w;
            paint.setColor(i);
            float f = (float) width;
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f, (float) rect.top, paint);
            canvas2.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), paint);
            float f2 = f;
            canvas2.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), paint);
            canvas2.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, paint);
            if (this.A) {
                paint.setColor(this.y);
                paint.setAlpha(H[this.B]);
                this.B = (this.B + 1) % 8;
                int height2 = (rect.height() / 2) + rect.top;
                canvas2.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), paint);
            }
            float width2 = ((float) getWidth()) / ((float) vu6.w);
            float height3 = ((float) getHeight()) / ((float) vu6.x);
            boolean isEmpty = this.D.isEmpty();
            int i2 = this.z;
            if (!isEmpty) {
                paint.setAlpha(80);
                paint.setColor(i2);
                Iterator it = this.D.iterator();
                while (it.hasNext()) {
                    r66 r66 = (r66) it.next();
                    canvas2.drawCircle((float) ((int) (r66.a * width2)), (float) ((int) (r66.b * height3)), 3.0f, paint);
                }
                this.D.clear();
            }
            if (!this.C.isEmpty()) {
                paint.setAlpha(160);
                paint.setColor(i2);
                Iterator it2 = this.C.iterator();
                while (it2.hasNext()) {
                    r66 r662 = (r66) it2.next();
                    canvas2.drawCircle((float) ((int) (r662.a * width2)), (float) ((int) (r662.b * height3)), 6.0f, paint);
                }
                ArrayList arrayList = this.C;
                ArrayList arrayList2 = this.D;
                this.C = arrayList2;
                this.D = arrayList;
                arrayList2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(dk0 dk0) {
        this.E = dk0;
        dk0.F.add(new ck0(2, this));
    }

    public void setLaserVisibility(boolean z2) {
        this.A = z2;
    }

    public void setMaskColor(int i) {
        this.x = i;
    }
}
