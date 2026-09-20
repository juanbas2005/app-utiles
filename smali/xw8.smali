.class public final Lxw8;
.super Ltw8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic A:I

.field public final synthetic B:Landroid/app/Activity;

.field public final synthetic C:Lzb2;


# direct methods
.method public constructor <init>(Lzb2;Landroid/app/Activity;I)V
    .locals 1

    .line 1
    iput p3, p0, Lxw8;->A:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lxw8;->B:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p1, p0, Lxw8;->C:Lzb2;

    .line 10
    .line 11
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lyw8;

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iput-object p2, p0, Lxw8;->B:Landroid/app/Activity;

    .line 20
    .line 21
    iput-object p1, p0, Lxw8;->C:Lzb2;

    .line 22
    .line 23
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lyw8;

    .line 26
    .line 27
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iput-object p2, p0, Lxw8;->B:Landroid/app/Activity;

    .line 32
    .line 33
    iput-object p1, p0, Lxw8;->C:Lzb2;

    .line 34
    .line 35
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lyw8;

    .line 38
    .line 39
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    iput-object p2, p0, Lxw8;->B:Landroid/app/Activity;

    .line 44
    .line 45
    iput-object p1, p0, Lxw8;->C:Lzb2;

    .line 46
    .line 47
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lyw8;

    .line 50
    .line 51
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_3
    iput-object p2, p0, Lxw8;->B:Landroid/app/Activity;

    .line 56
    .line 57
    iput-object p1, p0, Lxw8;->C:Lzb2;

    .line 58
    .line 59
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lyw8;

    .line 62
    .line 63
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, Lxw8;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxw8;->C:Lzb2;

    .line 7
    .line 8
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyw8;

    .line 11
    .line 12
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 13
    .line 14
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lxw8;->B:Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {v1}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-wide v2, p0, Ltw8;->x:J

    .line 24
    .line 25
    invoke-interface {v0, v1, v2, v3}, Lcu8;->onActivityDestroyedByScionActivityInfo(Ljv8;J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, Lxw8;->C:Lzb2;

    .line 30
    .line 31
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lyw8;

    .line 34
    .line 35
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 36
    .line 37
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lxw8;->B:Landroid/app/Activity;

    .line 41
    .line 42
    invoke-static {v1}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-wide v2, p0, Ltw8;->x:J

    .line 47
    .line 48
    invoke-interface {v0, v1, v2, v3}, Lcu8;->onActivityStoppedByScionActivityInfo(Ljv8;J)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, Lxw8;->C:Lzb2;

    .line 53
    .line 54
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lyw8;

    .line 57
    .line 58
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 59
    .line 60
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lxw8;->B:Landroid/app/Activity;

    .line 64
    .line 65
    invoke-static {v1}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-wide v2, p0, Ltw8;->x:J

    .line 70
    .line 71
    invoke-interface {v0, v1, v2, v3}, Lcu8;->onActivityPausedByScionActivityInfo(Ljv8;J)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    iget-object v0, p0, Lxw8;->C:Lzb2;

    .line 76
    .line 77
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lyw8;

    .line 80
    .line 81
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 82
    .line 83
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lxw8;->B:Landroid/app/Activity;

    .line 87
    .line 88
    invoke-static {v1}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-wide v2, p0, Ltw8;->x:J

    .line 93
    .line 94
    invoke-interface {v0, v1, v2, v3}, Lcu8;->onActivityResumedByScionActivityInfo(Ljv8;J)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_3
    iget-object v0, p0, Lxw8;->C:Lzb2;

    .line 99
    .line 100
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lyw8;

    .line 103
    .line 104
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 105
    .line 106
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lxw8;->B:Landroid/app/Activity;

    .line 110
    .line 111
    invoke-static {v1}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-wide v2, p0, Ltw8;->x:J

    .line 116
    .line 117
    invoke-interface {v0, v1, v2, v3}, Lcu8;->onActivityStartedByScionActivityInfo(Ljv8;J)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
