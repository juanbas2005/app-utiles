.class public final Lrr6;
.super Ld3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:J

.field public b:Lkk0;


# virtual methods
.method public final a(Lc3;)Z
    .locals 4

    .line 1
    check-cast p1, Lpr6;

    .line 2
    .line 3
    iget-wide v0, p0, Lrr6;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-wide v0, p1, Lpr6;->E:J

    .line 14
    .line 15
    iget-wide v2, p1, Lpr6;->F:J

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    iput-wide v0, p1, Lpr6;->F:J

    .line 22
    .line 23
    :cond_1
    iput-wide v0, p0, Lrr6;->a:J

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0
    .line 27
    .line 28
    .line 29
.end method

.method public final b(Lc3;)[Lf61;
    .locals 4

    .line 1
    check-cast p1, Lpr6;

    .line 2
    .line 3
    iget-wide v0, p0, Lrr6;->a:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    iput-wide v2, p0, Lrr6;->a:J

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, p0, Lrr6;->b:Lkk0;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lpr6;->w(J)[Lf61;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
