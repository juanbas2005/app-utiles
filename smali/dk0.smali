.class public abstract Ldk0;
.super Landroid/view/ViewGroup;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic V:I


# instance fields
.field public A:Landroid/view/SurfaceView;

.field public B:Landroid/view/TextureView;

.field public C:Z

.field public final D:Lkb9;

.field public E:I

.field public final F:Ljava/util/ArrayList;

.field public G:Lig;

.field public H:Lek0;

.field public I:Lvu6;

.field public J:Lvu6;

.field public K:Landroid/graphics/Rect;

.field public L:Lvu6;

.field public M:Landroid/graphics/Rect;

.field public N:Landroid/graphics/Rect;

.field public O:Lvu6;

.field public P:D

.field public Q:Lio5;

.field public R:Z

.field public final S:Lbk0;

.field public final T:Lns8;

.field public final U:Lck0;

.field public w:Lxj0;

.field public final x:Landroid/view/WindowManager;

.field public final y:Landroid/os/Handler;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldk0;->z:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Ldk0;->C:Z

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Ldk0;->E:I

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Ldk0;->F:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, Lek0;

    .line 20
    .line 21
    invoke-direct {v1}, Lek0;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Ldk0;->H:Lek0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Ldk0;->M:Landroid/graphics/Rect;

    .line 28
    .line 29
    iput-object v1, p0, Ldk0;->N:Landroid/graphics/Rect;

    .line 30
    .line 31
    iput-object v1, p0, Ldk0;->O:Lvu6;

    .line 32
    .line 33
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v2, p0, Ldk0;->P:D

    .line 39
    .line 40
    iput-object v1, p0, Ldk0;->Q:Lio5;

    .line 41
    .line 42
    iput-boolean v0, p0, Ldk0;->R:Z

    .line 43
    .line 44
    new-instance v0, Lbk0;

    .line 45
    .line 46
    move-object v1, p0

    .line 47
    check-cast v1, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lbk0;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Ldk0;->S:Lbk0;

    .line 53
    .line 54
    new-instance v0, Lh50;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {v0, v1, v2}, Lh50;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;I)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lns8;

    .line 61
    .line 62
    const/16 v3, 0x8

    .line 63
    .line 64
    invoke-direct {v2, v3, v1}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Ldk0;->T:Lns8;

    .line 68
    .line 69
    new-instance v2, Lck0;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v2, v3, v1}, Lck0;-><init>(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Ldk0;->U:Lck0;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-nez v1, :cond_0

    .line 82
    .line 83
    const/high16 v1, -0x1000000

    .line 84
    .line 85
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 86
    .line 87
    .line 88
    :cond_0
    invoke-virtual {p0, p2}, Ldk0;->b(Landroid/util/AttributeSet;)V

    .line 89
    .line 90
    .line 91
    const-string p2, "window"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Landroid/view/WindowManager;

    .line 98
    .line 99
    iput-object p1, p0, Ldk0;->x:Landroid/view/WindowManager;

    .line 100
    .line 101
    new-instance p1, Landroid/os/Handler;

    .line 102
    .line 103
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Ldk0;->y:Landroid/os/Handler;

    .line 107
    .line 108
    new-instance p1, Lkb9;

    .line 109
    .line 110
    const/16 p2, 0x8

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-direct {p1, p2, v0}, Lkb9;-><init>(IZ)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Ldk0;->D:Lkb9;

    .line 117
    .line 118
    return-void
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

.method public static a(Lcom/journeyapps/barcodescanner/BarcodeView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldk0;->w:Lxj0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Ldk0;->getDisplayRotation()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Ldk0;->E:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->g()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldk0;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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

.method private getDisplayRotation()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->x:Landroid/view/WindowManager;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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


# virtual methods
.method public final b(Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lpv5;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x1

    .line 12
    const/high16 v1, -0x40800000    # -1.0f

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    float-to-int v2, v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    float-to-int v1, v1

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    new-instance v4, Lvu6;

    .line 30
    .line 31
    invoke-direct {v4, v2, v1}, Lvu6;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v4, p0, Ldk0;->O:Lvu6;

    .line 35
    .line 36
    :cond_0
    const/4 v1, 0x3

    .line 37
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iput-boolean v2, p0, Ldk0;->z:Z

    .line 42
    .line 43
    const/4 v2, -0x1

    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v2, v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Lrm0;

    .line 52
    .line 53
    invoke-direct {v0, v3}, Lrm0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Ldk0;->Q:Lio5;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    if-ne v2, v4, :cond_2

    .line 60
    .line 61
    new-instance v1, Lrm0;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lrm0;-><init>(I)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Ldk0;->Q:Lio5;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-ne v2, v1, :cond_3

    .line 70
    .line 71
    new-instance v0, Lrm0;

    .line 72
    .line 73
    invoke-direct {v0, v4}, Lrm0;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Ldk0;->Q:Lio5;

    .line 77
    .line 78
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    return-void
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

.method public final c()V
    .locals 8

    .line 1
    invoke-static {}, Lw95;->l()V

    .line 2
    .line 3
    .line 4
    const-string v0, "dk0"

    .line 5
    .line 6
    const-string v1, "resume()"

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldk0;->w:Lxj0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "dk0"

    .line 16
    .line 17
    const-string v1, "initCamera called twice"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lxj0;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    iput-boolean v2, v0, Lxj0;->f:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput-boolean v3, v0, Lxj0;->g:Z

    .line 38
    .line 39
    new-instance v4, Lek0;

    .line 40
    .line 41
    invoke-direct {v4}, Lek0;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v4, v0, Lxj0;->i:Lek0;

    .line 45
    .line 46
    new-instance v4, Lwj0;

    .line 47
    .line 48
    invoke-direct {v4, v0, v2}, Lwj0;-><init>(Lxj0;I)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lwj0;

    .line 52
    .line 53
    invoke-direct {v5, v0, v3}, Lwj0;-><init>(Lxj0;I)V

    .line 54
    .line 55
    .line 56
    iput-object v5, v0, Lxj0;->j:Lwj0;

    .line 57
    .line 58
    new-instance v5, Lwj0;

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    invoke-direct {v5, v0, v6}, Lwj0;-><init>(Lxj0;I)V

    .line 62
    .line 63
    .line 64
    iput-object v5, v0, Lxj0;->k:Lwj0;

    .line 65
    .line 66
    new-instance v5, Lwj0;

    .line 67
    .line 68
    const/4 v7, 0x3

    .line 69
    invoke-direct {v5, v0, v7}, Lwj0;-><init>(Lxj0;I)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v0, Lxj0;->l:Lwj0;

    .line 73
    .line 74
    invoke-static {}, Lw95;->l()V

    .line 75
    .line 76
    .line 77
    sget-object v5, Lkb9;->C:Lkb9;

    .line 78
    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    new-instance v5, Lkb9;

    .line 82
    .line 83
    invoke-direct {v5, v6}, Lkb9;-><init>(I)V

    .line 84
    .line 85
    .line 86
    sput-object v5, Lkb9;->C:Lkb9;

    .line 87
    .line 88
    :cond_1
    sget-object v5, Lkb9;->C:Lkb9;

    .line 89
    .line 90
    iput-object v5, v0, Lxj0;->a:Lkb9;

    .line 91
    .line 92
    new-instance v6, Lzj0;

    .line 93
    .line 94
    invoke-direct {v6, v1}, Lzj0;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    iput-object v6, v0, Lxj0;->c:Lzj0;

    .line 98
    .line 99
    iget-object v1, v0, Lxj0;->i:Lek0;

    .line 100
    .line 101
    iput-object v1, v6, Lzj0;->g:Lek0;

    .line 102
    .line 103
    new-instance v1, Landroid/os/Handler;

    .line 104
    .line 105
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v1, v0, Lxj0;->h:Landroid/os/Handler;

    .line 109
    .line 110
    iget-object v1, p0, Ldk0;->H:Lek0;

    .line 111
    .line 112
    iget-boolean v7, v0, Lxj0;->f:Z

    .line 113
    .line 114
    if-nez v7, :cond_2

    .line 115
    .line 116
    iput-object v1, v0, Lxj0;->i:Lek0;

    .line 117
    .line 118
    iput-object v1, v6, Lzj0;->g:Lek0;

    .line 119
    .line 120
    :cond_2
    iput-object v0, p0, Ldk0;->w:Lxj0;

    .line 121
    .line 122
    iget-object v1, p0, Ldk0;->y:Landroid/os/Handler;

    .line 123
    .line 124
    iput-object v1, v0, Lxj0;->d:Landroid/os/Handler;

    .line 125
    .line 126
    invoke-static {}, Lw95;->l()V

    .line 127
    .line 128
    .line 129
    iput-boolean v3, v0, Lxj0;->f:Z

    .line 130
    .line 131
    iput-boolean v2, v0, Lxj0;->g:Z

    .line 132
    .line 133
    iget-object v0, v5, Lkb9;->A:Ljava/lang/Object;

    .line 134
    .line 135
    monitor-enter v0

    .line 136
    :try_start_0
    iget v1, v5, Lkb9;->x:I

    .line 137
    .line 138
    add-int/2addr v1, v3

    .line 139
    iput v1, v5, Lkb9;->x:I

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-direct {p0}, Ldk0;->getDisplayRotation()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iput v0, p0, Ldk0;->E:I

    .line 150
    .line 151
    :goto_0
    iget-object v0, p0, Ldk0;->L:Lvu6;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-virtual {p0}, Ldk0;->e()V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iget-object v0, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 160
    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v1, p0, Ldk0;->S:Lbk0;

    .line 168
    .line 169
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 174
    .line 175
    if-eqz v0, :cond_6

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iget-object v1, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    new-instance v2, Lvu6;

    .line 201
    .line 202
    invoke-direct {v2, v0, v1}, Lvu6;-><init>(II)V

    .line 203
    .line 204
    .line 205
    iput-object v2, p0, Ldk0;->L:Lvu6;

    .line 206
    .line 207
    invoke-virtual {p0}, Ldk0;->e()V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 212
    .line 213
    new-instance v1, Lak0;

    .line 214
    .line 215
    invoke-direct {v1, p0}, Lak0;-><init>(Ldk0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 219
    .line 220
    .line 221
    :cond_6
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Ldk0;->D:Lkb9;

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iget-object p0, p0, Ldk0;->T:Lns8;

    .line 231
    .line 232
    iget-object v2, v0, Lkb9;->z:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, Lk96;

    .line 235
    .line 236
    if-eqz v2, :cond_7

    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 239
    .line 240
    .line 241
    :cond_7
    const/4 v2, 0x0

    .line 242
    iput-object v2, v0, Lkb9;->z:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v2, v0, Lkb9;->y:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v2, v0, Lkb9;->A:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iput-object p0, v0, Lkb9;->A:Ljava/lang/Object;

    .line 253
    .line 254
    const-string p0, "window"

    .line 255
    .line 256
    invoke-virtual {v1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    check-cast p0, Landroid/view/WindowManager;

    .line 261
    .line 262
    iput-object p0, v0, Lkb9;->y:Ljava/lang/Object;

    .line 263
    .line 264
    new-instance p0, Lk96;

    .line 265
    .line 266
    invoke-direct {p0, v0, v1}, Lk96;-><init>(Lkb9;Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    iput-object p0, v0, Lkb9;->z:Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->enable()V

    .line 272
    .line 273
    .line 274
    iget-object p0, v0, Lkb9;->y:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p0, Landroid/view/WindowManager;

    .line 277
    .line 278
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    iput p0, v0, Lkb9;->x:I

    .line 287
    .line 288
    return-void

    .line 289
    :catchall_0
    move-exception p0

    .line 290
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    throw p0
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

.method public final d(Lqc3;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldk0;->C:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldk0;->w:Lxj0;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "dk0"

    .line 10
    .line 11
    const-string v1, "Starting preview"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ldk0;->w:Lxj0;

    .line 17
    .line 18
    iput-object p1, v0, Lxj0;->b:Lqc3;

    .line 19
    .line 20
    invoke-static {}, Lw95;->l()V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, v0, Lxj0;->f:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, v0, Lxj0;->a:Lkb9;

    .line 28
    .line 29
    iget-object v0, v0, Lxj0;->k:Lwj0;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Ldk0;->C:Z

    .line 36
    .line 37
    move-object p1, p0

    .line 38
    check-cast p1, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/BarcodeView;->h()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Ldk0;->U:Lck0;

    .line 44
    .line 45
    invoke-virtual {p0}, Lck0;->g()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "CameraInstance is not open"

    .line 50
    .line 51
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
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

.method public final e()V
    .locals 8

    .line 1
    iget-object v0, p0, Ldk0;->L:Lvu6;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, Ldk0;->J:Lvu6;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Ldk0;->K:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    iget-object v2, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x18

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lvu6;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v5, p0, Ldk0;->K:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v2, v1, v5}, Lvu6;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lvu6;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Lqc3;

    .line 42
    .line 43
    iget-object v1, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v4, v3}, Lqc3;-><init>(IZ)V

    .line 50
    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iput-object v1, v0, Lqc3;->x:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ldk0;->d(Lqc3;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const-string p0, "surfaceHolder may not be null"

    .line 61
    .line 62
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object v0, p0, Ldk0;->J:Lvu6;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v1, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v2, p0, Ldk0;->J:Lvu6;

    .line 93
    .line 94
    int-to-float v5, v0

    .line 95
    int-to-float v1, v1

    .line 96
    div-float/2addr v5, v1

    .line 97
    iget v6, v2, Lvu6;->w:I

    .line 98
    .line 99
    int-to-float v6, v6

    .line 100
    iget v2, v2, Lvu6;->x:I

    .line 101
    .line 102
    int-to-float v2, v2

    .line 103
    div-float/2addr v6, v2

    .line 104
    cmpg-float v2, v5, v6

    .line 105
    .line 106
    const/high16 v7, 0x3f800000    # 1.0f

    .line 107
    .line 108
    if-gez v2, :cond_2

    .line 109
    .line 110
    div-float/2addr v6, v5

    .line 111
    move v5, v7

    .line 112
    move v7, v6

    .line 113
    goto :goto_0

    .line 114
    :cond_2
    div-float/2addr v5, v6

    .line 115
    :goto_0
    new-instance v2, Landroid/graphics/Matrix;

    .line 116
    .line 117
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 121
    .line 122
    .line 123
    int-to-float v0, v0

    .line 124
    mul-float/2addr v7, v0

    .line 125
    mul-float/2addr v5, v1

    .line 126
    sub-float/2addr v0, v7

    .line 127
    const/high16 v6, 0x40000000    # 2.0f

    .line 128
    .line 129
    div-float/2addr v0, v6

    .line 130
    sub-float/2addr v1, v5

    .line 131
    div-float/2addr v1, v6

    .line 132
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 138
    .line 139
    .line 140
    :cond_3
    new-instance v0, Lqc3;

    .line 141
    .line 142
    iget-object v1, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 143
    .line 144
    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v4, v3}, Lqc3;-><init>(IZ)V

    .line 149
    .line 150
    .line 151
    if-eqz v1, :cond_4

    .line 152
    .line 153
    iput-object v1, v0, Lqc3;->y:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ldk0;->d(Lqc3;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_4
    const-string p0, "surfaceTexture may not be null"

    .line 160
    .line 161
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    return-void
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public getCameraInstance()Lxj0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->w:Lxj0;

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

.method public getCameraSettings()Lek0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->H:Lek0;

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

.method public getFramingRect()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->M:Landroid/graphics/Rect;

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

.method public getFramingRectSize()Lvu6;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->O:Lvu6;

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

.method public getMarginFraction()D
    .locals 2

    .line 1
    iget-wide v0, p0, Ldk0;->P:D

    .line 2
    .line 3
    return-wide v0
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

.method public getPreviewFramingRect()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->N:Landroid/graphics/Rect;

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

.method public getPreviewScalingStrategy()Lio5;
    .locals 1

    .line 1
    iget-object v0, p0, Ldk0;->Q:Lio5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance p0, Lrm0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, v0}, Lrm0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance p0, Lrm0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p0, v0}, Lrm0;-><init>(I)V

    .line 21
    .line 22
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

.method public getPreviewSize()Lvu6;
    .locals 0

    .line 1
    iget-object p0, p0, Ldk0;->J:Lvu6;

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

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ldk0;->z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/view/TextureView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 18
    .line 19
    new-instance v1, Lak0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lak0;-><init>(Ldk0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, Landroid/view/SurfaceView;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ldk0;->S:Lbk0;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    new-instance p1, Lvu6;

    .line 2
    .line 3
    sub-int/2addr p4, p2

    .line 4
    sub-int/2addr p5, p3

    .line 5
    invoke-direct {p1, p4, p5}, Lvu6;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldk0;->I:Lvu6;

    .line 9
    .line 10
    iget-object p2, p0, Ldk0;->w:Lxj0;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p2, Lxj0;->e:Lig;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    new-instance p2, Lig;

    .line 20
    .line 21
    invoke-direct {p0}, Ldk0;->getDisplayRotation()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    const/4 p5, 0x4

    .line 26
    invoke-direct {p2, p5, p3}, Lig;-><init>(IB)V

    .line 27
    .line 28
    .line 29
    new-instance p5, Lrm0;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p5, v0}, Lrm0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p5, p2, Lig;->d:Ljava/lang/Object;

    .line 36
    .line 37
    iput p4, p2, Lig;->b:I

    .line 38
    .line 39
    iput-object p1, p2, Lig;->c:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p2, p0, Ldk0;->G:Lig;

    .line 42
    .line 43
    invoke-virtual {p0}, Ldk0;->getPreviewScalingStrategy()Lio5;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p2, Lig;->d:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p1, p0, Ldk0;->w:Lxj0;

    .line 50
    .line 51
    iget-object p2, p0, Ldk0;->G:Lig;

    .line 52
    .line 53
    iput-object p2, p1, Lxj0;->e:Lig;

    .line 54
    .line 55
    iget-object p4, p1, Lxj0;->c:Lzj0;

    .line 56
    .line 57
    iput-object p2, p4, Lzj0;->h:Lig;

    .line 58
    .line 59
    invoke-static {}, Lw95;->l()V

    .line 60
    .line 61
    .line 62
    iget-boolean p2, p1, Lxj0;->f:Z

    .line 63
    .line 64
    if-eqz p2, :cond_0

    .line 65
    .line 66
    iget-object p2, p1, Lxj0;->a:Lkb9;

    .line 67
    .line 68
    iget-object p1, p1, Lxj0;->j:Lwj0;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    iget-boolean p1, p0, Ldk0;->R:Z

    .line 74
    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    iget-object p2, p0, Ldk0;->w:Lxj0;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lw95;->l()V

    .line 83
    .line 84
    .line 85
    iget-boolean p4, p2, Lxj0;->f:Z

    .line 86
    .line 87
    if-eqz p4, :cond_1

    .line 88
    .line 89
    iget-object p4, p2, Lxj0;->a:Lkb9;

    .line 90
    .line 91
    new-instance p5, Lvb;

    .line 92
    .line 93
    invoke-direct {p5, v0, p2, p1}, Lvb;-><init>(ILjava/lang/Object;Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4, p5}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    const-string p0, "CameraInstance is not open"

    .line 101
    .line 102
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    :goto_0
    iget-object p1, p0, Ldk0;->A:Landroid/view/SurfaceView;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    iget-object p2, p0, Ldk0;->K:Landroid/graphics/Rect;

    .line 111
    .line 112
    if-nez p2, :cond_2

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-virtual {p1, p3, p3, p2, p0}, Landroid/view/View;->layout(IIII)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    iget p0, p2, Landroid/graphics/Rect;->left:I

    .line 127
    .line 128
    iget p3, p2, Landroid/graphics/Rect;->top:I

    .line 129
    .line 130
    iget p4, p2, Landroid/graphics/Rect;->right:I

    .line 131
    .line 132
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 133
    .line 134
    invoke-virtual {p1, p0, p3, p4, p2}, Landroid/view/View;->layout(IIII)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    iget-object p1, p0, Ldk0;->B:Landroid/view/TextureView;

    .line 139
    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {p1, p3, p3, p2, p0}, Landroid/view/View;->layout(IIII)V

    .line 151
    .line 152
    .line 153
    :cond_4
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
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
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v0, "super"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "torch"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Ldk0;->setTorch(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "super"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "torch"

    .line 16
    .line 17
    iget-boolean p0, p0, Ldk0;->R:Z

    .line 18
    .line 19
    invoke-virtual {v1, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-object v1
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

.method public setCameraSettings(Lek0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldk0;->H:Lek0;

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public setFramingRectSize(Lvu6;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldk0;->O:Lvu6;

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public setMarginFraction(D)V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 2
    .line 3
    cmpl-double v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Ldk0;->P:D

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "The margin fraction must be less than 0.5"

    .line 11
    .line 12
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public setPreviewScalingStrategy(Lio5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldk0;->Q:Lio5;

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public setTorch(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Ldk0;->R:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldk0;->w:Lxj0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lw95;->l()V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lxj0;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lxj0;->a:Lkb9;

    .line 15
    .line 16
    new-instance v1, Lvb;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2, p0, p1}, Lvb;-><init>(ILjava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lkb9;->c(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public setUseTextureView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldk0;->z:Z

    .line 2
    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
