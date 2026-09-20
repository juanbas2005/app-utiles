.class public final Lh33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lw72;


# static fields
.field public static final f:Lbz2;


# instance fields
.field public final a:Ld45;

.field public final b:Lv72;

.field public final c:Lwr0;

.field public d:I

.field public final e:Lcp0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lbz2;->x:Lbz2;

    .line 2
    .line 3
    const-string v0, "OkHttp-Response-Body"

    .line 4
    .line 5
    const-string v1, "Truncated"

    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, [Ljava/lang/String;

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    rem-int/2addr v2, v1

    .line 20
    if-nez v2, :cond_3

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, [Ljava/lang/String;

    .line 28
    .line 29
    array-length v3, v2

    .line 30
    const/4 v4, 0x0

    .line 31
    move v5, v4

    .line 32
    :goto_0
    if-ge v5, v3, :cond_1

    .line 33
    .line 34
    aget-object v6, v2, v5

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    aget-object v6, v0, v5

    .line 39
    .line 40
    invoke-static {v6}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    aput-object v6, v2, v5

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string v0, "Headers cannot be null"

    .line 54
    .line 55
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    array-length v0, v2

    .line 60
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    invoke-static {v4, v0, v1}, Lwn6;->m(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ltz v0, :cond_2

    .line 67
    .line 68
    :goto_1
    aget-object v1, v2, v4

    .line 69
    .line 70
    add-int/lit8 v3, v4, 0x1

    .line 71
    .line 72
    aget-object v3, v2, v3

    .line 73
    .line 74
    invoke-static {v1}, Lza5;->u(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Lza5;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    if-eq v4, v0, :cond_2

    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance v0, Lbz2;

    .line 86
    .line 87
    invoke-direct {v0, v2}, Lbz2;-><init>([Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lh33;->f:Lbz2;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    const-string v0, "Expected alternating header names and values"

    .line 94
    .line 95
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public constructor <init>(Ld45;Lv72;Lwr0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh33;->a:Ld45;

    .line 8
    .line 9
    iput-object p2, p0, Lh33;->b:Lv72;

    .line 10
    .line 11
    iput-object p3, p0, Lh33;->c:Lwr0;

    .line 12
    .line 13
    new-instance p1, Lcp0;

    .line 14
    .line 15
    iget-object p2, p3, Lwr0;->y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lzw5;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lcp0;-><init>(Lzw5;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lh33;->e:Lcp0;

    .line 23
    .line 24
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final a(La66;)Loy6;
    .locals 10

    .line 1
    iget-object v0, p1, La66;->w:Lkd6;

    .line 2
    .line 3
    invoke-static {p1}, La53;->a(La66;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lg73;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lh33;->k(Lg73;J)Le33;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string v1, "Transfer-Encoding"

    .line 21
    .line 22
    iget-object v2, p1, La66;->B:Lbz2;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lbz2;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :cond_1
    const-string v3, "chunked"

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const-string v3, "state: "

    .line 39
    .line 40
    const/4 v4, 0x5

    .line 41
    const/4 v5, 0x4

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object p1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lg73;

    .line 47
    .line 48
    iget v0, p0, Lh33;->d:I

    .line 49
    .line 50
    if-ne v0, v5, :cond_2

    .line 51
    .line 52
    iput v4, p0, Lh33;->d:I

    .line 53
    .line 54
    new-instance v0, Ld33;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, Ld33;-><init>(Lh33;Lg73;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    iget p0, p0, Lh33;->d:I

    .line 61
    .line 62
    invoke-static {p0, v3}, Lku4;->q(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_3
    invoke-static {p1}, Lfg8;->e(La66;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    const-wide/16 v8, -0x1

    .line 71
    .line 72
    cmp-long p1, v6, v8

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    iget-object p1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lg73;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v6, v7}, Lh33;->k(Lg73;J)Le33;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    iget-object p1, v0, Lkd6;->x:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lg73;

    .line 88
    .line 89
    iget v0, p0, Lh33;->d:I

    .line 90
    .line 91
    if-ne v0, v5, :cond_5

    .line 92
    .line 93
    iput v4, p0, Lh33;->d:I

    .line 94
    .line 95
    iget-object v0, p0, Lh33;->b:Lv72;

    .line 96
    .line 97
    invoke-interface {v0}, Lv72;->e()V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lg33;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p0, p1}, Lb33;-><init>(Lh33;Lg73;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    iget p0, p0, Lh33;->d:I

    .line 110
    .line 111
    invoke-static {p0, v3}, Lku4;->q(ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v2
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, Lh33;->c:Lwr0;

    .line 2
    .line 3
    iget-object p0, p0, Lwr0;->z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyw5;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyw5;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public final c()Z
    .locals 1

    .line 1
    iget p0, p0, Lh33;->d:I

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
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

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lh33;->b:Lv72;

    .line 2
    .line 3
    invoke-interface {p0}, Lv72;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final d(La66;)J
    .locals 1

    .line 1
    invoke-static {p1}, La53;->a(La66;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object p0, p1, La66;->B:Lbz2;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbz2;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    const-string v0, "chunked"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 p0, -0x1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_2
    invoke-static {p1}, Lfg8;->e(La66;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
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

.method public final e(Lkd6;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh33;->b:Lv72;

    .line 5
    .line 6
    invoke-interface {v0}, Lv72;->h()Lt96;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lt96;->b:Ljava/net/Proxy;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p1, Lkd6;->y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Lkd6;->x:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lg73;

    .line 39
    .line 40
    iget-object v3, v2, Lg73;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v4, "https"

    .line 43
    .line 44
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 51
    .line 52
    if-ne v0, v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v2}, Lg73;->b()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v2}, Lg73;->d()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/16 v0, 0x3f

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object p1, p1, Lkd6;->z:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Lbz2;

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Lh33;->l(Lbz2;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final f(Z)Lz56;
    .locals 8

    .line 1
    iget-object v0, p0, Lh33;->e:Lcp0;

    .line 2
    .line 3
    iget v1, p0, Lh33;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "state: "

    .line 19
    .line 20
    iget p0, p0, Lh33;->d:I

    .line 21
    .line 22
    invoke-static {p0, p1}, Lku4;->q(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lcp0;->y:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Led0;

    .line 29
    .line 30
    iget-wide v4, v0, Lcp0;->x:J

    .line 31
    .line 32
    invoke-interface {v1, v4, v5}, Led0;->H(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v4, v0, Lcp0;->x:J

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    int-to-long v6, v6

    .line 43
    sub-long/2addr v4, v6

    .line 44
    iput-wide v4, v0, Lcp0;->x:J

    .line 45
    .line 46
    invoke-static {v1}, Lub5;->p(Ljava/lang/String;)Lig;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v4, v1, Lig;->b:I

    .line 51
    .line 52
    new-instance v5, Lz56;

    .line 53
    .line 54
    invoke-direct {v5}, Lz56;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v6, v1, Lig;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lgu5;

    .line 60
    .line 61
    iput-object v6, v5, Lz56;->b:Lgu5;

    .line 62
    .line 63
    iput v4, v5, Lz56;->c:I

    .line 64
    .line 65
    iget-object v1, v1, Lig;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v5, Lz56;->d:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcp0;->h()Lbz2;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lbz2;->k()Lzy2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, v5, Lz56;->f:Lzy2;

    .line 80
    .line 81
    const/16 v0, 0x64

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    if-ne v4, v0, :cond_2

    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_2
    if-ne v4, v0, :cond_3

    .line 89
    .line 90
    iput v3, p0, Lh33;->d:I

    .line 91
    .line 92
    return-object v5

    .line 93
    :catch_0
    move-exception p1

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const/16 p1, 0x66

    .line 96
    .line 97
    if-gt p1, v4, :cond_4

    .line 98
    .line 99
    const/16 p1, 0xc8

    .line 100
    .line 101
    if-ge v4, p1, :cond_4

    .line 102
    .line 103
    iput v3, p0, Lh33;->d:I

    .line 104
    .line 105
    return-object v5

    .line 106
    :cond_4
    const/4 p1, 0x4

    .line 107
    iput p1, p0, Lh33;->d:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    return-object v5

    .line 110
    :goto_1
    iget-object p0, p0, Lh33;->b:Lv72;

    .line 111
    .line 112
    invoke-interface {p0}, Lv72;->h()Lt96;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-object p0, p0, Lt96;->a:Lv9;

    .line 117
    .line 118
    iget-object p0, p0, Lv9;->h:Lg73;

    .line 119
    .line 120
    invoke-virtual {p0}, Lg73;->g()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v0, Ljava/io/IOException;

    .line 125
    .line 126
    const-string v1, "unexpected end of stream on "

    .line 127
    .line 128
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw v0
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final g()V
    .locals 0

    .line 1
    iget-object p0, p0, Lh33;->c:Lwr0;

    .line 2
    .line 3
    iget-object p0, p0, Lwr0;->z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyw5;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyw5;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public final h()Ldy6;
    .locals 0

    .line 1
    iget-object p0, p0, Lh33;->c:Lwr0;

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

.method public final i()Lv72;
    .locals 0

    .line 1
    iget-object p0, p0, Lh33;->b:Lv72;

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

.method public final j(Lkd6;J)Ltu6;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lkd6;->A:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lf56;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lf56;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/net/ProtocolException;

    .line 19
    .line 20
    const-string p1, "Duplex connections are not supported for HTTP/1"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    iget-object p1, p1, Lkd6;->z:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lbz2;

    .line 29
    .line 30
    const-string v0, "Transfer-Encoding"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lbz2;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "chunked"

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 v0, 0x0

    .line 43
    const-string v2, "state: "

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget p1, p0, Lh33;->d:I

    .line 49
    .line 50
    if-ne p1, v1, :cond_2

    .line 51
    .line 52
    iput v3, p0, Lh33;->d:I

    .line 53
    .line 54
    new-instance p1, Lc33;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Lc33;-><init>(Lh33;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_2
    iget p0, p0, Lh33;->d:I

    .line 61
    .line 62
    invoke-static {p0, v2}, Lku4;->q(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    const-wide/16 v4, -0x1

    .line 67
    .line 68
    cmp-long p1, p2, v4

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    iget p1, p0, Lh33;->d:I

    .line 73
    .line 74
    if-ne p1, v1, :cond_4

    .line 75
    .line 76
    iput v3, p0, Lh33;->d:I

    .line 77
    .line 78
    new-instance p1, Lf33;

    .line 79
    .line 80
    invoke-direct {p1, p0}, Lf33;-><init>(Lh33;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    iget p0, p0, Lh33;->d:I

    .line 85
    .line 86
    invoke-static {p0, v2}, Lku4;->q(ILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_5
    const-string p0, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 91
    .line 92
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v0
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final k(Lg73;J)Le33;
    .locals 2

    .line 1
    iget v0, p0, Lh33;->d:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lh33;->d:I

    .line 8
    .line 9
    new-instance v0, Le33;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Le33;-><init>(Lh33;Lg73;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget p0, p0, Lh33;->d:I

    .line 18
    .line 19
    invoke-static {p0, p1}, Lku4;->q(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
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

.method public final l(Lbz2;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh33;->d:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lh33;->c:Lwr0;

    .line 9
    .line 10
    iget-object v1, v0, Lwr0;->z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lyw5;

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 15
    .line 16
    .line 17
    const-string p2, "\r\n"

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lbz2;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    iget-object v3, v0, Lwr0;->z:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lyw5;

    .line 30
    .line 31
    if-ge v2, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lbz2;->g(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 38
    .line 39
    .line 40
    const-string v4, ": "

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lbz2;->l(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v3, v4}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, p2}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v3, p2}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput p1, p0, Lh33;->d:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const-string p1, "state: "

    .line 66
    .line 67
    iget p0, p0, Lh33;->d:I

    .line 68
    .line 69
    invoke-static {p0, p1}, Lku4;->q(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
