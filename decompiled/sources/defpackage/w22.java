package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: w22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w22 {
    public static final Object j = new Object();
    public static volatile w22 k;
    public final ReentrantReadWriteLock a;
    public final os b;
    public volatile int c = 3;
    public final Handler d;
    public final dc e;
    public final v22 f;
    public final kw5 g;
    public final int h;
    public final tl1 i;

    public w22(ml2 ml2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        v22 v22 = (v22) ml2.b;
        this.f = v22;
        int i2 = ml2.a;
        this.h = i2;
        this.i = (tl1) ml2.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new os(0);
        this.g = new kw5(27);
        dc dcVar = new dc(this);
        this.e = dcVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                v22.a(new s22(dcVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static w22 a() {
        w22 w22;
        boolean z;
        synchronized (j) {
            try {
                w22 = k;
                if (w22 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w22;
    }

    public static boolean d() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b(int i2, CharSequence charSequence) {
        boolean z = true;
        if (c() != 1) {
            z = false;
        }
        if (z) {
            k75.i("charSequence cannot be null", charSequence);
            wr0 wr0 = (wr0) this.e.b;
            wr0.getClass();
            if (i2 < 0 || i2 >= charSequence.length()) {
                return -1;
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                uq7[] uq7Arr = (uq7[]) spanned.getSpans(i2, i2 + 1, uq7.class);
                if (uq7Arr.length > 0) {
                    return spanned.getSpanStart(uq7Arr[0]);
                }
            }
            return ((i32) wr0.W(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new i32(i2))).x;
        }
        h.s("Not initialized yet");
        return 0;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            h.s("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        } else if (c() != 1) {
            this.a.writeLock().lock();
            try {
                if (this.c != 0) {
                    this.c = 0;
                    this.a.writeLock().unlock();
                    dc dcVar = this.e;
                    w22 w22 = (w22) dcVar.a;
                    try {
                        w22.f.a(new s22(dcVar));
                    } catch (Throwable th) {
                        w22.f(th);
                    }
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new cj0((List) arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, gt7] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098 A[SYNTHETIC, Splitter:B:49:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca A[SYNTHETIC, Splitter:B:63:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(int i2, int i3, int i4, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Throwable th;
        CharSequence charSequence2;
        int i5;
        int i6;
        if (c() == 1) {
            z = true;
        } else {
            z = false;
        }
        gt7 gt7 = null;
        if (!z) {
            h.s("Not initialized yet");
            return null;
        } else if (i2 < 0) {
            h.q("start cannot be negative");
            return null;
        } else if (i3 >= 0) {
            if (i2 <= i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            k75.g("start should be <= than end", z2);
            if (charSequence == null) {
                return null;
            }
            if (i2 <= charSequence.length()) {
                z3 = true;
            } else {
                z3 = false;
            }
            k75.g("start should be < than charSequence length", z3);
            if (i3 <= charSequence.length()) {
                z4 = true;
            } else {
                z4 = false;
            }
            k75.g("end should be < than charSequence length", z4);
            if (charSequence.length() == 0 || i2 == i3) {
                return charSequence;
            }
            if (i4 != 1) {
                z5 = false;
            } else {
                z5 = true;
            }
            wr0 wr0 = (wr0) this.e.b;
            wr0.getClass();
            boolean z6 = charSequence instanceof bz6;
            if (z6) {
                ((bz6) charSequence).a();
            }
            Class<uq7> cls = uq7.class;
            if (!z6) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, cls) <= i3) {
                            ? obj = new Object();
                            obj.w = false;
                            obj.x = new SpannableString(charSequence);
                            gt7 = obj;
                        }
                        if (gt7 != null) {
                            uq7[] uq7Arr = (uq7[]) gt7.x.getSpans(i2, i3, cls);
                            if (uq7Arr != null && uq7Arr.length > 0) {
                                for (uq7 uq7 : uq7Arr) {
                                    int spanStart = gt7.x.getSpanStart(uq7);
                                    int spanEnd = gt7.x.getSpanEnd(uq7);
                                    if (spanStart != i3) {
                                        gt7.removeSpan(uq7);
                                    }
                                    i2 = Math.min(spanStart, i2);
                                    i3 = Math.max(spanEnd, i3);
                                }
                            }
                        }
                        i5 = i2;
                        i6 = i3;
                        if (i5 != i6) {
                            if (i5 < charSequence.length()) {
                                charSequence2 = charSequence;
                                try {
                                    gt7 gt72 = (gt7) wr0.W(charSequence2, i5, i6, Integer.MAX_VALUE, z5, new jz0(20, gt7, (kw5) wr0.x));
                                    if (gt72 != null) {
                                        Spannable spannable = gt72.x;
                                        if (z6) {
                                            ((bz6) charSequence2).b();
                                        }
                                        return spannable;
                                    }
                                    if (!z6) {
                                        return charSequence2;
                                    }
                                    ((bz6) charSequence2).b();
                                    return charSequence2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (z6) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        charSequence2 = charSequence;
                        if (!z6) {
                            return charSequence2;
                        }
                        ((bz6) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    if (z6) {
                    }
                    throw th;
                }
            }
            try {
                gt7 = new gt7((Spannable) charSequence);
                if (gt7 != null) {
                }
                i5 = i2;
                i6 = i3;
                if (i5 != i6) {
                }
                charSequence2 = charSequence;
                if (!z6) {
                }
                ((bz6) charSequence2).b();
                return charSequence2;
            } catch (Throwable th4) {
                th = th4;
                charSequence2 = charSequence;
                th = th;
                if (z6) {
                    ((bz6) charSequence2).b();
                }
                throw th;
            }
        } else {
            h.q("end cannot be negative");
            return null;
        }
    }

    public final void h(u22 u22) {
        k75.i("initCallback cannot be null", u22);
        this.a.writeLock().lock();
        try {
            if (this.c != 1) {
                if (this.c != 2) {
                    this.b.add(u22);
                }
            }
            this.d.post(new cj0(Arrays.asList(new u22[]{u22}), this.c, (Throwable) null));
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i2;
        if (c() == 1 && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            dc dcVar = this.e;
            dcVar.getClass();
            Bundle bundle = editorInfo.extras;
            pk4 pk4 = (pk4) ((am6) dcVar.c).x;
            int a2 = pk4.a(4);
            if (a2 != 0) {
                i2 = ((ByteBuffer) pk4.z).getInt(a2 + pk4.w);
            } else {
                i2 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i2);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
}
