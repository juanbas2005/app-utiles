.class public final Lyj0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field public a:Lwv2;

.field public b:Lvu6;

.field public final synthetic c:Lzj0;


# direct methods
.method public constructor <init>(Lzj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyj0;->c:Lzj0;

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
.method public final onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyj0;->b:Lvu6;

    .line 2
    .line 3
    iget-object v1, p0, Lyj0;->a:Lwv2;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    new-instance v2, Lry6;

    .line 20
    .line 21
    iget v4, v0, Lvu6;->w:I

    .line 22
    .line 23
    iget v5, v0, Lvu6;->x:I

    .line 24
    .line 25
    iget-object p2, p0, Lyj0;->c:Lzj0;

    .line 26
    .line 27
    iget v7, p2, Lzj0;->k:I

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    invoke-direct/range {v2 .. v7}, Lry6;-><init>([BIIII)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lyj0;->c:Lzj0;

    .line 34
    .line 35
    iget-object p0, p0, Lzj0;->b:Landroid/hardware/Camera$CameraInfo;

    .line 36
    .line 37
    iget p0, p0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    if-ne p0, p1, :cond_0

    .line 41
    .line 42
    iput-boolean p1, v2, Lry6;->e:Z

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    goto :goto_3

    .line 48
    :cond_0
    :goto_0
    iget-object p0, v1, Lwv2;->x:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lnz0;

    .line 51
    .line 52
    iget-object p0, p0, Lnz0;->h:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :try_start_1
    iget-object p1, v1, Lwv2;->x:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lnz0;

    .line 58
    .line 59
    iget-boolean p2, p1, Lnz0;->a:Z

    .line 60
    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    iget-object p1, p1, Lnz0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Landroid/os/Handler;

    .line 66
    .line 67
    const p2, 0x7f090257

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    :goto_1
    monitor-exit p0

    .line 82
    return-void

    .line 83
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :try_start_2
    throw p1

    .line 85
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 86
    .line 87
    const-string p1, "No preview data received"

    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 93
    :goto_3
    const-string p1, "zj0"

    .line 94
    .line 95
    const-string p2, "Camera preview failed"

    .line 96
    .line 97
    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lwv2;->o()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, "zj0"

    .line 105
    .line 106
    const-string p1, "Got preview callback, but no handler or resolution available"

    .line 107
    .line 108
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    new-instance p0, Ljava/lang/Exception;

    .line 114
    .line 115
    const-string p1, "No resolution available"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lwv2;->o()V

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
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
