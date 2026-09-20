package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: wl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wl0 extends xl0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl0(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = carouselLayoutManager;
                super(0);
                return;
            default:
                this.c = carouselLayoutManager;
                return;
        }
    }

    public final int a() {
        int i = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (i) {
            case b85.b:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.D();
        }
    }

    public final int b() {
        switch (this.b) {
            case b85.b:
                return this.c.E();
            default:
                return 0;
        }
    }

    public final int c() {
        int i = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (i) {
            case b85.b:
                return carouselLayoutManager.n - carouselLayoutManager.F();
            default:
                return carouselLayoutManager.n;
        }
    }

    public final int d() {
        switch (this.b) {
            case b85.b:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    public final int e() {
        switch (this.b) {
            case b85.b:
                return 0;
            default:
                return this.c.G();
        }
    }
}
