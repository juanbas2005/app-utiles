.class public final Ljv;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq51;

.field public final synthetic y:Lkotlinx/serialization/json/JsonObject;


# direct methods
.method public synthetic constructor <init>(Lq51;Lkotlinx/serialization/json/JsonObject;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljv;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Ljv;->x:Lq51;

    .line 4
    .line 5
    iput-object p2, p0, Ljv;->y:Lkotlinx/serialization/json/JsonObject;

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
    .locals 5

    .line 1
    iget v0, p0, Ljv;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Ljv;->y:Lkotlinx/serialization/json/JsonObject;

    .line 6
    .line 7
    iget-object p0, p0, Ljv;->x:Lq51;

    .line 8
    .line 9
    const-class v3, Lkotlinx/serialization/json/JsonObject;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ly53;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Li53;->f:Li53;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p0, Lb26;->a:Lc26;

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :try_start_0
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 37
    .line 38
    .line 39
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :catchall_0
    new-instance v0, Lfp7;

    .line 41
    .line 42
    invoke-direct {v0, p0, v4}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_0
    check-cast p1, Ly53;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v0, Li53;->c:Li53;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 63
    .line 64
    sget-object p0, Lb26;->a:Lc26;

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :try_start_1
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 71
    .line 72
    .line 73
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    :catchall_1
    new-instance v0, Lfp7;

    .line 75
    .line 76
    invoke-direct {v0, p0, v4}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_1
    check-cast p1, Ly53;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v0, Li53;->c:Li53;

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object p0, Lb26;->a:Lc26;

    .line 99
    .line 100
    invoke-virtual {p0, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :try_start_2
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 105
    .line 106
    .line 107
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 108
    :catchall_2
    new-instance v0, Lfp7;

    .line 109
    .line 110
    invoke-direct {v0, p0, v4}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :pswitch_2
    check-cast p1, Ly53;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    sget-object v0, Li53;->c:Li53;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Ly53;->d(Li53;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p1, p0}, Lpv8;->q(Lh53;Lq51;)V

    .line 128
    .line 129
    .line 130
    iput-object v2, p1, Ly53;->d:Ljava/lang/Object;

    .line 131
    .line 132
    sget-object p0, Lb26;->a:Lc26;

    .line 133
    .line 134
    invoke-virtual {p0, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    :try_start_3
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 139
    .line 140
    .line 141
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 142
    :catchall_3
    new-instance v0, Lfp7;

    .line 143
    .line 144
    invoke-direct {v0, p0, v4}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ly53;->b(Lfp7;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
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
