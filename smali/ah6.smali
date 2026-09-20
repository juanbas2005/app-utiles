.class public final Lah6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lzg6;


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lyg6;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lyg6;-><init>(Landroidx/core/widget/NestedScrollView;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lah6;->a:Lzg6;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ltz2;

    .line 19
    .line 20
    const/16 v0, 0x9

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ltz2;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lah6;->a:Lzg6;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method
