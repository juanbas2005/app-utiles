package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: er8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class er8 extends ph8 {
    public final /* synthetic */ y50 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er8(y50 y50, Looper looper) {
        super(looper, 3);
        this.a = y50;
    }

    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        si8 si8;
        y50 y50 = this.a;
        int i = y50.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (si8 = (si8) message.obj) != null) {
                synchronized (si8) {
                    si8.a = null;
                }
                y50 y502 = si8.c;
                synchronized (y502.l) {
                    y502.l.remove(si8);
                }
            }
        } else if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !(y50 instanceof l49)) || i3 == 5)) && !y50.q()) {
            si8 si82 = (si8) message.obj;
            if (si82 != null) {
                synchronized (si82) {
                    si82.a = null;
                }
                y50 y503 = si82.c;
                synchronized (y503.l) {
                    y503.l.remove(si82);
                }
            }
        } else {
            int i4 = message.what;
            if (i4 == 4) {
                y50.u = new m11(message.arg2, (PendingIntent) null, (String) null);
                if (!y50.v() || y50.v) {
                    m11 m11 = y50.u;
                    if (m11 == null) {
                        m11 = new m11(8, (PendingIntent) null, (String) null);
                    }
                    y50.j.f(m11);
                    System.currentTimeMillis();
                    return;
                }
                y50.w(3, (IInterface) null);
            } else if (i4 == 5) {
                m11 m112 = y50.u;
                if (m112 == null) {
                    m112 = new m11(8, (PendingIntent) null, (String) null);
                }
                y50.j.f(m112);
                System.currentTimeMillis();
            } else if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                y50.j.f(new m11(message.arg2, pendingIntent2, (String) null));
                System.currentTimeMillis();
            } else if (i4 == 6) {
                y50.w(5, (IInterface) null);
                v50 v50 = y50.o;
                if (v50 != null) {
                    v50.a(message.arg2);
                }
                System.currentTimeMillis();
                y50.t(5, 1, (IInterface) null);
            } else if (i4 != 2 || y50.p()) {
                int i5 = message.what;
                if (i5 == 2 || i5 == 1 || i5 == 7) {
                    si8 si83 = (si8) message.obj;
                    synchronized (si83) {
                        try {
                            bool = si83.a;
                            if (si83.b) {
                                String obj2 = si83.toString();
                                StringBuilder sb = new StringBuilder(obj2.length() + 47);
                                sb.append("Callback proxy ");
                                sb.append(obj2);
                                sb.append(" being reused. This is not safe.");
                                Log.w("GmsClient", sb.toString());
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    if (bool != null) {
                        y50 y504 = si83.f;
                        int i6 = si83.d;
                        if (i6 != 0) {
                            y504.w(1, (IInterface) null);
                            Bundle bundle = si83.e;
                            if (bundle != null) {
                                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                            } else {
                                pendingIntent = null;
                            }
                            si83.b(new m11(i6, pendingIntent, (String) null));
                        } else if (!si83.a()) {
                            y504.w(1, (IInterface) null);
                            si83.b(new m11(8, (PendingIntent) null, (String) null));
                        }
                    }
                    synchronized (si83) {
                        si83.b = true;
                    }
                    synchronized (si83) {
                        si83.a = null;
                    }
                    y50 y505 = si83.c;
                    synchronized (y505.l) {
                        y505.l.remove(si83);
                    }
                    return;
                }
                Log.wtf("GmsClient", hl6.p(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
            } else {
                si8 si84 = (si8) message.obj;
                if (si84 != null) {
                    synchronized (si84) {
                        si84.a = null;
                    }
                    y50 y506 = si84.c;
                    synchronized (y506.l) {
                        y506.l.remove(si84);
                    }
                }
            }
        }
    }
}
