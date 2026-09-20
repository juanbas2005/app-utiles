.class public final Lj55;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsh4;


# instance fields
.field public K:Lvr2;

.field public L:J


# virtual methods
.method public final K0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final a(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lj55;->L:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lwe3;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj55;->K:Lvr2;

    .line 10
    .line 11
    new-instance v1, Lwe3;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lwe3;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lj55;->L:J

    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
