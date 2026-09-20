package defpackage;

import java.util.function.Consumer;

/* renamed from: kf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class kf3 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ StringBuilder b;

    public /* synthetic */ kf3(int i, StringBuilder sb) {
        this.a = i;
        this.b = sb;
    }

    public final void accept(Object obj) {
        int i = this.a;
        StringBuilder sb = this.b;
        switch (i) {
            case b85.b:
                sb.append(" @");
                sb.append((Integer) obj);
                return;
            case 1:
                sb.append("listen_port=");
                sb.append((Integer) obj);
                sb.append(10);
                return;
            case 2:
                sb.append(" @");
                sb.append((gb3) obj);
                return;
            case 3:
                sb.append("endpoint=");
                sb.append((gb3) obj);
                sb.append(10);
                return;
            case 4:
                sb.append("persistent_keepalive_interval=");
                sb.append((Integer) obj);
                sb.append(10);
                return;
            default:
                sb.append("preshared_key=");
                sb.append(((ns3) obj).e());
                sb.append(10);
                return;
        }
    }
}
