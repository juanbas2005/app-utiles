.class public final Lzd3;
.super Ljava/io/OutputStream;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final w:Ljava/io/OutputStream;

.field public final x:Lui7;

.field public final y:Lsy4;

.field public z:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lsy4;Lui7;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lzd3;->z:J

    .line 7
    .line 8
    iput-object p1, p0, Lzd3;->w:Ljava/io/OutputStream;

    .line 9
    .line 10
    iput-object p2, p0, Lzd3;->y:Lsy4;

    .line 11
    .line 12
    iput-object p3, p0, Lzd3;->x:Lui7;

    .line 13
    .line 14
    return-void
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
.method public final close()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lzd3;->z:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    iget-object v3, p0, Lzd3;->y:Lsy4;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3, v0, v1}, Lsy4;->e(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lzd3;->x:Lui7;

    .line 15
    .line 16
    invoke-virtual {v0}, Lui7;->b()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-object v4, v3, Lsy4;->z:Lpy4;

    .line 21
    .line 22
    invoke-virtual {v4}, Lqu2;->h()V

    .line 23
    .line 24
    .line 25
    iget-object v4, v4, Lqu2;->x:Lcom/google/protobuf/b;

    .line 26
    .line 27
    check-cast v4, Lry4;

    .line 28
    .line 29
    invoke-static {v4, v1, v2}, Lry4;->y(Lry4;J)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object p0, p0, Lzd3;->w:Ljava/io/OutputStream;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p0

    .line 39
    invoke-static {v0, v3, v3}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 40
    .line 41
    .line 42
    throw p0
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

.method public final flush()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lzd3;->w:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Lzd3;->x:Lui7;

    .line 9
    .line 10
    iget-object p0, p0, Lzd3;->y:Lsy4;

    .line 11
    .line 12
    invoke-static {v1, p0, p0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 13
    .line 14
    .line 15
    throw v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final write(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lzd3;->y:Lsy4;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lzd3;->w:Ljava/io/OutputStream;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lzd3;->z:J

    .line 9
    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    add-long/2addr v1, v3

    .line 13
    iput-wide v1, p0, Lzd3;->z:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lsy4;->e(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    iget-object p0, p0, Lzd3;->x:Lui7;

    .line 21
    .line 22
    invoke-static {p0, v0, v0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final write([B)V
    .locals 5

    .line 26
    iget-object v0, p0, Lzd3;->y:Lsy4;

    :try_start_0
    iget-object v1, p0, Lzd3;->w:Ljava/io/OutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    .line 27
    iget-wide v1, p0, Lzd3;->z:J

    array-length p1, p1

    int-to-long v3, p1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lzd3;->z:J

    .line 28
    invoke-virtual {v0, v1, v2}, Lsy4;->e(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 29
    iget-object p0, p0, Lzd3;->x:Lui7;

    .line 30
    invoke-static {p0, v0, v0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 31
    throw p1
.end method

.method public final write([BII)V
    .locals 3

    .line 32
    iget-object v0, p0, Lzd3;->y:Lsy4;

    :try_start_0
    iget-object v1, p0, Lzd3;->w:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 33
    iget-wide p1, p0, Lzd3;->z:J

    int-to-long v1, p3

    add-long/2addr p1, v1

    iput-wide p1, p0, Lzd3;->z:J

    .line 34
    invoke-virtual {v0, p1, p2}, Lsy4;->e(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 35
    iget-object p0, p0, Lzd3;->x:Lui7;

    .line 36
    invoke-static {p0, v0, v0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 37
    throw p1
.end method
