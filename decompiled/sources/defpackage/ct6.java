package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ct6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ct6 implements s92 {
    public final SidecarInterface a;
    public final zs6 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public cf4 e;

    public ct6(Context context) {
        context.getClass();
        SidecarInterface a2 = bt6.a(context);
        zs6 zs6 = new zs6();
        this.a = a2;
        this.b = zs6;
    }

    public final pb8 a(Activity activity) {
        IBinder iBinder;
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
        if (window == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (iBinder == null) {
            return new pb8(a42.w);
        }
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.c(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void b(Activity activity) {
        IBinder iBinder;
        boolean z;
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            iBinder = null;
        } else {
            iBinder = attributes.token;
        }
        if (iBinder != null) {
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
            }
            LinkedHashMap linkedHashMap = this.d;
            v31 v31 = (v31) linkedHashMap.get(activity);
            if (v31 != null) {
                if (activity instanceof z45) {
                    ((z45) activity).j(v31);
                }
                linkedHashMap.remove(activity);
            }
            cf4 cf4 = this.e;
            if (cf4 != null) {
                ReentrantLock reentrantLock = (ReentrantLock) cf4.y;
                reentrantLock.lock();
                try {
                    ((WeakHashMap) cf4.z).put(activity, (Object) null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            LinkedHashMap linkedHashMap2 = this.c;
            if (linkedHashMap2.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap2.remove(iBinder);
            if (z && (sidecarInterface = this.a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void c(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        cf4 cf4 = this.e;
        if (cf4 != null) {
            cf4.x(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof z45)) {
            at6 at6 = new at6(this, activity);
            linkedHashMap2.put(activity, at6);
            ((z45) activity).i(at6);
        }
    }

    public final void d(br4 br4) {
        this.e = new cf4(br4);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:54|55|56|57|63|64|65|66|67|(2:69|84)(2:70|71)) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013b A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0170 A[Catch:{ NoSuchFieldError -> 0x00b9, all -> 0x0194 }] */
    public final boolean e() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        SidecarDeviceState sidecarDeviceState;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        try {
            SidecarInterface sidecarInterface = this.a;
            if (sidecarInterface == null || (cls7 = sidecarInterface.getClass()) == null) {
                method = null;
            } else {
                method = cls7.getMethod("setSidecarCallback", new Class[]{SidecarInterface.SidecarCallback.class});
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls8 = Void.TYPE;
            if (sg3.e(cls, cls8)) {
                SidecarInterface sidecarInterface2 = this.a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.a;
                Class<IBinder> cls9 = IBinder.class;
                if (sidecarInterface4 != null) {
                    Class<?> cls10 = sidecarInterface4.getClass();
                    if (cls10 != null) {
                        method2 = cls10.getMethod("getWindowLayoutInfo", new Class[]{cls9});
                        if (method2 == null) {
                            cls2 = method2.getReturnType();
                        } else {
                            cls2 = null;
                        }
                        if (!sg3.e(cls2, SidecarWindowLayoutInfo.class)) {
                            SidecarInterface sidecarInterface5 = this.a;
                            if (sidecarInterface5 == null || (cls6 = sidecarInterface5.getClass()) == null) {
                                method3 = null;
                            } else {
                                method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", new Class[]{cls9});
                            }
                            if (method3 != null) {
                                cls3 = method3.getReturnType();
                            } else {
                                cls3 = null;
                            }
                            if (sg3.e(cls3, cls8)) {
                                SidecarInterface sidecarInterface6 = this.a;
                                if (sidecarInterface6 == null || (cls5 = sidecarInterface6.getClass()) == null) {
                                    method4 = null;
                                } else {
                                    method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", new Class[]{cls9});
                                }
                                if (method4 != null) {
                                    cls4 = method4.getReturnType();
                                } else {
                                    cls4 = null;
                                }
                                if (sg3.e(cls4, cls8)) {
                                    sidecarDeviceState = new SidecarDeviceState();
                                    sidecarDeviceState.posture = 3;
                                    List sidecarDisplayFeature = new SidecarDisplayFeature();
                                    Rect rect = sidecarDisplayFeature.getRect();
                                    rect.getClass();
                                    sidecarDisplayFeature.setRect(rect);
                                    sidecarDisplayFeature.getType();
                                    sidecarDisplayFeature.setType(1);
                                    SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                    sidecarDisplayFeature = sidecarWindowLayoutInfo.displayFeatures;
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(sidecarDisplayFeature);
                                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke(sidecarWindowLayoutInfo, new Object[]{arrayList});
                                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                                    invoke.getClass();
                                    if (!arrayList.equals((List) invoke)) {
                                        return true;
                                    }
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                            }
                            throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                        }
                        throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
                    }
                }
                method2 = null;
                if (method2 == null) {
                }
                if (!sg3.e(cls2, SidecarWindowLayoutInfo.class)) {
                }
            } else {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
            }
        } catch (NoSuchFieldError unused) {
            SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{3});
            Object invoke2 = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
            invoke2.getClass();
            if (((Integer) invoke2).intValue() != 3) {
                throw new Exception("Invalid device posture getter/setter");
            }
        } catch (Throwable unused2) {
            return false;
        }
    }
}
