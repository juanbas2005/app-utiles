.class public final Li19;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ljava/io/ByteArrayInputStream;

.field public x:Lg19;

.field public final y:[B

.field public final z:Lbr4;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Li19;->y:[B

    .line 9
    .line 10
    new-instance v0, Lbr4;

    .line 11
    .line 12
    const/16 v1, 0x1b

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, v1, v2}, Lbr4;-><init>(IB)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li19;->z:Lbr4;

    .line 19
    .line 20
    iput-object p1, p0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final B()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li19;->o()Lg19;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li19;->x:Lg19;

    .line 5
    .line 6
    iget-byte p0, p0, Lg19;->b:B

    .line 7
    .line 8
    const/16 v0, 0x1f

    .line 9
    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "expected definite length but found "

    .line 14
    .line 15
    invoke-static {p0, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final D(B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li19;->o()Lg19;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li19;->x:Lg19;

    .line 5
    .line 6
    iget-byte p0, p0, Lg19;->a:B

    .line 7
    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    shr-int/lit8 p1, p1, 0x5

    .line 12
    .line 13
    and-int/lit8 p1, p1, 0x7

    .line 14
    .line 15
    shr-int/lit8 p0, p0, 0x5

    .line 16
    .line 17
    and-int/lit8 p0, p0, 0x7

    .line 18
    .line 19
    const-string v0, "expected major type "

    .line 20
    .line 21
    const-string v1, " but found "

    .line 22
    .line 23
    invoke-static {p1, p0, v0, v1}, Lb81;->l(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final E(I[B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eq v0, p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 5
    .line 6
    sub-int v2, p1, v0

    .line 7
    .line 8
    invoke-virtual {v1, p2, v0, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Li19;->x:Lg19;

    .line 25
    .line 26
    return-void
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

.method public final G()[B
    .locals 4

    .line 1
    invoke-virtual {p0}, Li19;->B()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li19;->v()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-ltz v2, :cond_1

    .line 13
    .line 14
    const-wide/32 v2, 0x7fffffff

    .line 15
    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-gtz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-long v2, v2

    .line 28
    cmp-long v2, v2, v0

    .line 29
    .line 30
    if-ltz v2, :cond_0

    .line 31
    .line 32
    long-to-int v0, v0

    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Li19;->E(I[B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_1
    const-string p0, "the maximum supported byte/text string length is 2147483647 bytes"

    .line 46
    .line 47
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
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

.method public final a()J
    .locals 5

    .line 1
    const/16 v0, -0x80

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li19;->D(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li19;->B()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li19;->v()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Li19;->z:Lbr4;

    .line 22
    .line 23
    iget-object p0, p0, Lbr4;->x:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-wide v0

    .line 35
    :cond_1
    const-string p0, "the maximum supported array length is 9223372036854775807"

    .line 36
    .line 37
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-wide v2
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

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Li19;->z:Lbr4;

    .line 7
    .line 8
    invoke-virtual {p0}, Lbr4;->V()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final k()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Li19;->o()Lg19;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li19;->x:Lg19;

    .line 5
    .line 6
    iget-byte v0, v0, Lg19;->a:B

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v1, 0x20

    .line 13
    .line 14
    if-ne v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Li19;->v()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long p0, v1, v3

    .line 24
    .line 25
    if-ltz p0, :cond_2

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-wide v1

    .line 30
    :cond_1
    not-long v0, v1

    .line 31
    return-wide v0

    .line 32
    :cond_2
    const-string p0, "the maximum supported unsigned/negative integer is 9223372036854775807"

    .line 33
    .line 34
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    return-wide v0

    .line 40
    :cond_3
    shr-int/lit8 p0, v0, 0x5

    .line 41
    .line 42
    and-int/lit8 p0, p0, 0x7

    .line 43
    .line 44
    const-string v0, "expected major type 0 or 1 but found "

    .line 45
    .line 46
    invoke-static {p0, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1
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

.method public final l()J
    .locals 7

    .line 1
    const/16 v0, -0x60

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li19;->D(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Li19;->B()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li19;->v()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-ltz v4, :cond_1

    .line 18
    .line 19
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v5, v0, v5

    .line 25
    .line 26
    if-gtz v5, :cond_1

    .line 27
    .line 28
    if-lez v4, :cond_0

    .line 29
    .line 30
    add-long v2, v0, v0

    .line 31
    .line 32
    iget-object p0, p0, Li19;->z:Lbr4;

    .line 33
    .line 34
    iget-object p0, p0, Lbr4;->x:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-wide v0

    .line 46
    :cond_1
    const-string p0, "the maximum supported map length is 4611686018427387903L"

    .line 47
    .line 48
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-wide v2
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

.method public final o()Lg19;
    .locals 11

    .line 1
    iget-object v0, p0, Li19;->x:Lg19;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iget-object v0, p0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Li19;->z:Lbr4;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Lbr4;->V()V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_0
    new-instance v1, Lg19;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lg19;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Li19;->x:Lg19;

    .line 27
    .line 28
    const/16 v0, -0x80

    .line 29
    .line 30
    const-wide/16 v4, -0x5

    .line 31
    .line 32
    const-wide/16 v6, -0x2

    .line 33
    .line 34
    const-wide/16 v8, -0x1

    .line 35
    .line 36
    iget-byte v10, v1, Lg19;->a:B

    .line 37
    .line 38
    if-eq v10, v0, :cond_6

    .line 39
    .line 40
    const/16 v0, -0x60

    .line 41
    .line 42
    if-eq v10, v0, :cond_6

    .line 43
    .line 44
    const/16 v0, -0x40

    .line 45
    .line 46
    if-eq v10, v0, :cond_6

    .line 47
    .line 48
    const/16 v0, -0x20

    .line 49
    .line 50
    if-eq v10, v0, :cond_3

    .line 51
    .line 52
    if-eqz v10, :cond_6

    .line 53
    .line 54
    const/16 v0, 0x20

    .line 55
    .line 56
    if-eq v10, v0, :cond_6

    .line 57
    .line 58
    const/16 v0, 0x40

    .line 59
    .line 60
    if-eq v10, v0, :cond_2

    .line 61
    .line 62
    const/16 v0, 0x60

    .line 63
    .line 64
    if-ne v10, v0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v3, v6, v7}, Lbr4;->W(J)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    shr-int/lit8 p0, v10, 0x5

    .line 71
    .line 72
    and-int/lit8 p0, p0, 0x7

    .line 73
    .line 74
    const-string v0, "invalid major type: "

    .line 75
    .line 76
    invoke-static {p0, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_2
    invoke-virtual {v3, v8, v9}, Lbr4;->W(J)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    iget-byte v0, v1, Lg19;->b:B

    .line 89
    .line 90
    const/16 v1, 0x1f

    .line 91
    .line 92
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v3}, Lbr4;->X()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    const-wide/16 v6, 0x0

    .line 99
    .line 100
    cmp-long v6, v0, v6

    .line 101
    .line 102
    if-gez v6, :cond_5

    .line 103
    .line 104
    cmp-long v0, v0, v4

    .line 105
    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    iget-object v0, v3, Lbr4;->x:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/ArrayDeque;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    const-string p0, "expected a value for dangling key in indefinite-length map"

    .line 117
    .line 118
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_5
    const-string p0, "expected indefinite length scope but found "

    .line 123
    .line 124
    invoke-static {v0, v1, p0}, Lf21;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_6
    invoke-virtual {v3}, Lbr4;->X()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    cmp-long v10, v0, v8

    .line 137
    .line 138
    if-eqz v10, :cond_a

    .line 139
    .line 140
    cmp-long v0, v0, v6

    .line 141
    .line 142
    if-eqz v0, :cond_b

    .line 143
    .line 144
    :goto_0
    invoke-virtual {v3}, Lbr4;->X()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    iget-object v2, v3, Lbr4;->x:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Ljava/util/ArrayDeque;

    .line 151
    .line 152
    const-wide/16 v6, 0x1

    .line 153
    .line 154
    cmp-long v3, v0, v6

    .line 155
    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    if-lez v3, :cond_8

    .line 163
    .line 164
    add-long/2addr v0, v8

    .line 165
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_8
    const-wide/16 v6, -0x4

    .line 177
    .line 178
    cmp-long v3, v0, v6

    .line 179
    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_9
    cmp-long v0, v0, v4

    .line 194
    .line 195
    if-nez v0, :cond_c

    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_a
    move-wide v6, v0

    .line 209
    :cond_b
    const-string p0, "expected non-string scope but found "

    .line 210
    .line 211
    invoke-static {v6, v7, p0}, Lf21;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object v2

    .line 219
    :cond_c
    :goto_1
    iget-object p0, p0, Li19;->x:Lg19;

    .line 220
    .line 221
    return-object p0
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final u()Z
    .locals 2

    .line 1
    const/16 v0, -0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li19;->D(B)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li19;->x:Lg19;

    .line 7
    .line 8
    iget-byte v0, v0, Lg19;->b:B

    .line 9
    .line 10
    const/16 v1, 0x18

    .line 11
    .line 12
    if-gt v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Li19;->v()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int p0, v0

    .line 19
    const/16 v0, 0x14

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_0
    const/16 v0, 0x15

    .line 26
    .line 27
    if-ne p0, v0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const-string p0, "expected FALSE or TRUE"

    .line 32
    .line 33
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_2
    const-string p0, "expected simple value"

    .line 39
    .line 40
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0
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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li19;->x:Lg19;

    .line 4
    .line 5
    iget-byte v2, v1, Lg19;->b:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x18

    .line 9
    .line 10
    if-ge v2, v4, :cond_0

    .line 11
    .line 12
    int-to-long v1, v2

    .line 13
    iput-object v3, v0, Li19;->x:Lg19;

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    const-wide/16 v5, 0xff

    .line 17
    .line 18
    if-ne v2, v4, :cond_2

    .line 19
    .line 20
    iget-object v1, v0, Li19;->w:Ljava/io/ByteArrayInputStream;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    iput-object v3, v0, Li19;->x:Lg19;

    .line 30
    .line 31
    int-to-long v0, v1

    .line 32
    and-long/2addr v0, v5

    .line 33
    return-wide v0

    .line 34
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_2
    const/16 v3, 0x19

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x2

    .line 45
    const/16 v10, 0x8

    .line 46
    .line 47
    iget-object v11, v0, Li19;->y:[B

    .line 48
    .line 49
    if-ne v2, v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v9, v11}, Li19;->E(I[B)V

    .line 52
    .line 53
    .line 54
    aget-byte v0, v11, v8

    .line 55
    .line 56
    int-to-long v0, v0

    .line 57
    aget-byte v2, v11, v7

    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    and-long/2addr v0, v5

    .line 61
    shl-long/2addr v0, v10

    .line 62
    and-long/2addr v2, v5

    .line 63
    or-long/2addr v0, v2

    .line 64
    return-wide v0

    .line 65
    :cond_3
    const/16 v3, 0x1a

    .line 66
    .line 67
    const/16 v12, 0x10

    .line 68
    .line 69
    const/4 v13, 0x3

    .line 70
    const/4 v14, 0x4

    .line 71
    if-ne v2, v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v14, v11}, Li19;->E(I[B)V

    .line 74
    .line 75
    .line 76
    aget-byte v0, v11, v8

    .line 77
    .line 78
    int-to-long v0, v0

    .line 79
    aget-byte v2, v11, v7

    .line 80
    .line 81
    int-to-long v2, v2

    .line 82
    aget-byte v7, v11, v9

    .line 83
    .line 84
    int-to-long v7, v7

    .line 85
    aget-byte v9, v11, v13

    .line 86
    .line 87
    int-to-long v13, v9

    .line 88
    and-long/2addr v0, v5

    .line 89
    shl-long/2addr v0, v4

    .line 90
    and-long/2addr v2, v5

    .line 91
    and-long/2addr v7, v5

    .line 92
    shl-long/2addr v2, v12

    .line 93
    or-long/2addr v0, v2

    .line 94
    shl-long v2, v7, v10

    .line 95
    .line 96
    or-long/2addr v0, v2

    .line 97
    and-long v2, v13, v5

    .line 98
    .line 99
    or-long/2addr v0, v2

    .line 100
    return-wide v0

    .line 101
    :cond_4
    const/16 v3, 0x1b

    .line 102
    .line 103
    const/16 v16, 0x5

    .line 104
    .line 105
    if-ne v2, v3, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0, v10, v11}, Li19;->E(I[B)V

    .line 108
    .line 109
    .line 110
    aget-byte v0, v11, v8

    .line 111
    .line 112
    int-to-long v0, v0

    .line 113
    aget-byte v2, v11, v7

    .line 114
    .line 115
    int-to-long v2, v2

    .line 116
    aget-byte v7, v11, v9

    .line 117
    .line 118
    int-to-long v7, v7

    .line 119
    aget-byte v9, v11, v13

    .line 120
    .line 121
    move v13, v4

    .line 122
    move-wide/from16 v17, v5

    .line 123
    .line 124
    int-to-long v4, v9

    .line 125
    aget-byte v6, v11, v14

    .line 126
    .line 127
    move v14, v10

    .line 128
    move-object v9, v11

    .line 129
    int-to-long v10, v6

    .line 130
    aget-byte v6, v9, v16

    .line 131
    .line 132
    move/from16 v19, v12

    .line 133
    .line 134
    move/from16 p0, v13

    .line 135
    .line 136
    int-to-long v12, v6

    .line 137
    const/4 v6, 0x6

    .line 138
    aget-byte v6, v9, v6

    .line 139
    .line 140
    move/from16 v21, v14

    .line 141
    .line 142
    const/16 v20, 0x7

    .line 143
    .line 144
    int-to-long v14, v6

    .line 145
    aget-byte v6, v9, v20

    .line 146
    .line 147
    move-wide/from16 v22, v0

    .line 148
    .line 149
    int-to-long v0, v6

    .line 150
    and-long v9, v10, v17

    .line 151
    .line 152
    shl-long v9, v9, p0

    .line 153
    .line 154
    and-long v22, v22, v17

    .line 155
    .line 156
    and-long v2, v2, v17

    .line 157
    .line 158
    and-long v6, v7, v17

    .line 159
    .line 160
    and-long v4, v4, v17

    .line 161
    .line 162
    and-long v11, v12, v17

    .line 163
    .line 164
    and-long v13, v14, v17

    .line 165
    .line 166
    const/16 v8, 0x38

    .line 167
    .line 168
    shl-long v15, v22, v8

    .line 169
    .line 170
    const/16 v8, 0x30

    .line 171
    .line 172
    shl-long/2addr v2, v8

    .line 173
    or-long/2addr v2, v15

    .line 174
    const/16 v8, 0x28

    .line 175
    .line 176
    shl-long/2addr v6, v8

    .line 177
    or-long/2addr v2, v6

    .line 178
    const/16 v6, 0x20

    .line 179
    .line 180
    shl-long/2addr v4, v6

    .line 181
    or-long/2addr v2, v4

    .line 182
    or-long/2addr v2, v9

    .line 183
    shl-long v4, v11, v19

    .line 184
    .line 185
    or-long/2addr v2, v4

    .line 186
    shl-long v4, v13, v21

    .line 187
    .line 188
    or-long/2addr v2, v4

    .line 189
    and-long v0, v0, v17

    .line 190
    .line 191
    or-long/2addr v0, v2

    .line 192
    return-wide v0

    .line 193
    :cond_5
    const/16 v20, 0x7

    .line 194
    .line 195
    iget-byte v0, v1, Lg19;->a:B

    .line 196
    .line 197
    shr-int/lit8 v0, v0, 0x5

    .line 198
    .line 199
    and-int/lit8 v0, v0, 0x7

    .line 200
    .line 201
    const-string v1, "invalid additional information "

    .line 202
    .line 203
    const-string v3, " for major type "

    .line 204
    .line 205
    invoke-static {v2, v0, v1, v3}, Lb81;->l(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Lrf2;->i(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-wide/16 v0, 0x0

    .line 213
    .line 214
    return-wide v0
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method
