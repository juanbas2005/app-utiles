.class public final Lcm3;
.super Lbb0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b0:Lz1;

.field public final c0:Lz53;


# direct methods
.method public constructor <init>(Lz1;Lpl3;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcm3;->b0:Lz1;

    .line 8
    .line 9
    iget-object p1, p2, Lpl3;->b:Lz53;

    .line 10
    .line 11
    iput-object p1, p0, Lcm3;->c0:Lz53;

    .line 12
    .line 13
    return-void
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


# virtual methods
.method public final A()B
    .locals 5

    .line 1
    iget-object p0, p0, Lcm3;->b0:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz1;->p()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lf55;->t(Ljava/lang/String;)Llr7;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget v2, v2, Llr7;->w:I

    .line 18
    .line 19
    const/high16 v3, -0x80000000

    .line 20
    .line 21
    xor-int/2addr v3, v2

    .line 22
    const v4, -0x7fffff01

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/Integer;->compare(II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    int-to-byte v2, v2

    .line 33
    new-instance v3, Lfr7;

    .line 34
    .line 35
    invoke-direct {v3, v2}, Lfr7;-><init>(B)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move-object v3, v1

    .line 40
    :goto_1
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iget-byte p0, v3, Lfr7;->w:B

    .line 43
    .line 44
    return p0

    .line 45
    :cond_2
    invoke-static {v0}, Lk57;->o0(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :catch_0
    const-string v2, "Failed to parse type \'UByte\' for input \'"

    .line 50
    .line 51
    const/16 v3, 0x27

    .line 52
    .line 53
    invoke-static {v3, v2, v0}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x6

    .line 59
    invoke-static {p0, v0, v2, v1, v3}, Lz1;->u(Lz1;Ljava/lang/String;ILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    throw v1
    .line 63
.end method

.method public final B()S
    .locals 5

    .line 1
    iget-object p0, p0, Lcm3;->b0:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz1;->p()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lf55;->t(Ljava/lang/String;)Llr7;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget v2, v2, Llr7;->w:I

    .line 18
    .line 19
    const/high16 v3, -0x80000000

    .line 20
    .line 21
    xor-int/2addr v3, v2

    .line 22
    const v4, -0x7fff0001

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4}, Ljava/lang/Integer;->compare(II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    int-to-short v2, v2

    .line 33
    new-instance v3, Lbs7;

    .line 34
    .line 35
    invoke-direct {v3, v2}, Lbs7;-><init>(S)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move-object v3, v1

    .line 40
    :goto_1
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iget-short p0, v3, Lbs7;->w:S

    .line 43
    .line 44
    return p0

    .line 45
    :cond_2
    invoke-static {v0}, Lk57;->o0(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :catch_0
    const-string v2, "Failed to parse type \'UShort\' for input \'"

    .line 50
    .line 51
    const/16 v3, 0x27

    .line 52
    .line 53
    invoke-static {v3, v2, v0}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x6

    .line 59
    invoke-static {p0, v0, v2, v1, v3}, Lz1;->u(Lz1;Ljava/lang/String;ILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    throw v1
    .line 63
.end method

.method public final a()Lz53;
    .locals 0

    .line 1
    iget-object p0, p0, Lcm3;->c0:Lz53;

    .line 2
    .line 3
    return-object p0
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

.method public final h(Lll6;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "unsupported"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
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

.method public final o()I
    .locals 4

    .line 1
    iget-object p0, p0, Lcm3;->b0:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz1;->p()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lf55;->t(Ljava/lang/String;)Llr7;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget p0, v2, Llr7;->w:I

    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    invoke-static {v0}, Lk57;->o0(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :catch_0
    const-string v2, "Failed to parse type \'UInt\' for input \'"

    .line 25
    .line 26
    const/16 v3, 0x27

    .line 27
    .line 28
    invoke-static {v3, v2, v0}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-static {p0, v0, v2, v1, v3}, Lz1;->u(Lz1;Ljava/lang/String;ILjava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    throw v1
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

.method public final v()J
    .locals 4

    .line 1
    iget-object p0, p0, Lcm3;->b0:Lz1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz1;->p()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lf55;->u(Ljava/lang/String;)Lqr7;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-wide v0, v2, Lqr7;->w:J

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_0
    invoke-static {v0}, Lk57;->o0(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    :catch_0
    const-string v2, "Failed to parse type \'ULong\' for input \'"

    .line 25
    .line 26
    const/16 v3, 0x27

    .line 27
    .line 28
    invoke-static {v3, v2, v0}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-static {p0, v0, v2, v1, v3}, Lz1;->u(Lz1;Ljava/lang/String;ILjava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    throw v1
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
