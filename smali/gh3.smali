.class public final Lgh3;
.super Lvg2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:Lvg2;


# direct methods
.method public constructor <init>(Lvg2;)V
    .locals 4

    .line 1
    iget v0, p1, Lvg2;->b:I

    .line 2
    .line 3
    iget v1, p1, Lvg2;->c:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {p0, v0, v1, v2, v3}, Lvg2;-><init>(IIIB)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lgh3;->d:Lvg2;

    .line 11
    .line 12
    return-void
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


# virtual methods
.method public final g()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lgh3;->d:Lvg2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvg2;->g()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lvg2;->b:I

    .line 8
    .line 9
    iget p0, p0, Lvg2;->c:I

    .line 10
    .line 11
    mul-int/2addr v1, p0

    .line 12
    new-array p0, v1, [B

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    aget-byte v3, v0, v2

    .line 18
    .line 19
    and-int/lit16 v3, v3, 0xff

    .line 20
    .line 21
    rsub-int v3, v3, 0xff

    .line 22
    .line 23
    int-to-byte v3, v3

    .line 24
    aput-byte v3, p0, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object p0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final h(I[B)[B
    .locals 1

    .line 1
    iget-object v0, p0, Lgh3;->d:Lvg2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lvg2;->h(I[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    :goto_0
    iget v0, p0, Lvg2;->b:I

    .line 9
    .line 10
    if-ge p2, v0, :cond_0

    .line 11
    .line 12
    aget-byte v0, p1, p2

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    rsub-int v0, v0, 0xff

    .line 17
    .line 18
    int-to-byte v0, v0

    .line 19
    aput-byte v0, p1, p2

    .line 20
    .line 21
    add-int/lit8 p2, p2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh3;->d:Lvg2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvg2;->i()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final j()Lvg2;
    .locals 1

    .line 1
    new-instance v0, Lgh3;

    .line 2
    .line 3
    iget-object p0, p0, Lgh3;->d:Lvg2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lvg2;->j()Lvg2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lgh3;-><init>(Lvg2;)V

    .line 10
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
.end method
