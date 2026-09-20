package cu.lestebang.utiletecsa.feature.nauta.service;

import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "nauta"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class NautaTileService extends TileService implements nu2 {
    public static final /* synthetic */ int D = 0;
    public final ig0 A;
    public h27 B;
    public h27 C;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public ur4 z;

    public NautaTileService() {
        w77 d = b85.d();
        dn1 dn1 = aw1.a;
        this.A = gl0.E(rc9.D0(d, pe4.a.B));
    }

    public static final void b(NautaTileService nautaTileService, boolean z2, String str) {
        int i;
        Tile qsTile = nautaTileService.getQsTile();
        if (qsTile != null) {
            if (z2) {
                i = 2;
            } else {
                i = 1;
            }
            qsTile.setState(i);
            if (Build.VERSION.SDK_INT >= 29) {
                if (!z2 || d57.I0(str)) {
                    str = null;
                }
                qsTile.setSubtitle(str);
            }
            qsTile.updateTile();
        }
    }

    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w.a();
    }

    public final ur4 c() {
        ur4 ur4 = this.z;
        if (ur4 != null) {
            return ur4;
        }
        sg3.a0("nautaRepository");
        throw null;
    }

    public final void onClick() {
        super.onClick();
        h27 h27 = this.C;
        if (h27 == null || !h27.l()) {
            this.C = ar7.H(this.A, (e81) null, (r81) null, new b23(this, (f61) null), 3);
        }
    }

    public final void onCreate() {
        if (!this.y) {
            this.y = true;
            this.z = (ur4) ((sd1) ((ss4) a())).a.C.get();
        }
        super.onCreate();
    }

    public final void onDestroy() {
        gl0.J(this.A, (CancellationException) null);
        super.onDestroy();
    }

    public final void onStartListening() {
        super.onStartListening();
        this.B = ar7.H(this.A, (e81) null, (r81) null, new ot(this, (f61) null, 21), 3);
    }

    public final void onStopListening() {
        h27 h27 = this.B;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.B = null;
        super.onStopListening();
    }
}
