package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class DecoratedBarcodeView extends FrameLayout {
    public final BarcodeView w;
    public final ViewfinderView x;
    public final TextView y;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pv5.c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.w = barcodeView;
        if (barcodeView != null) {
            barcodeView.b(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.x = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.w);
                this.y = (TextView) findViewById(R.id.zxing_status_view);
                return;
            }
            h.q("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
            throw null;
        }
        h.q("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        throw null;
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public ek0 getCameraSettings() {
        return this.w.getCameraSettings();
    }

    public qk1 getDecoderFactory() {
        return this.w.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.y;
    }

    public ViewfinderView getViewFinder() {
        return this.x;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.w.setTorch(true);
            return true;
        } else if (i == 25) {
            this.w.setTorch(false);
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(ek0 ek0) {
        this.w.setCameraSettings(ek0);
    }

    public void setDecoderFactory(qk1 qk1) {
        this.w.setDecoderFactory(qk1);
    }

    public void setStatusText(String str) {
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(tk1 tk1) {
    }
}
