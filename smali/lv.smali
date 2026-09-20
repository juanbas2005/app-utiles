.class public final Llv;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq51;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lq51;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Llv;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Llv;->x:Lq51;

    .line 4
    .line 5
    iput-object p2, p0, Llv;->y:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Llv;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    sget-object v2, Lm15;->a:Lm15;

    .line 6
    .line 7
    iget-object v3, p0, Llv;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Llv;->x:Lq51;

    .line 10
    .line 11
    const-class v4, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ly53;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, Li53;->d:Li53;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 28
    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object p0, Lb26;->a:Lc26;

    .line 35
    .line 36
    invoke-virtual {p0, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :try_start_0
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 41
    .line 42
    .line 43
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
    new-instance v0, Lfp7;

    .line 45
    .line 46
    invoke-direct {v0, p0, v5}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of p0, v3, Lj85;

    .line 54
    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    iput-object v3, p1, Ly53;->d:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {p1, v5}, Ly53;->b(Lfp7;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iput-object v3, p1, Ly53;->d:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p0, Lb26;->a:Lc26;

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :try_start_1
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 72
    .line 73
    .line 74
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    :catchall_1
    new-instance v0, Lfp7;

    .line 76
    .line 77
    invoke-direct {v0, p0, v5}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    return-object v1

    .line 84
    :pswitch_0
    check-cast p1, Ly53;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v0, Li53;->c:Li53;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 95
    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 100
    .line 101
    sget-object p0, Lb26;->a:Lc26;

    .line 102
    .line 103
    invoke-virtual {p0, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :try_start_2
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 108
    .line 109
    .line 110
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 111
    :catchall_2
    new-instance v0, Lfp7;

    .line 112
    .line 113
    invoke-direct {v0, p0, v5}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    instance-of p0, v3, Lj85;

    .line 121
    .line 122
    if-eqz p0, :cond_3

    .line 123
    .line 124
    iput-object v3, p1, Ly53;->d:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-virtual {p1, v5}, Ly53;->b(Lfp7;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    iput-object v3, p1, Ly53;->d:Ljava/lang/Object;

    .line 131
    .line 132
    sget-object p0, Lb26;->a:Lc26;

    .line 133
    .line 134
    invoke-virtual {p0, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    :try_start_3
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 139
    .line 140
    .line 141
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 142
    :catchall_3
    new-instance v0, Lfp7;

    .line 143
    .line 144
    invoke-direct {v0, p0, v5}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 148
    .line 149
    .line 150
    :goto_1
    return-object v1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
