.class public final Lkn1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Loy6;


# instance fields
.field public final w:Ljava/io/InputStream;

.field public final x:Lfy6;

.field public final synthetic y:Lam6;


# direct methods
.method public constructor <init>(Lam6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkn1;->y:Lam6;

    .line 5
    .line 6
    iget-object p1, p1, Lam6;->x:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/net/Socket;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lkn1;->w:Ljava/io/InputStream;

    .line 15
    .line 16
    new-instance v0, Lfy6;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lfy6;-><init>(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lkn1;->x:Lfy6;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final Y(JLsc0;)J
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    if-ltz v2, :cond_6

    .line 12
    .line 13
    iget-object v0, p0, Lkn1;->x:Lfy6;

    .line 14
    .line 15
    invoke-virtual {v0}, Lri7;->f()V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p3, v1}, Lsc0;->V(I)Lqi6;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, v1, Lqi6;->c:I

    .line 24
    .line 25
    rsub-int v2, v2, 0x2000

    .line 26
    .line 27
    int-to-long v2, v2

    .line 28
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    long-to-int p1, p1

    .line 33
    :try_start_0
    invoke-virtual {v0}, Lvt;->h()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object p0, p0, Lkn1;->w:Ljava/io/InputStream;

    .line 37
    .line 38
    iget-object p2, v1, Lqi6;->a:[B

    .line 39
    .line 40
    iget v2, v1, Lqi6;->c:I

    .line 41
    .line 42
    invoke-virtual {p0, p2, v2, p1}, Ljava/io/InputStream;->read([BII)I

    .line 43
    .line 44
    .line 45
    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :try_start_2
    invoke-virtual {v0}, Lvt;->i()Z

    .line 47
    .line 48
    .line 49
    move-result p1
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    const/4 p1, -0x1

    .line 53
    if-ne p0, p1, :cond_2

    .line 54
    .line 55
    iget p0, v1, Lqi6;->b:I

    .line 56
    .line 57
    iget p1, v1, Lqi6;->c:I

    .line 58
    .line 59
    if-ne p0, p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Lqi6;->a()Lqi6;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iput-object p0, p3, Lsc0;->w:Lqi6;

    .line 66
    .line 67
    invoke-static {v1}, Lti6;->a(Lqi6;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    const-wide/16 p0, -0x1

    .line 71
    .line 72
    return-wide p0

    .line 73
    :cond_2
    iget p1, v1, Lqi6;->c:I

    .line 74
    .line 75
    add-int/2addr p1, p0

    .line 76
    iput p1, v1, Lqi6;->c:I

    .line 77
    .line 78
    iget-wide p1, p3, Lsc0;->x:J

    .line 79
    .line 80
    int-to-long v0, p0

    .line 81
    add-long/2addr p1, v0

    .line 82
    iput-wide p1, p3, Lsc0;->x:J

    .line 83
    .line 84
    return-wide v0

    .line 85
    :cond_3
    const/4 p0, 0x0

    .line 86
    :try_start_3
    invoke-virtual {v0, p0}, Lvt;->j(Ljava/io/IOException;)Ljava/io/IOException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    throw p0
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_1

    .line 93
    :catch_0
    move-exception p0

    .line 94
    :try_start_4
    invoke-virtual {v0}, Lvt;->i()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {v0, p0}, Lvt;->j(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_1
    :try_start_5
    invoke-virtual {v0}, Lvt;->i()Z

    .line 107
    .line 108
    .line 109
    throw p0
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_1

    .line 110
    :catch_1
    move-exception p0

    .line 111
    invoke-static {p0}, Lcg8;->a(Ljava/lang/AssertionError;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    new-instance p1, Ljava/io/IOException;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_5
    throw p0

    .line 124
    :cond_6
    const-string p0, "byteCount < 0: "

    .line 125
    .line 126
    invoke-static {p1, p2, p0}, Lf21;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-wide v0
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

.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lkn1;->y:Lam6;

    .line 2
    .line 3
    iget-object v1, p0, Lkn1;->x:Lfy6;

    .line 4
    .line 5
    invoke-virtual {v1}, Lvt;->h()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, v0, Lam6;->y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iget-object v0, v0, Lam6;->x:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/net/Socket;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    and-int/lit8 v4, v3, 0x2

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    or-int/lit8 v4, v3, 0x2

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :goto_0
    if-eqz v2, :cond_6

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    if-eq v2, v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 50
    .line 51
    .line 52
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_5

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :catch_1
    :try_start_2
    iget-object p0, p0, Lkn1;->w:Ljava/io/InputStream;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lvt;->i()Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-virtual {v1}, Lvt;->i()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_5

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    invoke-virtual {v1, p0}, Lfy6;->j(Ljava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :cond_6
    invoke-virtual {v1}, Lvt;->i()Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Lvt;->i()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-virtual {v1, p0}, Lfy6;->j(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_5
    invoke-virtual {v1}, Lvt;->i()Z

    .line 107
    .line 108
    .line 109
    throw p0
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

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lkn1;->x:Lfy6;

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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "source("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lkn1;->y:Lam6;

    .line 9
    .line 10
    iget-object p0, p0, Lam6;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x29

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
