.class public final Ls74;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public static a(JLjava/lang/Object;)Lqf3;
    .locals 2

    .line 1
    sget-object v0, Ltt7;->c:Lrt7;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lrt7;->h(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqf3;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ldu5;

    .line 11
    .line 12
    iget-boolean v1, v1, Ldu5;->w:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Ldu5;

    .line 17
    .line 18
    iget v1, v0, Ldu5;->y:I

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    mul-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ldu5;->g(I)Ldu5;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p2, p0, p1, v0}, Ltt7;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-object v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
