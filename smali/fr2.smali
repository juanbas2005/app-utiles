.class public final Lfr2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final e:Lrg;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Lwv2;

.field public final c:Ljava/util/HashMap;

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lrg;->d()Lrg;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lfr2;->e:Lrg;

    .line 6
    .line 7
    return-void
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

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 1
    new-instance v0, Lwv2;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwv2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-boolean v2, p0, Lfr2;->d:Z

    .line 18
    .line 19
    iput-object p1, p0, Lfr2;->a:Landroid/app/Activity;

    .line 20
    .line 21
    iput-object v0, p0, Lfr2;->b:Lwv2;

    .line 22
    .line 23
    iput-object v1, p0, Lfr2;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()Ln75;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lfr2;->d:Z

    .line 2
    .line 3
    sget-object v1, Lfr2;->e:Lrg;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "No recording has been started."

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Lrg;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ln75;

    .line 13
    .line 14
    invoke-direct {p0}, Ln75;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, Lfr2;->b:Lwv2;

    .line 19
    .line 20
    iget-object p0, p0, Lwv2;->x:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lkb9;

    .line 23
    .line 24
    iget-object p0, p0, Lkb9;->y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, [Landroid/util/SparseIntArray;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    aget-object p0, p0, v0

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    const-string p0, "FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized."

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Lrg;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Ln75;

    .line 39
    .line 40
    invoke-direct {p0}, Ln75;-><init>()V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    move v1, v0

    .line 45
    move v2, v1

    .line 46
    move v3, v2

    .line 47
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-ge v0, v4, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {p0, v0}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    add-int/2addr v1, v5

    .line 62
    const/16 v6, 0x2bc

    .line 63
    .line 64
    if-le v4, v6, :cond_2

    .line 65
    .line 66
    add-int/2addr v3, v5

    .line 67
    :cond_2
    const/16 v6, 0x10

    .line 68
    .line 69
    if-le v4, v6, :cond_3

    .line 70
    .line 71
    add-int/2addr v2, v5

    .line 72
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    new-instance p0, Ler2;

    .line 76
    .line 77
    invoke-direct {p0, v1, v2, v3}, Ler2;-><init>(III)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Ln75;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Ln75;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lfr2;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lfr2;->a:Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Lfr2;->e:Lrg;

    .line 20
    .line 21
    const-string v1, "FrameMetricsAggregator is already recording %s"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lfr2;->b:Lwv2;

    .line 28
    .line 29
    iget-object v0, v0, Lwv2;->x:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lkb9;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v2, Lkb9;->D:Landroid/os/HandlerThread;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    new-instance v2, Landroid/os/HandlerThread;

    .line 41
    .line 42
    const-string v3, "FrameMetricsAggregator"

    .line 43
    .line 44
    invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Lkb9;->D:Landroid/os/HandlerThread;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 50
    .line 51
    .line 52
    new-instance v2, Landroid/os/Handler;

    .line 53
    .line 54
    sget-object v3, Lkb9;->D:Landroid/os/HandlerThread;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 61
    .line 62
    .line 63
    sput-object v2, Lkb9;->E:Landroid/os/Handler;

    .line 64
    .line 65
    :cond_1
    const/4 v2, 0x0

    .line 66
    :goto_0
    const/16 v3, 0x8

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    if-gt v2, v3, :cond_3

    .line 70
    .line 71
    iget-object v3, v0, Lkb9;->y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, [Landroid/util/SparseIntArray;

    .line 74
    .line 75
    aget-object v5, v3, v2

    .line 76
    .line 77
    if-nez v5, :cond_2

    .line 78
    .line 79
    iget v5, v0, Lkb9;->x:I

    .line 80
    .line 81
    shl-int/2addr v4, v2

    .line 82
    and-int/2addr v4, v5

    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    new-instance v4, Landroid/util/SparseIntArray;

    .line 86
    .line 87
    invoke-direct {v4}, Landroid/util/SparseIntArray;-><init>()V

    .line 88
    .line 89
    .line 90
    aput-object v4, v3, v2

    .line 91
    .line 92
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-object v3, v0, Lkb9;->A:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v3, Ldr2;

    .line 102
    .line 103
    sget-object v5, Lkb9;->E:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-virtual {v2, v3, v5}, Landroid/view/Window;->addOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/os/Handler;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v0, Lkb9;->z:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/ArrayList;

    .line 111
    .line 112
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 113
    .line 114
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iput-boolean v4, p0, Lfr2;->d:Z

    .line 121
    .line 122
    return-void
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
