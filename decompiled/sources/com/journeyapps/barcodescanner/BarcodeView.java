package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import cu.lestebang.utiletecsa.R;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class BarcodeView extends dk0 {
    public int W = 1;
    public jz0 a0 = null;
    public nz0 b0;
    public qk1 c0;
    public final Handler d0;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h50 h50 = new h50(this, 0);
        this.c0 = new kb9(3, false);
        this.d0 = new Handler(h50);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [rk1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [mn4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7, types: [nk1, dl4] */
    public final nk1 f() {
        nk1 nk1;
        if (this.c0 == null) {
            this.c0 = new kb9(3, false);
        }
        ? obj = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put(fk1.F, obj);
        kb9 kb9 = (kb9) this.c0;
        kb9.getClass();
        EnumMap enumMap = new EnumMap(fk1.class);
        enumMap.putAll(hashMap);
        EnumMap enumMap2 = (EnumMap) kb9.z;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) kb9.y;
        if (set != null) {
            enumMap.put(fk1.y, set);
        }
        String str = (String) kb9.A;
        if (str != null) {
            enumMap.put(fk1.A, str);
        }
        ? obj2 = new Object();
        obj2.c(enumMap);
        int i = kb9.x;
        if (i == 0) {
            nk1 = new nk1(obj2);
        } else if (i == 1) {
            nk1 = new nk1(obj2);
        } else if (i != 2) {
            nk1 = new nk1(obj2);
        } else {
            ? nk12 = new nk1(obj2);
            nk12.c = true;
            nk1 = nk12;
        }
        obj.a = nk1;
        return nk1;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        w95.l();
        Log.d("dk0", "pause()");
        this.E = -1;
        xj0 xj0 = this.w;
        if (xj0 != null) {
            w95.l();
            if (xj0.f) {
                xj0.a.c(xj0.l);
            } else {
                xj0.g = true;
            }
            xj0.f = false;
            this.w = null;
            this.C = false;
        } else {
            this.y.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.L == null && (surfaceView = this.A) != null) {
            surfaceView.getHolder().removeCallback(this.S);
        }
        if (this.L == null && (textureView = this.B) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.I = null;
        this.J = null;
        this.N = null;
        kb9 kb9 = this.D;
        k96 k96 = (k96) kb9.z;
        if (k96 != null) {
            k96.disable();
        }
        kb9.z = null;
        kb9.y = null;
        kb9.A = null;
        this.U.j();
    }

    public qk1 getDecoderFactory() {
        return this.c0;
    }

    public final void h() {
        i();
        if (this.W != 1 && this.C) {
            nz0 nz0 = new nz0(getCameraInstance(), f(), this.d0);
            this.b0 = nz0;
            nz0.g = getPreviewFramingRect();
            nz0 nz02 = this.b0;
            nz02.getClass();
            w95.l();
            HandlerThread handlerThread = new HandlerThread("nz0");
            nz02.c = handlerThread;
            handlerThread.start();
            nz02.d = new Handler(((HandlerThread) nz02.c).getLooper(), (yx) nz02.i);
            nz02.a = true;
            xj0 xj0 = (xj0) nz02.b;
            xj0.h.post(new vj0(xj0, (wv2) nz02.j, 0));
        }
    }

    public final void i() {
        nz0 nz0 = this.b0;
        if (nz0 != null) {
            w95.l();
            synchronized (nz0.h) {
                nz0.a = false;
                ((Handler) nz0.d).removeCallbacksAndMessages((Object) null);
                ((HandlerThread) nz0.c).quit();
            }
            this.b0 = null;
        }
    }

    public void setDecoderFactory(qk1 qk1) {
        w95.l();
        this.c0 = qk1;
        nz0 nz0 = this.b0;
        if (nz0 != null) {
            nz0.e = f();
        }
    }
}
