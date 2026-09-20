.class public final Lch0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltp1;


# instance fields
.field public w:Lhd0;

.field public x:Lwv2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkw5;->A:Lkw5;

    .line 5
    .line 6
    iput-object v0, p0, Lch0;->w:Lhd0;

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
.end method


# virtual methods
.method public final Y()F
    .locals 0

    .line 1
    iget-object p0, p0, Lch0;->w:Lhd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lhd0;->b()Ltp1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ltp1;->Y()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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

.method public final a(Lvr2;)Lwv2;
    .locals 2

    .line 1
    new-instance v0, Lwv2;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwv2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lwv2;->x:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lch0;->x:Lwv2;

    .line 11
    .line 12
    return-object v0
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

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lch0;->w:Lhd0;

    .line 2
    .line 3
    invoke-interface {p0}, Lhd0;->b()Ltp1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ltp1;->b()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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
