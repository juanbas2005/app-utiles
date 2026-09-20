package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import cu.lestebang.utiletecsa.R;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class CaptureActivity extends Activity {
    public bl0 w;
    public DecoratedBarcodeView x;

    /* JADX WARNING: type inference failed for: r8v1, types: [mn4, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018e  */
    public final void onCreate(Bundle bundle) {
        boolean z;
        List<String> list;
        Set set;
        String stringExtra;
        int intExtra;
        int i;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.x = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.x;
        bl0 bl0 = new bl0(this, decoratedBarcodeView);
        this.w = bl0;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle2 != null) {
            bl0.c = bundle2.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (bl0.c == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i2 = getResources().getConfiguration().orientation;
                    if (i2 == 2) {
                        if (!(rotation == 0 || rotation == 1)) {
                            i = 8;
                            bl0.c = i;
                        }
                    } else if (i2 == 1) {
                        if (rotation == 0 || rotation == 3) {
                            i = 1;
                        } else {
                            i = 9;
                        }
                        bl0.c = i;
                    }
                    i = 0;
                    bl0.c = i;
                }
                setRequestedOrientation(bl0.c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = dk1.a;
                String stringExtra2 = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                if (stringExtra2 != null) {
                    list = Arrays.asList(dk1.a.split(stringExtra2));
                } else {
                    list = null;
                }
                String stringExtra3 = intent.getStringExtra("SCAN_MODE");
                if (list != null) {
                    set = EnumSet.noneOf(d50.class);
                    try {
                        for (String valueOf : list) {
                            set.add(d50.valueOf(valueOf));
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    int i3 = ek1.a;
                    Bundle extras = intent.getExtras();
                    if (extras != null && !extras.isEmpty()) {
                        enumMap = new EnumMap(fk1.class);
                        for (fk1 fk1 : fk1.values()) {
                            if (!(fk1 == fk1.A || fk1 == fk1.F || fk1 == fk1.y)) {
                                String name = fk1.name();
                                Class cls = fk1.w;
                                if (extras.containsKey(name)) {
                                    if (cls.equals(Void.class)) {
                                        enumMap.put(fk1, Boolean.TRUE);
                                    } else {
                                        Object obj = extras.get(name);
                                        if (cls.isInstance(obj)) {
                                            enumMap.put(fk1, obj);
                                        } else {
                                            Log.w("ek1", "Ignoring hint " + fk1 + " because it is not assignable from " + obj);
                                        }
                                    }
                                }
                            }
                        }
                        Log.i("ek1", "Hints from the Intent: " + enumMap);
                    }
                    ek0 ek0 = new ek0();
                    if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                        ek0.a = intExtra;
                    }
                    if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                        decoratedBarcodeView.w.setTorch(true);
                    }
                    stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                    if (stringExtra != null) {
                        decoratedBarcodeView.setStatusText(stringExtra);
                    }
                    int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                    String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                    new Object().c(enumMap);
                    decoratedBarcodeView.w.setCameraSettings(ek0);
                    BarcodeView barcodeView = decoratedBarcodeView.w;
                    kb9 kb9 = new kb9(3, false);
                    kb9.y = set;
                    kb9.z = enumMap;
                    kb9.A = stringExtra4;
                    kb9.x = intExtra2;
                    barcodeView.setDecoderFactory(kb9);
                }
                if (stringExtra3 != null) {
                    set = (Set) dk1.b.get(stringExtra3);
                } else {
                    set = null;
                }
                int i32 = ek1.a;
                Bundle extras2 = intent.getExtras();
                enumMap = new EnumMap(fk1.class);
                while (r14 < r13) {
                }
                Log.i("ek1", "Hints from the Intent: " + enumMap);
                ek0 ek02 = new ek0();
                ek02.a = intExtra;
                decoratedBarcodeView.w.setTorch(true);
                stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                }
                int intExtra22 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra42 = intent.getStringExtra("CHARACTER_SET");
                new Object().c(enumMap);
                decoratedBarcodeView.w.setCameraSettings(ek02);
                BarcodeView barcodeView2 = decoratedBarcodeView.w;
                kb9 kb92 = new kb9(3, false);
                kb92.y = set;
                kb92.z = enumMap;
                kb92.A = stringExtra42;
                kb92.x = intExtra22;
                barcodeView2.setDecoderFactory(kb92);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                bl0.i.x = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                bl0.e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                bl0.f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                z = true;
                bl0.j.postDelayed(new yk0(bl0, 1), intent.getLongExtra("TIMEOUT", 0));
            } else {
                z = true;
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                bl0.d = z;
            }
        }
        bl0 bl02 = this.w;
        DecoratedBarcodeView decoratedBarcodeView2 = bl02.b;
        ns8 ns8 = bl02.l;
        BarcodeView barcodeView3 = decoratedBarcodeView2.w;
        jz0 jz0 = new jz0(decoratedBarcodeView2, false, ns8, 10);
        barcodeView3.W = 2;
        barcodeView3.a0 = jz0;
        barcodeView3.h();
    }

    public final void onDestroy() {
        super.onDestroy();
        bl0 bl0 = this.w;
        bl0.g = true;
        bl0.h.a();
        bl0.j.removeCallbacksAndMessages((Object) null);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.x.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        bl0 bl0 = this.w;
        bl0.h.a();
        BarcodeView barcodeView = bl0.b.w;
        xj0 cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        bl0 bl0 = this.w;
        bl0.getClass();
        if (i != 250) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            bl0.a.setResult(0, intent);
            if (bl0.e) {
                bl0.b(bl0.f);
            } else {
                bl0.a();
            }
        } else {
            bl0.b.w.c();
        }
    }

    public final void onResume() {
        super.onResume();
        bl0 bl0 = this.w;
        CaptureActivity captureActivity = bl0.a;
        if (ag8.k(captureActivity, "android.permission.CAMERA") == 0) {
            bl0.b.w.c();
        } else if (!bl0.m) {
            ag8.F(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            bl0.m = true;
        }
        n43 n43 = bl0.h;
        if (!n43.a) {
            ((CaptureActivity) n43.c).registerReceiver((to) n43.d, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            n43.a = true;
        }
        Handler handler = (Handler) n43.e;
        handler.removeCallbacksAndMessages((Object) null);
        if (n43.b) {
            handler.postDelayed((yk0) n43.f, 300000);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.w.c);
    }
}
