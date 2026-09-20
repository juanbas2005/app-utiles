package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xa1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xa1 implements Thread.UncaughtExceptionHandler {
    public final wv2 a;
    public final z00 b;
    public final Thread.UncaughtExceptionHandler c;
    public final q91 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public xa1(wv2 wv2, z00 z00, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, q91 q91) {
        this.a = wv2;
        this.b = z00;
        this.c = uncaughtExceptionHandler;
        this.d = q91;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", (Throwable) null);
            return false;
        } else if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", (Throwable) null);
            return false;
        } else if (!this.d.b()) {
            return true;
        } else {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", (Throwable) null);
            }
            return false;
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            if (a(thread, th)) {
                this.a.p(this.b, thread, th);
            } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", (Throwable) null);
            }
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable) null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", (Throwable) null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
        } catch (Exception e2) {
            g22 g22 = g22.D;
            if (g22.g(6)) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e2);
            }
            if (uncaughtExceptionHandler != null) {
                g22.o("Completed exception processing. Invoking default exception handler.");
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                g22.o("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable) null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", (Throwable) null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
