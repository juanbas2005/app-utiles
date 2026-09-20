package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: hl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class hl6 {
    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewParent] */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public static final void a(int i, View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (rq2.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int B = b81.B(i);
        ViewGroup viewGroup2 = null;
        if (B == 0) {
            ? parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = parent;
            }
            if (viewGroup2 != null) {
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
            }
        } else if (B == 1) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ? parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup2 = parent2;
            }
            if (viewGroup2 == null) {
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
        } else if (B == 2) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
        } else if (B == 3) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            view.setVisibility(4);
        }
    }

    public static /* synthetic */ int b(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }

    public static int c(int i) {
        switch (i) {
            case b85.b:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ long d(int i) {
        if (i == 1) {
            return 1099511627776L;
        }
        if (i == 2) {
            return 1073741824;
        }
        if (i == 3) {
            return 1048576;
        }
        if (i == 4) {
            return 1024;
        }
        if (i == 5) {
            return 1;
        }
        throw null;
    }

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int f(int i, int i2, int i3) {
        return fl8.a(i) + i2 + i3;
    }

    public static int g(int i, int i2, int i3, int i4) {
        return fl8.a(i) + i2 + i3 + i4;
    }

    public static int h(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int i(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int j(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static String k(int i, String str) {
        return str + i;
    }

    public static String l(yt2 yt2, int i, int i2, yt2 yt22, boolean z) {
        yt2.e0(i);
        String u = l55.u(i2, yt22);
        yt2.r(z);
        return u;
    }

    public static String m(c26 c26, Class cls, StringBuilder sb) {
        sb.append(c26.b(cls));
        return sb.toString();
    }

    public static String n(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static StringBuilder q(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static zl8 r(zl8 zl8) {
        int size = zl8.size();
        return zl8.t(size + size);
    }

    public static /* synthetic */ void s(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
        } else if (autoCloseable instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
        } else if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
        } else if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else {
            ku4.v();
        }
    }

    public static void t(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ADDING";
        }
        if (i != 3) {
            return "null";
        }
        return "REMOVING";
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i == 3) {
            return "GONE";
        }
        if (i != 4) {
            return "null";
        }
        return "INVISIBLE";
    }
}
