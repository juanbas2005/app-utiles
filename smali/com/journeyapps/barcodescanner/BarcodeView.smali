.class public Lcom/journeyapps/barcodescanner/BarcodeView;
.super Ldk0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public W:I

.field public a0:Ljz0;

.field public b0:Lnz0;

.field public c0:Lqk1;

.field public final d0:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Ldk0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->W:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->a0:Ljz0;

    .line 9
    .line 10
    new-instance p1, Lh50;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p0, p2}, Lh50;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;I)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lkb9;

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p2, v0, v1}, Lkb9;-><init>(IZ)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

    .line 24
    .line 25
    new-instance p2, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->d0:Landroid/os/Handler;

    .line 31
    .line 32
    return-void
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
.method public final f()Lnk1;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkb9;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lkb9;-><init>(IZ)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lrk1;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, Lfk1;->F:Lfk1;

    .line 25
    .line 26
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

    .line 30
    .line 31
    check-cast p0, Lkb9;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Ljava/util/EnumMap;

    .line 37
    .line 38
    const-class v3, Lfk1;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lkb9;->z:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/util/EnumMap;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Lkb9;->y:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/Set;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    sget-object v3, Lfk1;->y:Lfk1;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v1, p0, Lkb9;->A:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    sget-object v3, Lfk1;->A:Lfk1;

    .line 73
    .line 74
    invoke-virtual {v2, v3, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_3
    new-instance v1, Lmn4;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Lmn4;->c(Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    iget p0, p0, Lkb9;->x:I

    .line 86
    .line 87
    if-eqz p0, :cond_6

    .line 88
    .line 89
    const/4 v2, 0x1

    .line 90
    if-eq p0, v2, :cond_5

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    if-eq p0, v3, :cond_4

    .line 94
    .line 95
    new-instance p0, Lnk1;

    .line 96
    .line 97
    invoke-direct {p0, v1}, Lnk1;-><init>(Lmn4;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    new-instance p0, Ldl4;

    .line 102
    .line 103
    invoke-direct {p0, v1}, Lnk1;-><init>(Lmn4;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v2, p0, Ldl4;->c:Z

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    new-instance p0, Lfh3;

    .line 110
    .line 111
    invoke-direct {p0, v1}, Lnk1;-><init>(Lmn4;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    new-instance p0, Lnk1;

    .line 116
    .line 117
    invoke-direct {p0, v1}, Lnk1;-><init>(Lmn4;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    iput-object p0, v0, Lrk1;->a:Lnk1;

    .line 121
    .line 122
    return-object p0
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

.method public final g()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lw95;->l()V

    .line 5
    .line 6
    .line 7
    const-string v0, "dk0"

    .line 8
    .line 9
    const-string v1, "pause()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ldk0;->E:I

    .line 16
    .line 17
    iget-object v0, p0, Ldk0;->w:Lxj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lw95;->l()V

    .line 23
    .line 24
    .line 25
    iget-boolean v2, v0, Lxj0;->f:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v0, Lxj0;->a:Lkb9;

    .line 30
    .line 31
    iget-object v3, v0, Lxj0;->l:Lwj0;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x1

    .line 38
    iput-boolean v2, v0, Lxj0;->g:Z

    .line 39
    .line 40
    :goto_0
    const/4 v2, 0x0

    .line 41
    iput-boolean v2, v0, Lxj0;->f:Z

    .line 42
    .line 43
    iput-object v1, p0, Ldk0;->w:Lxj0;

    .line 44
    .line 45
    iput-boolean v2, p0, Ldk0;->C:Z

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p0, Ldk0;->y:Landroid/os/Handler;

    .line 49
    .line 50
    const v2, 0x7f090255

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object v0, p0, Ldk0;->L:Lvu6;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v2, p0, Ldk0;->S:Lbk0;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v0, p0, Ldk0;->L:Lvu6;

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    iput-object v1, p0, Ldk0;->I:Lvu6;

    .line 85
    .line 86
    iput-object v1, p0, Ldk0;->J:Lvu6;

    .line 87
    .line 88
    iput-object v1, p0, Ldk0;->N:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget-object v0, p0, Ldk0;->D:Lkb9;

    .line 91
    .line 92
    iget-object v2, v0, Lkb9;->z:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Lk96;

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 99
    .line 100
    .line 101
    :cond_4
    iput-object v1, v0, Lkb9;->z:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v1, v0, Lkb9;->y:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v1, v0, Lkb9;->A:Ljava/lang/Object;

    .line 106
    .line 107
    iget-object p0, p0, Ldk0;->U:Lck0;

    .line 108
    .line 109
    invoke-virtual {p0}, Lck0;->j()V

    .line 110
    .line 111
    .line 112
    return-void
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

.method public getDecoderFactory()Lqk1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

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

.method public final h()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->W:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Ldk0;->C:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lnz0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldk0;->getCameraInstance()Lxj0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->f()Lnk1;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->d0:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-direct {v0, v2, v3, v4}, Lnz0;-><init>(Lxj0;Lnk1;Landroid/os/Handler;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->b0:Lnz0;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldk0;->getPreviewFramingRect()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v0, Lnz0;->g:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->b0:Lnz0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lw95;->l()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/os/HandlerThread;

    .line 45
    .line 46
    const-string v2, "nz0"

    .line 47
    .line 48
    invoke-direct {v0, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lnz0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroid/os/Handler;

    .line 57
    .line 58
    iget-object v2, p0, Lnz0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Landroid/os/HandlerThread;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, p0, Lnz0;->i:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lyx;

    .line 69
    .line 70
    invoke-direct {v0, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lnz0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    iput-boolean v1, p0, Lnz0;->a:Z

    .line 76
    .line 77
    iget-object v0, p0, Lnz0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lxj0;

    .line 80
    .line 81
    iget-object p0, p0, Lnz0;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Lwv2;

    .line 84
    .line 85
    iget-object v1, v0, Lxj0;->h:Landroid/os/Handler;

    .line 86
    .line 87
    new-instance v2, Lvj0;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-direct {v2, v0, p0, v3}, Lvj0;-><init>(Lxj0;Lwv2;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 94
    .line 95
    .line 96
    :cond_0
    return-void
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

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->b0:Lnz0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lw95;->l()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lnz0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    iput-boolean v2, v0, Lnz0;->a:Z

    .line 13
    .line 14
    iget-object v2, v0, Lnz0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/os/Handler;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lnz0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/os/HandlerThread;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 27
    .line 28
    .line 29
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iput-object v3, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->b0:Lnz0;

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_0
    return-void
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

.method public setDecoderFactory(Lqk1;)V
    .locals 0

    .line 1
    invoke-static {}, Lw95;->l()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->c0:Lqk1;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->b0:Lnz0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->f()Lnk1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iput-object p0, p1, Lnz0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    return-void
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
