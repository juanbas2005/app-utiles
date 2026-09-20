.class public final Lcd1;
.super Lsg4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lcd1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lsg4;-><init>(Lsg4;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lcd1;->r:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p1, p0, Lcd1;->r:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Lrq6;Landroid/graphics/RectF;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lsg4;-><init>(Lrq6;)V

    .line 10
    iput-object p2, p0, Lcd1;->r:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Ldd1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lug4;-><init>(Lsg4;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Ldd1;->c0:Lcd1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lug4;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
